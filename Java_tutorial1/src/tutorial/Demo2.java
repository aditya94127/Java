package tutorial;

public class Demo2 {
	int i;
	static Demo2 obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj=new Demo2();
		System.out.println(obj.i);
		obj.test();
	}
	public void test() {
		System.out.println(obj.i);
		System.out.println("test 1");
		System.out.println("test 2");
	}

}
