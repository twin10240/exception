package exception;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		try {
			m.dangerMethod();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
