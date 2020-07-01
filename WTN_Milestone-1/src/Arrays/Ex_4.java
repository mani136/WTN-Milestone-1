package Arrays;
public class Ex_4 {
public static void main(String[] args) {
	int a[]=new int[26];
	for(int i=0;i<26;i++)
	{
		a[i]=i;
		System.out.print((char)(a[i]+65)+" ");
	}
	System.out.println("\n");
	for(int i=0;i<26;i++)
	{
		a[i]=i;
		System.out.print((char)(a[i]+97)+" ");
	}
}
}
