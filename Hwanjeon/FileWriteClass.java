package Hwanjeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass { 
	//환전 결과를 담고있는 기록용 파일을 만드는 클래스. MoneyExchange 클래스 메인에서 fwc라 쓰면 호출된다.
	
	private FileWriter fw; //해당 클래스에서만 접근 가능한 FileWriter fw 선언
	private boolean isFileExist; // 해당 클래스에서만 접근 가능한 참거짓변수 isFileExist 선언
	
	public FileWriteClass() { //생성자(객체가 생성될 때 호출되는 메소드)		
		try {
			File file = new File("C:\\Users\\이유진\\Desktop\\Record the result of Exchange.csv"); 
			//파일 클래스를 생성하고 작업파일의 풀패스(경로)를 적어 해당 파일 오픈. import 처리.
			
			if(file.exists() == false) { //만약 해당 파일이 존재하지 않으면
				isFileExist = false; //변수 isFileExist는 false
			} else { //해당 파일이 존재하면
				isFileExist = true; //변수 isFileExist는 true
			}
			
			fw = new FileWriter("C:\\Users\\이유진\\Desktop\\Record the result of Exchange.csv", true);				
		//FileWriter fw를 생성하고 오픈한 파일을 연결, 옵션 true는 실행할 때마다 이어쓰기, false는 덮어쓰기	 
		
		} catch (IOException e) { //디스크가 깨졌다거나 디스크 쓰기 권한이 없다거나 파일이 없다거나 등등의 예외 오류를 처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() { //소멸자(close를 안하면 계속 파일이 열려있어서 제어 불가)		
		try {
			fw.close(); //FileWriter 종료
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException { 		
		if(isFileExist == false) { //해당 파일이 존재하지 않으면, 생성될 때 첫 줄에 아래 항목들을 써준다
			String head = "날짜," + "환전종류," + "받은 원화," + "지급 환전액," + "지급 거스름돈" + "\n";
			fw.write(head); //파일에 한 줄 쓰기
		
		}		
	}
	
	public void dataWrite(ExchangeType exType) throws IOException { 
		//ExchangeType 클래스에서 묶인 변수들을 입력값으로 받아 수행
		
		Calendar c = Calendar.getInstance(); // Calendar 함수에서 날짜시간 받아오기
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //날짜시간 출력 형식 지정
		
		String result = sdf.format(c.getTime()) + "," 
				+ exType.typestr + "," + exType.w + "," 
				+ exType.ex_result + "," + exType.won_result + "\n";
		fw.write(result); //파일에 한 줄 쓰기
		
	}	
}









