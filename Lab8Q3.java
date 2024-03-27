package javaapplication11;
import java.util.*;
abstract class Shape1{
    Scanner sc=new Scanner(System.in);
    abstract void Peri();
    abstract void area();
}
class Circle1 extends Shape1{
    int r;
    void Peri(){
        r=sc.nextInt();
        double peri=2*3.14*r;
        System.out.print("Perimeter of circle:"+peri);
    }
    void area(){
         r=sc.nextInt();
        double area=r*3.14*r;
        System.out.print("Area of circle:"+area);
    }
}
class Rectangle1 extends Shape1{
    int l,b;
    void Peri(){
         l=sc.nextInt();
         b=sc.nextInt();
        double peri=2*(l+b);
        System.out.print("Perimeter of Rectangle:"+peri);
    }
    void area(){
         l=sc.nextInt();
         b=sc.nextInt();
        double area=l*b;
        System.out.print("Area of Rectangle:"+area);
    }
}
public class Lab8Q3 {
    public static void main(String args[]){
        Shape1 c=new Circle1();
        c.Peri();
        c.area();
        Shape1 r=new Rectangle1();
        r.Peri();
        r.area();
    }
}
