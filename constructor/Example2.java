package constructor;

public class Example2 {
	
	Example2()
	{
		System.out.println("This is zero argument Cons");
	}
	public void test() {
		
		System.out.println("This is nonstatic method");
	}
	public static void main(String args[]) {
		Example2 obj1 = new Example2();
		obj1.test();
	}

}
