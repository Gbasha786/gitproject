package java;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest st = new StaticTest();
		StaticTest st1 = new StaticTest();
		
		System.out.println("from st ref : " + st.a);
		System.out.println("From st1 ref : " + st1.a);
		
		st.a =1;
		
		System.out.println("from st ref : " + st.a);
		System.out.println("from st1 ref : " + st1.a);
	}


}

class StaticTest{
	static int a;
}
