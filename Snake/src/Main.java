import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	private static SnakeGUI gui;
	public static void main(String [] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {}
		gui = new SnakeGUI();
	}
	public static SnakeGUI getGUI() {
		return gui;
	}
}

