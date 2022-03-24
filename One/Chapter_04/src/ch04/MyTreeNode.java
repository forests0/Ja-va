package ch04;

public class MyTreeNode {
	MyTreeNode left;
	MyTreeNode right;
	private Student student;
	
	public MyTreeNode() {
		left = null;
		right = null;
		student = null;
	}
	public MyTreeNode(Student student) {
		this.left = null;
		this.right = null;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
}
