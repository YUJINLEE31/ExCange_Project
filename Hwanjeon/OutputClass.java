package Hwanjeon;

public class OutputClass { 
	//환전 결과 출력과 관련된 기능만 모아놓은 클래스. 환전 프로그램의 마지막 부분. ProcessingClass에서 outClass라 쓰면 호출된다.
	
	public void printWon(double cw, int returnWon, 
			int won10000, int won5000, int won1000, 
			int won500, int won100, int won10) { //해당 입력값들을 받아 수행
		
		System.out.printf(">>원화 거스름돈 : %.2f 원\n", cw);
		System.out.println(">>최종 지급 원화 거스름돈 : " + returnWon + "원");
		System.out.println("(10000원 : " + won10000 + "장)");
		System.out.println("(5000원 : " + won5000 + "장)");
		System.out.println("(1000원 : " + won1000 + "장)");
		System.out.println("(500원 : " + won500 + "개)");
		System.out.println("(100원 : " + won100 + "개)");
		System.out.println("(10원 : " + won10  + "개)");
	}
	
	public void printUSD(double exchangeResult,int usd, 
			int usd100, int usd50, int usd20, int usd10, 
			int usd5, int usd2, int usd1) {
		
		System.out.printf(">>달러로 환전 결과 : %.2f 달러\n", exchangeResult);
		System.out.println(">>최종 지급 달러 : " + usd + "달러");
		System.out.println("(100달러 : "+ usd100 + "장)");
		System.out.println("(50달러 : " + usd50 + "장)");
		System.out.println("(20달러 : " + usd20 + "장)");
		System.out.println("(10달러 : " + usd10 + "장)");
		System.out.println("(5달러 : " + usd5 + "장)");
		System.out.println("(2달러 : " + usd2 + "장)");
		System.out.println("(1달러 : " + usd1 + "장)");
	}
	
	public void printEUR(double exchangeResult, int eur, 
			int eur100, int eur50, int eur20, int eur10, 
			int eur5, int eur2, int eur1) {
		
		System.out.printf(">>유로로 환전 결과 : %.2f 유로\n", exchangeResult);
		System.out.println(">>최종 지급 유로화 : " + eur + "유로");
		System.out.println("(100유로 : "+ eur100 + "장)");
		System.out.println("(50유로 : " + eur50 + "장)");
		System.out.println("(20유로 : " + eur20 + "장)");
		System.out.println("(10유로 : " + eur10 + "장)");
		System.out.println("(5유로 : " + eur5 + "장)");
		System.out.println("(2유로 : " + eur2 + "장)");
		System.out.println("(1유로 : " + eur1 + "장)");
	}
	
	public void printJPY(double exchangeResult, int jpy, 
			int jpy10000, int jpy5000, int jpy2000, int jpy1000, 
			int jpy500, int jpy100, int jpy50, int jpy10, int jpy5, int jpy1) {
		
		System.out.printf(">>엔화로 환전 결과 : %.2f 엔\n", exchangeResult);
		System.out.println(">>최종 지급 엔화 : " + jpy + "엔");
		System.out.println("(10000엔 : "+ jpy10000 + "장)");
		System.out.println("(5000엔 : " + jpy5000 + "장)");
		System.out.println("(2000엔 : " + jpy2000 + "장)");
		System.out.println("(1000엔 : " + jpy1000 + "장)");
		System.out.println("(500엔 : " + jpy500 + "개)");
		System.out.println("(100엔 : " + jpy100 + "개)");
		System.out.println("(50엔 : " + jpy50 + "개)");
		System.out.println("(10엔 : " + jpy10 + "개)");
		System.out.println("(5엔 : " + jpy5 + "개)");
		System.out.println("(1엔 : " + jpy1 + "개)");		
	}
	
}
