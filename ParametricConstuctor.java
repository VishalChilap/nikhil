package Mar14;
class ClassStudent {
	String name;
	int age;          // this is properties/attributes
	String course;
	ClassStudent(){
		this.name = "Vishal";
		this.age = 23;                //for s1
		this.course = "Mechanical";
	}
	ClassStudent(String name, int age){
		this.name = name;
		this.age = age;               //for s2 and s3
		this.course = "Electical";
	}
	ClassStudent(String name, int age, String course){
		this.name = name;
		this.age = age;               //for s4
		this.course = course;
	}
	public String toString() {
		return ("Name: "+this.name+" Age : "+this.age+" Course : "+this.course);
	}
}

public class ParametricConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudent s1 = new ClassStudent();    //non Parametric
		ClassStudent s2 = new ClassStudent("Viki",22);     //Parametric 
		ClassStudent s3 = new ClassStudent("Datta",24);    //Parametric
		ClassStudent s4 = new ClassStudent("Priyanka",21,"Computer");   //Parametric
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
