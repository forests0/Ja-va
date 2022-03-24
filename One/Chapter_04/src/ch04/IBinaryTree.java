package ch04;

public interface IBinaryTree {
	
	
	void addElement(Student student);
	String removeElement(int number);
	void selectElement(int number);
	
	MyTreeNode getRoot();
	
	void preOrder(MyTreeNode node);
	void inOrder(MyTreeNode node);
	void postOrder(MyTreeNode node);
}
