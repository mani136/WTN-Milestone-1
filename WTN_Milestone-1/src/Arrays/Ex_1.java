package Arrays;
public class Ex_1 {
public static void main(String[] args) {
	int a[]=new int[5]; //lets array size is 5
	int sum=0;
	double avg;
	for(int i=0;i<5;i++)
	{
		a[i]=Integer.parseInt(args[i]);
		sum=sum+a[i];
	}
	avg=(float)sum/5;
	System.out.println("Sum:"+sum);
	System.out.println("Avg:"+avg);
}
}
