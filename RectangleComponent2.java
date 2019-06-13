import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.*;
public class RectangleComponent2 extends JComponent{
    private Rectangle box;
    public RectangleComponent2(){
        box = new Rectangle(100, 100, 20, 30);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fill(box);
        g2.draw(box);
    }
    public void moveRectangleTo(int x, int y){
        box.setLocation(x, y);
//nameOFarray[x] ="x"

        repaint();
    }
}