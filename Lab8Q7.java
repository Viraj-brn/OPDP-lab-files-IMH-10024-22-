package javaapplication11;
interface I1{
    abstract void disp();
    void show();
}
interface I2{
    abstract void disp();
    void show();
}
class C1 implements I1{
    public void disp(){System.out.print("I1 disp");}
    public void show(){System.out.print("I1 Show");}
}
class C2 implements I2{
    public void disp(){System.out.print("I2 disp");}
    public void show(){System.out.print("I2 Show");}
}
public class Lab8Q7 {
    public static void main(String args[]){
        C2 c2=new C2();
        c2.disp();
        c2.show();
    }
}
