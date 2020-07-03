package Exceptional_Handling;
public class MathOperation {
	public static void main(String[] args)throws ArithmeticException,NumberFormatException {
		int arr[]=new int[5];
		int sum=0,avg=0;
		for(int i=0;i<5;i++) 
		{
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
		}
		avg=sum/5;
		System.out.println("Sum is "+sum+" and Average is "+avg);
	}
}
