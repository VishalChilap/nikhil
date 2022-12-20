package Mar14;
class Information{
	String name;
	int age;
	String course;
	Information(){
		this.name = "Vishal";
		this.age = 23;
		this.course = "Mechanical";
	}
	public String toString() {
		return ("Name: "+this.name+" Age : "+this.age+" Course : "+this.course);
	}
}

public class ToStringStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information f = new Information();
		System.out.println(f);

	}

}
