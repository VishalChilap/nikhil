package Mar14;
class Candidate{    // it is not compulsory to use getar with setar you use only getar or setar or both
	String name;
	int age;
	String course;
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

public class GetarSetar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate s1 = new Candidate();
		s1.setName("Vishal");
		s1.setAge(23);
		s1.setCourse("Mechanical");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getCourse());

	}

}
