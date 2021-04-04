package Baekjoon_problem;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_10818 {

	public static void main(String[] args) {
		int inputNum;
		int maxNum;
		int minNum;
		int[] inputArray;
		Scanner scanner=new Scanner(System.in);
		
		inputNum=scanner.nextInt();
		inputArray=new int[inputNum];
		
		//숫자 입력
		for(int i=0;i<inputNum;i++)
			inputArray[i]=scanner.nextInt();
		
		//입력 배열 정렬
		Arrays.sort(inputArray); //오름차순배열
		maxNum=inputArray[inputArray.length-1];
		minNum=inputArray[0];
		
		System.out.println(minNum+" "+maxNum);
		
		scanner.close();
	}

}
