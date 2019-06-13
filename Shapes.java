

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; // importing Graphic2D

		Rectangle box = new Rectangle(5, 10, 20, 30); // creating a rectangle at x:5 y:10 width:20 height:30
		g2.draw(box); // draw rectangle on component

		g2.setColor(Color.blue); // sets the color to blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // creating a circle
		g2.fill(circle); // fill in a circle

	}
}
