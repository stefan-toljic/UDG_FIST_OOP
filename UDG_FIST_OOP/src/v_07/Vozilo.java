package v_07;

public abstract class Vozilo {
	
	public static final int BICIKL_ID = 	0;
	public static final int MOTOR_ID = 		1;
	public static final int AUTOMOBIL_ID = 	2;

	private int id;
	private float maxBrzina;
	
	protected Vozilo() { }
	protected Vozilo(int id, float maxBrzina) {
		setId(id);
		setMaxBrzina(maxBrzina);
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected float getMaxBrzina() {
		return maxBrzina;
	}

	protected void setMaxBrzina(float maxBrzina) {
		this.maxBrzina = maxBrzina;
	}
	
	public abstract void info();
	
	public abstract float izracunajVrijemeDostave(float udaljenostKm);
}
