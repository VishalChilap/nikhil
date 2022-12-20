package Mar15;

public class Class {
	 private String name;
	private String id;
	static String department;
	
	Class(String name, String id){
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String toString() {
		return "Class [name=" + name + ", id=" + id + ", Department="+department+"]";
	}
	public static void show() {
		System.out.println("In static show method");	
	}
	

}
