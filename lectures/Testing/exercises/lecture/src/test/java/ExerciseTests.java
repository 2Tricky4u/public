import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

final class ExerciseTests {
    @Test
    void onePlusOneIsTwo() {
        assertThat(1 + 1, is(2));
    }

    @Test
    void throwErrorWhenUnderZero(){
        assertThrows(IllegalArgumentException.class, ()-> Functions.fibonacci(-1));
    }

    @Test
    void firstFibIsOk(){
        assertThat(Functions.fibonacci(1), is(1));
    }

    @Test
    void splitContainsAandB() {
        assertThat(Functions.splitString("a b", ' '), contains("a","b"));
    }

    @Test
    void shuffleDontLoseValues(){
        Integer[] list = new Integer[]{1,2,3,4};

        Functions.shuffle(list);

        assertThat(list, arrayContainingInAnyOrder(1,2,3,4));
    }

    // TODO: tests!
    // Remember "assertThat" with matchers (see the documentation!)
    // and "assertThrows" to assert an exception is thrown
}
