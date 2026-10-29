package v_07;

public class Motor extends Vozilo implements Ekonomican {

	public static final float MOD = 1.0f;
	
	public Motor(int motorId, float f) {
		// TODO Auto-generated constructor stub
		super(motorId, f);
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
		return Ekonomican.IZUZETNO_MALA * MOD;
	}

	@Override
	public String toString() {
		return "Motor [getId()=" + getId() + ", getMaxBrzina()=" + getMaxBrzina() + "]";
	}
}