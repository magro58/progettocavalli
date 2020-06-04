package CavallinoMatto;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
/**
 *
 * @author Leonardo
 */
public class CampettoCorsa extends JPanel {
    private BufferedImage image;
    
	public void paint(Graphics g) {
	//Cancello di partenza
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(5,15,90,690);
        this.setSize(975, 690);
        //Sfondo Arancione
        g.setColor(Color.ORANGE);
        g.fillRect(90,15,880,690);
        
        //Divisorio
        g.setColor(Color.GRAY);
        g.fillRect(5,2,965,10);
        g.fillRect(5,75,965,10);
        g.fillRect(5,150,965,10);
        g.fillRect(5,220,965,10);
        g.fillRect(5,290,965,10);
        g.fillRect(5,360,965,10);
        g.fillRect(5,430,965,10);
        g.fillRect(5,500,965,10);
        g.fillRect(5,570,965,10);
        g.fillRect(5,640,965,10);
        g.fillRect(5,695,965,10);

        //Barra Partenza
        g.setColor(Color.BLACK);
        g.fillRect(80,15,10,695);
        
        int h = 0, l = 0;
        boolean c = false;
        
        //Bandiera a scacchi
        while( h < 695 ){
        	
            for(int i = 0; i < 3; i++){
            	
                if(c==false){
                	
                    g.setColor(Color.BLACK);
                    c=true;
                    
                }else{
                	
                    g.setColor(Color.WHITE);
                    c=false;
                    
                }
                
                g.fillRect((880+l),(15+h),10,10);
                l+=10;
            }
            
            l = 0;
            h += 10;
        }
	}
}