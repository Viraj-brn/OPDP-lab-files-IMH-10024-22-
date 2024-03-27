package javaapplication10;
class Student{  
    int roll;  
    String name;
    int marks[]=new int[5];
    Student(){  
    roll = 0;  
    name = "Unknown";
    for(int i=0;i<marks.length;i++){
        marks[i]=0;
    }
    }    
    Student(int i,String n,int a,int b,int c,int d,int e){  
    roll = i;  
    name = n;
    for(int i=0;i<marks.length;i++){
        marks[i]=next;
    }
    }    
    void display(){
        System.out.println(roll+" "+name);
        for(int i=0;i<5;i++)
            System.out.println(marks[i]);
    }
}  
public class lab4q3 {
    public static void main(String args[]){
        Student s=new Student();
        Student s1=new Student(10,"Vaibhav",50,60,80,40,100);
        s.display();
        s1.display();
    }
}
