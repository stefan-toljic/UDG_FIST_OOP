package mia_stefan_oop;

import java.util.ArrayList;

public class Main {
	
	static int ukupno = 0, greske = 0;

	static void provjeri(String naziv, Object ocekivano, Object dobijeno) {
		boolean ok = ocekivano.equals(dobijeno);
		ukupno++;
		if (!ok) greske++;
		System.out.printf("#%-2d %-46s ocekivano=%-6s dobijeno=%-6s -> %s%n",
				ukupno, naziv, ocekivano, dobijeno, ok ? "OK" : "GRESKA");
	}
 
	static GameT nova(String ime, int hp) {
		return new GameT(new PlayerT(ime, 0, 0, 10, 10, hp), new ArrayList<EnemyT>());
	}
 
	static void naslov(String s) { System.out.println("\n--- " + s + " ---"); }
	
	public static void main(String args[]) {
	
		gameTest1();
	}
	
	private static void collisionTest(Pravougaonik p, Pravougaonik e) {
		System.out.print("_old_\n");
		if (p.kolizija(e))	System.out.print("Sudarili su se.\n");
		else				System.out.print("Nema sudara.\n");
	}
	
	private static void collisionTestV2(Pravougaonik p, Pravougaonik e) {
		System.out.print("_new_\n");
		if (p.kolizijaV2(e))	System.out.print("Sudarili su se.\n");
		else					System.out.print("Nema sudara.\n");
	}
	
	private static void testKolizije() {
		// Test 1 - FALSE
		Pravougaonik p1 = new Pravougaonik(0, 0, 10, 10);
		Pravougaonik e1 = new Pravougaonik(20, 20, 5, 5);
		collisionTest(p1, e1);
		// Test 2 - TRUE
		Pravougaonik p2 = new Pravougaonik(0, 0, 10, 10);
		Pravougaonik e2 = new Pravougaonik(5, 5, 10, 10);
		collisionTest(p2, e2); 
		// Test 3 - TRUE
		Pravougaonik p3 = new Pravougaonik(0, 0, 10, 10);
		Pravougaonik e3 = new Pravougaonik(10, 0, 5, 5);
		collisionTest(p3, e3); 
		// Test 4 - TRUE
		Pravougaonik p4 = new Pravougaonik(0, 0, 10, 10);
		Pravougaonik e4 = new Pravougaonik(-8, -2, 10, 5);
		collisionTest(p4, e4);
		// Test 5 - TRUE
		Pravougaonik p5 = new Pravougaonik(2, 2, 3, 3);
		Pravougaonik e5 = new Pravougaonik(0, 0, 10, 10);
		collisionTest(p5, e5);
		// Test 6 - TRUE
		Pravougaonik p6 = new Pravougaonik(0, 0, 10, 10);
		Pravougaonik e6 = new Pravougaonik(4, 0, 2, 10);
		collisionTest(p6, e6);
		System.out.println();
		collisionTestV2(p1, e1); // FALSE
		collisionTestV2(p2, e2); // TRUE
		collisionTestV2(p3, e3); // TRUE
		collisionTestV2(p4, e4); // TRUE
		collisionTestV2(p5, e5); // TRUE
		collisionTestV2(p6, e6); // TRUE
	}
	
