package v_m_6;

public abstract class Zaposleni implements Trosak {

	private String ime;
	private String prezime;
	private int brojGodinaStaza;
	/* constructor */
	public Zaposleni() { this.ime = ""; this.prezime = ""; }
	public Zaposleni(String ime, String prezime, int brojGodinaStaza) {
		this();
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setBrojGodinaStaza(brojGodinaStaza);
	}
	/* get/set */
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime == null) {
			System.out.println("_setIme: IN = null"); return;
		} this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if (prezime == null) {
			System.out.println("_setPrezime: IN = null"); return;
		} this.prezime = prezime;
	}
	public int getBrojGodinaStaza() {
		return brojGodinaStaza;
	}
	public void setBrojGodinaStaza(int brojGodinaStaza) {
		if (brojGodinaStaza < 0) {
			System.out.println("_setBrojGodinaStaza: IN < 0"); return;
		} this.brojGodinaStaza = brojGodinaStaza;
	}
	/* obracunPlate */
	public abstract float obracunPlate();
}
