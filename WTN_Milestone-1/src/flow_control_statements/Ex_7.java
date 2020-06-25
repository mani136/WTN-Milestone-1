package flow_control_statements;
public class Ex_7 {
public static void main(String[] args) {
	char a=args[0].charAt(0);
	if(Character.isUpperCase(a))
        System.out.print(Character.toLowerCase(a));
    else
        System.out.print(Character.toUpperCase(a));
}
}
