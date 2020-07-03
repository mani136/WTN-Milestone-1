package Inheritance;

public class Animal {
	void eat() {
		System.out.println("Eat");
	}
	void sleep() {
		System.out.println("Sleep");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird eats");
	}
	void sleep() {
		System.out.println("Bird sleeps");
	}
	void fly() {
		System.out.println("Bird flies");
	}
}
class AnimalMain{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b= new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}