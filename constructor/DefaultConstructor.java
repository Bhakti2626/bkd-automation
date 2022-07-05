package constructor;

public class DefaultConstructor {
	
	public void method() {
		
		String name= "Bhakti";
		System.out.println(name);
	}
	public static void main(String args[]) {
		
		DefaultConstructor obj = new DefaultConstructor();
		obj.method();
	}

}
