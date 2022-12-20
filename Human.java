package Mar18;
class Parent{
	int legs;
	int hands;
	Parent(int legs , int hands){
		System.out.println("In human costructor");
		this.hands=hands;
		this.legs=legs;
	}
	public void eat() {
		System.out.println("Parent eat");	
	}
	public static void walk() {
		System.out.println("Parent walk");
	}
}
class Baby extends Parent{
	boolean isCroel;
	Baby(int legs, int hands, boolean isCrowl){
		super(legs,hands);
		System.out.println("In baby costructor");
		this.isCroel=isCrowl;

	}
	@Override      
	public void eat() {     //final keyword is use to stop the method from overriding
		System.out.println("Baby eat");  //return type also same for overriding method
	}
	public static void walk() {      //static method is not overriding
		System.out.println("Baby walk");
	}
}

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent(4,4);
		p.eat();
		p.walk();
		
		System.out.println();
		Baby b = new Baby(4,4,true);
		b.eat();
		b.walk();
		//Baby.walk();
		//write way to write this is Baby.walk
		//Static method is not calling with object it call with class
		
		System.out.println();
		Parent b1 = new Baby(4,4,true);
		b1.eat();
		b1.walk();
		//while calling static method it is depend on reference class

	}

}
