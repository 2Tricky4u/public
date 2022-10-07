import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;


final class PeopleCounterTests {

    private PeopleCounter pc;

    @BeforeEach void createNewCounter(){ pc = new PeopleCounter(0);}

    @Test
    void startsAtZero(){
        assertThat(pc.getCounter(), is(0));
    }

    @Test
    void incrementsByOne(){

    }

    @Test
    void resetToZero(){

    }

    @Test
    void canNotExceedMax(){

    }
}
