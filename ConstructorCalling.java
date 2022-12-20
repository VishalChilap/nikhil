package Mar15;
class Student{
	String name;
	int age;          
	String course;
	Student(){
		System.out.println("In default constructor");
	}
	Student(String name, int age, String course){
		this();         //Calling default constructor
		this.name = name;
		this.age = age;              
		this.course = course;
	}
	public String toString() {
		return ("Name: "+this.name+" Age : "+this.age+" Course : "+this.course);
	}
}

public class ConstructorCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2 = new Student("Viki",22,"Mechanical");   
		Student s3 = new Student("Datta",24,"Electrical");   
		Student s4 = new Student("Priyanka",21,"Computer");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
