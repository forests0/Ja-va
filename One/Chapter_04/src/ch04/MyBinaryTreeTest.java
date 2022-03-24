package ch04;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		MyBinaryTree bTree = new MyBinaryTree();
		
		bTree.addElement(new Student(10, "심청이"));
		bTree.addElement(new Student(5, "굳"));
		bTree.addElement(new Student(1, "이름"));
		bTree.addElement(new Student(12, "이게된다?"));
		bTree.addElement(new Student(14, "안될까?"));
		bTree.addElement(new Student(7, "딤"));
		
		bTree.preOrder(bTree.getRoot());
		System.out.println("================================");
		bTree.inOrder(bTree.getRoot());
		System.out.println("================================");
		bTree.postOrder(bTree.getRoot());
		System.out.println("================================");
		
		bTree.selectElement(5);
		System.out.println(bTree.removeElement(5) + " 삭제");
	}

}
