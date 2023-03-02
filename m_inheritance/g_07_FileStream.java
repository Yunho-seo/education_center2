package m_inheritance;
import java.io.*;

public class g_07_FileStream {
	public static void main(String[] args) {
		Employee23 e = new Employee23();
		e.name = "korea";
		e.address = "seoul";
		e.number = 101;
		
		try {	// 파일 처리는 예외처리해야 함
			// 파일 오픈
			// 파일이나 네트워크, DB 접속은 OS 자원을 사용
			FileOutputStream fileOut = new FileOutputStream("c:\\\\work\\test.txt");
			// 객체를 스트림으로 -> 저장할 때는 순차적으로 Serial 
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);		// 객체 저장
			out.close();
			fileOut.close();
			System.out.println("Serialized 된 클래스의 데이터가 c:\\test.txt에 저장 ");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}