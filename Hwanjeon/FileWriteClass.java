package Hwanjeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass { 
	//ȯ�� ����� ����ִ� ��Ͽ� ������ ����� Ŭ����. MoneyExchange Ŭ���� ���ο��� fwc�� ���� ȣ��ȴ�.
	
	private FileWriter fw; //�ش� Ŭ���������� ���� ������ FileWriter fw ����
	private boolean isFileExist; // �ش� Ŭ���������� ���� ������ ���������� isFileExist ����
	
	public FileWriteClass() { //������(��ü�� ������ �� ȣ��Ǵ� �޼ҵ�)		
		try {
			File file = new File("C:\\Users\\������\\Desktop\\Record the result of Exchange.csv"); 
			//���� Ŭ������ �����ϰ� �۾������� Ǯ�н�(���)�� ���� �ش� ���� ����. import ó��.
			
			if(file.exists() == false) { //���� �ش� ������ �������� ������
				isFileExist = false; //���� isFileExist�� false
			} else { //�ش� ������ �����ϸ�
				isFileExist = true; //���� isFileExist�� true
			}
			
			fw = new FileWriter("C:\\Users\\������\\Desktop\\Record the result of Exchange.csv", true);				
		//FileWriter fw�� �����ϰ� ������ ������ ����, �ɼ� true�� ������ ������ �̾��, false�� �����	 
		
		} catch (IOException e) { //��ũ�� �����ٰų� ��ũ ���� ������ ���ٰų� ������ ���ٰų� ����� ���� ������ ó��
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() { //�Ҹ���(close�� ���ϸ� ��� ������ �����־ ���� �Ұ�)		
		try {
			fw.close(); //FileWriter ����
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException { 		
		if(isFileExist == false) { //�ش� ������ �������� ������, ������ �� ù �ٿ� �Ʒ� �׸���� ���ش�
			String head = "��¥," + "ȯ������," + "���� ��ȭ," + "���� ȯ����," + "���� �Ž�����" + "\n";
			fw.write(head); //���Ͽ� �� �� ����
		
		}		
	}
	
	public void dataWrite(ExchangeType exType) throws IOException { 
		//ExchangeType Ŭ�������� ���� �������� �Է°����� �޾� ����
		
		Calendar c = Calendar.getInstance(); // Calendar �Լ����� ��¥�ð� �޾ƿ���
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //��¥�ð� ��� ���� ����
		
		String result = sdf.format(c.getTime()) + "," 
				+ exType.typestr + "," + exType.w + "," 
				+ exType.ex_result + "," + exType.won_result + "\n";
		fw.write(result); //���Ͽ� �� �� ����
		
	}	
}









