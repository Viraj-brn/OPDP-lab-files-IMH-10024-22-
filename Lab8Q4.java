package javaapplication11;
interface Person1{
    static int salary=10000;
    static void dispSalary(){System.out.println("Salary:"+salary);}
    abstract void display();
}
class Employee implements Person1{
    public void display(){
        System.out.print("Employee ");
    }
}
public class Lab8Q4 {
    public static void main(String args[]){
        Person1 p=new Employee();
        p.display();
        Person1.dispSalary();
    }
}
