package Mar18;
public class Inheritance2Questions {
	String name;
	  
    Inheritance2Questions(String n) {  
        name = n;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Inheritance2Questions m1 = new Inheritance2Questions("guitar");
	     Inheritance2Questions m2 = new Inheritance2Questions("tv");
	     System.out.println(m2.equals(m1));
	}
	     
	public boolean equals(Object obj){
		Inheritance2Questions m = (Inheritance2Questions) obj;
		if (m.name != null) { 
			return true;  
		}
		return false;
		    


	}

}
