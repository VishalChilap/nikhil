package Mar15;

public class MyScool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = new Class("Vishal","11");
		Class c2 = new Class("Viki","22");
		Class c3 = new Class("Datta","44");
		
		c1.department = "Mechanical";
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.show(); //In different class
		
		call(); //In same class
		
	}
	public static void call() {
		System.out.println("In static call method");	

	}

}
