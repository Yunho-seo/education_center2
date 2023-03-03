package n_generic;
import java.util.*;
// Map은 Iterator가 없다 (Iterator은 순서적으로 접근하는 역할) => Map은 계산된 위치에 저장
// Map은 순서가 없음
public class h_08_Map {
	public static void main(String[] args) {
		// Map은 기본적으로 정렬이 되지 않는데, 정렬이 필요한 경우는 SortedMap을 사용 => TreeMap
		// Hash Table (동기화를 보장), HashMap (동기화를 보장하진 않지만 처리가 빠르다)이 있음.
		// 동기화 : 하나의 데이터에 대해서는 한 사람만 처리 가능하도록 보장하는 것 (System Rock)
		HashMap hm = new HashMap();		// 키 (Hash 함수 사용하여 키를 주소값으로 변환) + 데이터로 저장
		hm.put("소득", Double.valueOf(1234.12));
		hm.put("체중", Double.valueOf(48.2));
		hm.put("체중", 8.2);				// 키(Key) 값이 같으면, 수정된다. ( 키 값이 같으면 이전 데이터를 대체함 )
		hm.put("저축", 123123123);
		
		// 
		Set set = hm.entrySet();		// 키(set) : Map의 키는 set이여야 함 (중복되면 안되서)
										// set : 범주형 데이터 ( 범주형은, 중복을 허용하지 않는 종류이다. )
		Iterator i = set.iterator();	// Collections을 상속받는다, set은 Iterator를 사용할 수 있다.
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();	// Map.Entry(Map에 들어있는 키와 데이터의 조합)
			System.out.println(me.getKey() + ":");	// getKey : 키 값
			System.out.println(me.getValue());		// getValue : 값(데이터)을 가져옴
		}
		
		double balance = (Double) hm.get("소득");
		hm.put("소득", 2000);				// 데이터를 수정
		System.out.println(set);
		System.out.println(hm);
		
	}
}