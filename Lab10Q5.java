package javaapplication11;

public class Lab10Q5 {
      public static void main(String args[])  
    {  
        try {     
            try {
                int a=0,b=5,c;
                c=b/a;
                try {  
                    int arr[] = { 1, 2, 3, 4 };   
                    System.out.println(arr[10]);  
                }    
                catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception"+e.getMessage());  
                }  
            }     
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception"+e.getMessage());    
            }  
        }     
        catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.print(e4);
        }  
        catch (Exception e5) {  
            System.out.print(e5);    
        }  
    }  
}
