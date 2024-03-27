package javaapplication11;
abstract class Base1{
    abstract class Base2{
    abstract void display();
    }
}
class Derived1 extends Base1{
    class Derived2 extends Base2{
        void display(){System.out.println("OKAY");}
    }
}
public class Lab8Q5 {
    public static void main(String args[]){
        Base1.Base2 b=new Derived1().new Derived2();
        b.display();
    }
}
