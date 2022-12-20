package Mar18;
class Animal{
	int legs;
	int mouth;
	void show() {
		System.out.println("In animal");
	}
}
class Dog extends Animal{
	int tail;
	@Override
	void show() {
		System.out.println("In child");
	}
	@Override
	public String toString() {
		return "Dog [tail=" + tail + ", legs=" + legs + ", mouth=" + mouth + "]";
	}
	
} 

public class Geekster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.legs=4;
		a1.mouth=2;
		a1.show();
		
		Dog d1 = new Dog();
		d1.legs=3;
		d1.mouth=1;
		d1.tail=2;
		d1.show();
		
		Animal c1 = new Dog();
		c1.show();
		
		System.out.println("Dog is "+d1);
				

	}

}
