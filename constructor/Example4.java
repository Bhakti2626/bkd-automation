package constructor;

public class Example4 {

	int n =20;  // class variable
	Example4() {
		
		n=10; // initialization
	}
	
	Example4(float b){
		
		n=(int) b;
		
	}
	public void test() {
		System.out.println(n);
	}
	
	public static void main(String args[]) {
		Example4 obj = new Example4();
		obj.test();
		System.out.println(obj.n);
		Example4 obj1 = new Example4(20);
		System.out.println(obj1.n);
		
		obj1.n = 50;
		
		System.out.println(obj1.n);
		System.out.println(obj.n);
		
	}
	
}
