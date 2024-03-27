package javaapplication11;
class outer{
    class inner{
            void disp(){
             System.out.print("In inner class");
            }
    }
}
public class Lab8Q1A {
    public static void main(String args[])
    {
        outer.inner i= new outer().new inner();
        i.disp();
    }
}
