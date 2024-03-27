package javaapplication11;
import java.util.Scanner;
public class Lab10Q3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int k[]=new int[5];
        System.out.println("Enter the numbers in array:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("Divison division:");
            for(int i=0;i<5;i++)
        {
            k[i]=arr[i+1]/arr[i];
            System.out.println(k[i]);
        }
        }
        catch(ArithmeticException e){
            System.out.print("Denominator must be non zero"+e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.print("Cannot exceed the maximum array length"+e.getMessage());
        }
    }
}
