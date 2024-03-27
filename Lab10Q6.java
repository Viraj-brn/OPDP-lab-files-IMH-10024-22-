package javaapplication11;

public class Lab10Q6 {
    public static void method(int x) throws ArithmeticException
    {
        int a=10,b=0;
        if(b==0)
            throw new ArithmeticException("age should be > 18");
        else 
            System.out.print("Okay");
    }
    public static void main(String args[]) throws ArithmeticException
    {
        try{
            method(20);
            System.out.print("Good Age");
        }
        catch(ArithmeticException e){
            throw new Exception(e.getMessage()); 
        }
    }
}
