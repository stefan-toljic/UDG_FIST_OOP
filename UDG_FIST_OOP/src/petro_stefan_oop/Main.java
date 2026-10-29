package petro_stefan_oop;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		Game pis = new Game();
				
		Player p = new Player(0, 0, 10, 10, "Petro Stefanovic", 99);
		MeleeEnemy e0 = new MeleeEnemy(5, 5, 10, 10, "Goblin", 30, 10);
		MeleeEnemy e1 = new MeleeEnemy(10, 0, 5, 5, "Minotaur", 50, 15);
		BossEnemy be0 = new BossEnemy(-8, -2, 10, 5, "Putin", 999, 999);
		
		ArrayList<Enemy> enemies = new ArrayList<Enemy>(); 
		pis.setP(p); pis.setEnemies(enemies); pis.setLog(new ArrayList<String>());
		pis.addEnemy(e0); pis.addEnemy(e1); pis.addEnemy(be0);
		
		pis.resolveCollision();
		for (String s : pis.getLog())
			System.out.println(s);
	}
}
