package java;


public class Test {
	public static void main(String[] args) {
		int i = 300;
		System.out.println("val from main class --"+i);
		/*Test objtest = new Test();
		objtest.test(500);*/
		test();
	}
	
	public static void test(){
		int i=600;
		System.out.println("val from SUB class and the value of i is -- "+i);
	}

}