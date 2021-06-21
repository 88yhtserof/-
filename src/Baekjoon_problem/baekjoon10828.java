package Baekjoon_problem;

import java.util.Scanner;

//2021.06.21 10828번: 스택
//시간 초과 (시간제한 0.5초) -> 빠른 입출력 공부하기!! 15552 번 문제 참고

public class baekjoon10828 {

	public static class linkedStack{
		private class Node{
			int data;
			Node link;
		}

		private Node top=null;
		private int count=0;

		// push X: 정수 X를 스택에 넣는 연산이다.
		public void push(int item) {//top과 newNode 가지고 하기
			Node newNode=new Node();
			newNode.data=item;
			newNode.link=top;
			top=newNode;
			count++;
		}

		//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int pop() {//top만 가지고 하기
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

		//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		public int isEmpty() {
			if(top==null)//비어있으면
				return 1;
			return 0;
		}

		//size: 스택에 들어있는 정수의 개수를 출력한다.
		public int getSize() {
			return count;
		}

		//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		public int getTop(){
			if(isEmpty()==1)
				return -1;
			return top.data;	
		}
	}

	//프로그램 실행
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
