
import java.awt.event.*;
import javax.swing.*;
public class RectangleFrame2 extends JFrame{

    private RectangleComponent2 scene;

    class MousePressListener implements MouseListener{
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            scene.moveRectangleTo(x, y);
        }
        public void mouseReleased(MouseEvent e){}
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
    }
    public RectangleFrame2(){
        scene = new RectangleComponent2();
        add(scene);
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        setSize(300, 400);
    }
}