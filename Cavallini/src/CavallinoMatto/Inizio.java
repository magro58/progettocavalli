package CavallinoMatto;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Leonardo
 */

public class Inizio implements ActionListener
{
    JComboBox n;

    public Inizio(JComboBox num)
    {
       n=num;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        new CorsaCavalli((int)n.getSelectedItem());
        new SoundClipTest();
        
    }
    
}
