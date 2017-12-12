package test.armory;
/*
 * class 접근지정자
 * 
 * 1. public: 전체공개
 * 2. default: 같은 패키지 내에서만 접근가능
 * 
 * 생성자, 필드, 메소드의 접근 지정자
 * 
 * 1. public: 전체공개
 * 2. protected: 같은 패키지 혹은 상속관계의 자식에서 접근 가능
 * 3. default: 같은 패키지 내에서만 접근가능
 * 4. private: 같은 클래스 안에서만 접근가능 
 */

public class Gun {
	//멤버필드
	protected Bullet bullet;
	//생성자
	public Gun(Bullet bullet) {
		this.bullet = bullet;
	}
	//메소드
	public void fire() {
		
		if(bullet==null) {
			System.out.println("총알 객체가 없어서 사용 불가");
			return;
		}
		
		System.out.println("빵~");
	}
}
