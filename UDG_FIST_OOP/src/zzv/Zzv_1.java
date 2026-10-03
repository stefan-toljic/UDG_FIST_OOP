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
	
	public static void z9() {
		
		/* Biljeske 
		 * 1. Paziti na opseg: Long > Int
		 * 2. Paziti na dieljenje sa 0: do while
		 * 3. Paziti na to da li "lijepimo" dijelove
		 * default:	543, 130, 65
		 */
		
		long a, b, c;
		System.out.print("Molim bez 0 za a, b, c.\n");
		do {
			System.out.print("\nUnesite A: "); a = Math.abs(sc.nextLong());
			System.out.print("Unesite B: "); b = Math.abs(sc.nextLong());
			System.out.print("Unesite C: "); c = Math.abs(sc.nextLong());
		} while((a == 0) || (b == 0) || (c == 0));
		
		System.out.print("\nLijepimo li?\n0:N 1:Y\n"); int glue = sc.nextInt();
		if(glue == 0) {
			long d = (a / c) * (b / c);
			System.out.printf("\nBroj (ne lijepimo): %d\n", d);
		} else {
			long d = ((a * b) / (c * c));
			System.out.printf("\nBroj (lijepimo): %d\n", d);
		}
	}
	
	public static void z10() {
		
		double d, s;
		System.out.print("Unesite D: "); d = sc.nextDouble();
		s = Math.sqrt(81.0 / 337.0 * d * d);
		System.out.printf("\nP: %f\n", s * 16.0 / 9.0 * s);
	}
	
	public static void z11() {
		
		int n;
		System.out.print("Unesite broj: "); n = sc.nextInt();
		System.out.printf("\nPPC: %d\nPC: %d\nR: %d\n",
				(n / 10) % 10, n % 10, (n / 10) % 10 + n % 10);
	}
	
	public static void z12() {
		
		int n, a, b;
		System.out.print("Unesite broj: "); n = sc.nextInt();
		a = n / 10; b = n % 10;
		if (a > b)		System.out.printf("a > b: %d", a - b);
		else if (a < b)	System.out.printf("a < b: %d", a + b);
		else			System.out.printf("a == b: %d", a * b);
	}
	
	public static void z13() {
		
		double r1, r2;
		System.out.print("Unesite R1: "); r1 = Math.abs(sc.nextDouble());
		System.out.print("Unesite R2: "); r2 = Math.abs(sc.nextDouble());
		if ((Math.pow(r1, 2) * Math.PI) > (Math.pow(r2, 2) * Math.PI))
			System.out.printf("\nO1: %.3f", 2.0 * r1 * Math.PI);
		else
			System.out.printf("\nO2: %.3f", 2.0 * r2 * Math.PI);
	}
	
	public static void z14() {
		
		double a, b, c, min, max;
		System.out.print("Unesite A: "); a = sc.nextDouble();
		System.out.print("Unesite B: "); b = sc.nextDouble();
		System.out.print("Unesite C: "); c = sc.nextDouble();
		min = max = a;
		if (min > b) min = b; if (max < b) max = b;
		if (min > c) min = c; if (max < c) max = c;
		System.out.printf("\nMIN: %.3f\nMAX: %.3f\n", min, max);
	}
	
	public static void z15() {
		
		double x, p = 1; int n;
		System.out.print("Unesite X: "); x = sc.nextDouble();
		System.out.print("Unesite N: "); n = sc.nextInt();
		for (int i = 1; i <= n; i++) p *= x;
		System.out.printf("\nX na N: %.3f", p);
	}
	
	public static void z16() {
		
		double c1, c2, c3, minV, s = 0; int minP;
		System.out.print("Unesite C1: "); c1 = sc.nextDouble();
		System.out.print("Unesite C2: "); c2 = sc.nextDouble();
		System.out.print("Unesite C3: "); c3 = sc.nextDouble();
		minV = c1; minP = 1;
		if (minV > c2) { minV = c2; minP = 2; }
		if (minV > c3) { minV = c3; minP = 3; }
		System.out.println();
		if (1 != minP) { System.out.printf("Proizvod #%d: %.2f €\n", 1, c1); s += c1; }
		if (2 != minP) { System.out.printf("Proizvod #%d: %.2f €\n", 2, c2); s += c2; } 
		if (3 != minP) { System.out.printf("Proizvod #%d: %.2f €\n", 3, c3); s += c3; }
		System.out.printf("\nZbir: %.2f €\n", s);
	}
}
