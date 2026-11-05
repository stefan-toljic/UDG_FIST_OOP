package v_m_6;

import java.util.ArrayList;

//paka je bio odje
public class Vjezbe6 {
	
	public static final HonorarniZaposleni hz = 
			new HonorarniZaposleni("Milo", "Brnovic", 5, 50, 5.0f);
	public static final StalnoZaposleni sz =
			new StalnoZaposleni("Aleksa", "Abazovic", 10, 10.0f);
	public static final Racun r = new Racun("Raffaello", 6.7f, 0.08f);

	public static void main(String args[]) {
//		test0();
		test1();
	}
	
	public static void test0() {
		System.out.println(hz + "\tPlata: " + hz.getIznosTroska());
		System.out.println(sz + "\tPlata: " + sz.getIznosTroska());
		System.out.println(r + "\tTrosak: " + r.getIznosTroska());
	}
	
	public static void test1() {
		ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();
		ArrayList<Trosak> troskovi = new ArrayList<Trosak>();
		// zaposleni
		zaposleni.add(new HonorarniZaposleni("Pavle", "Kostic", 4, 25, 3.5f));
		zaposleni.add(new HonorarniZaposleni("Bogdan", "Cuk", 2, 15, 1.75f));
		zaposleni.add(new HonorarniZaposleni("Bojana", "Lav", 10, 50, 15.0f));
		zaposleni.add(new StalnoZaposleni("Slobodan", "Doknic", 6, 5.0f));
		zaposleni.add(new StalnoZaposleni("Marija", "Radovic", 8, 3.5f));
		zaposleni.add(new StalnoZaposleni("Slavko", "Zukic", 3, 2.75f));
		// trosak
		for (int i = 0; i < zaposleni.size(); i++) {
			troskovi.add(zaposleni.get(i));
			System.out.printf("#%d: %s", i, zaposleni.get(i)); System.out.
			println("\tIznos plate: " + zaposleni.get(i).getIznosTroska()); }
		troskovi.add(new Racun("Sir", 3.0f, 0.06f));
		troskovi.add(new Racun("Jaja", 4.0f, 0.07f));
		troskovi.add(new Racun("Prsut", 5.0f, 0.08f));
		System.out.println(); for (Trosak t : troskovi)
			System.out.printf("[%s] Trosak: %.2f €\n",
					t.getClass().getSimpleName(), t.getIznosTroska());
		// racun
		float sum = 0; for (Trosak t : troskovi) if (t instanceof Racun)
			sum += ((Racun) t).getIznos();
		System.out.printf("\nUkupni troskovi (-PDV): %.2f €", sum);
	}
}
