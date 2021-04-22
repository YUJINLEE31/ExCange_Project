# ExChange_Project

<환전 프로그램>

1. 개요 : 
콘솔에서 금액을 입력하고 환전 유형을 선택하면 
	1) 원화를 달러, 유로화, 또는 엔화로 환전한 결과
	2) 최종 지급 환전액
	3) 지급 시 필요한 화폐 개수
	4) 원화 거스름돈
	5) 최종 지급 거스름돈
	6) 지급 시 필요한 화폐 개수
를 출력한다.

2. 만든 이 : 이유진
 
3. 만든 날짜 : 2021-01-23

4. 소스코드(클래스)구성 :

MoneyExchange : 메인함수가 있는 클래스. 환전 프로그램의 골자.

ConstValueClass : 상수만 모아놓은 상수 선언용 클래스.

ExchangeType : 변수 선언용 클래스. MoneyExchange 클래스 메인에서 exType이라 쓰면 호출된다.

InputFromConsoleClass : 콘솔에서 입력값을 받는 스캐너 관련 기능만 모아놓은 클래스. 환전 프로그램의 시작부분. MoneyExchange 클래스 메인에서 inputConsole이라 쓰면 호출된다.

ProcessingClass : 환전 작업 과정을 모아놓은 클래스. 환전 프로그램의 계산 부분. MoneyExchange 클래스 메인에서 pc라 쓰면 호출된다.

OutputClass : 환전 결과 출력과 관련된 기능만 모아놓은 클래스. 환전 프로그램의 마지막 부분. ProcessingClass에서 outClass라 쓰면 호출된다.

FileWriteClass : 환전 결과를 담고있는 기록용 파일을 만드는 클래스. MoneyExchange 클래스 메인에서 fwc라 쓰면 호출된다.
