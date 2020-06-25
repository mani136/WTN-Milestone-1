package flow_control_statements;
public class Ex_1A {
public static void main(String[] args) {
	int a;
	a=Integer.parseInt(args[0]);
	if(a==0)
		System.out.println("Zero");
	else if(a>0)
		System.out.println("Positive Number");
	else if(a<0)
		System.out.println("Negative Number");
}
}
