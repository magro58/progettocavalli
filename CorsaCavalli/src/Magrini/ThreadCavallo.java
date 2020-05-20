package Magrini;

public class ThreadCavallo implements Runnable {
	Cavallo cav;
	GarettaCampo campetto;
	int v;
	int pos;
	
	public ThreadCavallo( Cavallo c, GarettaCampo cam ){
		cav = c;
		campetto = cam;
		pos = 0;
	}
	
	public void run() {
		
		int img = 80;
		int luncamp = 1000;
		while((cav.getX() + img) < luncamp) {
			v = (int)(Math.random() * 10 + 1);
			cav.setX(cav.getX() + v);
			if ((cav.getX() + img) > luncamp) {
				cav.setX(luncamp - img);
			}
		}
		//pos = campetto.getPos();  //servirebbe a controllare la posizione da GarettaCampo
		//campetto.contArr();		//servirebbe a controllare gli arrivi da GarettaCampo
		
	}

}
