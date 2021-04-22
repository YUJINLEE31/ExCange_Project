package Hwanjeon;

import java.io.IOException;
import java.util.Scanner;

public class MoneyExchange { //메인함수가 있는 클래스. 환전 프로그램의 골자.
	
	public static void main(String[] args) throws IOException { //메인부터 프로그램 시작
		
		//static이 붙으면 클래스에 속한게 아니다. 메인은 MoneyExchange클래스에 소속된 것이 아니다. 
		//메인은 실행 개요만 간단하게 두고 각각의 기능을 분화하여 클래스, 매소드를 계속 따로 만든다.
			
		ProcessingClass pc = new ProcessingClass(); //ProcessingClass pc 선언 및 생성
		InputFromConsoleClass inputConsole = new InputFromConsoleClass(); //InputFromConsoleClass inputConsole 선언 및 생성
		FileWriteClass fwc = new FileWriteClass(); //FileWriteClass fwc 선언 및 생성
		fwc.headerWrite(); //FileWriteClass의 headerWrite 메소드 호출
		ExchangeType exType; //ExchangeType exType 클래스 선언 (변수만 묶어 클래스로 만들어 두고 계속 호출해 사용할 예정)
		
		do { //무조건 처음에 최소한 한 번은 {}블록 실행하고 while문이 조건을 만나 조건에 해당하면 무한반복, 조건과 안 맞으면 반복을 멈추도록 한다
			exType = new ExchangeType(); //ExchangeType exType 생성(이하에서는 ExchangeType 클래스에 선언된 변수들을 호출해서 사용한다)
			
			exType.w = inputConsole.inputWon(); //w는 InputFromConsoleClass의 inputWon 매소드에서 리턴값을 받는다
			exType.type = inputConsole.inputType(); //type는 InputFromConsoleClass의 inputType 매소드에서 리턴값을 받는다
			
			if(exType.type == ConstValueClass.EX_TYPE_USD) { //type이 ConstValueClass의 EX_TYPE_USD(= 1)라면, 즉 사용자가 1을 누르면
				exType.cw = pc.exchangeUSD(exType.w, ConstValueClass.EX_RATE_USD); //cw는 ProcessingClass의 exchangeUSD 매소드에 w를 적용한 리턴값을 받는다
				exType.typestr = "USD"; //기록용 파일에 저장될 문자열
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) { //type이 ConstValueClass의 EX_TYPE_EUR(= 2)라면, 즉 사용자가 2을 누르면
				exType.cw = pc.exchangeEUR(exType.w, ConstValueClass.EX_RATE_EUR ); //cw는 ProcessingClass의 exchangeEUR 매소드에 w를 적용한 리턴값을 받는다
				exType.typestr = "EUR"; //기록용 파일에 저장될 문자열
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY) { //type이 ConstValueClass의 EX_TYPE_JPY(= 3)라면, 즉 사용자가 3을 누르면
				exType.cw = pc.exchangeJPY(exType.w, ConstValueClass.EX_RATE_JPY); //cw는 ProcessingClass의 exchangeJPY 매서드에 w를 적용한 리턴값을 받는다
				exType.typestr = "JPY"; //기록용 파일에 저장될 문자열
			} else {
				exType.typestr = "종료";	
				exType.w = 0;
				exType.cw = 0;
				exType.ex_result = 0;
				exType.won_result = 0;
			}
			
			pc.returnWon(exType.cw); //ProcessingClass의 returnWon 매소드에 cw을 적용한 리턴값을 받는다
									
			fwc.dataWrite(exType);  //FileWriteClass의 dataWrite 매소드에 ExchangeType 클래스에서 묶인 변수들을 적용해 리턴값을 받는다 
						
		} while(exType.type != ConstValueClass.EX_TYPE_EXIT); 
		//type이 ConstValueClass의 EX_TYPE_EXIT(= 0)이 아닐 때만 무한 반복하고, 사용자가 0을 누르면 do-while {}블록 탈출, 49행 문장 수행하고 프로그램 종료
		
		System.out.println("종료");
		
		fwc.fileClose(); //FileWriteClass의 fileClose 매소드 호출(파일쓰기 클래스를 닫는다(소멸자). close를 안하면 계속 파일이 열려있어서 제어 불가)
				
	}

}

