package Mar15;


class Vehical {
	
	int tyre;
	
	String fuel;
	
	
	
}

class car extends Vehical{
	
	car(int tyre, String fuel){
		this.tyre = tyre;
		this.fuel = fuel;
	}
	
	public String toString() {
		return "Tyre = "+tyre+" fuel = "+fuel;
	}
}

class bike extends Vehical{
	
	bike(int tyre, String fuel){
		this.tyre = tyre;
		this.fuel = fuel;
	}
	
	public String toString() {
		return "Tyre = "+tyre+" fuel = "+fuel;
	}
}

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c = new car(4, "cng");
		
		System.out.println(c);
		
		bike b = new bike(2, "petrol");
		
		System.out.println(b);

	}

}
