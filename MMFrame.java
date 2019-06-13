import javax.swing.JFrame;

public class MMFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		MMouse r = new MMouse();
		frame.add(r);

		frame.setVisible(true); 
	}
}