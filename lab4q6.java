package javaapplication10;
class Area1{  
    int area=1;  
    static Area1(int ...a){
        for(int i=0;i<a.length;i++){
            area=area*a[i];
        }
    }
    static Area1(int a){
        area=a*a;
    }
    void display(){
        System.out.println("Area is:"+area);
    }
    }    
public class lab4q6 {
    public static void main(String args[]){
        Area1 rect=new Area1(10,13);
        Area1 square=new Area1(12);
        rect.display();
        square.display();
    }
    
}
