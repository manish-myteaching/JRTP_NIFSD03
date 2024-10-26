package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		m();
	}

	static void m() {
		n();
	}

	static void n() {
		m();
	}

}
