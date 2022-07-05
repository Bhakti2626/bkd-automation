package operatorType;

public class UnaryOperatorEx3 {
	
	public static void main(String args[]) {
		
		int a =10;
		System.out.println(a++);     //out:10 and a=10+1=11
		
		System.out.println(++a);     // out:a=11+1=12
		
		System.out.println(a++);     // out:a=12   a=12+1=13
		
		System.out.println(a--);     // out a=13.... a=13-1=12
		
		System.out.println(--a);     // 12-1=11 out 11
		
		System.out.println(a++);     // out :a=11 then  a=11+1=12
		
		System.out.println(a--);     // out: a=12 thne  a=12-1=11
		
		System.out.println(++a);     // out:11+1=12  a=12
		System.out.println(a++);     // out: a=12 then a=12+1= 13
		System.out.println(--a);     // a=13-1=12 out 12
		System.out.println(a++);     // a=12 then a=12+1=13
		System.out.println(a--);     // a=13 then a=13-1=12
		System.out.println(++a);     //12+1=13 then a=13
		System.out.println(a++);     //out a=13 then a=13+1=14
		System.out.println(--a);     // out a=13 then a=13
		System.out.println(a--);     //out then a=13 a=13-1=12
		System.out.println(a++);     // a=12 then a=12+1 =13
	}

}
