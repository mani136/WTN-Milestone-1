package Inheritance;
public class TestEmployee extends Employee{
	public static void main(String[] args) {
		TestEmployee ob=new TestEmployee();
		ob.setName("Mani");
		System.out.println("Person Name: "+ob.getName());
		ob.setAnnual_salary(1300000);
		ob.setDoj("13-06-2014");
		ob.setIno("170030955");
		System.out.println("Annual Salary: "+ob.getAnnual_salary()+"\n"+"Date of Joining: "+ob.getDoj()+"\n"+"Insurance Number: "+ob.getIno());
	}
}
