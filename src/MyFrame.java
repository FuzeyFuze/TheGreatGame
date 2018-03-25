import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	
	private MyPanel pan;
	
	private class MyKey implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			
			switch(key){
			case KeyEvent.VK_LEFT:
				if(pan.x - 30 > -48) pan.x-=30;
				else pan.x = 752;
				break;
			case KeyEvent.VK_RIGHT:
				if(pan.x + 30 < 752) pan.x-=30;
				else pan.x = -48;
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {}

		@Override
		public void keyTyped(KeyEvent e) {}
		
	}
	
	public MyFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0,0, 800, 600);
		setTitle("THE GAME");
		setFocusable(true);
		pan = new MyPanel();
		add(pan);
		setVisible(true);
	}
}