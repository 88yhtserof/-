/*
 * 피드백
 * 김희선: 간단한 문제인데 재사용을 위한 함수 사용으로 오히려 코드가 길어져 비효율적이다. 
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

	//알람 시간을 설정하는 함수
	private static void setTime() {
		if(inMint<45) {
			//기존 시간에 45분 일찍 알람맞추기
			inMint+=MINUTE-SET_MINUTE;
			if(inHour==0) {//시가 자정이라면 23시로 출력되도록
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
