package Mar14;
class Full{
	String fname = "Vishal ";
	String lname = "Chilap";
	public String getFullName() {
		return (this.fname+this.lname);
	}
}

public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Full f1 = new Full();
		System.out.println(f1.getFullName());

	}

}
