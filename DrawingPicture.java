import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Polygon;

public class DrawingPicture extends JComponent {
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.blue);
		
		Rectangle box = new Rectangle(0, 60, 400, 30);
		g2.fill(box);
		
		Rectangle bottom = new Rectangle(0, 300, 400, 30);
		g2.fill(bottom);
		
		 
        int x[] = { 50, 65, 94, 75, 94, 65, 50, 35, 6, 25, 6, 35};
        int y[] = { 156, 180, 178, 200, 222, 220, 244, 220, 222, 200, 178, 180};
        int numberofpoints = 12;

        

        g2.setColor(Color.red);
        g2.fillPolygon(x,y,numberofpoints);
  
        // draw the polygon using drawPolygon
        // function using object of polygon class
        // g2.drawPolygon(fstar);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 12; j++){
                x[j] += 100;
            }
            Polygon fstar = new Polygon(x, y, numberofpoints);
            g2.fillPolygon(fstar);
        }
        
        
        
        
        
        
        
        
       
        
        
        
        
        
	}		
}
