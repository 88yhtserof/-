package Baekjoon_problem;

import java.util.Scanner;

//2021.06.21 10828번: 스택
//시간 초과 (시간제한 0.5초) -> 빠른 입출력 공부하기!! 15552 번 문제 참고

/*
 1. 스택 (stack)


접시를 쌓듯이 자료를 차곡차곡 쌓아올린 형태의 자료구조
후입선출 구조(LIFO: Last-In First-out) → top 에서만 저장된 원소에 접근할 수 있다.
top : 스택의 가장 위에 놓인 원소를 가리킨다. 
스택의 연산:
push(s, item) : 삽입, 스택 s에 item(원소)을 삽입하는 연산
pop(s) : 삭제, 스택 s의 top에 있는 원소를 삭제하여 리턴하는 연산
+ 추가 연산 - peek(s) : 스택 s의 top에 있는 원소를 삭제하지 않고 리턴하는 연산
스택의 구현:
순차 자료구조 - 1차원 배열을 이용하여 구현. 단점) 공간 낭비 가능성 높음, 크기 변경 비효율적
연결 자료구조 - 단순 연결 리스트를 이용하여 구현. 스택의 원소 하나 = 노드 하나


1.1 스택의 구현 - 연결 자료구조

-단순 연결 리스트를 이용하여 구현
-스택 원소 하나 = 단순 연결 리스트의 노트 하나
-순차 자료구조의 단점 극복 가능 
-변수 top :  단순 연결 리스트의 첫번째 노드 가리키는 변수
	empty 상태 : top == null (초기상태)
	full 상태 : 정의되지 않음
-연결 자료구조를 이용한 스택 연산
	push(s, item) : 단순 연결 리스트 스택 s의 가장 앞에 data 값으로 item을 가진 노드 삽입. <소요시간 O(1)>
	pop(s) : 단순 연결 리스트 스택 s의 첫번째 노드 삭제. 즉, top이 가리키고 있는 노드 삭제 후 리턴


public class MyLinkedStack {
	private Node top =null //공백 스택 생성
    
    private class Node{//Node클래스
    	char data;
        Node link
    }
    
    public boolean isEmpty(){
    if(top == null)  //empty 상태 : top == null
    	return true;
    else
    	return false;
    }
    
    public void push(char item){//top과 item만 이용하여 스택에 삽입
    	Node newNode= new Node();//삽입할 item를 저장할 새 노드 생성
    	newNode.data=item; //새 노드의 data에 item 저장
        newNode.link=top;
      
        만약 공백 스택일 경우 top은 null, 
        새 노드는 해당 스택의 첫번째 노드이자 마지막 노드이므로 link에 null 저장해야 함
        
        공백 스택이 아닐 경우 top은 이전 노드를 가리킴
        새 노드는  이전 노드를 가리켜야 하므로 top, 
        즉 이전 노드를 가리키는 link를 받아 이전 노드를 가리킨다.
        
        top=newNode; //top이 새 노드, 즉 첫번째 노드를 가리키게 한다.
    }
    
    public char pop(){ //top을 사용하여 삭제 후 리턴
    	if(isEmpty())
        	예외 발생;
        else{
        	char item=top.data; //top이 가리키는 노드의 data를 따로 저장한다.
            top=top.link; //top이 첫번째 노드의 link, 즉 두번째 노드를 가리키게 한다.
            //연결 리스트에서 노드는 다른 노드와의 연결이 끊어지면 해당 노드는 삭제된다.
            return item;
        }
    }
}

 */

public class baekjoon10828 {

	//스택을 위한 클래스 구현
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
