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

//****************************************************************************

package constructor;

public class DefaultConstructor2 {
	
	String name;
	DefaultConstructor2(){
		
		name="Shivlila";
	}
	DefaultConstructor2(String a){
		
		name = "Bhakti";
	}
	public void myName() {
		
		System.out.println(name);
	}
	public static void main(String args) {
		
		DefaultConstructor2 obj1 = new DefaultConstructor2();
		obj1.myName();
		
		DefaultConstructor2 obj2 = new  DefaultConstructor2();
		obj2.myName();
	}

}

//****************************************************************************

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

//****************************************************************************

package constructor;

public class Example3 {
	
	Example3(){
	
		System.out.println("cons with zero argument");
	}
	
	Example3(int a){
		System.out.println("Cons with int argument");
		
	}
	Example3(float b){
		System.out.println("Cons with float argument");
	}
	
	Example3(char s){
		System.out.println("Cons with char argument");
	}
	
	public static void main(String args[]) {
		
		Example3 O1 = new Example3();
		Example3 O2 = new Example3(20);
		Example3 O3 = new Example3(20.03f);
		Example3 O4 = new Example3(':');
	}

}


//****************************************************************************


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
