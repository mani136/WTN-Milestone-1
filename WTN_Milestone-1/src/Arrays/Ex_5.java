package Arrays;
public class Ex_5 {
public static void main(String[] args) {
	int a[]=new int[10];
	for(int i=1;i<10;i++)
	{
		a[i]=i;
	}
	int temp;
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	System.out.println("Min-1: "+a[0]+" Min-2: "+a[1]);
	System.out.println("Max-1: "+a[a.length-1]+" Max-2: "+a[a.length-2]);
}
}
