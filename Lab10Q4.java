package javaapplication11;
public class Lab10Q4 {
    public static void AgeCheck(int x)
    {
        if(x<0){throw new ArithmeticException("Age cannot be Shunya");}
        System.out.print("Age is "+x);
    }
    public static void main(String args[])
    {
        try{
            AgeCheck(-5);
        }
        catch(ArithmeticException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
