package flow_control_statements;
public class Ex_3 {
public static void main(String[] args) {
	if(args.length==0)
		System.out.println("No Values");
	else
	{
		for(int i=0;i<args.length-1;i++)
			System.out.print(args[i]+",");
		System.out.println(args[args.length-1]);
	}  
	
}
}
