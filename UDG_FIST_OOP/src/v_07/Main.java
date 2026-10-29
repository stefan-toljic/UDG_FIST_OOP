package v_07;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		 ArrayList<Vozilo> lista = new ArrayList<Vozilo>();
		 lista.add(new Bicikl(Vozilo.BICIKL_ID, 10.0f));
		 lista.add(new Motor(Vozilo.MOTOR_ID, 15.0f));
		 lista.add(new Automobil(Vozilo.AUTOMOBIL_ID, 25.0f));
		 /////////////////////////////////////////////////////
		 for (Vozilo x : lista) {
			 float dis = 10.0f;
			 dis += new Random().nextFloat();
			 x.info();
			 System.out.println("Vrijeme dostave: " + x.izracunajVrijemeDostave(dis));
			 if (x instanceof Ekonomican)
				 System.out.println("Potrosnja po KM: " + ((Ekonomican) x).potrosnjaPoKm());
		 }
	}
}


