package petro_stefan_oop;

public class Player extends GameObject {
	
	private String ime;
	private int hp;
	
	public Player(int x, int y, int w, int h, String ime, int hp) {
		super(x, y, w, h);
		setIme(ime);
		setHp(hp);
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime == null) {
			System.out.print("setIme: ime je null! Greska.\n");
			return;
		} if (ime.equals("")) {
			System.out.print("setIme: ime je \"\"! Greska.\n");
			return;
		}
		this.ime = ime.toLowerCase().trim(); String s = this.ime.toString();
		this.ime = this.ime.replace(this.ime.toString().charAt(0), this.ime.toString().toUpperCase().charAt(0));
		this.ime = this.ime.replace(s.charAt(s.indexOf(' ') + 1), s.toUpperCase().charAt(s.indexOf(' ') + 1));
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
	@Override
	// TODO
	public String toString() {
		return "Player [getIme()=" + getIme() + ", getHp()=" + getHp() + ", getX()=" + getX() + ", getY()=" + getY()
				+ ", getW()=" + getW() + ", getH()=" + getH() + "]";
	}
}
