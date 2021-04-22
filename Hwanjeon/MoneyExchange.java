package Hwanjeon;

import java.io.IOException;
import java.util.Scanner;

public class MoneyExchange { //�����Լ��� �ִ� Ŭ����. ȯ�� ���α׷��� ����.
	
	public static void main(String[] args) throws IOException { //���κ��� ���α׷� ����
		
		//static�� ������ Ŭ������ ���Ѱ� �ƴϴ�. ������ MoneyExchangeŬ������ �Ҽӵ� ���� �ƴϴ�. 
		//������ ���� ���丸 �����ϰ� �ΰ� ������ ����� ��ȭ�Ͽ� Ŭ����, �żҵ带 ��� ���� �����.
			
		ProcessingClass pc = new ProcessingClass(); //ProcessingClass pc ���� �� ����
		InputFromConsoleClass inputConsole = new InputFromConsoleClass(); //InputFromConsoleClass inputConsole ���� �� ����
		FileWriteClass fwc = new FileWriteClass(); //FileWriteClass fwc ���� �� ����
		fwc.headerWrite(); //FileWriteClass�� headerWrite �޼ҵ� ȣ��
		ExchangeType exType; //ExchangeType exType Ŭ���� ���� (������ ���� Ŭ������ ����� �ΰ� ��� ȣ���� ����� ����)
		
		do { //������ ó���� �ּ��� �� ���� {}��� �����ϰ� while���� ������ ���� ���ǿ� �ش��ϸ� ���ѹݺ�, ���ǰ� �� ������ �ݺ��� ���ߵ��� �Ѵ�
			exType = new ExchangeType(); //ExchangeType exType ����(���Ͽ����� ExchangeType Ŭ������ ����� �������� ȣ���ؼ� ����Ѵ�)
			
			exType.w = inputConsole.inputWon(); //w�� InputFromConsoleClass�� inputWon �żҵ忡�� ���ϰ��� �޴´�
			exType.type = inputConsole.inputType(); //type�� InputFromConsoleClass�� inputType �żҵ忡�� ���ϰ��� �޴´�
			
			if(exType.type == ConstValueClass.EX_TYPE_USD) { //type�� ConstValueClass�� EX_TYPE_USD(= 1)���, �� ����ڰ� 1�� ������
				exType.cw = pc.exchangeUSD(exType.w, ConstValueClass.EX_RATE_USD); //cw�� ProcessingClass�� exchangeUSD �żҵ忡 w�� ������ ���ϰ��� �޴´�
				exType.typestr = "USD"; //��Ͽ� ���Ͽ� ����� ���ڿ�
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) { //type�� ConstValueClass�� EX_TYPE_EUR(= 2)���, �� ����ڰ� 2�� ������
				exType.cw = pc.exchangeEUR(exType.w, ConstValueClass.EX_RATE_EUR ); //cw�� ProcessingClass�� exchangeEUR �żҵ忡 w�� ������ ���ϰ��� �޴´�
				exType.typestr = "EUR"; //��Ͽ� ���Ͽ� ����� ���ڿ�
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY) { //type�� ConstValueClass�� EX_TYPE_JPY(= 3)���, �� ����ڰ� 3�� ������
				exType.cw = pc.exchangeJPY(exType.w, ConstValueClass.EX_RATE_JPY); //cw�� ProcessingClass�� exchangeJPY �ż��忡 w�� ������ ���ϰ��� �޴´�
				exType.typestr = "JPY"; //��Ͽ� ���Ͽ� ����� ���ڿ�
			} else {
				exType.typestr = "����";	
				exType.w = 0;
				exType.cw = 0;
				exType.ex_result = 0;
				exType.won_result = 0;
			}
			
			pc.returnWon(exType.cw); //ProcessingClass�� returnWon �żҵ忡 cw�� ������ ���ϰ��� �޴´�
									
			fwc.dataWrite(exType);  //FileWriteClass�� dataWrite �żҵ忡 ExchangeType Ŭ�������� ���� �������� ������ ���ϰ��� �޴´� 
						
		} while(exType.type != ConstValueClass.EX_TYPE_EXIT); 
		//type�� ConstValueClass�� EX_TYPE_EXIT(= 0)�� �ƴ� ���� ���� �ݺ��ϰ�, ����ڰ� 0�� ������ do-while {}��� Ż��, 49�� ���� �����ϰ� ���α׷� ����
		
		System.out.println("����");
		
		fwc.fileClose(); //FileWriteClass�� fileClose �żҵ� ȣ��(���Ͼ��� Ŭ������ �ݴ´�(�Ҹ���). close�� ���ϸ� ��� ������ �����־ ���� �Ұ�)
				
	}

}

