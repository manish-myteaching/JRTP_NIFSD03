package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("First Line in main()");

		m();

		System.out.println("First Line in main()");
	}

	static void m() {
		System.out.println("First Line in m()");
		int i = 0;
		i = 10 / 0;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Last Line in m()");
		n(i);
	}

	static void n(int i) {
		System.out.println("First Line in n()");
		System.out.println("Business Logic");
		System.out.println("Last Line in n()");
	}

}
