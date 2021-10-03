package exceptions;

public class Math {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("line 1");
        try {
            System.out.println("line 2: "+a/0);
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("your code has issue");
        }
        System.out.println("line 3");


    }
}
