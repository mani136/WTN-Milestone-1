package Arrays;
public class Ex_6 {
public static void main(String[] args) {
	int arr[]=new int[20];
	int temp;
	for(int i=20;i>0;i--)
    {
      arr[20-i]=i;
    }
    for(int i=0;i<arr.length;i++)
    for(int j=0;j<arr.length;j++)
    {
      if(arr[i]<arr[j])
      {
        temp=arr[i];      
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i] +" ");
    }
}
}
