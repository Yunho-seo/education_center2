package m_inheritance;
import java.io.*;

public class g_08_FileStreamInput {
	public static void main(String[] args) throws Throwable {
		ObjectInputStream ois = null;
		try {		// \\는 드라이브를 의미, \는 폴더를 의미, : 프로그램에서 eclipse는 리눅스 os 문제
					// 윈도우에서 폴더지정은 "c:\\work\\test.txt"
			FileInputStream fn = new FileInputStream("c:\\\\work\\test.txt");
			ois = new ObjectInputStream(fn);
			
			Employee23 data = (Employee23) ois.readObject();
			System.out.println("이름: " + data.name);
			System.out.println("메일: " + data.address);
			System.out.println("번호: " + data.number);
		} catch (IOException e) {
			System.out.println("입력오류");
		}
	}

}
