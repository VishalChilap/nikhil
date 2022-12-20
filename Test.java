package Mar18;
class Derived{
	public void getDetails()throws Exception {  //Exception should be in increasing order
		System.out.println("Derived class");    // like in parent throws Exception and in child ArithmeticException
	}                                         // are accepted or same type exception are accepted
}

public class Test extends Derived {
	public void getDetails()throws ArithmeticException {
		System.out.println("Test class");
	}

	public static void main(String[] args)throws Exception {//After throws Exception you have to handle in main method
		// TODO Auto-generated method stub
		Derived d1 = new Derived();
		d1.getDetails();
		
		System.out.println();
		Derived d2 = new Test();
		d1.getDetails();
		
		System.out.println();
		Test d3 = new Test();
		d3.getDetails();

	}

}
