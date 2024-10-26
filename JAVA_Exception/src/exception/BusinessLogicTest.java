package exception;

public class BusinessLogicTest {

	public static void m(String s) throws CustomException {
		if (s == null) {
			throw new CustomException("Please pass value");
		}
		System.out.println(s);
	}

	public static void main(String... k) throws CustomException  {		
			m("manish");
	
	}
}
