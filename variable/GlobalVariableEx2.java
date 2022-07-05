
public class GlobalVariableEx2 {
	
	String s = "Velocity";
	char c = 'b';
	
	public void test() {
		
		int a = 40;
		int b = 10;
		System.out.println(s);
		System.out.println(c);
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		GlobalVariableEx2 obj = new GlobalVariableEx2();
		obj.test();
		System.out.println(obj.s);
		
	}

}
