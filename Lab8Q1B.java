package javaapplication11;
class outer1{void dispOuter(){System.out.println("In outer");
    class inner1{
        void dispInner(){System.out.println("In inner");}
            }
    inner1 in=new inner1();
    in.dispInner();
        }
    }
public class Lab8Q1B {
    public static void main(String args[]){
        outer1 o=new outer1();
        o.dispOuter();
    }
}
