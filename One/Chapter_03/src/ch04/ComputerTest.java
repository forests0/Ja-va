package ch04;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop();
		Computer notebook = new MynoteBook();
		
		desktop.turnOn();
		desktop.display();
		desktop.typing();
		
		notebook.turnOff();
		notebook.display();
		notebook.typing();
	}

}
