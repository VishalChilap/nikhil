package Mar14;
class Me{
	String name;
	int age;
	String course;
	Me(){
		this.name="Vishal";
		this.age=23;
		this.course="Mechanical";
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getCourse() {
		return this.course;
	}
	public void setName(String name1) {
		this.name=name1;
	}
	public void setAge(int age1) {
		this.age=age1;
	}
	public void setCourse(String course1) {
		this.course=course1;
	}
}

public class GetarSetarConstructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me s1 = new Me();
		System.out.println("Hi");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getCourse());

	}

}
