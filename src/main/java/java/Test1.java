package java;


public class Test1 {
	public static void main(String[] args) {
		int i = 600;
		Test objTest = new Test();
		Test1 objTest1 = new Test1();
		objTest.test();
		/*System.out.println("value of INSTANCE variable is 500 and value of i is -- " +objTest1.i);
		System.out.println("value of INSTANCE variable in SUPER CLASS is 100 and value of i is -- " +objTest.i);
		*/System.out.println("value of LOCAL variable is 600 and value of i is -- " +i);
	}
}
