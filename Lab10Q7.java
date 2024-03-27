package javaapplication11;

public class Lab10Q7 {
    public static void AgeCheck(int x)
    {
        if(x<0){throw new IllegalArgumentException("Age cannot be less than 0");}
        System.out.print("Age is "+x);
    }
    public static void main(String args[])
    {
        try{
            AgeCheck(-5);
        }
        catch(IllegalArgumentException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
