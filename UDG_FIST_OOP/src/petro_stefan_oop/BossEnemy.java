package petro_stefan_oop;

public class BossEnemy extends Enemy {

	public BossEnemy(int x, int y, int w, int h, String type, int hp, int dmg) {
		super(x, y, w, h, type, hp, dmg); // prljavo, ali moze
		setHp(hp); // gore stara validacija, ovdje nova
	}
	
	@Override
	public void setHp(int hp) {
		if (hp < 0) {
			System.out.print("setHp: HP ne moze biti < 0. HP = 0.\n");
			this.hp = 0;
		} if (hp > 1000) {
			System.out.print("setHp: HP ne moze biti > 1000. HP = 1000.\n");
			this.hp = 1000;
		}
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "BossEnemy [getType()=" + getType() + ", getHp()=" + getHp() + ", getDmg()=" + getDmg() + "x2, getX()="
				+ getX() + ", getY()=" + getY() + ", getW()=" + getW() + ", getH()=" + getH() + "]";
	}
}
