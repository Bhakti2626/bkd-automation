package constructor;

public class ZeroArgumentConst {
	
	static int a;
	static String name;
	
	ZeroArgumentConst(){
		
		a=20;
		name="Shiv";
		System.out.println(a);
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		
		ZeroArgumentConst obj1 = new ZeroArgumentConst();
	}
	

}
