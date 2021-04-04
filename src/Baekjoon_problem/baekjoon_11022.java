package Baekjoon_problem;

import java.util.Scanner;

public class baekjoon_11022 {

	public static void main(String[] args) {
		int caseNum;
		int num1;
		int num2;
		int sum=0;

		Scanner scanner=new Scanner(System.in);
		caseNum=scanner.nextInt();

		//계산 후 출력하는 반복문
		for(int idx=0; idx<caseNum;idx++) {
			num1=scanner.nextInt();
			num2=scanner.nextInt();
			sum=num1+num2;

			System.out.println("Case #"+(idx+1)+": "+num1+" + "+num2+" = "+sum);
		}
		scanner.close();
	}
}
