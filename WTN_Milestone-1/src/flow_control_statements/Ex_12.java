package flow_control_statements;
public class Ex_12 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int c=0;
	for(int i=2;i<a;i++)
		if(a%i==0)
			c++;
	if(c>0)
		System.out.println("Not Prime");
	else
		System.out.println("Prime");
}
}
