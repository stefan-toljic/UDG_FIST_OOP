package priprema_kolokvijum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		prvi_v0();
//		prvi_v1();
		treci_v0();
	}
	
	private static void prvi_v0() {
		Scanner sc = new Scanner(System.in); int n;
		do { System.out.print("Unesite N: "); n = Math.abs(sc.nextInt());
		} while (n < 0);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("*");
			System.out.println();
		} sc.close();
	}
	
	private static void prvi_v1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite N: "); int n = Math.abs(sc.nextInt());
		String s = ""; for (int i = 0; i < n; i++) {
			s += "*"; System.out.println(s);
		} sc.close();
	}
	
	private static void treci_v0() {
		ArrayList<MeteoPodatak> lista = new ArrayList<MeteoPodatak>();
		
		lista.add(new MeteoPodatak("PG", "2026-10-21 00:11:11", 9, 78, 1002));
		lista.add(new MeteoPodatak("NK", "2026-10-25 00:11:11", 9, 78, 1002));
		lista.add(new MeteoPodatak("PG", "2026-10-25 00:11:11", 19, 78, 1002));
		lista.add(new MeteoPodatak("PG", "2026-10-25 00:11:11", 15, 78, 1002));
		
		ArrayList<MeteoPodatak> selekcija = MeteoPodatak.izdvojPodatkeStanice(lista, "PG");
		for (MeteoPodatak x : selekcija)
			System.out.println(x);
		
		System.out.println(MeteoPodatak.odrediMaxTempZaDan(lista, "2026-10-21"));
	}
}
