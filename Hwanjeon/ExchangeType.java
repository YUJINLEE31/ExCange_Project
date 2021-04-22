package Hwanjeon;

public class ExchangeType { //변수 선언용 클래스. MoneyExchange 클래스 메인에서 exType이라 쓰면 호출된다.
	
	double w; //환전하려고 받은 원화				
	int type = 0; //콘솔에서 사용자가 선택한 환전 종류(유형)
	double cw = 0; //거스름돈(원화)
	String typestr = ""; //사용자가 선택한 환전 유형을 문자열로 표현하기 위한 변수 (기록용 파일 저장할 때 사용)
	static int ex_result; //최종 지급 환전액
	static int won_result; //최종 지급 원화 거스름돈
}
