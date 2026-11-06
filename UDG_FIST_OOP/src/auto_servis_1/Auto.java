package auto_servis_1;

import java.time.Year;
import java.util.ArrayList;

public class Auto {
	/* const */
	public static final int REG_LIMIT = 1985;
	public static final int AGE_LIMIT = 1866;
	public static final int Y85 = 1985;
	public static final int Y00 = 2000;
	public static final int Y01 = 2001;
	public static final int Y10 = 2010;
	public static final int Y11 = 2011;
	public static final int YNOW = Year.now().getValue();
	public static final float COEF_85_00 = 3.0f;
	public static final float COEF_01_10 = 2.0f;
	public static final float COEF_11_NOW = 1.0f;
	/* var */
	private static int brojProdatihAuta = 0;
	private MarkaAuta markaAuta;
	private int godisteAuta;
	private SnagaMotora snagaMotora;
	private boolean prodato;
	private KubikazaMotora kubikazaMotora;
	private boolean registrovan;
	/* constructor */
	public Auto() { }
	public Auto(MarkaAuta markaAuta, int godisteAuta, SnagaMotora snagaMotora, 
			boolean prodato, KubikazaMotora kubikazaMotora, boolean registrovan) {
		this.setMarkaAuta(markaAuta);
		this.setGodisteAuta(godisteAuta);
		this.setSnagaMotora(snagaMotora);
		this.setProdato(prodato);
		this.setKubikazaMotora(kubikazaMotora);
		this.setRegistrovan(registrovan);
	}
	/* get/set */
	public MarkaAuta getMarkaAuta() {
		return markaAuta;
	}
	public void setMarkaAuta(MarkaAuta markaAuta) {
		if (markaAuta == null) {
			System.out.println("_setMarkaAuta: IN = null"); return;
		} this.markaAuta = markaAuta;
	}
	public int getGodisteAuta() {
		return godisteAuta;
	}
	public void setGodisteAuta(int godisteAuta) {
		if (godisteAuta < Auto.AGE_LIMIT) {
			System.out.println("_setGodisteAuta: IN < " + Auto.AGE_LIMIT);
			return; } this.godisteAuta = godisteAuta;
	}
	public SnagaMotora getSnagaMotora() {
		return snagaMotora;
	}
	public void setSnagaMotora(SnagaMotora snagaMotora) {
		if (snagaMotora == null) {
			System.out.println("_setSnagaMotora: IN = null"); return;
		} this.snagaMotora = snagaMotora;
	}
	public boolean isProdato() {
		return prodato;
	}
	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}
	public KubikazaMotora getKubikazaMotora() {
		return kubikazaMotora;
	}
	public void setKubikazaMotora(KubikazaMotora kubikazaMotora) {
		if (kubikazaMotora == null) {
			System.out.println("_setKubikazaMotora: IN = null"); return;
		} this.kubikazaMotora = kubikazaMotora;
	}
	public boolean isRegistrovan() {
		return registrovan;
	}
	public void setRegistrovan(boolean registrovan) {
		if (getGodisteAuta() < Auto.REG_LIMIT) {
			System.out.println("_setRegistrovan: IN < " + Auto.REG_LIMIT);
			return; } this.registrovan = registrovan;
	}
	public static int getBrojProdatihAuta() {
		return brojProdatihAuta;
	}
	@Override
	public String toString() {
		return String.format("{\n\tMarka: %s\n\tGodiste: %d\n\tSnaga motora: %s"
			+ "\n\tProdato: %s\n\tKubikaza: %s\n\tRegisrovan: %s\n}",
			getMarkaAuta(), getGodisteAuta(), getSnagaMotora(), isProdato(),
			getKubikazaMotora(), isRegistrovan());
	}
	/* canRegister */
	public static ArrayList<Auto> canRegister(ArrayList<Auto> lista) {
		ArrayList<Auto> odabrana = new ArrayList<Auto>();
		for (Auto a : lista) if (a.getGodisteAuta() >= Auto.REG_LIMIT &&
				!a.isRegistrovan()) odabrana.add(a); return odabrana;
	}
	/* getIznosRegistracije */
	public float getIznosRegistracije() {
		float kubikaza, snaga, registracija;
		switch (kubikazaMotora) {
			case CC_999: kubikaza = 9.99f; break; 
			case CC_1199: kubikaza = 11.99f; break;
			case CC_1368: kubikaza = 13.68f; break;
			case CC_1598: kubikaza = 15.98f; break; 
			case CC_1968: kubikaza = 19.68f; break;
			case CC_2143: kubikaza = 21.43f; break;
			case CC_2993: kubikaza = 29.93f; break;
			case CC_3996: kubikaza = 39.96f; break;
			case CC_4951: kubikaza = 49.51f; break;
			case CC_6498: kubikaza = 64.98f; break;
			default: kubikaza = 0.0f;
		} switch (snagaMotora) {
			case KS_68: snaga = 0.68f; break;
			case KS_86: snaga = 0.86f; break;
			case KS_100: snaga = 1.00f; break;
			case KS_130: snaga = 1.30f; break;
			case KS_343: snaga = 3.43f; break;
			case KS_507: snaga = 5.07f; break;
			case KS_563: snaga = 5.63f; break;
			case KS_603: snaga = 6.03f; break;
			case KS_912: snaga = 9.12f; break;
			case KS_1109: snaga = 11.09f; break;
			default: snaga = 0.0f;
		} registracija = kubikaza * snaga;
		if (Y85 < godisteAuta && godisteAuta < Y00)
			registracija *= Auto.COEF_85_00;
		else if (Y01 < godisteAuta && godisteAuta < Y10)
			registracija *= Auto.COEF_01_10;
		else registracija *= Auto.COEF_11_NOW;
		System.out.printf("[%s] Registracija: %.2f €\n", markaAuta, registracija);
		return registracija;
	}
	/* getSumIznosaRegistracije */
	public static float getSumIznosaRegistracije(ArrayList<Auto> lista) {
		ArrayList<Auto> l = canRegister(lista); float s = 0; 
		for (Auto a	: l) s += a.getIznosRegistracije(); return s;
	}
	/* prodajAuto */
	public static void prodajAuto(ArrayList<Auto> lista, Auto auto) {
		lista.remove(auto); Auto.brojProdatihAuta++;
	}
}
