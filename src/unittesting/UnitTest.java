package unittesting;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    public static void main(String[] args) {
        CalculatorTest ct = new CalculatorTest();
        //if I add 5 and 5 I got 10
        Assert.assertEquals(10,ct.test1());
        System.out.println("test passed");
        //if I add 5 and 5 I got 10
        Assert.assertEquals(2,ct.test2());
        System.out.println("test passed");
    }
}
