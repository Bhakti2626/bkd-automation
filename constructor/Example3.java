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
