package flow_control_statements;
public class Ex_13 {
public static void main(String[] args) {
	for(int i=10;i<=99;i++)
	{
		int c=0;
		for(int j=2;j<i;j++)
			if(i%j==0)
				c++;
		if(c==0)
			System.out.println(i);
	}
}
}
