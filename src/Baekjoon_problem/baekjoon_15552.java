package Baekjoon_problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//2021.06.22 15552��: ���� A+B
/*
 * ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
 * Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
 */
public class baekjoon_15552 {

	public static void main(String[] args){
		int testNum;
		int fir;
		int sec;
		String result;
		
		try {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(System.out));
			testNum=Integer.parseInt(bufferedReader.readLine());	
			
			for(int i=0; i<testNum;i++) {
				StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine()); //���⸦ �������� �и�
				fir=Integer.parseInt(stringTokenizer.nextToken());
				sec=Integer.parseInt(stringTokenizer.nextToken());
				
				result=Integer.toString(fir+sec);
				
				bufferedWriter.write(result);
				bufferedWriter.newLine();
			}
			bufferedReader.close(); //���� �̿�� ��Ʈ���� �ݾ��־�� �Ѵ�.
			bufferedWriter.flush(); //���۸� �ݱ� �� ���� �� �����͵��� ��� ���������Ѵ�.
			//flush �޼ҵ带 �������� �� ���� �ؾ� �ð� �ʰ�x 
			bufferedWriter.close();	// ���� �̿�� ��Ʈ���� �ݾ��־�� �Ѵ�.
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
