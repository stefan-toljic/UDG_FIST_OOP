package zzv;

import java.util.Scanner;

public class Zzv_1 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void z1() {
		
		double a, b;
		System.out.print("Unesite A: "); a = sc.nextDouble();
		System.out.print("Unesite B: "); b = sc.nextDouble();
		System.out.printf("\nSrednja vrijednost: %.3f\n", (a + b) / 2.0);
	}
	
	public static void z2() {
		
		double x, y, t;
		System.out.print("Unesite X: "); x = sc.nextDouble();
		System.out.print("Unesite Y: "); y = sc.nextDouble();
		t = x; x = y; y = t;
		System.out.printf("\nX: %.3f\nY: %.3f\n", x, y);
	}
	
	public static void z3() {
		
		double n;
		System.out.print("Unesite rastojanje: "); n = sc.nextDouble();
		System.out.printf("\nMetara: %d\n", (int) n / 100);
	}
	
	public static void z4() {
		
		int g1, g2, g3, g4;
		System.out.print("Unesite br. stan. za G1: "); g1 = sc.nextInt();
		System.out.print("Unesite br. stan. za G2: "); g2 = sc.nextInt();
		System.out.print("Unesite br. stan. za G3: "); g3 = sc.nextInt();
		System.out.print("Unesite br. stan. za G4: "); g4 = sc.nextInt();
		System.out.printf("\nProsjek: %.3f\n", (double) (g1 + g2 + g3 + g4) / 4.0);
	}
	
	public static void z5() {
		
		int n;
		System.out.print("Unesite broj: "); n = sc.nextInt();
		System.out.printf("\nSprat: %d\n", (n / 10) % 10);
	}
	
	public static void z6() {
		
		int n, s = 0;
		System.out.print("Unesite broj: "); n = sc.nextInt();
		while(n > 0) { s += Math.pow(n % 10, 2); n /= 10; }
		System.out.printf("\nSuma: %d\n", s);
	}
	
	public static void z7() {
		
		int n;
		System.out.print("Unesite broj: "); n = sc.nextInt();
		System.out.printf("\nBroj: %d\n", 
				((n / 10) % 10) * 10 +	// druga cifra -> druga
				(n % 10) * 100 +		// treca cifra -> prva
				(n / 100));				// prva cifra -> treca
	}
	
	public static void z8() {
		
		int x1, y1, x2, y2;
		System.out.print("Unesite X1: "); x1 = sc.nextInt();
		System.out.print("Unesite Y1: "); y1 = sc.nextInt();
		System.out.print("Unesite X2: "); x2 = sc.nextInt();
		System.out.print("Unesite Y2: "); y2 = sc.nextInt();
		double x3 = (double) (x1 + x2) / 2, y3 = (double) (y1 + y2) / 2;
		double d = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		System.out.printf("\nX3: %.3f\nY3: %.3f\nRastojanje: %.3f\n", x3, y3, d);
	}
}
