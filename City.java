import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geo.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

Public class City extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.blue);
		
		