package javaapplication11;
class Grandparent{
    int x=10;
    Grandparent(){
    this.x=x;}
}
class Parent extends Grandparent{
    void show(){System.out.println("In parent");}
}
class Child extends Parent{
    void show1(){
    super.show();
    System.out.println("In Child");
    }
}
public class Lab7Q4 {
    public static void main(String args[]){
        Child d=new Child();
        d.show1();
        System.out.println(d.x);
    }
    
}
