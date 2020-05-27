package Magrini;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Cavallo extends JPanel {
	
	int X = 0;
	int Y;
	BufferedImage img;
	
	public Cavallo(int x, int y) {
		X = x;
		this.Y = y;
		setSize(60,60);
		/*Toolkit fungipls = Toolkit.getDefaultToolkit();
		switch(x) {
		case 1:{img = fungipls.getImage("cavallino.png");break;}
		case 2:{img = fungipls.getImage("cavallino2.png");break;}
		case 3:{img = fungipls.getImage("cavallino3.png");break;}
		case 4:{img = fungipls.getImage("cavallino4.png");break;}
		case 5:{img = fungipls.getImage("cavallino5.png");break;}
		case 6:{img = fungipls.getImage("cavallino6.png");break;}
		case 7:{img = fungipls.getImage("cavallino7.png");break;}
		case 8:{img = fungipls.getImage("cavallino8.png");break;}
		case 9:{img = fungipls.getImage("cavallino9.png");break;}
		case 10:{img = fungipls.getImage("cavallino10.png");break;}
		}
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
		try{ 
			mt.waitForID(1);
			}
		catch(InterruptedException e) {
			
		}*/
		try {
			img = ImageIO.read(new File("cavallino.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Graphics g = img.getGraphics();
		g.drawImage(img, x, 0, this);
		
		setVisible(true);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, X, Y, null);
	}
	
}

