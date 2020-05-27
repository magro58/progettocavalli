package Magrini;

import java.awt.*;

import javax.swing.*;

public class GarettaPista extends JFrame {
	
	int pos;
	Cavallo[] part;
	ThreadCavallo[] threadpart;
	Pista pis;
	int ncav;
	
	 public GarettaPista(int n) {
		 super("Gara Cavallini Pucciosi");
		 setSize(1000, 1039);
		 setLocation(40,30);
		 pis = new Pista();
		 ncav = n;
		 part = new Cavallo[ncav];
		 threadpart = new ThreadCavallo[ncav];
		 pos = 1;
		 int partenza = 10;
		 for (int i = 0; i < ncav; i++) {
			 part[i] = new Cavallo(partenza, i + 1);
			 threadpart[i] = new ThreadCavallo(part[i], this);
			 partenza = partenza + 50;
			 this.add(part[i]);
		 }
		
		 this.add(pis); 
		 setVisible(true);
		 
	 }
	 
	 public synchronized int getPos() {
			return pos;
		}
		
		public synchronized void Arrivi() {
			boolean ar = true;
			for (int i = 0; i < ncav; i++) {
				if(threadpart[i].pos == 0) {
					ar = false;
				}
			}
			if (ar == true) {
				Classifica();
			}
		}
		
		public void Classifica() {
			GridLayout layout = new GridLayout(ncav,1);
			JLabel[] arrivo = new JLabel[ncav];
			JFrame clas = new JFrame("Classificozza!!");
			clas.setBounds(250, 150, 400, 400);
			clas.setDefaultCloseOperation(EXIT_ON_CLOSE);
			clas.setLayout(layout);
			
			for(int i = 1; i < ncav + 1; i++) {
				for (int j = 0; j < ncav; j++) {
					arrivo[j] = new JLabel(i + "° Cavallo nella classifica in pista: " + (j+1));
					clas.add(arrivo[j]);
				}
			}
			clas.setVisible(true);
		}
	
	
}
