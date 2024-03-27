package javaapplication11;
class outer2{void dispOuter(){System.out.println("In outer");}
    static class inner2{
        public static void dispInner(){System.out.println("In inner");}
            }
        }
public class Lab8Q1C {
    public static void main(String args[]){
        outer2.inner2.dispInner();
    }
    
}
