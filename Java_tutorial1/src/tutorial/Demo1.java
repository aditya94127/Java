package tutorial;

public class Demo1 {
	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println(j);
		Demo1 obj1=new Demo1();
		System.out.println(obj1.j);
		obj1.test1();
	}
	public  void test1() {
		System.out.println(Demo1.j);
	}
 
}
 