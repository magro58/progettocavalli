package CavallinoMatto;
/**
 *
 * @author Leonardo
 */
public class CavalliInCorsa implements Runnable {
	Cavallo Cavallo;
	CorsaCavalli pista;
	int velocita;
	Thread t;
	int conta;
	int posizione;
        
        
	
	public CavalliInCorsa(Cavallo cav, CorsaCavalli c) {
		Cavallo=cav;
		pista=c;
		conta=0;
                velocita=0;
                t = new Thread(this);
		t.start();
		posizione=0;
	}
	
	@Override
	public void run() {
		int dimi=50;
		int dimPista=965;        
               // new SoundClipTest();
		while((Cavallo.getCx()+dimi)<dimPista) {
			if ((conta%10)==0)
				velocita=(int)(Math.random()*4+1);
			Cavallo.setCx(Cavallo.getCx()+velocita);
			conta++;
			try {Thread.sleep(75);}
			catch (Exception e) {}
			pista.repaint();
		}
		
		posizione = pista.getPosizione();
		pista.controllaArrivi();
	}
	
}