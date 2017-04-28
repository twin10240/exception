package exception;

public class MyClass {
	public void dangerMethod() throws MyException {
		int i = 10;
		if( i == 8+2 ) {
			//위험한 경우(예외 상황 발생)
			throw new MyException();
		}
		
		System.out.println( "정상실행" );
	}
}