	private static void gameTest1() {
		naslov("A: osnovni tok");
		GameT g = nova("Stefan", 100);
		g.addEnemy(new EnemyT("Orc", 5, 5, 10, 10, 30));
		g.addEnemy(new EnemyT("Goblin", 50, 50, 5, 5, 10));
		g.collidingWithPlayer();
		provjeri("napadaci poslije collidingWithPlayer", 1, g.getIgrac().getNapadaci().size());
		g.resolveCollisions();
		provjeri("HP poslije resolveCollisions", 70, g.getIgrac().getHealth());
		provjeri("napadaci ociscen poslije resolve", 0, g.getIgrac().getNapadaci().size());
		provjeri("log sadrzi BUM", true, g.getLog().contains("<BUM!>"));
 
		naslov("B: resolve dva puta zaredom");
		g.resolveCollisions();
		provjeri("HP nepromijenjen (nema napadaca)", 70, g.getIgrac().getHealth());
 
		naslov("C: dupli poziv collidingWithPlayer BEZ resolve");
		GameT c = nova("Mia", 100);
		c.addEnemy(new EnemyT("Orc", 0, 0, 5, 5, 10));
		c.collidingWithPlayer();
		c.collidingWithPlayer();
		provjeri("napadaca (isti Orc dva puta)", 1, c.getIgrac().getNapadaci().size());
		c.resolveCollisions();
		provjeri("HP (Orc udario samo jednom)", 90, c.getIgrac().getHealth());
 
		naslov("D: steta veca od zdravlja");
		GameT d = nova("Mia", 20);
		d.addEnemy(new EnemyT("Troll", 0, 0, 5, 5, 50));
		d.collidingWithPlayer();
		d.resolveCollisions();
		provjeri("HP = 0", 0, d.getIgrac().getHealth());
 
		naslov("E: dva neprijatelja udaraju redom");
		GameT e = nova("X", 100);
		e.addEnemy(new EnemyT("Orc", 0, 0, 5, 5, 30));
		e.addEnemy(new EnemyT("Bat", 2, 2, 3, 3, 10));
		e.collidingWithPlayer();
		e.resolveCollisions();
		provjeri("HP = 100 - 30 - 10", 60, e.getIgrac().getHealth());
 
		naslov("F: dodir po ivici i razmak 1");
		GameT f = nova("X", 100);
		f.addEnemy(new EnemyT("Edge", 10, 0, 5, 5, 10));
		f.addEnemy(new EnemyT("Far", 11, 0, 5, 5, 10));
		f.collidingWithPlayer();
		provjeri("samo Edge (dodir racuna), Far ne", 1, f.getIgrac().getNapadaci().size());
 
		naslov("G: nema sudara");
		GameT n = nova("X", 100);
		n.addEnemy(new EnemyT("Bat", 100, 100, 5, 5, 10));
		n.collidingWithPlayer();
		n.resolveCollisions();
		provjeri("HP nepromijenjen", 100, n.getIgrac().getHealth());
 
		naslov("H: findByType");
		GameT h = nova("X", 100);
		h.addEnemy(new EnemyT("Orc", 0, 0, 1, 1, 5));
		h.addEnemy(new EnemyT("Orc Boss", 0, 0, 1, 1, 5));
		h.addEnemy(new EnemyT("Bat", 0, 0, 1, 1, 5));
		provjeri("\"Orc\" -> 2 (contains)", 2, h.findByType("Orc").size());
		provjeri("\"Or\" -> 2", 2, h.findByType("Or").size());
		provjeri("\"Dragon\" -> 0", 0, h.findByType("Dragon").size());
		provjeri("null -> 0", 0, h.findByType(null).size());
		provjeri("\"\" (prazan string) -> ?", 3, h.findByType("").size());
 
		naslov("I: null argumenti i konstruktor");
		GameT i = new GameT(new PlayerT("Z", 0, 0, 5, 5, 100), null);
		i.addEnemy(new EnemyT("Orc", 0, 0, 1, 1, 5));
		provjeri("null lista u ctor -> addEnemy radi", 1, i.getNeprijatelji().size());
		i.addEnemy((EnemyT) null);
		provjeri("addEnemy(null) ne dodaje", 1, i.getNeprijatelji().size());
		ArrayList<EnemyT> vanjska = new ArrayList<EnemyT>();
		GameT j = new GameT(new PlayerT("Y", 0, 0, 5, 5, 100), vanjska);
		j.addEnemy(new EnemyT("Orc", 0, 0, 1, 1, 5));
		provjeri("vanjska lista netaknuta (opcionalno)", 0, vanjska.size());
 
		naslov("J: GameT bez igraca");
		GameT k = new GameT(null, new ArrayList<EnemyT>());
		k.addEnemy(new EnemyT("Orc", 0, 0, 1, 1, 5));
		String r1 = "OK";
		try { k.collidingWithPlayer(); } catch (Exception ex) { r1 = "izuzetak"; }
		provjeri("collidingWithPlayer ne pada", "OK", r1);
		String r2 = "OK";
		try { k.resolveCollisions(); } catch (Exception ex) { r2 = "izuzetak"; }
		provjeri("resolveCollisions ne pada", "OK", r2);
 
		naslov("K: nevalidne vrijednosti u konstruktoru");
		PlayerT p = new PlayerT("A", 0, 0, 5, 5, 150);
		provjeri("health=150 -> ostaje 0 (default)", 0, p.getHealth());
		EnemyT en = new EnemyT(null, 0, 0, 5, 5, 10);
		provjeri("type=null -> \"\"", "", en.getType());
 
		System.out.printf("%nProslo: %d / %d%n", ukupno - greske, ukupno);
	}
}
