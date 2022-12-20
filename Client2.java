package Mar17;
class AA{
	void show(int a, float bf) throws Exception {
		System.out.println("In parent");
	}
}
class BB extends AA{
	@Override
	 protected void show(int a, float bf) throws ArithmeticException  {  
		System.out.println("In child");         //access specifier should be same or in increasing order
	}                                         //like after default protected or public accept in child
                                              //arguments should be same and in same order
}                              //exception should be same or in decreasing order
public class Client2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AA a1 = new BB();
		a1.show(1, 00);

	}

}
