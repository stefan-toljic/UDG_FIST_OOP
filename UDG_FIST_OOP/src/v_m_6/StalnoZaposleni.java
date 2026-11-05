package v_m_6;

public class StalnoZaposleni extends Zaposleni {

	private float koeficijent;
	/* constructor */
	public StalnoZaposleni(String ime, String prezime, int brojGodinaStaza, float koeficijent) {
		super(ime, prezime, brojGodinaStaza);
		setKoeficijent(koeficijent);
	}
	/* get/set */
	public float getKoeficijent() {
		return koeficijent;
	}

	public void setKoeficijent(float koeficijent) {
		if (koeficijent <= 0) {
			System.out.println("_setKoeficijent: IN <= 0"); return;
		} this.koeficijent = koeficijent;
	}
	@Override
	public float obracunPlate() {
		return 600 * koeficijent + 10 * getBrojGodinaStaza();
	}
	@Override
	public String toString() {
		return String.format("{\n\tIme: %s\n\tPrezime: %s\n\tGodine staza: "
				+ "%d\n\tKoeficijent: %.2f\n}", getIme(),
				getPrezime(), getBrojGodinaStaza(), getKoeficijent());
	}
	@Override
	public float getIznosTroska() {
		return obracunPlate();
	}
}
