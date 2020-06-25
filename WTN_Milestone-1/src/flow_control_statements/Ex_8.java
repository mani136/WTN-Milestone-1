package flow_control_statements;
public class Ex_8 {
public static void main(String[] args) {
	char a=args[0].charAt(0);
	if(a=='R')
		System.out.println("RED");
	else if(a=='B' || a=='b')
		System.out.println("BLUE");
	else if(a=='G' || a=='g')
		System.out.println("GREEN");
	else if(a=='O' || a=='o')
		System.out.println("ORANGE");
	else if(a=='W' || a=='w')
		System.out.println("WHITE");
	else if(a=='Y' || a=='y')
		System.out.println("YELLOW");
	else
		System.out.println("Invalid code");
}
}
