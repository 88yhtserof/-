package Baekjoon_problem;

import java.util.Scanner;

public class baekjoon_2438 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		
		//�� ���
		for(int row=0;row<n;row++) {//��
			for(int column=0; column<=row;column++)//��
				System.out.print("*");
			System.out.println();
		}
		
		scanner.close();
	}

}
