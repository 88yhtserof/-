package Baekjoon_problem;

import java.util.Scanner;

//2021.06.19 1152�� : �ܾ��� ����
public class baekjoon_1152 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String str;
		String[] strArray= {};
		int num;
		
		str=scanner.nextLine();
		
		if(!str.isBlank()) {
			//���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.->trim �޼ҵ�� �� �� ���� ����
			str=str.trim();
			//�ܾ�� ���� �� ���� ����-> split�޼ҵ带 ����ؼ� ��ȯ�� ���ڿ� �迭�� ������ ����.
			strArray=str.split(" ");
			num=strArray.length;
		}
		else
			num=0;
		
		System.out.println(num);
		
		scanner.close();
	}
}
