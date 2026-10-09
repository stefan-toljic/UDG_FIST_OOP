package mia_stefan_oop;

public class EnemyT extends Pravougaonik {
	
	private String type;
	private int damage;
	
	public EnemyT(String type, int x, int y, int sirina, int visina, int damage) {
		super(x, y, sirina, visina);
		setType(type);
		setDamage(damage);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null) {	// zasto ne type.equals(null)? -> NullPointerException
			System.out.print("_setType: prazan string\n");
			this.type = ""; return;	// podesavam + prekidam
		} this.type = type;	// validacija prosla
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0 || damage > 100) {
			System.out.print("_setDamage: dmg -> [0, 100]\n");
			return; // namjerno prekidam izvrsavanje funkcije
		} this.damage = damage; // validacija prosla
	}

	@Override
	public String toString() {
		return	"Enemy [" + getType() + "] @ " +					// [Type] @
				"(" + getDl().getX() + "," + getDl().getY() + ") "	// (X,Y)
				+ getSirina() + "x" + getVisina() + 				// WxH
				" Damage = " + getDamage() + "\n";					// Damage
				
	}
}
