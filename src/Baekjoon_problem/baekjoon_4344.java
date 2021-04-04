package Baekjoon_problem;

//문제를 잘못 읽음
//김희선 - 변수가 앞부분에 정리되어 있어 깔끔해보인다. 함수 사용이 유용해 보임
import java.util.Scanner;

public class baekjoon_4344 {

	public static void main(String[] args) {
		int inputCase;
		int inputNum;
		double sum;
		double avg;
		Scanner scanner=new Scanner(System.in);
		
		//테스트 케이스 입력
		inputCase=scanner.nextInt();
		
		for(int row=0;row<inputCase;row++) { //행
			//학생 수
			inputNum=scanner.nextInt();
			
			//성적 입력
			sum=0.0; //sum 초기화
			for(int column=0;column<inputNum;column++) //열
				sum+=scanner.nextInt();
			
			//평균계산
			avg=Math.round(sum/inputNum*1000)/1000.0;//수정 필요- 형식지정자? 사용
			
			//평균을 넘는 학생의 비율 구하기
			
			System.out.println(avg+"%");
		}

		scanner.close();
	}

}
