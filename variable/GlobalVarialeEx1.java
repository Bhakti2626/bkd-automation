package VariableTypes;

public class GlobalVarialeEx1 {
	
	String s = "Velocity";
	char c = 'b';
	
	public void main() {
		System.out.println("s");
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		GlobalVarialeEx1 obj = new GlobalVarialeEx1();
		obj.main();
		System.out.println(obj.c);
		
	}

}
