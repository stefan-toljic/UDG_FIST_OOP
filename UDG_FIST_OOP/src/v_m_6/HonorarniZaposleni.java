package v_m_6;

public class HonorarniZaposleni extends Zaposleni {
	
	private int brojSati;
	private float cijenaSata;
	/* constructor */
	public HonorarniZaposleni(String ime, String prezime, int brojGodinaStaza,
			int brojSati, float cijenaSata) {
		super(ime, prezime, brojGodinaStaza);
		setBrojSati(brojSati);
		setCijenaSata(cijenaSata);
	}
	/* get/set */
	public int getBrojSati() {
		return brojSati;
	}
	public void setBrojSati(int brojSati) {
		if (brojSati < 0) { 
			System.out.println("_setBrojSati: IN < 0"); return;
		} this.brojSati = brojSati;
	}
	public float getCijenaSata() {
		return cijenaSata;
	}
	public void setCijenaSata(float cijenaSata) {
		if (cijenaSata < 0) { 
			System.out.println("_setCijenaSata: IN < 0"); return;
		} this.cijenaSata = cijenaSata;
	}
	@Override
	public float obracunPlate() {
		return brojSati * cijenaSata;
	}
	@Override
	public String toString() {
		return String.format("{\n\tIme: %s\n\tPrezime: %s\n\tGodine staza: "
				+ "%d\n\tBroj sati: %d\n\tCijena sata: %.2f\n}", getIme(),
				getPrezime(), getBrojGodinaStaza(), getBrojSati(),
				getCijenaSata());
	}
	@Override
	public float getIznosTroska() {
		return obracunPlate();
	}
}
