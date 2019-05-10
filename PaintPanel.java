import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class PaintPanel extends JPanel {

	private int pointCount = 0; 
	private Point[] points = new Point[10000];
	private int number1 = 4;
	private int number2 = 4;
	private Color color = Color.BLUE;
	
	public PaintPanel() {
		addMouseMotionListener(
				new MouseMotionAdapter() { 
					public void mouseDragged(MouseEvent event) { 
						if (pointCount < points.length) {
							points[pointCount] = event.getPoint();
							pointCount++;
							repaint();
						}
					}
				}
		);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
		for (int i = 0; i < pointCount; i++) {
			g.setColor(this.color);
			g.fillOval(points[i].x, points[i].y, number1, number2);
		}
	}
	
	public void plusComponent() {
		this.number1 = this.number1 + 1;
		this.number2 = this.number2 + 1;
	}
	
	public void minusComponent() {
		if(this.number1 > 2) {
			this.number1 = this.number1 - 1;
			this.number2 = this.number2 - 1;
		}
		else {
			this.number1 = 2;
			this.number2 = 2;
		}
	}
	
	public void colorButton(Color color) {
		this.color = color;
	}
	
	public void eraseButton() {
		this.pointCount = 0;
	}
	public void paintComponent2(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < pointCount; i++) {
			g.setColor(this.color);
			g.fillOval(points[i].x, points[i].y, number1, number2);
		}
	}
}