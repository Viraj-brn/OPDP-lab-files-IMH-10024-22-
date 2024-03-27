package javaapplication11;
class Employee1 {
	private int ID;
	private String name;
	private int age;
	private static int empCount = 1;
	public Employee1(String name, int age,int id)
	{
		this.name = name;
		this.age = age;
		this.ID = id;
                empCount++;
	}
	public void show()
	{
		System.out.println("Id=" + ID + "\nName=" + name
						+ "\nAge=" + age);
	}
	public void showNextId()
	{
		System.out.println("Employee count is="
						+ empCount);
	}
	public void finalize()
	{
		--empCount;
	}
}

public class Lab10Q2 {
	public static void main(String[] args)
	{
		Employee1 e1 = new Employee1("Manoj", 56,100);
		Employee1 e2 = new Employee1("Pramod", 45,142);
		Employee1 e3 = new Employee1("Neha", 25,179);
		e1.show();
		e2.show();
		e3.show();
		e1.showNextId();
		e2.showNextId();
		e3.showNextId();
                {
                Employee1 i1 = new Employee1("Binod", 23,023);
                Employee1 i2 = new Employee1("Pooja", 21,056);
                i1.show();
                i2.show();
                i1.showNextId();
                i2.showNextId();
                i1 = i2 = null;
                System.gc();
                System.runFinalization();
		}
		e1.showNextId();
	}
}
