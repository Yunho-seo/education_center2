package javadarray;
import java.util.Scanner;
public class c_04_string_compare {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		// 문자열 동일 여부 (T/F)
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str1) : " + str2.equals(str1));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		// 비교한 다음, 앞이 크면 정수, 같으면 0, 앞이 작으면 음수를 출력
		System.out.println("str1.compareTo(str2) ? " + str1.compareTo(str2));	// 앞은 H, 뒤는 W
		System.out.println("str1.compareTo(str3) ? " + str1.compareTo(str3));
		
		// 대소문자를 불문하고
		System.out.println("str1.compareToIgnoreCase(str3) ? " + str1.compareToIgnoreCase(str3));
		
		// 연습문제 1 : 다음을 배열에 입력하고 정렬하는 프로그램을 작성
		// {"대한", "민국", "만세", "한국", "대전"}
		
		String[] strarray= {"대한", "민국", "만세", "한국", "대전"};
		for(int i=0; i<strarray.length; i++) {
			for(int j=0; j<strarray.length-i-1; j++) {
				if(strarray[j].compareTo(strarray[j+1])>0) {	// 오름차순
					String temp = strarray[j];
					strarray[j] = strarray[j+1];
					strarray[j+1] = temp;
				}
			}
		}
		for(int i=0; i<strarray.length; i++) {
			System.out.println(strarray[i]+" ");
		}
	}	
}
