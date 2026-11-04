package pzk_0;

import java.util.Scanner;

public class Test0 {

	public static void main(String args[]) {
//		zad1();
		zad2();
	}
	
	private static void zad1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite N: "); int n = sc.nextInt();
		crtaj(n); sc.close();
	}
	
	private static void crtaj(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	private static void zad2() {
		String test = "c123s015g028t068r002p017h53b10020*CS";
		System.out.println(dajPodatke(test));
	}
	
	private static String dajPodatke(String in) {
		in = in.toLowerCase().trim();
		// Parsiranje
		int c = in.indexOf('c') + 1;
		int smjer = Integer.parseInt(in.substring(c, c + 3));
//		System.out.println("smjer: " + smjer);
		c = in.indexOf('s') + 1;
		float brzinaSr = Integer.parseInt(in.substring(c, c + 3));
		brzinaSr *= 0.44704;
//		System.out.println("brzinaSr: " + brzinaSr);
		c = in.indexOf('g') + 1;
		float brzinaMax = Integer.parseInt(in.substring(c, c + 3));
		brzinaMax *= 0.44704;
//		System.out.println("brzinaMax: " + brzinaMax);
		// Formatiranje
		return String.format("{smjer: %d, 'brzinaSr': %.2f, 'brzinaMax': %.2f}", smjer, brzinaSr, brzinaMax);
	}
}
