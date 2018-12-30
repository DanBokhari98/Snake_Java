import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class SnakeGUI extends JFrame {
	private static int dx, dy;
	private SnakeGraphics snake;
	
	public SnakeGUI() {
		super("Snake");
		gui();
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT)  dx = -1;
	    if (key == KeyEvent.VK_RIGHT) dx = 1;
	    if (key == KeyEvent.VK_UP) dy = -1;
	    if (key == KeyEvent.VK_DOWN) dy = 1;
	}
	
	public static int getDX() { return dx; }
	public static int getDY() { return dy; }
	
	public void gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		snake  = new SnakeGraphics();
		snake.setAlignmentX(TOP_ALIGNMENT);
		add(snake);
	}
}
