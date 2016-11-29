
public class Cat extends Animal implements Pet {
	
	private String name;
	
	public Cat(String gName){
		super(4);
		name = gName;
	}
	
	public Cat(){
		this("");
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
		System.out.println("Cat " + name + " is playing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats eat mouse");
	}

}
