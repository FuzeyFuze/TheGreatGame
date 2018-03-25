import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
import javax.imageio.*;


public class MyPanel extends JPanel {

	public int x;
	private Image bg, catcher;
	private Timer tmDraw, tmUpdate;
	
	public MyPanel(){
		try {
			bg = ImageIO.read(new File("img\\bg.png"));
			catcher = ImageIO.read(new File("img\\chatcher.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics gr){
		gr.drawImage(bg, 0, 0, 800, 600, null);
		gr.drawImage(catcher, x, 465, 100, 100,null);		
	}
}
