package Overriding;
public class Fruit {
	private String name;
	private String taste;
	private String size;
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Name of the Fruit:"+name);
		System.out.println("Taste of the Fruit:"+taste);
		System.out.println("Size of the Fruit:"+size);
	}
}

class Apple extends Fruit{
	Apple(String name, String taste, String size) 
	{super(name, taste, size);}
	void eat()
	{super.eat();}
}

class Orange extends Fruit{
	Orange(String name, String taste, String size) 
	{super(name, taste, size);}
	void eat()
	{super.eat();} 
}

class Fruit_Main {
	public static void main(String[] args) {
		Apple a=new Apple("Apple","Sweet","Small");
		Orange o=new Orange("Orange","Sweet-Tart","Small");
		a.eat();
		System.out.println();
		o.eat();
		
	}
}