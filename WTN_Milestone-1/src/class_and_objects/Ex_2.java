package class_and_objects;
class Calculator
{
	static int powerInt(int num1,int num2)
	{return   (int)Math.pow(num1, num2);}
	static double powerDouble(double num1,double num2)
	{return   Math.pow(num1, num2);}
}
public class Ex_2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	Calculator c=new Calculator();
	int a,b;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	System.out.println(c.powerInt(a,b));
	System.out.println(c.powerDouble(a, b));
}
}