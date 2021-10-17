package unittesting;

public class CalculatorTest {
    Calculator cal = new Calculator();
    //if I add 5 and 5 I got 10
    public int test1(){
        return cal.add(5, 5);
    }
    //if I subtract 5 to 5 I got 0
    public int test2(){
        return cal.sub(5, 5);
    }
}
