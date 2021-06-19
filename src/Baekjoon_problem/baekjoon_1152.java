package Baekjoon_problem;

import java.util.Scanner;

//2021.06.19 1152번 : 단어의 개수
public class baekjoon_1152 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String str;
		String[] strArray= {};
		int num;
		
		str=scanner.nextLine();
		
		if(!str.isBlank()) {
			//문자열의 앞과 뒤에는 공백이 있을 수도 있다.->trim 메소드로 앞 뒤 공백 제거
			str=str.trim();
			//단어는 띄어쓰기 한 개로 구분-> split메소드를 사용해서 반환된 문자열 배열의 개수를 센다.
			strArray=str.split(" ");
			num=strArray.length;
		}
		else
			num=0;
		
		System.out.println(num);
		
		scanner.close();
	}
}
