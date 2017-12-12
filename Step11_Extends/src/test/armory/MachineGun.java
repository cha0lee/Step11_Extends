package test.armory;

public class MachineGun extends Gun {
	//자식 생성자에서 부모 생성자에 필요한 값을 전달 받아서
	public MachineGun(Bullet bullet) {
		//부모 생성자에 넘겨준다.
		//부모 생성자를 호출하는 코드는 가장 첫줄에 와야한다.
		super(bullet);
	}
	
	//메소드
	public void autoFire() {
		//필드의 접근지정자가 private이므로 this.bullet/ bullet으로 접근 불가, bullet이 지정된 부모의 bullet 멤버 필드를 protected로 바꿔야함 
		if(this.bullet==null) {
			System.out.println("총알 객체가 없어서 발사불가!");
		}
		System.out.println("빵~ 빵~ 빵~");
	}
}
