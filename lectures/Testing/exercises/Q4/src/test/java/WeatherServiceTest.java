import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public final class WeatherServiceTest {
    @Test
    void example() {
        assertThat(1 + 1, is(2));
    }

    @Test
    void getWeatherSunnyIsCorrect() {
        HttpClient httpClient = x-> "Sunny";
        WeatherService w = new WeatherService(httpClient);
        assertThat(w.getWeatherToday(), is(Weather.SUNNY));
    }

    @Test
    void getWeatherWithIOErrorIsWorking() {
        HttpClient httpClient = x-> {throw new IOException();};
        WeatherService w = new WeatherService(httpClient);
        assertThat(w.getWeatherToday(),is(Weather.UNKNOWN));
    }

    @Test
    void getWeatherWithInvalidIsOk() {
        HttpClient httpClient = x -> "invalid_weather";
        WeatherService w = new WeatherService(httpClient);
        assertThat(w.getWeatherToday(),is(Weather.UNKNOWN));
    }

}
