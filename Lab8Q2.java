package javaapplication11;
abstract class bike{
    abstract void run();
}
class Honda extends bike{
    void run(){
        System.out.println("Vrooooooommmmmm");
    }
}
public class Lab8Q2 {
    public static void main(String args[]){
        bike b=new Honda();
        b.run();
    }
}
