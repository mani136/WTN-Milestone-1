package Arrays;
public class Ex_3 {
public static void main(String[] args) {
	int a[]=new int[] {1,4,34,56,7};
	int b=Integer.parseInt(args[0]);
	int c=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b)
			System.out.println("Index No is:"+i);
		else
			c++;
	}
	if(c==a.length)
		System.out.println("-1");
}
}
