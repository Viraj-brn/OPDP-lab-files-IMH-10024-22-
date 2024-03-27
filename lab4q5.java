package javaapplication10;
class Area{  
    int area=1;  
    Area(int a,int b){
        area=a*b;
    }
    Area(int a){
        area=a*a;
    }
    void display(){
        System.out.println("Area is:"+area);
    }
    }    
public class lab4q5 {
    public static void main(String args[]){
        Area rect=new Area(10,13);
        Area square=new Area(12);
        rect.display();
        square.display();
    }
    
}
