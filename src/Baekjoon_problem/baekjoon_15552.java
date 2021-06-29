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
<p> The buffer size may be specified, or the default size may be used. The * default is large enough for most purposes. * *
: 버퍼 크기는 정할 수도, 기본 크기를 사용할 수도 있다. 기본 크기는 충분히 크다
<p> In general, each read request made of a Reader causes a corresponding * read request to be made of the underlying character or byte stream.
:일반적으로, Reader의 각 읽기 요청은 평균 이하의 문자, byte 스트림으로 구성된 해당 읽기요청을 야기시킨다. 
It is * therefore advisable to wrap a BufferedReader around any Reader whose read() * operations may be costly, such as FileReaders and InputStreamReaders.
:따라서 BufferedReader로 FileReader와 InputStreamReader같이 read()작업에 비용이 많이 들 수 있는 다른 Reader를 감싸는 것이 좋다. 

BufferedReader의 사용법
import java.io.BufferedReader; //BufferedReader는 java.io패키지

import java.io.BufferedReader; //BufferedReader는 java.io패키지

class Test{
	public static void main(String[] args) throws IOException{
    	//BufferedReader 사용 시 예외처리 필수.
        // try-catch 구문 사용 가능
    	BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        
        int intNum=Integer.parseInt(bfr.readLine());
        //BufferedReader.readLine()은 문자열을 반환해주기 때문에 
        //int값을 받기 위해서는 형변환이 필요하다.
        
        //띄어쓰기를 기준으로 입력값 받기
        StringTokenizer stz=new StringTokenizer(bfr.readLine());//띄어쓰기를 기준으로 토큰화
        String str1 = stz.nextToken();
        String str2= stz.nextToken();
       	예) 
        입력: this is a test
        str1 -> this 
        str2 -> is
        
        bfr.close() //버퍼 이용시 사용이 끝난 후 반드시 스트림을 닫아주어야 한다.
        }
}

메서드 종류
BufferedReader(Reader in[, int size])	Creates a buffering character-input stream that uses an input buffer of* the specified size.:size 크기의 입력 버퍼를 사용하는 문자 입력 버퍼스트림을 생성한다.
										- size 파라미터 생략 시 defualt 크기의 문자 입력 버퍼스트림 생성
int read([char cbuf[][, int off, int len]])	문자 배열 cbuf을 off 위치에서 부터 len 개의 문자를  한 문자씩 읽어 숫자로 반환한다. 즉, 해당 문자의 아스키 코드 값 반환한다. 만약 스트림의 끝에 도달하면 -1을 반환한다.
											-read() :Reads a single character. 한 개의 문자를 읽는다.
											-read(char cbuf[])
String readLine()	Reads a line of text.:'\n'을 기준으로, 한 줄의 글을 읽고 문자열을 반환한다.
long skip(long n)	Skips characters.:n 개수만큼 문자를 건너뛰고 건너뛴 문자의 개수를 반환한다.
boolean ready()	Tells whether this stream is ready to be read.:해당 스트림이 사용할 준비가 되었는지 아닌지 알려준다.
boolean markSupported()	Tells whether this stream supports the mark() operation, which it does.:해당 스트림이 mark() 기능을 지원하는지 아닌지 알려준다.
void mark(int readAheadLimit)	Marks the present position in the stream.:스트림에서 현재 위치를 마킹한다.
void reset()	 Resets the stream to the most recent mark.:가장 최근 마킹으로 스트림을 재설정한다.
void close()	스트림을 닫아준다.
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
