import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

final class Vector3Test {

    @Test
    public void sampleTest() {
        assertThat(1, is(1));
    }

    @Test
    public void isZeroVectorDetected() {
        Vector3 v = new Vector3(0,0,0);
        assertThat(v.isZero(),is(true));
    }

    @Test
    public void isDotPoductWithSimpleVectWorking(){
        Vector3 v1 = new Vector3(1,2,3), v2 = new Vector3(3,2,1);
        assertThat(v1.dot(v2), is((double) 3+4+3));
    }

    @Test
    public void isTheLengthOfSimpleVectWorking(){
        Vector3 v = new Vector3(2,3,4);
        assertThat(v.getLength(), is(Math.sqrt(2*2+3*3+4*4)));
    }

    @Test
    public void isCrossProdWorkingWithSimpleVect(){
        Vector3 v1 = new Vector3(3,2,1), v2 = new Vector3(1,2,3);
        assertThat(v1.cross(v2), is(new Vector3(4,-8,4)));
    }

    @Test
    public void isSimpleNormalizationWorking(){
        Vector3 v = new Vector3(2,1,3);
        Vector3 normalized = v.normalize();
        assertThat(normalized.getX(), closeTo(0.5345224838248488, 0.005));
        assertThat(normalized.getY(), closeTo(0.2672612419124244, 0.005));
        assertThat(normalized.getZ(), closeTo(0.8017837257372732, 0.005));
    }

    @Test
    public void scaleByNumberWorks(){
        Vector3 v = new Vector3(1,2,3);
        assertThat(v.scale(3), is(new Vector3(3,6,9)));

    }
}
