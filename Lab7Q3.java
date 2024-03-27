package javaapplication11;
import java.util.*;
class Rect{
    double l,b;
    Rect(){
        this.l=1;
        this.b=1;
    }
    Rect(double l,double b){
        this.l=l;
        this.b=b;
    }
}
class Cuboid extends Rect{
    double h;
    Cuboid(){
    this.h=1;
    }
    Cuboid(double h){
    this.h=h;
    }
    void volume(){
    System.out.println("Volume is:"+(l*b*h));
    }
}
class Lab7Q3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Cuboid c=new Cuboid();
        System.out.print("Enter height:");
        double h=sc.nextDouble();
        Cuboid cu=new Cuboid(h);
        c.volume();
        cu.volume();
    }
}
