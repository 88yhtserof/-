package Baekjoon_problem;

import java.util.Scanner;

public class baekjoon_2438 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		
		//별 찍기
		for(int row=0;row<n;row++) {//행
			for(int column=0; column<=row;column++)//열
				System.out.print("*");
			System.out.println();
		}
		
		scanner.close();
	}

}
