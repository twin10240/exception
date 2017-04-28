package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		try {
			result = 100 / a;
			System.out.println( "some codes..." );
		} catch( ArithmeticException e ){
			//e.printStackTrace();
			System.out.println( "죄송~" );
			System.out.println( "error 로그:" + e );
			return;
		} finally {
			System.out.println( "자원정리" );
		}
		
		System.out.println( result );
	}

}
