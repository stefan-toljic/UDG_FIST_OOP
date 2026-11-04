package pzk_0;

import java.util.ArrayList;

public class Vjetrometar {

	private String nazivMjerneStanice;
	private String datumVrijemeOcitavanja; // YYYY-MM-DD /t HH:MM:SS
	private int pravacVjetra;
	private float srednjaBrzinaVjetra;
	private float maksimalnaBrzinaVjetra;
	
	public Vjetrometar(String nazivMjerneStanice, String datumVrijemeOcitavanja, int pravacVjetra,
			float srednjaBrzinaVjetra, float maksimalnaBrzinaVjetra) {
		this.nazivMjerneStanice = nazivMjerneStanice;
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
		this.pravacVjetra = pravacVjetra;
		this.srednjaBrzinaVjetra = srednjaBrzinaVjetra;
		this.maksimalnaBrzinaVjetra = maksimalnaBrzinaVjetra;
	}
	
	public String getNazivMjerneStanice() {
		return nazivMjerneStanice;
	}
	public void setNazivMjerneStanice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}
	public String getDatumVrijemeOcitavanja() {
		return datumVrijemeOcitavanja;
	}
	public void setDatumVrijemeOcitavanja(String datumVrijemeOcitavanja) {
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
	}
	public int getPravacVjetra() {
		return pravacVjetra;
	}
	public void setPravacVjetra(int pravacVjetra) {
		this.pravacVjetra = pravacVjetra;
	}
	public float getSrednjaBrzinaVjetra() {
		return srednjaBrzinaVjetra;
	}
	public void setSrednjaBrzinaVjetra(float srednjaBrzinaVjetra) {
		this.srednjaBrzinaVjetra = srednjaBrzinaVjetra;
	}
	public float getMaksimalnaBrzinaVjetra() {
		return maksimalnaBrzinaVjetra;
	}
	public void setMaksimalnaBrzinaVjetra(float maksimalnaBrzinaVjetra) {
		this.maksimalnaBrzinaVjetra = maksimalnaBrzinaVjetra;
	}
	
	public static ArrayList<Vjetrometar> izdvojiPodatke(ArrayList<Vjetrometar> lista, String datum) {
		ArrayList<Vjetrometar> odabrani = new ArrayList<Vjetrometar>();
		for (Vjetrometar x : lista)
			if (x.getDatumVrijemeOcitavanja().contains(datum)) odabrani.add(x);
		return odabrani;
	}

	@Override
	public String toString() {
		return "Vjetrometar [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVrijemeOcitavanja="
				+ datumVrijemeOcitavanja + ", pravacVjetra=" + pravacVjetra + ", srednjaBrzinaVjetra="
				+ srednjaBrzinaVjetra + ", maksimalnaBrzinaVjetra=" + maksimalnaBrzinaVjetra + "]";
	}
}
