package Hwanjeon;

public class ConstValueClass { //상수만 모아놓은 상수 선언용 클래스.

	//final로 선언해 다른 클래스에서 임의로 변경할 수 없도록 값을 고정
	//어디서든 호출, 사용될 수 있도록 static 선언
	//숫자 대신 문자로 코딩하기 위해 문자상수명을 선언하고 상수값을 저장
	//실무상 소문자는 변수, 대문자는 상수로 약속

	final static int EX_TYPE_EXIT = 0; //콘솔에서 0을 입력하면 종료
	final static int EX_TYPE_USD = 1; //1을 입력하면 미화로 환전
	final static int EX_TYPE_EUR = 2; //2를 입력하면 유로화로 환전
	final static int EX_TYPE_JPY = 3; //3을 입력하면 엔화로 환전
	final static double EX_RATE_USD = 1127.3; //미화 환율
	final static double EX_RATE_EUR = 1349.4; //유로화 환율
	final static double EX_RATE_JPY = 1034.13; //100엔화 환율 
	
}
