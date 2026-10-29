package v_07;

public class Bicikl extends Vozilo implements Ekonomican {
	
	public static final float MOD = 0.5f;

	public Bicikl(int biciklId, float f) {
		// TODO Auto-generated constructor stub
		super(biciklId, f);
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
	public float potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return Ekonomican.NIKAKVA * MOD;
	}

	@Override
	public String toString() {
		return "Bicikl [getId()=" + getId() + ", getMaxBrzina()=" + getMaxBrzina() + "]";
	}
}
