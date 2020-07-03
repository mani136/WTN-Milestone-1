package Abstract_Classes;
public abstract class Compartment {
public abstract String notice();
}
class FirstClass extends Compartment{
	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "FirstClass  Compartment";
	}
}
class Ladies extends Compartment{
	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Luggage Compartment";
	}
}
class TestCompartment{
	public static void main(String[] args) {
		Compartment[] arr=new Compartment[10];
	int rand=1+(int)(Math.random()*4);
	for(int i=0;;) {
	if(rand==1)
		arr[i]=new Luggage();
	else if(rand==2)
		arr[i]=new Ladies();
	else if(rand==3)
		arr[i]=new General();
	else if(rand==4)
		arr[i]=new FirstClass();
	System.out.println(arr[i].notice());
	break;
	}
	}
}