package Mar15;

public class SimpleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.id = "111";
		e1.name = "AAA";
		e1.Designation = "Educator";
		
		Employee e2 = new Employee();
		e2.id = "222";
		e2.name = "BBB";
		e2.Designation = "Educator";
		
		Employee e3 = new Employee();
		e3.id = "333";
		e3.name = "CCC";
		e3.Designation = "Manager";
		
		System.out.println("e1 : "+e1);
		System.out.println("e2 : "+e2);
		System.out.println("e3 : "+e3);

	}

}
