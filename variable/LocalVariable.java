package variable;

public class LocalVariable {
	
	public static void addn() {
		int a =10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}
	
	public void mul() {
		int d = 5;
		int e = 6;
		int f = d*e;
		System.out.println(f);
	}
	
	public static void main(String args[]) {
		LocalVariable.addn();
		LocalVariable obj = new LocalVariable();
		obj.mul();
		
	}
	

}
