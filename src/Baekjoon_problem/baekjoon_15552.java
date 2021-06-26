package Baekjoon_problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//2021.06.22 15552번: 빠른 A+B
/*
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 */

/*
 BufferedReader 와 BufferedWriter

버퍼를 이용하여 입력받은 값들을 한 번에 전송하기 때문에 입출력시 효율이 좋다.
예) 흙을 삽으로 한 번씩 풀 때마다 옮기기 10번 vs 수레에 10번 삽으로 흙을 퍼 담아 한 번에 옮기기

버퍼(buffer)
어떤 장치에서 다른 장치로 데이터를 송신할 때 일어나는 시간의 차이나 데이터 흐름의 속도 차이를 조정하기 위해 일시적으로 데이터를 기억시키는 장치.
버퍼링(buffering)
어떤 장치에서 다른 장치로 데이터를 송신할 때 양자의 속도 차이를 조정하기 위해 일시적으로 데이터를 기억시키는 수법

1. BufferedReader

보통 자바에서 입력을 받기 위해 java.util 패키지의 Scanner 클래스을 사용한다. Scanner같은 경우 공백 문자와 엔터로 입력값을 구분한다. 
예) Scanner.next() / Scanner.nextLine()
이와 다르게 BuferedReader는 엔터만 경계로 인식한다. 따라서 공백 문자로 입력값을 구분하기 위해서는 따로 처리가 필요하다. (여기서는 StringTokenizer를 사용할 예정이다.)

Reads text from a character-input stream, buffering characters so as to * provide for the efficient reading of characters, arrays, and lines. * *
: 문자들, 배열, 줄의 효율적인 읽기를 제공하기 위해서 문자들을 버퍼링하면서 문자 입력 스트림으로부터 글자를 읽는다.
 */
public class baekjoon_15552 {

	public static void main(String[] args){
		int testNum;
		int fir;
		int sec;
		String result;
		
		try {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(System.out));
			testNum=Integer.parseInt(bufferedReader.readLine());	
			
			for(int i=0; i<testNum;i++) {
				StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine()); //띄어쓰기를 기준으로 분리
				fir=Integer.parseInt(stringTokenizer.nextToken());
				sec=Integer.parseInt(stringTokenizer.nextToken());
				
				result=Integer.toString(fir+sec);
				
				bufferedWriter.write(result);
				bufferedWriter.newLine();
			}
			bufferedReader.close(); //버퍼 이용시 스트림을 닫아주어야 한다.
			bufferedWriter.flush(); //버퍼를 닫기 전 버퍼 내 데이터들을 모두 내보내야한다.
			//flush 메소드를 마지막에 한 번만 해야 시간 초과x 
			bufferedWriter.close();	// 버퍼 이용시 스트림을 닫아주어야 한다.
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
