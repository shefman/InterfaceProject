
abstract public class Animal {
	
	protected int legs;
	
	protected Animal(int gLegs){
		legs = gLegs;
	}
	
	public void walk(){
		System.out.println("Animal walks on " + legs + " legs");
	}
	
	abstract public void eat();

}
