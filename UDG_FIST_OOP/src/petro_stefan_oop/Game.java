package petro_stefan_oop;

import java.util.ArrayList;

public class Game {

	private Player p;
	private ArrayList<Enemy> enemies;
	private ArrayList<String> log;
	
	public Game() {
		enemies = new ArrayList<Enemy>();
		log = new ArrayList<String>();
	}
	public Game(Player p, ArrayList<Enemy> enemies, ArrayList<String> log) {
		super();
		setP(p);
		setEnemies(enemies);
		setLog(log);
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		if (p == null) {
			System.out.print("setP: igrac je NULL!\n");
			return;
		}
		this.p = p;
	}
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(ArrayList<Enemy> enemies) {
		if (enemies == null) {
			System.out.print("setEnemies: enemies je NULL!\n");
			return;
		}
		this.enemies = enemies;
	}
	public ArrayList<String> getLog() {
		return log;
	}
	public void setLog(ArrayList<String> log) {
		if (log == null) {
			System.out.print("setLog: log je NULL!\n");
			return;
		}
		this.log = log;
	}
	
	public boolean checkCollision(Player p, Enemy e) {
		return p.intersetcts(e);
	}
	
	public void decreaseHealth(Player p, Enemy e) {
		int tempHp = p.getHp();
		String poruka = "", output = "";
		if (e instanceof BossEnemy) {
			if ((p.getHp() - e.getDmg() * 2) > 0) {
				p.setHp(p.getHp() - e.getDmg() * 2);
				poruka = "HIT: ";
			}
			else {
				System.out.print("decreasehealth: GRESKA!\n");
				poruka = "HIT (greska_validirana): ";
				p.setHp(0);
			}
		} else {
			if ((p.getHp() - e.getDmg()) > 0) {
				p.setHp(p.getHp() - e.getDmg());
				poruka = "HIT: ";
			}
			else {
				System.out.print("decreasehealth: GRESKA!\n");
				poruka = "HIT (greska_validirana): ";
				p.setHp(0);
			}	
		}
		output = p.getIme() + " by " + e.getType() + " for " + e.getDmg() +
		", HP: " + (tempHp) + " -> " + p.getHp();
		log.add(poruka + output);
	}
	
	public void addEnemy(Enemy e) {
		this.enemies.add(e);
		this.log.add("Dodat NEW ENEMY: " + e.toString());
	}
	
	public ArrayList<Enemy> findByType(String query) {
		ArrayList<Enemy> chosen = new ArrayList<Enemy>();
		for (Enemy e : this.enemies)
			if (e.getType().equals(query.toLowerCase().trim()))
				chosen.add(e);
		return chosen;
	}
	
	public ArrayList<Enemy> collidingWithPlayer() {
		ArrayList<Enemy> chosen = new ArrayList<Enemy>();
		for (Enemy e : this.enemies)
			if (checkCollision(this.p, e))
				chosen.add(e);
		return chosen;
	}
	
	public void resolveCollision() {
		ArrayList<Enemy> udareni = collidingWithPlayer();
		for (Enemy e : udareni)
			decreaseHealth(this.p, e);
	}
}
