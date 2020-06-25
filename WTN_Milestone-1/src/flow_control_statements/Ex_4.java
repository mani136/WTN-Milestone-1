package flow_control_statements;
public class Ex_4 {
public static void main(String[] args) {
	char a,b;
	a=args[0].charAt(0);
	b=args[1].charAt(0);
	if(a>b)
		System.out.println(b+" "+a);
	else
		System.out.println(a+" "+b);
}
}
