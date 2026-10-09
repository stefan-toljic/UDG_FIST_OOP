package mia_stefan_oop;

import java.util.ArrayList;

public class GameT {

	private PlayerT igrac;
	private ArrayList<EnemyT> neprijatelji;
	private String log;
	
	public GameT() { log = ""; neprijatelji = new ArrayList<EnemyT>(); }
	
	public GameT(PlayerT igrac, ArrayList<EnemyT> neprijatelji) {
		this();	// Kako je ovo kul...
		this.igrac = igrac;
		this.neprijatelji = neprijatelji;
	}
	
	public void decreaseHealth(EnemyT e) {
		// TODO
	}
	
	public void addEnemy(EnemyT e) {
		// TODO
	}
	
	public void addEnemy(String s) {
		// TODO
	}
	
	public ArrayList<EnemyT> findByType(String s) {
		// TODO
		return null;
	}
	
	public boolean checkCollision(EnemyT e) {
		// TODO
		return false;
	}
	
	public void collidingWithPlayer() {
		// TODO
	}
	
	public void resolveCollisions() {
		// TODO
	}
}
