package v_07;

public class Automobil extends Vozilo {

	public static final float MOD = 1.5f;
	
	public Automobil(int automobilId, float f) {
		// TODO Auto-generated constructor stub
		super(automobilId, f);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	public float izracunajVrijemeDostave(float udaljenostKm) {
		// TODO Auto-generated method stub
		return udaljenostKm * getMaxBrzina() * MOD;
	}

	@Override
	public String toString() {
		return "Automobil [getId()=" + getId() + ", getMaxBrzina()=" + getMaxBrzina() + "]";
	}
}
