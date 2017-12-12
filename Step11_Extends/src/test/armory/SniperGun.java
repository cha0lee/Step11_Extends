package test.armory;

public class SniperGun extends Gun{

	public SniperGun(Bullet bullet) {
		super(bullet);
	}
	//fire() 메소드 재정의하기
	@Override
	public void fire() {
		super.fire();
		
		System.out.println("좀더 멀리 정밀하게 빵~");
	}
	
}
