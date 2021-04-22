package Hwanjeon;

public class ProcessingClass { 
	//환전 작업 과정을 모아놓은 클래스. 환전 프로그램의 계산 부분. MoneyExchange 클래스 메인에서 pc라 쓰면 호출된다.
	
	OutputClass outClass = null; //OutputClass outClass 선언하고 초기화
	
	ProcessingClass() { //생성자(객체가 생성될 때 호출되는 메소드)
		outClass = new OutputClass(); //OutputClass outClass 생성
	}
	
	public void returnWon(double cw) { //cw(원화 거스름돈)를 입력값으로 수행
		int cwResult; //소수점처리를 끝낸 원화 거스름돈
		int returnWon; //최종 지급 원화 거스름돈
		int won10000, won5000, won1000, won500, won100, won10; //지급할 때 필요한 지폐나 동전의 개수
		
		cwResult = (int)(cw); //소수점 이하는 버림 처리 
		returnWon = (int)(cw/10) * 10; //1원 단위는 버림 처리
		won10000 = cwResult/10000;
		won5000 = cwResult%10000/5000;
		won1000 = cwResult%10000%5000/1000;
		won500 = cwResult%10000%5000%1000/500;
		won100 = cwResult%10000%5000%1000%500/100;
		won10 = cwResult%10000%5000%1000%500%100/10;

		outClass.printWon(cw, returnWon, won10000, 
				won5000, won1000, won500, won100, won10); //OutputClass의 printWon 매소드에서 리턴값을 받는다
		ExchangeType.won_result = returnWon; //ExchangeType 클래스의 변수 won_result에 최종 지급 원화 거스름돈 저장
	}
	
	public double exchangeUSD(double w, double EX_RATE_USD) { 
		//w(환전하려고 받은 원화)와 ConstValueClass의 EX_RATE_USD를 입력값으로 수행
		
		double exchangeResult; //달러로 환전 결과
		int usd = 0; //소수점처리를 끝낸 달러 환전 결과 (최종 지급 달러)
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; //지급할 때 필요한 지폐나 동전의 개수
		double cw = 0; //거스름돈
		
		exchangeResult = w / EX_RATE_USD ;
		usd = (int)exchangeResult; //소수점 이하는 버림 처리
		usd100 = usd/100;
		usd50 = usd%100/50;
		usd20 = usd%100%50/20;
		usd10 = usd%100%50%20/10;
		usd5 = usd%100%50%20%10/5;
		usd2 = usd%100%50%20%10%5/2;
		usd1 = usd%100%50%20%10%5%2/1;
		
		outClass.printUSD( exchangeResult, usd, 
				usd100, usd50, usd20, usd10, usd5, usd2, usd1); //OutputClass의 printUSD 매소드에서 리턴값을 받는다
		ExchangeType.ex_result = usd; //ExchangeType 클래스의 변수 ex_result(최종 지급 환전액)에 최종 지급 달러 저장
		
		cw = w - usd * EX_RATE_USD;			
		return cw;
	}
	
	public double exchangeEUR(double w, double EX_RATE_EUR) { 
		//w(환전하려고 받은 원화)와 ConstValueClass의 EX_RATE_EUR를 입력값으로 수행
		
		double exchangeResult; //유로로 환전 결과
		int eur = 0; //소수점처리를 끝낸 유로 환전 결과 (최종 지급 유로화)
		int eur100, eur50, eur20, eur10, eur5, eur2, eur1; //지급할 때 필요한 지폐나 동전의 개수
		double cw = 0; //거스름돈
		
		exchangeResult = w / EX_RATE_EUR ;
		eur = (int)exchangeResult; //소수점 이하는 버림 처리 
		eur100 = eur/100;
		eur50 = eur%100/50;
		eur20 = eur%100%50/20;
		eur10 = eur%100%50%20/10;
		eur5 = eur%100%50%20%10/5;
		eur2 = eur%100%50%20%10%5/2;
		eur1 = eur%100%50%20%10%5%2/1;
		
		outClass.printEUR(exchangeResult, eur,
				eur100, eur50, eur20, eur10, eur5, eur2, eur1); //OutputClass의 printEUR 매소드에서 리턴값을 받는다
		ExchangeType.ex_result = eur; //ExchangeType 클래스의 변수 ex_result(최종 지급 환전액)에 최종 지급 유로화 저장
		
		cw = w - eur * EX_RATE_EUR;
		return cw;
	}
	
	public double exchangeJPY(double w, double EX_RATE_JPY) { 
		//w(환전하려고 받은 원화)와 ConstValueClass의 EX_RATE_JPY를 입력값으로 수행
		
		double exchangeResult; //엔화로 환전 결과
		int jpy = 0; //소수점처리를 끝낸 엔화 환전 결과 (최종 지급 엔화)	
		int jpy10000, jpy5000, jpy2000, jpy1000, 
			jpy500, jpy100, jpy50, jpy10, jpy5, jpy1; //지급할 때 필요한 지폐나 동전의 개수
		double cw = 0; //거스름돈
		
		exchangeResult = w / (EX_RATE_JPY / 100); //100엔에 대한 환율이므로 1엔에 대한 환율은 /100
		jpy = (int)exchangeResult; //소수점 이하는 버림 처리
		jpy10000 = jpy/10000;
		jpy5000 = jpy%10000/5000;
		jpy2000 = jpy%10000%5000/2000;
		jpy1000 = jpy%10000%5000%2000/1000;
		jpy500 = jpy%10000%5000%2000%1000/500;
		jpy100 = jpy%10000%5000%2000%1000%500/100;
		jpy50 = jpy%10000%5000%2000%1000%500%100/50;
		jpy10 = jpy%10000%5000%2000%1000%500%10%50/10;
		jpy5 = jpy%10000%5000%2000%1000%500%10%50%10/5;
		jpy1 = jpy%10000%5000%2000%1000%500%10%50%10%5/1;
		
		outClass.printJPY(exchangeResult, jpy, 
				jpy10000, jpy5000, jpy2000, jpy1000, 
				jpy500, jpy100, jpy50, jpy10, jpy5, jpy1); //OutputClass의 printJPY 매소드에서 리턴값을 받는다
		ExchangeType.ex_result = jpy; //ExchangeType 클래스의 변수 ex_result(최종 지급 환전액)에 최종 지급 엔화 저장
		
		cw = w - jpy * (EX_RATE_JPY / 100)  ;
		return cw;
	}
	
}
