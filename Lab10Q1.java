package javaapplication11;
class Something{
    public void finalize(){System.out.println("Garbage collection");}
}
public class Lab10Q1 {
    public static void main(String args[]){
        Something s1=new Something();
        Something s2=new Something();
        Something s3=new Something();
        Something s4=new Something();
        s1=s2;
        System.gc();
        s3=null;
        s4=null;
        System.gc();
    }
}
