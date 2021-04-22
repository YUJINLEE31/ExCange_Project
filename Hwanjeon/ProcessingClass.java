package Hwanjeon;

public class ProcessingClass { 
	//ȯ�� �۾� ������ ��Ƴ��� Ŭ����. ȯ�� ���α׷��� ��� �κ�. MoneyExchange Ŭ���� ���ο��� pc�� ���� ȣ��ȴ�.
	
	OutputClass outClass = null; //OutputClass outClass �����ϰ� �ʱ�ȭ
	
	ProcessingClass() { //������(��ü�� ������ �� ȣ��Ǵ� �޼ҵ�)
		outClass = new OutputClass(); //OutputClass outClass ����
	}
	
	public void returnWon(double cw) { //cw(��ȭ �Ž�����)�� �Է°����� ����
		int cwResult; //�Ҽ���ó���� ���� ��ȭ �Ž�����
		int returnWon; //���� ���� ��ȭ �Ž�����
		int won10000, won5000, won1000, won500, won100, won10; //������ �� �ʿ��� ���� ������ ����
		
		cwResult = (int)(cw); //�Ҽ��� ���ϴ� ���� ó�� 
		returnWon = (int)(cw/10) * 10; //1�� ������ ���� ó��
		won10000 = cwResult/10000;
		won5000 = cwResult%10000/5000;
		won1000 = cwResult%10000%5000/1000;
		won500 = cwResult%10000%5000%1000/500;
		won100 = cwResult%10000%5000%1000%500/100;
		won10 = cwResult%10000%5000%1000%500%100/10;

		outClass.printWon(cw, returnWon, won10000, 
				won5000, won1000, won500, won100, won10); //OutputClass�� printWon �żҵ忡�� ���ϰ��� �޴´�
		ExchangeType.won_result = returnWon; //ExchangeType Ŭ������ ���� won_result�� ���� ���� ��ȭ �Ž����� ����
	}
	
	public double exchangeUSD(double w, double EX_RATE_USD) { 
		//w(ȯ���Ϸ��� ���� ��ȭ)�� ConstValueClass�� EX_RATE_USD�� �Է°����� ����
		
		double exchangeResult; //�޷��� ȯ�� ���
		int usd = 0; //�Ҽ���ó���� ���� �޷� ȯ�� ��� (���� ���� �޷�)
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; //������ �� �ʿ��� ���� ������ ����
		double cw = 0; //�Ž�����
		
		exchangeResult = w / EX_RATE_USD ;
		usd = (int)exchangeResult; //�Ҽ��� ���ϴ� ���� ó��
		usd100 = usd/100;
		usd50 = usd%100/50;
		usd20 = usd%100%50/20;
		usd10 = usd%100%50%20/10;
		usd5 = usd%100%50%20%10/5;
		usd2 = usd%100%50%20%10%5/2;
		usd1 = usd%100%50%20%10%5%2/1;
		
		outClass.printUSD( exchangeResult, usd, 
				usd100, usd50, usd20, usd10, usd5, usd2, usd1); //OutputClass�� printUSD �żҵ忡�� ���ϰ��� �޴´�
		ExchangeType.ex_result = usd; //ExchangeType Ŭ������ ���� ex_result(���� ���� ȯ����)�� ���� ���� �޷� ����
		
		cw = w - usd * EX_RATE_USD;			
		return cw;
	}
	
	public double exchangeEUR(double w, double EX_RATE_EUR) { 
		//w(ȯ���Ϸ��� ���� ��ȭ)�� ConstValueClass�� EX_RATE_EUR�� �Է°����� ����
		
		double exchangeResult; //���η� ȯ�� ���
		int eur = 0; //�Ҽ���ó���� ���� ���� ȯ�� ��� (���� ���� ����ȭ)
		int eur100, eur50, eur20, eur10, eur5, eur2, eur1; //������ �� �ʿ��� ���� ������ ����
		double cw = 0; //�Ž�����
		
		exchangeResult = w / EX_RATE_EUR ;
		eur = (int)exchangeResult; //�Ҽ��� ���ϴ� ���� ó�� 
		eur100 = eur/100;
		eur50 = eur%100/50;
		eur20 = eur%100%50/20;
		eur10 = eur%100%50%20/10;
		eur5 = eur%100%50%20%10/5;
		eur2 = eur%100%50%20%10%5/2;
		eur1 = eur%100%50%20%10%5%2/1;
		
		outClass.printEUR(exchangeResult, eur,
				eur100, eur50, eur20, eur10, eur5, eur2, eur1); //OutputClass�� printEUR �żҵ忡�� ���ϰ��� �޴´�
		ExchangeType.ex_result = eur; //ExchangeType Ŭ������ ���� ex_result(���� ���� ȯ����)�� ���� ���� ����ȭ ����
		
		cw = w - eur * EX_RATE_EUR;
		return cw;
	}
	
	public double exchangeJPY(double w, double EX_RATE_JPY) { 
		//w(ȯ���Ϸ��� ���� ��ȭ)�� ConstValueClass�� EX_RATE_JPY�� �Է°����� ����
		
		double exchangeResult; //��ȭ�� ȯ�� ���
		int jpy = 0; //�Ҽ���ó���� ���� ��ȭ ȯ�� ��� (���� ���� ��ȭ)	
		int jpy10000, jpy5000, jpy2000, jpy1000, 
			jpy500, jpy100, jpy50, jpy10, jpy5, jpy1; //������ �� �ʿ��� ���� ������ ����
		double cw = 0; //�Ž�����
		
		exchangeResult = w / (EX_RATE_JPY / 100); //100���� ���� ȯ���̹Ƿ� 1���� ���� ȯ���� /100
		jpy = (int)exchangeResult; //�Ҽ��� ���ϴ� ���� ó��
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
				jpy500, jpy100, jpy50, jpy10, jpy5, jpy1); //OutputClass�� printJPY �żҵ忡�� ���ϰ��� �޴´�
		ExchangeType.ex_result = jpy; //ExchangeType Ŭ������ ���� ex_result(���� ���� ȯ����)�� ���� ���� ��ȭ ����
		
		cw = w - jpy * (EX_RATE_JPY / 100)  ;
		return cw;
	}
	
}
