package Baekjoon_problem;

//������ �߸� ����
//���� - ������ �պκп� �����Ǿ� �־� ����غ��δ�. �Լ� ����� ������ ����
import java.util.Scanner;

public class baekjoon_4344 {

	public static void main(String[] args) {
		int inputCase;
		int inputNum;
		double sum;
		double avg;
		Scanner scanner=new Scanner(System.in);
		
		//�׽�Ʈ ���̽� �Է�
		inputCase=scanner.nextInt();
		
		for(int row=0;row<inputCase;row++) { //��
			//�л� ��
			inputNum=scanner.nextInt();
			
			//���� �Է�
			sum=0.0; //sum �ʱ�ȭ
			for(int column=0;column<inputNum;column++) //��
				sum+=scanner.nextInt();
			
			//��հ��
			avg=Math.round(sum/inputNum*1000)/1000.0;//���� �ʿ�- ����������? ���
			
			//����� �Ѵ� �л��� ���� ���ϱ�
			
			System.out.println(avg+"%");
		}

		scanner.close();
	}

}
