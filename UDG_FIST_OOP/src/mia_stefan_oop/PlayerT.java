package mia_stefan_oop;

import java.util.ArrayList;

public class PlayerT extends Pravougaonik {
	// Osnovne
	private String name;
	private int health;
	// Pomocne
	private ArrayList<EnemyT> napadaci;
	
	public PlayerT(String name, int x, int y, int sirina, int visina, int health) {
		super(x, y, sirina, visina);
		setName(name);
		setHealth(health);
		napadaci = new ArrayList<EnemyT>();
	}
	// Osnovne : Get/Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {	// zasto ne type.equals(null)? -> NullPointerException
			System.out.print("_setName: prazan string\n");
			this.name = ""; return;	// podesavam + prekidam
		} this.name = name;	// validacija prosla
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			System.out.print("_setHealth: hp -> [0, 100]\n");
			return; // namjerno prekidam izvrsavanje funkcije
		} this.health = health; // validacija prosla
	}
	// Pomocne: Get/Set
	public ArrayList<EnemyT> getNapadaci() {
		return napadaci;
	}
	
	public void addNapadac(EnemyT e) {
		if(e == null) { System.out.print("_addNapadac: null pointer\n");
			return; } napadaci.add(e); // IF_NULL ? return : add
	}
	
	public void removeNapadac(EnemyT e) {
		if(e == null) { System.out.print("_removeNapadac: null pointer\n");
			return; } napadaci.remove(e); // IS_NULL ? return : remove
	}
	
	@Override
	public String toString() {
		return	"Player [" + getName() + "] @ " +					// [Name] @
				"(" + getDl().getX() + "," + getDl().getY() + ") "	// (X,Y)
				+ getSirina() + "x" + getVisina() + 				// WxH
				" Health = " + getHealth() + "\n";					// Health
				
	}
}
