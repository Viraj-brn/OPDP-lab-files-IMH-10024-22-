
package javaapplication11;
import java.util.*;
class Shape{
    double l, b, h;
    void getArea(){
        double Area=0;
        System.out.println("Area of shape is:"+Area);
    }
}
class Rectangle extends Shape{
    void getArea(){
        double Area;
        Scanner sc=new Scanner(System.in);
        l=sc.nextDouble();
        b=sc.nextDouble();
        Area=l*b;
        System.out.println("Area of Rectangle is:"+Area);
    }
}
class Box extends Rectangle{
    void getArea(){
        double Area;
        Scanner sc=new Scanner(System.in);
        l=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        Area=2*(l*b+b*h+h*l);
        System.out.print("Area of Box is:"+Area);
    }
}
public class Lab7Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        Rectangle r=new Rectangle();
        Box b=new Box();
        s.getArea();
        r.getArea();
        b.getArea();
        
    }
}
