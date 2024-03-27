
package javaapplication10;
class Car{
    String brand;
    Car(String s){
     brand=s;   
    }        
    void disp(){
        System.out.print(brand);
    }
}
public class lab4q2 {
   public static void main(String args[]){
        Car c=new Car("Ford");
        c.disp();
   }
}
