package Magrini;

import javax.swing.*;
import java.awt.*;

public class Pista extends JPanel{
	
	public void paint(Graphics g) {
		//colore sfondo campo
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 1000, 1039);
		//strisce separatorie per corsie
		g.setColor(Color.BLACK);
		g.fillRect(0, 100, 1000, 10);
		g.fillRect(0, 200, 1000, 10);
		g.fillRect(0, 300, 1000, 10);
		g.fillRect(0, 400, 1000, 10);
		g.fillRect(0, 500, 1000, 10);
		g.fillRect(0, 600, 1000, 10);
		g.fillRect(0, 700, 1000, 10);
		g.fillRect(0, 800, 1000, 10);
		g.fillRect(0, 900, 1000, 10);
		//traguardo
		g.fillRect(960, 0, 5, 1039);
		g.fillRect(970, 0, 5, 7039);
	}

}
