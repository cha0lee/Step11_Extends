package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type으로 받기
		SmartPhone p1 = new SmartPhone();
		//p1에 들어있는 참조값을 HandPhone type변수에 담기
		HandPhone p2 = p1;
		Phone p3 = p2;
		Object p4 = p1;
		
		//p1, p2, p3, p4에 들어있는 참조값은 모두 같다.
		if(p1 == p2) {
			System.out.println("같아요!");
		}
		
		//Object type의 p4에 담겨있는 참조값을 Phone type으로 casting
		Phone p5 = (Phone)p4;
		//p4에 들어있는 참조값을 HandPhone type으로 casting
		HandPhone p6 = (HandPhone)p4;
		//p4에 들어있는 참조값을 SmartPhone type을 casting
		SmartPhone p7 = (SmartPhone)p4;
	}
}
