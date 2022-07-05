package VariableTypes;

public class GlobalVariableType {

	String s = "Bhakti";
	char c = 'S';

	public void test() {
		System.out.println(s);
		System.out.println(c);

	}
	public static void main(String args[]) {
		GlobalVariableType obj = new GlobalVariableType();
		obj.test();
		System.out.println(obj.c);
		
	}

}
