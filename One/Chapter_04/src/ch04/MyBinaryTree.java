package ch04;

public class MyBinaryTree implements IBinaryTree{

	private MyTreeNode root;
	private int count;
	
	@Override
	public void addElement(Student student) {
		MyTreeNode newNode = new MyTreeNode(student);
		if(root == null) {
			root = newNode;
			return ;
		}
		
		MyTreeNode temp = root;
		
		while(true) {
			if(student.getNumber() > temp.getStudent().getNumber()) {
				if(temp.right == null) {
					temp.right = newNode;
					break;
				}
				temp = temp.right;
			}
			else {
				if(temp.left == null) {
					temp.left = newNode;
					break;
				}
				temp = temp.left;
			}
		}
		
		count++;
	}

	@Override
	public String removeElement(int number) {
		if(root == null) {
			System.out.println("���� Ʈ���� ����ֽ��ϴ�!");
			return null;
		}
		//������� ã��
		MyTreeNode temp = root;
		MyTreeNode pre = null;
		while(temp.getStudent().getNumber() != number) {
			if(temp.getStudent().getNumber() < number) {
				pre = temp;
				temp = temp.right;
			}
			else {
				pre = temp;
				temp = temp.left;
			}
			if(temp == null) {
				System.out.println("ã���� �ϴ� �л��� �����Ѵ�.");
				return null;
			}
		}
		//temp = ������ ���, pre = temp�� �θ�, rTemp = temp�� �ڽ��� ���϶� ��ü�� ���, rPre = rTemp �θ�
		//�ڽ��� ���� ��
		if(temp.left == null & temp.right == null ) {
			if(temp == root) {
				root = null;
			}
			else if(pre.left == temp) {
				pre.left = null;
			}
			else {
				pre.right = null;
			}
			
		}
		//�ڽ��� �ϳ��� ��(����)
		else if(temp.left == null) {
			if(temp == root) {
				root = temp.right;
			}
			else if(pre.left == temp) {
				pre.left = temp.right;
			}
			else {
				pre.right = temp.right;
			}
		}
		//�ڽ��� �ϳ��� ��(��)
		else if(temp.right == null) {
			if(temp == root) {
				root = temp.left;
			}
			else if (pre.left == temp) {
				pre.left = temp.left;
			}
			else {
				pre.right = temp.left;
			}
		}
		//�ڽĳ��� ���϶�
		else {

			MyTreeNode rPre = temp;
			MyTreeNode rTemp = rPre.left;
			
			while(rTemp.right != null) {
				rPre = rTemp;
				rTemp = rTemp.right;
			}
			rPre.right = rTemp.left;
			rTemp.left = temp.left;
			rTemp.right = temp.right;
			
			if(temp == root) {
				root = rTemp;
				
			}
			else if(temp == pre.left) {
				pre.left = rTemp;
			}
			else {
				pre.right = rTemp;
			}
		}
		return temp.getStudent().getName();
	}

	@Override
	public void selectElement(int number) {
		if(root == null) {
			System.out.println("���� Ʈ���� ����ֽ��ϴ�!");
			return ;
		}
		MyTreeNode temp = root;
		while(temp.getStudent().getNumber() != number) {
			if(temp.getStudent().getNumber() < number) {
				temp = temp.right;
			}
			else {
				temp = temp.left;
			}
			if(temp == null) {
				System.out.println("ã���� �ϴ� �л��� �����Ѵ�.");
				return ;
			}
		}
		temp.getStudent().showInfo();

	}

	@Override
	public MyTreeNode getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public void preOrder(MyTreeNode node) {
		if(node != null) {
			node.getStudent().showInfo();
			preOrder(node.left);
			preOrder(node.right);
		}
		
	}

	@Override
	public void inOrder(MyTreeNode node) {
		if(node != null) {
			preOrder(node.left);
			node.getStudent().showInfo();
			preOrder(node.right);
		}
		
	}

	@Override
	public void postOrder(MyTreeNode node) {
		if(node != null) {
			preOrder(node.left);
			preOrder(node.right);
			node.getStudent().showInfo();
		}
		
	}

}
