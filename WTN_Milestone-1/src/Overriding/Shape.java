package Overriding;
public class Shape {
public void draw(String shape) 
{System.out.println("Shape is "+shape);	}
public void Erase(String erase) 
{System.out.println("Erasing is "+erase);}
}
class Circle extends Shape{
	public void draw(String shape) 
	{super.draw(shape);}
public void Erase(String erase) 
{super.Erase(erase);}
}
class Triangle extends Shape{
	public void draw(String shape) 
	{super.draw(shape);}
public void Erase(String erase) 
{super.Erase(erase);}
}
class Square extends Shape{
	public void draw(String shape) 
	{super.draw(shape);}
public void Erase(String erase) 
{super.Erase(erase);}
}
class ShapeMain{
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square s=new Square();
		c.draw("Circle Shape");
		c.Erase("Circle Erase");
	    System.out.println();
		t.draw("Triangle Shape");
		t.Erase("Triangle Erase");
        System.out.println();
		s.draw("Square Shape");
		s.Erase("Squarew Erase");
	}
}
