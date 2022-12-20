package Mar17;
class Test3{
	void myMethod() {
		System.out.println("hello");
	}
}

public class Derived extends Test3 {
	
	protected void myMethod(int x) {
		System.out.println("good");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj = new Derived();
		obj.myMethod();

	}

}
