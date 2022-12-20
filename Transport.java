package Mar17;
abstract class  Vehival{
	abstract void showMethod();
}
class Car extends Vehival{

	@Override
	void showMethod() {
		// TODO Auto-generated method stub
		System.out.println("In car");
	
	}
	
}
class Truck extends Vehival{

	@Override
	void showMethod() {
		// TODO Auto-generated method stub
		System.out.println("In truck");
		
	}
	
}

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehival a1 = new Car();
		a1.showMethod();
		
		Vehival t1 = new Truck();
		t1.showMethod();
		
		//Vehival v1 = new Vehival();   // not posssible
		//v1.showMethod();

	}

}
