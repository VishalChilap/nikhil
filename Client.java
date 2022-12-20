package Mar17;
class A {
	private void show() {
		System.out.println("In parent");
	}
	A(){
		System.out.println("In A constructor");
	}

}
class B extends A{
//	@Override
	void show() {
//		super.show();            //super key used to call parent method
		System.out.println("In child");
	}
	B(){
		//in this type it will first go to parent class and execute parent constructor
		// after that it will execute child constructor
		System.out.println("In B constructor");

	}

}


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A b1 = new B();
		B b1 = new B();
		b1.show();

	}

}
