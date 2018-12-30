import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SnakeGraphics extends JPanel {
	private static Ellipse2D highlighted;
	public static Graphics2D g2;
	private Random rand = new Random();
	private int dx, dy;
	
	public SnakeGraphics() {}
	
	public void setDX() { dx = SnakeGUI.getDX(); }
	public void setDY() { dy = SnakeGUI.getDY(); }
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2 = (Graphics2D) g;
		g2.setPaint(Color.BLUE);
		g2.setStroke(new BasicStroke(3.f));
		
		Rectangle2D.Double snake = new Rectangle2D.Double(250, 250, 15, 15);
		g2.draw(snake);
		System.out.println(snake.getX()  + " " + snake.getY());
		setDX();
		setDY();
		System.out.println(dx + " " + dy);
		while(dx != 0  || dy != 0) {
			System.out.println(dx + " " + dy);
			snake.setRect(250 + dx, 250 + dy, 15, 15);
			setDX();
			setDY();
		}
	}
	
}
