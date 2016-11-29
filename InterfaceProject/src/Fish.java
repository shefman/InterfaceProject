
public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish(){
		super(0);
	} 
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String gName) {
		// TODO Auto-generated method stub
		name = gName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish " + name + " is playing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eats everything");
	}
	
	public void walk(){
		super.walk();
		System.out.println("Joke! Fish does not have legs");
	}

}
