package cas_01;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("___CAS_01___\n");
		
		// Koji identifikatori su ispravni
//		int aaa;			// good
//		int _1_;			// OK
//		int manje-vise;		// bad -
//		int a12;			// good
//		int Windows;		// OK
//		int prost_cinilac;	// good
//		int 12a;			// bad 12
//		int vece-manje;		// bad -
//		int prost-cinilac;  // bad -
//		int _12a;			// OK
//		int north&south;	// bad &
//		int Marko(32);		// bad (32)
		
		///////////////////////////////
		// Primjer 1:
		short a = 32767, b = 1, c;
		c = (short) (a + b);
		System.out.println(c);
		
		//////////////////////
		// Primjer 2:
		int A; float B; A = 5; B = 5 * A / 7f;
		System.out.println(B);
		B = (float) (5 * A) / 7f;
		System.out.println(B);
		
		//////////////////////
		// Primjer 3:
		int s1, s2, q = 8; s1 = 1;	// s1: 1, s2: 0
		s2 = ++s1 + 5;				// s1: 2, s2: 7
		s1 = s2++;					// s1: 7, s2: 8
		s2 += (q % 3) + q / 5 + 2;	// s1: 7, s2: 8 + 5 = 13
		System.out.println(s1);
		System.out.println(s2);
		
		///////////////////////
		// Java Vjezbe I {1, 2, 3, 4, 5}
		v1(); v2(); v3(); v4(); v5();
		
		sc.close();
	}
	
	private static void v1() {
		int a, b;
		System.out.print("\nUnesite a: "); a = sc.nextInt();
		System.out.print("Unesite b: "); b = sc.nextInt();
		System.out.printf("\nPovrsina: %d\nObim: %d\n",
				(a * b), ((a + b)) * 2);
	}
	
	private static void v2() {
		double a, b;
		System.out.print("\nUnesite a: "); a = sc.nextDouble();
		System.out.print("Unesite b: "); b = sc.nextDouble();
		System.out.printf("\nP (mm2): %.5f\nP (cm2): %.5f\n",
				(a * b), (a * b) / 100);
	}

	private static void v3() {
		double P, r;
		System.out.print("\nUnesite P: "); P = sc.nextDouble();
		r = Math.sqrt(P / Math.PI);
		System.out.printf("\nr: %f\nO: %f\n", r, (2 * Math.PI * r));
	}

	private static void v4() {
		int x1, y1, x2, y2;
		System.out.print("\nUnesite x1: "); x1 = sc.nextInt();
		System.out.print("Unesite y1: "); y1 = sc.nextInt();
		System.out.print("Unesite x2: "); x2 = sc.nextInt();
		System.out.print("Unesite y2: "); y2 = sc.nextInt();
		int sirina = Math.abs(x1 - x2);
		int visina = Math.abs(y1 - y2);
		System.out.printf("\nW: %d\nH: %d", sirina, visina);
		System.out.printf("\nPovrsina: %d\nObim: %d\n",
				sirina * visina, (sirina + visina) * 2);
	}

	private static void v5() {
		final float COST_PER_KM = 0.5f;
		final float COST_START = 1.0f;
		int n;
		System.out.print("\nUnesite br. KM-a: "); n = sc.nextInt();
		System.out.printf("\nCijena: %.2f €", COST_START + COST_PER_KM * n);
	}
	
	// FINISH_TIME: 36:34:91
}

