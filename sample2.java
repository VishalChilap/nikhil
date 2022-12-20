package Mar17;

class abc{
	public void getDetails() {
		System.out.println("in derived");
	}
}

public class sample2 extends abc {
	
	protected void getDetails() {
		System.out.println("in sample");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc d1 = new sample2();
		
		d1.getDetails();

	}

}
