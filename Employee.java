package Mar15;

public class Employee {
	String id;
	String name;
	String department;
	String Designation;
	Employee(){
		department = "Training";
	}
	Employee(String id, String name, String Designation, String department){
		this.id=id;
		this.name=name;
		this.Designation=Designation;
		this.department=department;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", Designation=" + Designation
				+ "]";
	}
	

}
