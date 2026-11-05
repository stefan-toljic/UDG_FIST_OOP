package v_m_6;

public class Main {

	public static void main(String args[]) {
		
		test0();
	}
	/* test0*/
	private static void test0() {
		for (Dani d : Dani.values())
			kojiDan(d);
	}
	/* kojiDan */
	private static void kojiDan(Dani dan) {
		switch (dan) {
			case Dani.PONEDELJAK:
				System.out.println("Ponedeljak"); break;
			case Dani.UTORAK:
				System.out.println("Utorak"); break;
			case Dani.SRIJEDA:
				System.out.println("Srijeda"); break;
			case Dani.CETVRTAK:
				System.out.println("Cetvrtak"); break;
			case Dani.PETAK:
				System.out.println("Petak"); break;
			case Dani.SUBOTA:
				System.out.println("Subota"); break;
			case Dani.NEDELJA:
				System.out.println("Nedelja"); break;
		}
	}
}
