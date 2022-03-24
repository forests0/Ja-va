package ch13;

public class ObjectCopy1 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
				
		library[0] = new Book("»ï±¹Áö1", "Ä§Âø¸Ç", 12000);
		library[1] = new Book("»ï±¹Áö2", "Ä§Âø¸Ç", 12000);
		library[2] = new Book("»ï±¹Áö3", "Ä§Âø¸Ç", 12000);
		library[3] = new Book("»ï±¹Áö4", "Ä§Âø¸Ç", 12000);
		library[4] = new Book("»ï±¹Áö5", "Ä§Âø¸Ç", 12000);
		
		copylibrary[0] = new Book("»ï±¹Áö1", "Ä§Âø¸Ç", 12000);
		copylibrary[1] = new Book("»ï±¹Áö2", "Ä§Âø¸Ç", 12000);
		copylibrary[2] = new Book("»ï±¹Áö3", "Ä§Âø¸Ç", 12000);
		copylibrary[3] = new Book("»ï±¹Áö4", "Ä§Âø¸Ç", 12000);
		copylibrary[4] = new Book("»ï±¹Áö5", "Ä§Âø¸Ç", 12000);
		
		System.arraycopy(library, 0, copylibrary, 0, 0);
		copylibrary[0].setAuthor("»ıÅÃÁãÆä¸®");
		copylibrary[0].setName("¾î¸°¿ÕÀÚ");

		
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
