package unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGUnitTest {
    @Test
    public void test(){
        CalculatorTest ct = new CalculatorTest();
        //if I add 5 and 5 I got 10
        Assert.assertEquals(ct.test1(), 10);
        //System.out.println("test passed");
        //if I add 5 and 5 I got 10
        Assert.assertEquals(ct.test2(), 0);
        //System.out.println("test passed");
    }

}
