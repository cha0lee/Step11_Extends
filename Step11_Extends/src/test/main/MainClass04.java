package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		// casting을 잘못하여 compile은 가능하나 runtime error 발생
		// 원래 HandPhone 객체의 참조값이기 때문에 SmartPhone으로 casting은 실행시 오류가 발생한다.
		SmartPhone p2 = (SmartPhone)p1;
		p2.doInternet();
		
		
	}
}
