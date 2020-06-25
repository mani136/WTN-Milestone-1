package flow_control_statements;
public class Ex_14 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int sum=0,r=0;
	while(a>0)
	{
		r=a%10;
		sum=sum+r;
		a=a/10;
	}
	System.out.println(sum);
}
}
