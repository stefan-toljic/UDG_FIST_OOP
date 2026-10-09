package mia_stefan_oop;

import java.util.ArrayList;

class Player {
	private String name; // ne_prazno
	private int x, y;
	private int width, height;
	private int health; // 0 <= V <= 100
	
	public Player(String name, int x, int y, int width, int height, int health) {
		setName(name.trim());
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	public String getName() {
		if (name == null) {
			System.out.print("Ime igraca ne smije biti prazno.\n");
			return ""; }
		else
			return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		System.out.print("_HP: " + health + "\n");
		if (health < 0 || health > 100) {
			System.out.print("HP ima losu vrijednost.\n");
			return 0; }
		else
			return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Player [" + getName() + "] @ (" + getX() + "," + getY() + ") " +
				getWidth() + "x" + getHeight() + " HP=" + getHealth() + "\n";
	}
}

class Enemy {
	private String type; // ne_prazno
	private int x, y;
	private int width, height;
	private int damage; // 0 <= V <= 100
	
	public Enemy() {
		
	}
	
	public Enemy(String type, int x, int y, int width, int height, int damage) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}

	public String getType() {
		if(type == null) {
			System.out.print("Naziv neprijatelja ne moze biti prazan.\n");
			return ""; }
		else
			return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		if (0 < damage || damage > 100) {
			System.out.print("DMG ima losu vrijednost.\n");
			return 0; }
		else
			return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public String toString() {
		return "Enemy [" + getType() + "] @ (" + getX() + "," + getY() + ") " +
				getWidth() + "x" + getHeight() + " DMG=" + getDamage() + "\n";
	}
}

public class Game {

	static Player hero;
	static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	static ArrayList<Enemy> agresori = new ArrayList<Enemy>();
	static String log = "";
	
	public static void main(String args[]) {
		
		Player p = new Player(	"Hero",
				5,
				3,
				5,
				10,
				90);
		hero = p;
		
		enemies.add(new Enemy(	"Goblin",
								3,
								4,
								2,
								5,
								40));
		enemies.add(new Enemy(	"Shrek",
								2,
								3,
								4,
								8,
								69));
		p.toString();
		collidingWithPlayer();
		findByType("Goblin"); // Gob -> Nece naci "Gob"
		for (Enemy e : enemies)
			checkCollision(p, e);
		p.toString();
		System.out.print(log);
	}
	
	private static void azuriraj(String s) {
		log += s;
	}
	
	public static void decreaseHealth(Player p, Enemy e) {
		p.setHealth(p.getHealth() - e.getDamage());
		if (p.getHealth() < 0)
			System.out.print("Vrijednost health-a ne smije pasti ispod 0!\n");
		azuriraj("HIT: " + p.getName() + " by " + e.getType() +
				" for " + e.getDamage() + " -> HP " + p.getHealth() +
				e.getDamage() + " -> " + p.getHealth() + "\n");
	}
	
	public void addEnemy(Enemy e) {
		enemies.add(e);
		azuriraj("Dodat protivnik:\n" + e.toString());
	}
	
	public static ArrayList<Enemy> findByType(String query) {
		ArrayList<Enemy> odabrani = new ArrayList<Enemy>();
		for (Enemy e : enemies) {
			if (e.getType().equals(query))
				odabrani.add(e);
		}
		return odabrani;
	}
	
	public static boolean checkCollision(Player p, Enemy e) {
		// Prva tacka (Donje lijevo tjeme Enemy-a) { X, Y }
		if (	(p.getX() >= e.getX() && p.getX() <= (e.getX() + e.getWidth())
			&& 	(p.getY() >= e.getY() && p.getY() <= (e.getY() + e.getHeight()))))
				return true;
		// Druga tacka (Donje desno tjeme Enemy-a) { X + W, Y }
		else if (	((p.getX() + p.getWidth()) >= e.getX() && (p.getX() + p.getWidth()) <= (e.getX() + e.getWidth())
			&& 	(p.getY() >= e.getY() && p.getY() <= (e.getY() + e.getHeight()))))
				return true;
		// Treca tacka { X, Y + H }
		else if (	(p.getX() >= e.getX() && p.getX() <= (e.getX() + e.getWidth())
			&& 	((p.getY() + p.getHeight()) >= e.getY() && (p.getY() + p.getHeight()) <= (e.getY() + e.getHeight()))))
				return true;
		// Cetrvrta tacka { X + W, Y + H }
		else if (	((p.getX() + p.getWidth()) >= e.getX() && (p.getX() + p.getWidth()) <= (e.getX() + e.getWidth())
			&& 	((p.getY() + p.getHeight()) >= e.getY() && (p.getY() + p.getHeight()) <= (e.getY() + e.getHeight()))))
				return true;
		// Nema kolizije
		System.out.print("_checkCollision: Nema kolizije!\n");
		return false;
	}
	
	public static void collidingWithPlayer() {
		for (Enemy e : enemies)
			if (checkCollision(hero, e))
				agresori.add(e);
	}
	
	public void resolveCollisions() {
		for (Enemy e : agresori)
			decreaseHealth(hero, e);
	}
	
	private void parse(String s) { // "Goblin;12,5;16x16;20"
		Enemy e = new Enemy(); char c = '0'; s = s.toLowerCase();
		
		String[] polja = s.split(";");
		e.setType(polja[0]);
		
		String[] xy = polja[1].split(","); 
		int sum = 0;
		char[] xy_x = xy[0].toCharArray(); 
		for (int i = 0; i < xy_x.length; i++)
			sum += xy_x[i] - '0'; 
		e.setX(sum); sum = 0;
		char[] xy_y = xy[1].toCharArray();
		for (int i = 0; i < xy_y.length; i++)
			sum += xy_y[i] - '0';
		e.setY(sum); sum = 0;
		
		String[] wh = polja[2].split("x");
		char[] wh_w = wh[0].toCharArray();
		for (int i = 0; i < wh_w.length; i++)
			sum += wh_w[i] - '0';
		e.setWidth(sum); sum = 0;
		char[] wh_h = wh[1].toCharArray();
		for (int i = 0; i < wh_h.length; i++)
			sum += wh_h[i] - '0';
		e.setHeight(sum); sum = 0;
		
		char[] dmg = polja[3].toCharArray();
		for (int i = 0; i < dmg.length; i++)
			sum += dmg[i] - '0';
		e.setDamage(sum);
		
		enemies.add(e); // LELE, ovo zaboravih...
	}
}
