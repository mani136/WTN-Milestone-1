package Arrays;
public class Ex_7 {
public static void main(String[] args) {
	int a[]=new int[] {12,34,12,45,67,89};
	int temp[]=new int[10];
	int i,j,tmp,p=0;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
	    {
	      if(a[i]<a[j])
	      {
	        tmp=a[i];      
	        a[i]=a[j];
	        a[j]=tmp;
	      }
	    }
	}
	for(i=0;i<a.length;i++)
	{
		if(a[i]!=a[i+1])
		{
			temp[p]=a[i];
			p++;
		}
	}
	for(j=0;j<a.length;j++)
		System.out.print(temp[j]+" ");
}
}
