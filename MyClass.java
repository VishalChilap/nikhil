package Mar16;
class Animal{
	int legs;
	String walk;
	int mouth;
	int tail;
	
	Animal(int legs, int mouth, int tail){
		System.out.println("Inside animal constructor");
		this.legs=legs;
		this.mouth=mouth;
		this.tail=tail;
	}
	
	public void walk() {
		System.out.println("I walk");
	}
	
	public void eat() {
		System.out.println("I eat");
	}
}

class Dog extends Animal{
	int paws;
	
	Dog(int paws, int legs, int mouth, int tail){
		super(legs,mouth,tail);     //supper is use to call parent parametric constructor if it present
		//if in parent constructor there is default constructor no need to use super key
		System.out.println("Inside dog constructor");
		this.paws=paws;
	}
	
	public void bark() {
	System.out.println("Dog bark");
	}
}
class Puppy extends Dog{
	boolean iscute;
	Puppy(boolean iscute, int paws, int legs, int mouth, int tail){
		super(paws,legs,mouth,tail);
		System.out.println("Inside puppy constructor");
		this.iscute=iscute;
	}
	public void bark() {                    //Example of method overriding
		System.out.println("Puppy bark");
		}
	public void parentbark() {
		super.bark();       //Using super key you call parent method/attributes from parent direct
		}
}

class Elephant extends Animal{
	int trunk;
	
	Elephant(int trunk, int legs, int mouth, int tail){
		super(legs,mouth,tail);
		System.out.println("Inside elephant constructor");
		this.trunk=trunk;
	}
}

public class MyClass {

	public static void main(String[] args) {
		Animal a1 = new Animal(0,1,1);
		a1.eat();
		a1.walk();
		System.out.println("legs = "+a1.legs);
		
		
		Dog d1 = new Dog(4,3,1,2);
		d1.bark();
		d1.eat();
		d1.walk();
		System.out.println("paws = "+d1.paws);
		System.out.println("legs = "+d1.legs);
		
		
		Puppy p1 = new Puppy(true,2,3,1,2);
		p1.bark();
		p1.parentbark();
		p1.eat();
		p1.walk();
		System.out.println("is cute = "+p1.iscute);
		System.out.println("paws = "+p1.paws);
		System.out.println("legs = "+p1.legs);

		
		Elephant e1 = new Elephant(2,4,1,1);
		e1.eat();
		e1.walk();
		System.out.println("trunk = "+e1.trunk);
		System.out.println("legs = "+e1.legs);


	}

}
