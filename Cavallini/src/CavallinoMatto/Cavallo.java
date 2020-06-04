package CavallinoMatto;

import java.awt.*;
import java.io.IOException;
import java.util.logging.*;
import javax.imageio.*;

import javax.swing.JPanel;
/**
 *
 * @author Leonardo
 */
public class Cavallo extends JPanel {
	int cx;
	int cy;
	Image img;

	public Cavallo(int y, int x) {
            
		cx = 0;
		cy = y;
		Toolkit tk = Toolkit.getDefaultToolkit();

            try {
                
                img = ImageIO.read(getClass().getResource("../img/cavallino.png"));
                
            } catch (IOException ex) {
                
                Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
                
            }
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
                
		try {
                    
			mt.waitForID(1);
                        
		} catch (Exception e) {
                      
		}
	}
        
        public void paint(Graphics g) {
            
		g.drawImage(img,  cx,  cy, null);
                
	}
	
	public int getCx() {
            
		return cx;
                
	}
        
	public void setCx(int n) {
            
		cx = n;
                
	}
}