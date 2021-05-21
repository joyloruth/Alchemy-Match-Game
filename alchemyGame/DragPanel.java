package alchemyGame;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class DragPanel extends JPanel {

	
	ImageIcon image = new ImageIcon("guitar.png");
	ImageIcon image2 = new ImageIcon("guitar.png");
	
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	
	final int WIDTH2 = image2.getIconWidth();
	final int HEIGHT2 = image2.getIconHeight();
	
	Point imageCorner = new Point(0,0);
	Point imageCorner2 = new Point(0,150);
	
	
	Point previousPoint;
	Point previousPoint2;
	
	
	DragPanel(){
		
		
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
		image2.paintIcon(this, g, (int)imageCorner2.getX(), (int)imageCorner2.getY());
	}
	
	
	
	private class ClickListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			previousPoint = e.getPoint();
			previousPoint2 = e.getPoint();
			
			
		}
		
		
	}
 
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			
			Point currentPoint = e.getPoint();
			Point currentPoint2 = e.getPoint();
			
			imageCorner.translate(
					
					(int)(currentPoint.getX() - previousPoint.getX()),
					(int)(currentPoint.getY() - previousPoint.getY())
					);
			previousPoint = currentPoint;
			repaint();
			
			
			imageCorner2.translate(
					
					(int)(currentPoint2.getX() - previousPoint2.getX()),
					(int)(currentPoint2.getY() - previousPoint2.getY())
					);
			previousPoint2 = currentPoint2;
			repaint();
			
			
		}
		
	}
}


