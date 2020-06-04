package CavallinoMatto;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Leonardo
 */

public class CorsaCavalli extends JFrame {
    
	int pos;
        
        CavalliInCorsa[] Tpart;
	Cavallo[] part;
	
	CampettoCorsa pistina;
	Graphics os;
	Image img;
        
	int n = 0;
        
        //Costruttore con richiesta numero cavalli partecipanti
	public CorsaCavalli(int num) {

		super("Corsa dei Cavalli rari arcobaleno (un po' clandestini)");
		n = num;
                
		setLocation(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                
		pistina = new CampettoCorsa();
		part = new Cavallo[n];
		Tpart = new CavalliInCorsa[n];
		pos = 1;
		
		int pt = 20;
		for (int i = 0; i < n; i++) {
			part[i] = new Cavallo(pt,  i);
			Tpart[i] = new CavalliInCorsa(part[i], this);
			pt = pt + 70;			
		}
                
		// Visualizzazione gara
		this.add(pistina);
		setVisible(true);
                this.setSize(975, 775);
                
                
	}
	
        //get della posizione per controllare la posizione dei cavalli
	public synchronized int getPosizione() {
		return pos++;
	}
	
        //metodo che controlla se i cavalli sono arrivati o no
	public synchronized void controllaArrivi() {
            
		boolean arrivati=true;
                
		for (int i=0; i<n; i++) {
                    
			if (Tpart[i].posizione == 0) {
                            
				arrivati=false;
                                
			}
		}
                
		if(arrivati == true) {
                    
			visualizzaClassifica();
                        
		}
	}
	/**
         * il metodo che visualizza la classifica degli arrivi
         */
	public void visualizzaClassifica() {
            
		JLabel[] arrivi;
		arrivi = new JLabel[n];
		JFrame classifica = new JFrame("Classifica Arco-Baleni");
                
                classifica.setBounds(300, 150, 800, 450);
		classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);
		classifica.getContentPane().setLayout(new GridLayout(6,1 ));
                classifica.getContentPane().setBackground(Color.ORANGE);
                
		for(int i=1; i<n+1; i++) {
                    
			for (int j=0; j<n; j++) {
                            
				if (Tpart[j].posizione==i){
                                    
					arrivi[j]=new JLabel("Il "+i+"° classificato in gara e' nella " + (j+1)+"° corsia");
					arrivi[j].setFont(new Font("Josefin Slab", Font.ITALIC, 18));
					arrivi[j].setForeground(Color.BLACK);
                                        
					classifica.getContentPane().add(arrivi[j]);
				
                                }
			}
		}
                
		classifica.setVisible(true);
		
	}
	
	public void update(Graphics g) {
            
		paint(g);
                
	}
	
	public void paint(Graphics g) {
            
		if (part != null) {
                    
			Graphics2D screen = (Graphics2D) g;
                        
			img= createImage(1000, 700);
			os = img.getGraphics();
                        
			Dimension d = getSize();
                        
			pistina.paint(os);
                        
			for (int i = 0; i < n; i++) {
                            
				part[i].paint(os);
                                
			}
                        
			screen.drawImage(img, 0, 30, this);
			os.dispose();
                        
		}
	}
        
	public static void main(String[] args)
        {
            
            JFrame f=new JFrame("Corsetta Cavalletti Animaletti");
            JPanel pannello=new JPanel();
            pannello.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            
            c.anchor = GridBagConstraints.CENTER;
            c.gridx=0;
            c.gridy=0;
            c.insets =  new Insets(0,0,0,0);
            
            JLabel b=new JLabel("BUONGIORNISSIMO KAFFEEEE??!?!");
            pannello.add(b,c);
            
            b.setFont(new Font("Josefin Slab", Font.ITALIC, 18));
            b.setForeground(Color.red);
            
            JLabel n=new JLabel("Quanti Cavallini Arcobalenosi Vuoi???");
            c.gridy++;
            pannello.add(n,c);
  
            Vector npart = new Vector();
            
            npart.add(2);
            npart.add(3);
            npart.add(4);
            npart.add(5);
            npart.add(6);
            npart.add(7);
            npart.add(8);
            npart.add(9);
            npart.add(10);
        
            JComboBox elenchino=new JComboBox(npart);
            
            c.gridy++; c.anchor = GridBagConstraints.WEST;
            
            pannello.add(elenchino,c);
            JButton Go=new JButton("Let'so Go");
            Inizio ei = new Inizio(elenchino);
            
            Go.addActionListener(ei);
            c.gridx++;
            pannello.add(Go,c);
            
            f.add(pannello);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBounds(500, 300, 500, 300);
            
            Go.setBackground(Color.ORANGE);
            elenchino.setBackground(Color.ORANGE);
	}
        
}