package v_m_6;

public class Racun implements Trosak {

	private String opis;
	private float iznos;
	private float pdv;
	/* constructor */
	public Racun(String opis, float iznos, float pdv) {
		super();
		this.opis = opis;
		this.iznos = iznos;
		this.pdv = pdv;
	}
	/* get/set*/
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public float getIznos() {
		return iznos;
	}
	public void setIznos(float iznos) {
		this.iznos = iznos;
	}
	public float getPdv() {
		return pdv;
	}
	public void setPdv(float pdv) {
		this.pdv = pdv;
	}
	@Override
	public String toString() {
		return String.format("{\n\tOpis: %s\n\tIznos: %.2f\n\tPDV: %.2f"
				+ "\n}", getOpis(), getIznos(), getPdv());
	}
	@Override
	public float getIznosTroska() {
		return iznos + iznos * pdv;
	}
}
