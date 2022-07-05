package variable;

public class GlobalVariable {
	
	String s ="Bhakti";
	char a= 'c';
	
	int x =100;
	
	public void test() {
		System.out.println(x);
		
	}
	public static void test1() {
		
	}
	
	public static void main(String args[]) {
		
		StaticVariable z =new StaticVariable(100);
		z.test();
		
			
	}

}
