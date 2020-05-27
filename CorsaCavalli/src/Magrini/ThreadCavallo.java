package Magrini;

public class ThreadCavallo implements Runnable {
	Cavallo cav;
	GarettaPista pistina;
	int v;
	int pos;
	
	public ThreadCavallo( Cavallo c, GarettaPista cam ){
		cav = c;
		pistina = cam;
		pos = 1;
	}
	
	public void run() {
		
		int img = 80;
		int luncamp = 1000;
		while((cav.getX() + img) < luncamp) {
			v = (int)(Math.random() * 10 + 1);
			cav.setX(cav.getX() + v);
			if ((cav.getX() + img) > luncamp) {
				cav.setX(luncamp);
			}
			
		}
				
		
	}
	
	

}
