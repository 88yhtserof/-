package Baekjoon_problem;

import java.util.Scanner;

//2021.06.21 10828��: ����
//�ð� �ʰ� (�ð����� 0.5��) -> ���� ����� �����ϱ�!! 15552 �� ���� ����

/*
 1. ���� (stack)


���ø� �׵��� �ڷḦ �������� �׾ƿø� ������ �ڷᱸ��
���Լ��� ����(LIFO: Last-In First-out) �� top ������ ����� ���ҿ� ������ �� �ִ�.
top : ������ ���� ���� ���� ���Ҹ� ����Ų��. 
������ ����:
push(s, item) : ����, ���� s�� item(����)�� �����ϴ� ����
pop(s) : ����, ���� s�� top�� �ִ� ���Ҹ� �����Ͽ� �����ϴ� ����
+ �߰� ���� - peek(s) : ���� s�� top�� �ִ� ���Ҹ� �������� �ʰ� �����ϴ� ����
������ ����:
���� �ڷᱸ�� - 1���� �迭�� �̿��Ͽ� ����. ����) ���� ���� ���ɼ� ����, ũ�� ���� ��ȿ����
���� �ڷᱸ�� - �ܼ� ���� ����Ʈ�� �̿��Ͽ� ����. ������ ���� �ϳ� = ��� �ϳ�


1.1 ������ ���� - ���� �ڷᱸ��

-�ܼ� ���� ����Ʈ�� �̿��Ͽ� ����
-���� ���� �ϳ� = �ܼ� ���� ����Ʈ�� ��Ʈ �ϳ�
-���� �ڷᱸ���� ���� �غ� ���� 
-���� top :  �ܼ� ���� ����Ʈ�� ù��° ��� ����Ű�� ����
	empty ���� : top == null (�ʱ����)
	full ���� : ���ǵ��� ����
-���� �ڷᱸ���� �̿��� ���� ����
	push(s, item) : �ܼ� ���� ����Ʈ ���� s�� ���� �տ� data ������ item�� ���� ��� ����. <�ҿ�ð� O(1)>
	pop(s) : �ܼ� ���� ����Ʈ ���� s�� ù��° ��� ����. ��, top�� ����Ű�� �ִ� ��� ���� �� ����


public class MyLinkedStack {
	private Node top =null //���� ���� ����
    
    private class Node{//NodeŬ����
    	char data;
        Node link
    }
    
    public boolean isEmpty(){
    if(top == null)  //empty ���� : top == null
    	return true;
    else
    	return false;
    }
    
    public void push(char item){//top�� item�� �̿��Ͽ� ���ÿ� ����
    	Node newNode= new Node();//������ item�� ������ �� ��� ����
    	newNode.data=item; //�� ����� data�� item ����
        newNode.link=top;
      
        ���� ���� ������ ��� top�� null, 
        �� ���� �ش� ������ ù��° ������� ������ ����̹Ƿ� link�� null �����ؾ� ��
        
        ���� ������ �ƴ� ��� top�� ���� ��带 ����Ŵ
        �� ����  ���� ��带 �����Ѿ� �ϹǷ� top, 
        �� ���� ��带 ����Ű�� link�� �޾� ���� ��带 ����Ų��.
        
        top=newNode; //top�� �� ���, �� ù��° ��带 ����Ű�� �Ѵ�.
    }
    
    public char pop(){ //top�� ����Ͽ� ���� �� ����
    	if(isEmpty())
        	���� �߻�;
        else{
        	char item=top.data; //top�� ����Ű�� ����� data�� ���� �����Ѵ�.
            top=top.link; //top�� ù��° ����� link, �� �ι�° ��带 ����Ű�� �Ѵ�.
            //���� ����Ʈ���� ���� �ٸ� ������ ������ �������� �ش� ���� �����ȴ�.
            return item;
        }
    }
}

 */

public class baekjoon10828 {

	//������ ���� Ŭ���� ����
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
