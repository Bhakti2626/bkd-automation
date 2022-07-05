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
