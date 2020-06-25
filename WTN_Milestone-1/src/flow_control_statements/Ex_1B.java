package flow_control_statements;
public class Ex_1B {
public static void main(String[] args) {
	int a,b;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	if(a%10==b%10)
		System.out.println("True");
	else
		System.out.println("False");
}
}
