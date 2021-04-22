package Hwanjeon;

import java.util.Scanner;

public class InputFromConsoleClass { 
//콘솔에서 입력값을 받는 스캐너 관련 기능만 모아놓은 클래스. 환전 프로그램의 시작부분. MoneyExchange 클래스 메인에서 inputConsole이라 쓰면 호출된다.
	
	Scanner scanner = null; //Scanner 선언하고 초기화
	
	InputFromConsoleClass() { //생성자(객체가 생성될 때 호출되는 메소드)
		scanner = new Scanner(System.in); //Scanner 생성
	}
	
	protected void finalize() { //소멸자
		scanner.close(); //Scanner 소멸(종료)
	}
	
	public double inputWon() { //콘솔에서 환전할 원화를 입력받는 매소드
		double w;
		System.out.print("*받은 원화 입력 : ");
		w = scanner.nextInt();
		return w;
	}
	
	public int inputType() { //콘솔에서 환전할 유형을 입력받는 매소드
		int type;
		System.out.print("*환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) ? ");
		type = scanner.nextInt();
		return type;
	}
}
