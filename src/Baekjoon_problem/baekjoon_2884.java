/*
 * �ǵ��
 * ����: ������ �����ε� ������ ���� �Լ� ������� ������ �ڵ尡 ����� ��ȿ�����̴�. 
 * */

package Baekjoon_problem;

import java.util.Scanner;

public class baekjoon_2884 {

	final static int MINUTE=60;
	final static int SET_MINUTE=45;
	static int inHour;
	static int inMint;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		inHour=scanner.nextInt();
		inMint=scanner.nextInt();
		
		setTime();
		
		System.out.println(inHour+" "+inMint);

		scanner.close();
	}

	//�˶� �ð��� �����ϴ� �Լ�
	private static void setTime() {
		if(inMint<45) {
			//���� �ð��� 45�� ���� �˶����߱�
			inMint+=MINUTE-SET_MINUTE;
			if(inHour==0) {//�ð� �����̶�� 23�÷� ��µǵ���
				inHour=23;
				return ;
			}
			inHour-=1;
			return;
		}
		inMint-=SET_MINUTE;
		return;
	}
}
