package ch04;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		MyBinaryTree bTree = new MyBinaryTree();
		
		bTree.addElement(new Student(10, "��û��"));
		bTree.addElement(new Student(5, "��"));
		bTree.addElement(new Student(1, "�̸�"));
		bTree.addElement(new Student(12, "�̰Եȴ�?"));
		bTree.addElement(new Student(14, "�ȵɱ�?"));
		bTree.addElement(new Student(7, "��"));
		
		bTree.preOrder(bTree.getRoot());
		System.out.println("================================");
		bTree.inOrder(bTree.getRoot());
		System.out.println("================================");
		bTree.postOrder(bTree.getRoot());
		System.out.println("================================");
		
		bTree.selectElement(5);
		System.out.println(bTree.removeElement(5) + " ����");
	}

}
