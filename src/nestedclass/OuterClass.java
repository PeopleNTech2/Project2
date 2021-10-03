package nestedclass;

public class OuterClass {
    //outer class variables
    private int outerNum1 = 10;
    //outer class constructor
    public OuterClass(){

    }
    Inner inner = new Inner();

    //outer class methods
    public void outerMethod1(){
        System.out.println("outer class method 1");
        inner.innerMethod();
    }
    public void outerMethod2(){
        System.out.println("outer class method 2");
    }
    //inner class
    public class Inner{
        //inner class constructor
        public Inner(){

        }
        //inner class variables
        int numA = 6;
        //inner A class methods
        public  void innerMethod(){
            outerNum1 = 64;
            System.out.println("this is Inner class method");
        }
    }//inner class ends here

}//outer class ends here
