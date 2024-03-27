package javaapplication10;
import java.util.*;
    class Employee{
        public int Emp_ID;
        public String Emp_name,Emp_dept;
        void display(){
            System.out.println("ID:"+Emp_ID+" Name:"+Emp_name+" Department:"+Emp_dept);
        }
    }
class Employee1{
        private int Emp_ID;
        private String Emp_name,Emp_dept;
        void display(){
            System.out.println("ID:"+Emp_ID+" Name:"+Emp_name+" Department:"+Emp_dept);
        }
    }
class Employee2{
        protected int Emp_ID;
        protected String Emp_name,Emp_dept;
        void display(){
            System.out.println("ID:"+Emp_ID+" Name:"+Emp_name+" Department:"+Emp_dept);
        }
    }
class Employee3{
        int Emp_ID;
        String Emp_name,Emp_dept;
        void display(){
            System.out.println("ID:"+Emp_ID+" Name:"+Emp_name+" Department:"+Emp_dept);
        }
    }
public class lab4q1 {
    
    public static void main(String args[]){
        Employee e=new Employee();
        e.Emp_ID=10;
        e.Emp_dept="Developer";
        e.Emp_name="Shubham";
        e.display();
         Employee2 e2=new Employee2();
        e2.Emp_ID=30;
        e2.Emp_dept="Sales";
        e2.Emp_name="Vineet";
        e2.display();
         Employee3 e3=new Employee3();
        e3.Emp_ID=40;
        e3.Emp_dept="Managing";
        e3.Emp_name="Nitin";
        e3.display();
        Employee1 e1=new Employee1();
        e1.Emp_ID=20;
        e1.Emp_dept="Developer";
        e1.Emp_name="Manoj";
        e1.display();
    }
}
