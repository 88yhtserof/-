package Baekjoon_problem;

import java.util.Scanner;

//2021.06.21 10828��: ����
//�ð� �ʰ� (�ð����� 0.5��) -> ���� ����� �����ϱ�!! 15552 �� ���� ����

public class baekjoon10828 {

	public static class linkedStack{
		private class Node{
			int data;
			Node link;
		}

		private Node top=null;
		private int count=0;

		// push X: ���� X�� ���ÿ� �ִ� �����̴�.
		public void push(int item) {//top�� newNode ������ �ϱ�
			Node newNode=new Node();
			newNode.data=item;
			newNode.link=top;
			top=newNode;
			count++;
		}

		//pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		public int pop() {//top�� ������ �ϱ�
			int data;

			if(isEmpty()==0) {
				data=top.data;
				top=top.link;
				count--;
			}
			else
				data=-1;

			return data;
		}

		//empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		public int isEmpty() {
			if(top==null)//���������
				return 1;
			return 0;
		}

		//size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
		public int getSize() {
			return count;
		}

		//top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		public int getTop(){
			if(isEmpty()==1)
				return -1;
			return top.data;	
		}
	}

	//���α׷� ����
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		linkedStack stack=new linkedStack();

		int instructionNum;
		instructionNum=scanner.nextInt();

		for(int i=0; i<instructionNum;i++) {
			String instruction=scanner.next();

			switch(instruction){
			case "push": 
				int item=scanner.nextInt();
				stack.push(item);
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.getSize());
				break;
			case "empty":
				System.out.println(stack.isEmpty());
				break;
			case "top":
				System.out.println(stack.getTop());
				break;
			}
		}

		scanner.close();
	}
}
