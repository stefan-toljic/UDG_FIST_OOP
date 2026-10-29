package petro_stefan_oop;

public class Enemy extends GameObject {

	protected String type;
	protected int hp;
	protected int dmg;
	
	public Enemy(int x, int y, int w, int h, String type, int hp, int dmg) {
		super(x, y, w, h);
		setIme(type);
		setHp(hp);
		setDmg(dmg);
	}
	public String getType() {
		return type;
	}
	public void setIme(String type) {
		if (type == null) {
			System.out.print("setType: type je null! Greska.\n");
			return;
		} if (type.equals("")) {
			System.out.print("setType: type je \"\"! Greska.\n");
			return;
		}
		this.type = type.toLowerCase().trim();
		this.type = this.type.replace(this.type.toString().charAt(0), this.type.toString().toUpperCase().charAt(0));
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			System.out.print("setHp: HP ne moze biti < 0. HP = 0.\n");
			this.hp = 0;
		} if (hp > 100) {
			System.out.print("setHp: HP ne moze biti > 100. HP = 100.\n");
			this.hp = 100;
		}
		this.hp = hp;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		if (dmg <= 0) {
			System.out.print("setDmg: DMG ne moze biti < 1. DMG = 1.\n");
			this.dmg = 1;
		} if (dmg > 100) {
			System.out.print("setDmg: DMG ne moze biti > 100. DMG = 100\n");
			this.dmg = 100;
		}
		this.dmg = dmg;
	}
	@Override
	public String toString() {
		return "Enemy [getType()=" + getType() + ", getHp()=" + getHp() + ", getDmg()=" + getDmg() + ", getX()="
				+ getX() + ", getY()=" + getY() + ", getW()=" + getW() + ", getH()=" + getH() + "]";
	}
}
