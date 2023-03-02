package m_inheritance;
// 추상 함수(추상 메서드)가 하나라도 있으면 추상 클래스이다.
// 추상 클래스는 인스턴스하면 안된다 : 정의되지 않은 함수는 실행하면 에러가 발생
abstract class Weapon {					// 추상 클래스 : 추상 함수(추상 메서드)가 하나라도 있으면 추상 클래스이다.
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	public abstract void attack();		// 추상 함수
}

// 추상 클래스를 상속받는 이유는?
// 1) 추상 메서드가 하나라도 있으면, 반드시 오버라이딩 해야 함 -> 프로그래머가 잊지 않고 같은 이름으로 구현해주길 바랄 때 -> 약속 plug-in에서.
// 2) 인스턴스하지는 않지만 부모로써 상속받은 자식을 가리킬 수가 있기에. (상속을 통해 인스턴스를 생성해야 함)
class MyWeapon extends Weapon {
	@Override		// 어노테이션(자바), 장식자(파이썬) : 추상 메서드를 오버라이딩 하고 있다는 뜻
	public void attack() {
		System.out.println("김구라를 공격해요");
	}
}

class YourWeapon extends Weapon {
	@Override
	public void attack() {
		System.out.println("원숭이를 공격해요");
	}
}

public class g_01_abstract {
	public static void main(String[] args) {
		MyWeapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
		YourWeapon w2 = new YourWeapon();
		w2.prepare();
		w2.attack();
		
		useWeapon(w1);
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {	// 부모를 사용
		w.prepare();
		w.attack();
	}
}