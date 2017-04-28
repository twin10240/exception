package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream( "hello.txt" );
		} catch (FileNotFoundException e) {
			System.out.println( "죄송: 파일이 없습니다." );
			System.out.println( "로그:" + e);
			return;
			//e.printStackTrace();
		}

	}

}
