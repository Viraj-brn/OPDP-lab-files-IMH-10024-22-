package javaapplication11;
class Base{
    void display()
    {
    System.out.println("In Base display");   
    }
}
class Derived extends Base{
    void display(){
    System.out.println("In Derived display");
    }
    void show(){
    System.out.println("In Derived show");
    }
}
public class Lab7Q5 {
    public static void main(String args[])
    {
        Base b=new Base();
        Base d=new Derived();
        b.display();
        d.display();
    }
}
