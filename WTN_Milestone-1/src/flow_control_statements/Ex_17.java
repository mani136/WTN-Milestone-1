package flow_control_statements;
public class Ex_17 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int t=a,sum=0,r;
	while(a>0)
	{
		r=a%10;
		sum=sum*10+r;
		a=a/10;
	}
	if(sum==t)
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
}
}
