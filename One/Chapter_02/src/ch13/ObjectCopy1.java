package ch13;

public class ObjectCopy1 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
				
		library[0] = new Book("�ﱹ��1", "ħ����", 12000);
		library[1] = new Book("�ﱹ��2", "ħ����", 12000);
		library[2] = new Book("�ﱹ��3", "ħ����", 12000);
		library[3] = new Book("�ﱹ��4", "ħ����", 12000);
		library[4] = new Book("�ﱹ��5", "ħ����", 12000);
		
		copylibrary[0] = new Book("�ﱹ��1", "ħ����", 12000);
		copylibrary[1] = new Book("�ﱹ��2", "ħ����", 12000);
		copylibrary[2] = new Book("�ﱹ��3", "ħ����", 12000);
		copylibrary[3] = new Book("�ﱹ��4", "ħ����", 12000);
		copylibrary[4] = new Book("�ﱹ��5", "ħ����", 12000);
		
		System.arraycopy(library, 0, copylibrary, 0, 0);
		copylibrary[0].setAuthor("�������丮");
		copylibrary[0].setName("�����");

		
		for(Book book : library) {
			book.ShowInfo();
			System.out.println("=================");
		}
		System.out.println("***************************");
		for(Book book : copylibrary) {
			book.ShowInfo();
			System.out.println("=================");
		}
	}

}
