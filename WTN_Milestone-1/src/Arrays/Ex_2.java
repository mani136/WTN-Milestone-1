package Arrays;
public class Ex_2 {
public static void main(String[] args) {
	int min=0,max=0;
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=Integer.parseInt(args[i]);
		if(a[i]>max)
			max=a[i];
	}
	min=a[0];
	for(int i=1;i<5;i++)
		if(min>a[i])
			min=a[i];
	System.out.println("Max: "+max);
	System.out.println("Min: "+min);
}
}
