
public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();

		System.out.println(e.getClass().getName());
		e.walk();
		e.eat();

		System.out.println(c.getClass().getName());
		c.walk();
		c.eat();
		c.play();

		System.out.println(p.getClass().getName());
		p.play();

		System.out.println(d.getClass().getName());
		d.walk();
		d.eat();
		d.play();

		System.out.println(a.getClass().getName());
		a.walk();
		a.eat();

	}

}
