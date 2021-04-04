package Baekjoon_problem;

import java.util.Scanner;

public class baekjoon_1000 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		sum=num1+num2;
		System.out.println(sum);
		
		scanner.close();
	}

}
