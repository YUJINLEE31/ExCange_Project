package Hwanjeon;

import java.util.Scanner;

public class InputFromConsoleClass { 
//�ֿܼ��� �Է°��� �޴� ��ĳ�� ���� ��ɸ� ��Ƴ��� Ŭ����. ȯ�� ���α׷��� ���ۺκ�. MoneyExchange Ŭ���� ���ο��� inputConsole�̶� ���� ȣ��ȴ�.
	
	Scanner scanner = null; //Scanner �����ϰ� �ʱ�ȭ
	
	InputFromConsoleClass() { //������(��ü�� ������ �� ȣ��Ǵ� �޼ҵ�)
		scanner = new Scanner(System.in); //Scanner ����
	}
	
	protected void finalize() { //�Ҹ���
		scanner.close(); //Scanner �Ҹ�(����)
	}
	
	public double inputWon() { //�ֿܼ��� ȯ���� ��ȭ�� �Է¹޴� �żҵ�
		double w;
		System.out.print("*���� ��ȭ �Է� : ");
		w = scanner.nextInt();
		return w;
	}
	
	public int inputType() { //�ֿܼ��� ȯ���� ������ �Է¹޴� �żҵ�
		int type;
		System.out.print("*ȯ���� ���� ���� (0:����, 1:USD, 2:EUR, 3:JPY) ? ");
		type = scanner.nextInt();
		return type;
	}
}
