package lemdatest;

interface Test
{
	public void test();
}
public class LemdaTestOne {

	public static void main(String[] args) {
		Test t=()->System.out.println("test() method implementation");
		
		t.test();
	}	
}
