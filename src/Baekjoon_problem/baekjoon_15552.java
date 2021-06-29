package Baekjoon_problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//2021.06.22 15552��: ���� A+B
/*
 * ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
 * Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
 */

/*
 BufferedReader �� BufferedWriter

���۸� �̿��Ͽ� �Է¹��� ������ �� ���� �����ϱ� ������ ����½� ȿ���� ����.
��) ���� ������ �� ���� Ǯ ������ �ű�� 10�� vs ������ 10�� ������ ���� �� ��� �� ���� �ű��

����(buffer)
� ��ġ���� �ٸ� ��ġ�� �����͸� �۽��� �� �Ͼ�� �ð��� ���̳� ������ �帧�� �ӵ� ���̸� �����ϱ� ���� �Ͻ������� �����͸� ����Ű�� ��ġ.
���۸�(buffering)
� ��ġ���� �ٸ� ��ġ�� �����͸� �۽��� �� ������ �ӵ� ���̸� �����ϱ� ���� �Ͻ������� �����͸� ����Ű�� ����

1. BufferedReader

���� �ڹٿ��� �Է��� �ޱ� ���� java.util ��Ű���� Scanner Ŭ������ ����Ѵ�. Scanner���� ��� ���� ���ڿ� ���ͷ� �Է°��� �����Ѵ�. 
��) Scanner.next() / Scanner.nextLine()
�̿� �ٸ��� BuferedReader�� ���͸� ���� �ν��Ѵ�. ���� ���� ���ڷ� �Է°��� �����ϱ� ���ؼ��� ���� ó���� �ʿ��ϴ�. (���⼭�� StringTokenizer�� ����� �����̴�.)

Reads text from a character-input stream, buffering characters so as to * provide for the efficient reading of characters, arrays, and lines. * *
: ���ڵ�, �迭, ���� ȿ������ �б⸦ �����ϱ� ���ؼ� ���ڵ��� ���۸��ϸ鼭 ���� �Է� ��Ʈ�����κ��� ���ڸ� �д´�.
<p> The buffer size may be specified, or the default size may be used. The * default is large enough for most purposes. * *
: ���� ũ��� ���� ����, �⺻ ũ�⸦ ����� ���� �ִ�. �⺻ ũ��� ����� ũ��
<p> In general, each read request made of a Reader causes a corresponding * read request to be made of the underlying character or byte stream.
:�Ϲ�������, Reader�� �� �б� ��û�� ��� ������ ����, byte ��Ʈ������ ������ �ش� �б��û�� �߱��Ų��. 
It is * therefore advisable to wrap a BufferedReader around any Reader whose read() * operations may be costly, such as FileReaders and InputStreamReaders.
:���� BufferedReader�� FileReader�� InputStreamReader���� read()�۾��� ����� ���� �� �� �ִ� �ٸ� Reader�� ���δ� ���� ����. 

BufferedReader�� ����
import java.io.BufferedReader; //BufferedReader�� java.io��Ű��

import java.io.BufferedReader; //BufferedReader�� java.io��Ű��

class Test{
	public static void main(String[] args) throws IOException{
    	//BufferedReader ��� �� ����ó�� �ʼ�.
        // try-catch ���� ��� ����
    	BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        
        int intNum=Integer.parseInt(bfr.readLine());
        //BufferedReader.readLine()�� ���ڿ��� ��ȯ���ֱ� ������ 
        //int���� �ޱ� ���ؼ��� ����ȯ�� �ʿ��ϴ�.
        
        //���⸦ �������� �Է°� �ޱ�
        StringTokenizer stz=new StringTokenizer(bfr.readLine());//���⸦ �������� ��ūȭ
        String str1 = stz.nextToken();
        String str2= stz.nextToken();
       	��) 
        �Է�: this is a test
        str1 -> this 
        str2 -> is
        
        bfr.close() //���� �̿�� ����� ���� �� �ݵ�� ��Ʈ���� �ݾ��־�� �Ѵ�.
        }
}

�޼��� ����
BufferedReader(Reader in[, int size])	Creates a buffering character-input stream that uses an input buffer of* the specified size.:size ũ���� �Է� ���۸� ����ϴ� ���� �Է� ���۽�Ʈ���� �����Ѵ�.
										- size �Ķ���� ���� �� defualt ũ���� ���� �Է� ���۽�Ʈ�� ����
int read([char cbuf[][, int off, int len]])	���� �迭 cbuf�� off ��ġ���� ���� len ���� ���ڸ�  �� ���ھ� �о� ���ڷ� ��ȯ�Ѵ�. ��, �ش� ������ �ƽ�Ű �ڵ� �� ��ȯ�Ѵ�. ���� ��Ʈ���� ���� �����ϸ� -1�� ��ȯ�Ѵ�.
											-read() :Reads a single character. �� ���� ���ڸ� �д´�.
											-read(char cbuf[])
String readLine()	Reads a line of text.:'\n'�� ��������, �� ���� ���� �а� ���ڿ��� ��ȯ�Ѵ�.
long skip(long n)	Skips characters.:n ������ŭ ���ڸ� �ǳʶٰ� �ǳʶ� ������ ������ ��ȯ�Ѵ�.
boolean ready()	Tells whether this stream is ready to be read.:�ش� ��Ʈ���� ����� �غ� �Ǿ����� �ƴ��� �˷��ش�.
boolean markSupported()	Tells whether this stream supports the mark() operation, which it does.:�ش� ��Ʈ���� mark() ����� �����ϴ��� �ƴ��� �˷��ش�.
void mark(int readAheadLimit)	Marks the present position in the stream.:��Ʈ������ ���� ��ġ�� ��ŷ�Ѵ�.
void reset()	 Resets the stream to the most recent mark.:���� �ֱ� ��ŷ���� ��Ʈ���� �缳���Ѵ�.
void close()	��Ʈ���� �ݾ��ش�.
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
				StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine()); //���⸦ �������� �и�
				fir=Integer.parseInt(stringTokenizer.nextToken());
				sec=Integer.parseInt(stringTokenizer.nextToken());
				
				result=Integer.toString(fir+sec);
				
				bufferedWriter.write(result);
				bufferedWriter.newLine();
			}
			bufferedReader.close(); //���� �̿�� ��Ʈ���� �ݾ��־�� �Ѵ�.
			bufferedWriter.flush(); //���۸� �ݱ� �� ���� �� �����͵��� ��� ���������Ѵ�.
			//flush �޼ҵ带 �������� �� ���� �ؾ� �ð� �ʰ�x 
			bufferedWriter.close();	// ���� �̿�� ��Ʈ���� �ݾ��־�� �Ѵ�.
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
