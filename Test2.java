package Mar17;
class FG
{
    void getData()
    {
        System.out.println("Inside hello");
    }
}
class S extends FG
{
	@Override
   protected void getData()     //here try to use private and see what happen
    {
        System.out.println("Inside GS");
    }
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FG obj = new S();
        obj.getData();


	}

}
