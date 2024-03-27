package javaapplication11;
class Person{
    String name="XYZ";
    int age=25;
    void display(){
    /*Shadowing*/
    String name="ABC";
    System.out.println("Name:"+name+" & Age:"+age);
    System.out.println("Name:"+this.name);}
    public static void show(){
        System.out.println("You are in Person's show");
    }
}
class student extends Person{
    int roll,marks;
    public static void show(){
        System.out.println("You are in student's show");
    }
}
class employee extends Person{
    int salary=10000;
    void display(){System.out.println("Salary is "+salary);}
}
public class Lab7Q6 {
    public static void main(String args[]){
        Person p=new Person();
        Person s=new student();
        Person e=new employee();
        /*Method hiding*/
        p.show();
        s.show();
        p.display();
        /*Runtime polymorphism*/
        e.display();
    }
}
