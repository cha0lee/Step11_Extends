package test.mypac;

public class Phone extends Object{ //public class Phone extends Object{의 생략형
	
	//디폴트 생성자를 명시적으로 정의하기
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	
	//멤버 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}

}
