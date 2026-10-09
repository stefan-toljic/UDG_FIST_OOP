package mia_stefan_oop;

public class Main {
	
	public static void main(String args[]) {
	
		
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
}
