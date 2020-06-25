package flow_control_statements;
public class Ex_15 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	for(int i=0;i<a;i++) {
		for(int j=0;j<=i;j++)
			System.out.print("* ");
		System.out.println("\n");
	}
}
}
