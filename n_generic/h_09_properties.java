package n_generic;
import java.util.*;
import java.io.*;
public class h_09_properties {
	public static void main(String[] args) throws Exception {	// throws Exception : 예외 처리
		// Properties : 프로젝트의 옵션을 관리
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");		// 입력
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		Enumeration e = prop.propertyNames();	// Properties의 반복자(Iterator)
		// Enumeration : 순차적으로 접근하는 반복자 - 초창기에 자주 쓰임
		
		while(e.hasMoreElements()) {		// Element를 하나씩 열거
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		prop.setProperty("size", "20");			// 입력과 같은 함수이지만, 수정 기능
		System.out.println("size= " + prop.getProperty("size"));
		prop.store(new FileWriter("info.properties"), "test");		// FileWriter : 파일 오픈
																	// info.properties : 파일명, test : 파일설명
		try {
			prop.load(new FileInputStream("info.properties"));
		} catch (IOException el) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		System.out.println("size= " + prop.getProperty("size"));
		Properties sysProp = System.getProperties();
		System.out.println("java.version: " + sysProp.getProperty("java.version"));
		System.out.println("user.languag: " + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}
