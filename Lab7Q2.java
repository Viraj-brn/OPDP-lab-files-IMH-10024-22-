package javaapplication11;
import java.util.*;
class Circle{
    double r;
    double area(){
        return 3.14*r*r;
    }
    double set_width(){
        return r;
    }
    double circumference(){
        return 6.28*r;
    }
}
class Cylinder extends Circle{
    double h;
    void volume(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Radius: ");
        r=sc.nextDouble(); 
        System.out.print("Height: ");
        h=sc.nextDouble();
        double a=super.area();
        double volume=a*h;
        System.out.print("Volume is "+volume);
    }
}
public class Lab7Q2 {
    public static void main(String args[])
    {
        Cylinder c=new Cylinder();
        c.volume();
    }
}
