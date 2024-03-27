package javaapplication10;
import java.util.*;
class Student1{  
    int roll;  
    String name;
    int marks[]=new int[5];
    Student1(int r,String n){  
    roll = r;  
    name = n;
    }
    void display(){
        System.out.println(roll+" "+name);
        for(int i=0;i<5;i++)
            System.out.println(marks[i]);
    }
    int average(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+marks[i];
        }
        return sum/5;
    }
}
public class lab4q4 {
    void input(int marks[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        } 
    }  
    public static void main(String args[]){
        lab4q4 l=new lab4q4();
        Student1 s1=new Student1(10,"Vaibhav");
        Student1 s3=new Student1(11,"Sumit");
        Student1 s2=new Student1(12,"Vinod");
        l.input(s1.marks);
        s1.display();
        System.out.println("Average:"+s1.average());
        l.input(s2.marks);
        s2.display();
        System.out.println("Average:"+s2.average());
        l.input(s3.marks);
        s3.display();
        System.out.println("Average:"+s3.average());
    }
}
