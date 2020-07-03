package Inheritance;
public class Employee extends Person{
	private double annual_salary;
	private String doj;
	private String ino;
public double getAnnual_salary() 
{return annual_salary;}
public void setAnnual_salary(double annual_salary) 
{this.annual_salary = annual_salary;}
public String getDoj() 
{return doj;}
public void setDoj(String doj) 
{this.doj = doj;}
public String getIno() 
{return ino;}
public void setIno(String ino) 
{this.ino = ino;}
}