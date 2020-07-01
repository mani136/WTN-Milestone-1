package Arrays;
public class Ex_8 {
	public static void main(String[]args) {
	 int i,si=-1,ss=-1,c=0,s=0;
	  int []a=new int[args.length];
	  for(i=0;i<args.length;i++)
	  {
	    a[i]=Integer.parseInt(args[i]);
	  }
	  for(i=0;i<args.length;i++)
	  {
	    if(a[i]==6)
	    {
	      si=i;
	      c++;
	    }
	    if(a[i]==7)
	    {
	      ss=i;
	      if(c==1) c++;
	    }
	  }
	  if(c==2)
	   for(i=si;i<=ss;i++)
	     {a[i]=0;}
	  for(i=0;i<args.length;i++)
	  {s+=a[i];}
	  System.out.println(s);
}}
