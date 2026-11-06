package auto_servis_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static final int BASE_YEAR = 1980;
	
	public static Auto good = new Auto(MarkaAuta.AUDI, 2020,
			SnagaMotora.KS_130, true, KubikazaMotora.CC_1199, false);
	public static Auto bad1 = new Auto(null, 2020, SnagaMotora.KS_130, true,
			KubikazaMotora.CC_1199, false);
	public static Auto bad2 = new Auto(MarkaAuta.AUDI, Auto.AGE_LIMIT - 1,
			SnagaMotora.KS_130, true, KubikazaMotora.CC_1199, false);
	public static Auto bad3 = new Auto(MarkaAuta.AUDI, 2020, null, true,
			KubikazaMotora.CC_1199, false);
	public static Auto bad4 = new Auto(MarkaAuta.AUDI, Auto.REG_LIMIT - 1,
			SnagaMotora.KS_130, true, null, true);
	public static Auto bad5 = new Auto(null, Auto.REG_LIMIT - 1,
			null, true, null, true);
	
	public static void main(String args[]) {
		
//		test0();
		test1();
	}
	
	private static void test0() {
		System.out.println(good + " [All GOOD]");
		System.out.println(bad1 + " [Marka NULL]");
		System.out.println(bad2 + " [Godiste BAD]");
		System.out.println(bad3 + " [Snaga NULL]");
		System.out.println(bad4 + " [Registracija BAD]");
		System.out.println(bad5 + " [All BAD]");
	}
	
	private static void test1() {
		ArrayList<Auto> hangar = new ArrayList<Auto>();
		MarkaAuta[] marke = MarkaAuta.values();
		SnagaMotora[] snage = SnagaMotora.values();
		KubikazaMotora[] kubikaze = KubikazaMotora.values();
		Scanner sc = new Scanner(System.in); int n;
		System.out.print("Unesite broj auta: "); n = Math.abs(sc.nextInt());
		for (int i = 0; i < n; i++) { hangar.add(
			new Auto(marke[i % marke.length], BASE_YEAR + i, snage[i % snage
			.length], false, kubikaze[i % kubikaze.length], false));
		} System.out.printf("\nSuma iznosa registracije: %.2f €\n",
			Auto.getSumIznosaRegistracije(hangar)); test2(hangar); sc.close();
	}
	
	private static void test2(ArrayList<Auto> lista) {
		System.out.println("BPA (PRIJE): " + Auto.getBrojProdatihAuta()); 
		while (lista.size() > 0) { System.out.println(lista.get(0));
		Auto.prodajAuto(lista, lista.get(0));
		} System.out.println("BPA (POSLE): " + Auto.getBrojProdatihAuta());
	}
}
