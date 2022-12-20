package Mar16;
class Vehical{
	int tyre;
	String type;
	String fuel;
	public void Class() {
		System.out.println("In Vehical class");
	}
}

class Car extends Vehical{
	Car(int tyre, String type, String fuel){
		this.tyre=tyre;
		this.type=type;
		this.fuel=fuel;
	}
	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", tyre=" + tyre + ", type=" + type + ",]";
	}
	public void Seater() {
		System.out.println("Four seater");
	}
	public void Class() {
		System.out.println("In Car class");
	}
}

class Truck extends Vehical{
	Truck(int tyre, String type, String fuel){
		this.tyre=tyre;
		this.type=type;
		this.fuel=fuel;
	}
	@Override
	public String toString() {
		return "Truck [fuel=" + fuel + ", tyre=" + tyre + ", type=" + type + ",]";
	}
	public void Use() {
		System.out.println("Use for goods carrier");
	}
	public void Class() {
		System.out.println("In Truck class");
	}
}

class Motorcycle extends Vehical{
	Motorcycle(int tyre, String type, String fuel){
		this.tyre=tyre;
		this.type=type;
		this.fuel=fuel;
	}
	@Override
	public String toString() {
		return "Motorcycle [fuel=" + fuel + ", tyre=" + tyre + ", type=" + type + ",]";
	}
	public void Seater() {
		System.out.println("Two seater");
	}
	public void Class() {
		System.out.println("In Motorcycle class");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v1  = new Vehical();
		v1.Class();
		
		Car c1 = new Car(4,"Four wheeler","Petrol ang CNG");
		c1.Class();
		System.out.println(c1);
		c1.Seater();

		
		Truck t1 = new Truck(4,"Four wheeler","Diesel");
		t1.Class();
		System.out.println(t1);
		t1.Use();

	
		Motorcycle m1 = new Motorcycle(2,"Two wheeler","Petrol");
		m1.Class();
		System.out.println(m1);
		m1.Seater();


	}

}
