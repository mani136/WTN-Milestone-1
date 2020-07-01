package class_and_objects;
class Box
{
	int width;
	int height;
	int depth;
	public void test(int w,int h,int d) {
		width=w;
		height=h;
		depth=d;
		System.out.println(width*height*depth);
	}
}
public class Ex_1 {
	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		Box bb=new Box();
		bb.test(a,b,c);
	}
}
