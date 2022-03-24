package ch03;

import ch01.MyLinkedList;
import ch01.MyListNode;

public class MyListStack extends MyLinkedList implements IStack{

	private MyListNode top;
	
	@Override
	public void push(String data) {
		MyListNode newNode = insertElement(0, data);
		if(isEmpty()) {
			top = newNode;
			return ;
		}
		top = newNode;
		System.out.println(data + " push");
	}

	@Override
	public String pop() {
		if(isEmpty()) {
			System.out.println("현재 이 스택은 비워져 있습니다");
			return null;
		}
		String data = top.getData();
		top = top.next;
		return data;
	}

	@Override
	public void printAll() {
		MyListNode temp = top;
		if(isEmpty()) {
			System.out.println("현재 이 스택은 비워져 있습니다");
		}
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}

}
