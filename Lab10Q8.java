package javaapplication11;
import java.util.Scanner;
public class Lab10Q8 {
    public static void method1(){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=b/a;
    }
    public static void method2(){
        method1();
    }
    public static void method3(){
        method2();
    }
    public static void main(String[] args) {
        try {
            method3();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
