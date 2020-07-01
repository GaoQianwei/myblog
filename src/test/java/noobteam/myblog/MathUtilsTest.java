package noobteam.myblog;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void makeUpNewData() {
        String x = MathUtils.makeUpNewData(Thread.currentThread().hashCode()+"",3);
        System.out.println(x);
    }

    @Test
    public void testMakeUpNewData() {
    }

    @Test
    public void randomDigitNumber() {
    }
}