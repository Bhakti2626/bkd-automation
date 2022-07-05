

//Syntax of class
public class MyfirstClass {
	
	//ways to write main method
	// static public void main(String args[]){}
	// public static void main(String[] args){}
	
	
	  public static void main(String args[]) {
		MyfirstClass.bhakti();
		System.out.println("myFIrstProgram");
	
		
		//Object creation in java
		MyfirstClass a = new MyfirstClass();
		a.shiv();
	}
	  
	// method syntax e.q public void shiv(){}
	// public is access modifier
	// void is data type - does not return an any value
	// shiv is a method name 
	//() - signature backet
	//(int a or String name) - signature backet which accept method argument
	  
	// non static method
	//private
	// protected
	public void shiv() {
	System.out.println("hey non static method is executed!!!!!");	
	}
	
	// static method
	public static void bhakti() {
		System.out.println("hey static method is executed....");

	}  
}
