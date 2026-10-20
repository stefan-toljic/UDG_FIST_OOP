package mia_stefan_oop;

import java.util.ArrayList;

public class GameT {

	private PlayerT igrac;
	private ArrayList<EnemyT> neprijatelji;
	private String log;
		
	public GameT() { setNeprijatelji(new ArrayList<EnemyT> ()); log = ""; }
	
	public GameT(PlayerT igrac, ArrayList<EnemyT> neprijatelji) {
		this();
		setIgrac(igrac);
		setNeprijatelji(neprijatelji);
	}
	
	// Get/Set
	public PlayerT getIgrac() {
		return igrac;
	}

	public void setIgrac(PlayerT igrac) {
		if (igrac == null) { System.out.print("_setIgrac: null pointer\n");
			return; } this.igrac = igrac;	// IS_NULL ? return : setIgrac
	}

	public ArrayList<EnemyT> getNeprijatelji() {
		return neprijatelji;
	}
	
	public void setNeprijatelji(ArrayList<EnemyT> neprijatelji) {
		if (neprijatelji == null) { 
			System.out.print("_setNeprijatelji: null pointer\n"); return; }
		this.neprijatelji = neprijatelji; // IS_NULL ? return : setNeprijatelji
	}

	public String getLog() {
		return log;
	}
	
	private void updateLog(String entry) { log += entry; }
		
	// Custom
	public void decreaseHealth(EnemyT e) {
		if (igrac.getHealth() < e.getDamage()) {
			System.out.print("_decreaseHealth: hp can't drop below 0\n");
			System.out.print("... podesavam hp na 0...\n");
			igrac.setHealth(0); return; }	// HP < DMG ? set 0 : HP - DMG
		igrac.setHealth(igrac.getHealth() - e.getDamage());
		updateLog(	// "<BUM!> [name] (HP=...) hit by [type] (DMG=...)\n"
			"<BUM!> [" + igrac.getName() + "] (HP=" + igrac.getHealth() +
			") hit by [" + e.getType() + "] (DMG=" + e.getDamage() + ")\n");
	}

	public void addEnemy(EnemyT e) {
		if (e == null) { System.out.print("_addEnemy: null pointer\n");
			return; } neprijatelji.add(e);	// IS_NULL ? return : addEnemy
		updateLog(	// "<DODAT_E!> [type] (DMG=...)\n"
			"<DODAT_E!> [" + e.getType() + "] (DMG=" + e.getDamage() + ")\n");
	}
	
	public void addEnemy(String s) {
		// TODO
	}
	
	public ArrayList<EnemyT> findByType(String s) {
		ArrayList<EnemyT> found = new ArrayList<EnemyT>();
		if (s == null) { System.out.print("_findByType: null pointer\n"); 
			System.out.print("... vracam praznu listu...\n"); return found; }
		for (EnemyT e : neprijatelji)
			if (e.getType().contains(s)) found.add(e);
		if (found.size() == 0)System.out.print("_findByType: 0 found\n");
		return found;	// Ako nadje doda, ako ne nista
	}
	
	public boolean checkCollision(EnemyT e) {
		if (igrac.kolizijaV2(e)) return true;
		return false;	// KV2 ? Y : N
	}
	
	public void collidingWithPlayer() {
		final int oldSize = igrac.getNapadaci().size();	// old_napadaci_size
		for (EnemyT e : neprijatelji)
			if (checkCollision(e)) igrac.addNapadac(e);
		System.out.printf("_collidingWithPlayer: dodato %d neprijatelja\n",
				igrac.getNapadaci().size() - oldSize); // no_enemies added
	}
	
	public void resolveCollisions() {
		for (EnemyT e : igrac.getNapadaci()) decreaseHealth(e);
		igrac.getNapadaci().clear();	// Cistimo listu napadaca
	}
}
