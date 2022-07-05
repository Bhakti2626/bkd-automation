public class StaticNonStaticMethodProgram {
	
	public static void getStaticData() {
		
		System.out.println("Inside static method");
	}
	
	public void getData() {
		System.out.println("Inside non static method");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		System.out.println("inside main method");
		StaticNonStaticMethodProgram.getStaticData();
		
		int x = 30;
		int y = 10;
		
		
		StaticNonStaticMethodProgram obj = new StaticNonStaticMethodProgram();
		obj.getData();
		
		System.out.println("add :" + obj.add(x, y));
		System.out.println("sub:" + obj.sub(x, y));
		System.out.println("mul :"+ obj.mul(x, y));
		System.out.println("div:"+ obj.div(x, y));
	
	}
}

	
