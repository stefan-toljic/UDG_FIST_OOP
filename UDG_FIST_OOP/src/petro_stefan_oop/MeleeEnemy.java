package petro_stefan_oop;

public class MeleeEnemy extends Enemy {

	public MeleeEnemy(int x, int y, int w, int h, String type, int hp, int dmg) {
		super(x, y, w, h, type, hp, dmg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MeleeEnemy [getType()=" + getType() + ", getHp()=" + getHp() + ", getDmg()=" + getDmg()
				+ ", getX()=" + getX() + ", getY()=" + getY() + ", getW()="
				+ getW() + ", getH()=" + getH() + "]";
	}
}
