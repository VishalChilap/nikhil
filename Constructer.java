package Mar14;
class Boys{
	String name;
	int age;
	String course;
	Boys(){
		this.name="Vishal";
		this.age=23;
		this.course="Mecahnical";
		//System.out.println(name);
		//System.out.println(age);
		//System.out.println(course);
		}
	}

public class Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boys B1 = new Boys();
		System.out.println(B1.name);
		System.out.println(B1.age);
		System.out.println(B1.course);


	}

}
