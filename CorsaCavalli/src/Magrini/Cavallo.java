package Magrini;
import javax.swing.*;

public class Cavallo extends JPanel {
	
	int X = 0;
	int Y;
	ImageIcon img;
	
	public Cavallo(int x, int y) {
		super();
		X = x;
		this.Y = y;
		setSize(80,80);
		img = new ImageIcon("cavallino.png");
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
	
}
