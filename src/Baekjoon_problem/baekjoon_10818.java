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
		
		//���� �Է�
		for(int i=0;i<inputNum;i++)
			inputArray[i]=scanner.nextInt();
		
		//�Է� �迭 ����
		Arrays.sort(inputArray); //���������迭
		maxNum=inputArray[inputArray.length-1];
		minNum=inputArray[0];
		
		System.out.println(minNum+" "+maxNum);
		
		scanner.close();
	}

}
