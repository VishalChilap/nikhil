package Mar17;

class derived{
	protected void getDetails() {
		System.out.println("in derived");
	}
}

public class smaple extends derived {
	
	protected void getDetails() {
		System.out.println("in sample");
	
	}
	
	public static void main(String args[]) {
		derived obj = new smaple();
		obj.getDetails();
	}

}
