package ch01;

public class MyLinkedList {
	private MyListNode head;
	private int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode = new MyListNode(data);
		if(head == null) {
			head = newNode;
			
		}
		else {
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		MyListNode newNode = new MyListNode(data);
		MyListNode temp = head;
		
		if(position < 0 || position > count) {
			System.out.println("�߰��� ��ġ�� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�. ���� ����Ʈ ũ��� " + count + "�Դϴ�.");
			return null;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			MyListNode preNode = null;
			for(int i = 0; i < position; i++) {
				preNode = temp;
				temp = temp.next;
				
			}
			preNode.next = newNode;
			newNode.next = temp;
		}
		count++;
		return newNode;	
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("��� X!");
			return;
		}
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			
			if(temp != null) {
				System.out.print(" -> ");
			}
		}
	}
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
}
