package zzv_1;

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
	
	public static void z16_v2() { // Isti zadatak, samo sa 5 cijena.
		
		double m1, m2; int p1, p2;
		System.out.print("Unesite C1: "); double c1 = sc.nextDouble();
		System.out.print("Unesite C2: "); double c2 = sc.nextDouble();
		System.out.print("Unesite C3: "); double c3 = sc.nextDouble();
		System.out.print("Unesite C4: "); double c4 = sc.nextDouble();
		System.out.print("Unesite C5: "); double c5 = sc.nextDouble();
		if (c1 > c2) { m1 = c1; p1 = 1; m2 = c2; p2 = 2;
		} else { m1 = c2; p1 = 2; m2 = c1; p2 = 1;
		} // initial_setup: c1 & c2 ✓
		if (c3 > m1) { m2 = m1; p2 = p1; m1 = c3; p1 = 3;
		} else if (c3 > m2) { m2 = c3; p2 = 3;
		} // c3 ✓
		if (c4 > m1) { m2 = m1; p2 = p1; m1 = c4; p1 = 4;
		} else if (c4 > m2) { m2 = c4; p2 = 4;
		} // c4 ✓
		if (c5 > m1) { m2 = m1; p2 = p1; m1 = c5; p1 = 5;
		} else if (c5 > m2) { m2 = c5; p2 = 5;
		} // c5 ✓
		System.out.printf("\nProizvodi #%d i #%d: %.2f €\n", p1, p2, m1 + m2);
	}
	
	public static void z16_v3() { // Isti zadatak, samo n cijena.
		
		double m1 = -1, m2 = -1; int p1 = 0, p2 = 0, n;
		System.out.print("Broj proizvoda: "); n = sc.nextInt(); System.out.println();
		if (n >= 2) {
			System.out.print("[ vrijednost cijene je apsolutna ]\n");
			for (int i = 1; i <= n; i++) {
				System.out.printf("Unesite C%d: ", i); double cv = Math.abs(sc.nextDouble());
				if (cv > m1) { m2 = m1; p2 = p1; m1 = cv; p1 = i;	// cv > m1
				} else if (cv > m2) { m2 = cv; p2 = i; } 			// cv > m2
			}
			System.out.printf("\nProizvodi #%d i #%d: %.2f €\n", p1, p2, m1 + m2);
		} else System.out.print("Trebaju nam 2 ili vise prozvoda.\n");
	}
	
	public static void z17() {
		
		System.out.print("Unesite godinu: "); int g = Math.abs(sc.nextInt());
		if ((g % 100) != 0) {
			if ((g % 4) == 0) System.out.print("\nJeste.\n");
			else System.out.print("\nNije.\n");
		} else {
			if((g % 400) == 0) System.out.print("\nJeste.\n");
			else System.out.print("\nNije.\n");
		}
	}
	
	public static void z18() { // KS: (0, 0) gore lijevo (ekran)
		
		int glx, gly, ddx, ddy, x, y;
		do { 
			System.out.print("\n[ unesite validne vrijednosti ]\n");
			System.out.print("Unesite GLx: "); glx = Math.abs(sc.nextInt());
			System.out.print("Unesite GLy: "); gly = Math.abs(sc.nextInt());
			System.out.print("Unesite DDx: "); ddx = Math.abs(sc.nextInt());
			System.out.print("Unesite DDy: "); ddy = Math.abs(sc.nextInt());
		} while (!((ddx - glx) > 0 && (ddy - gly) > 0));
		System.out.print("Unesite X: "); x = Math.abs(sc.nextInt());
		System.out.print("Unesite Y: "); y = Math.abs(sc.nextInt());
		if ((x >= glx && x <= ddx) && (y >= gly && y <= ddy))
			System.out.print("\nPripada.\n");
		else System.out.print("\nNe pripada.\n");
	}
	
	public static void z18_v2() { // KS: (0, 0) dolje lijevo (DKS)
		
		int glx, gly, ddx, ddy, x, y;
		do {
			System.out.print("\n[ unesite validne vrijednosti ]\n");
			System.out.print("Unesite GLx: "); glx = Math.abs(sc.nextInt());
			System.out.print("Unesite GLy: "); gly = Math.abs(sc.nextInt());
			System.out.print("Unesite Ddx: "); ddx = Math.abs(sc.nextInt());
			System.out.print("Unesite Ddy: "); ddy = Math.abs(sc.nextInt());
		} while (!((ddx - glx) > 0 && (gly - ddy) > 0));
		System.out.print("Unesite X: "); x = Math.abs(sc.nextInt());
		System.out.print("Unesite Y: "); y = Math.abs(sc.nextInt());
		if ((x >= glx && x <= ddx) && (y >= ddy && y <= gly))
			System.out.print("\nPripada.\n");
		else System.out.print("\nNe pripada.\n");
	}
	
	public static void z19() {
		
		System.out.print("Unesite PW: "); double pw = sc.nextDouble();
		System.out.print("Unesite PH: "); double ph = sc.nextDouble();
		if (ph / pw >= 2) System.out.print("\nMoze.\n");
		else System.out.print("\nNe moze.\n");
	}
	
	public static void z20() {
		
		System.out.print("Unesite T: "); double t = sc.nextDouble();
		if (t <= 0.0) System.out.print("\nStanje: Cvrsto.\n");
		else if (t > 0.0 && t < 100.0) System.out.print("\nStanje: Tecno.\n");
		else System.out.print("\nStanje: Gasovito.\n");
	}
	
	public static void z21() {
		
		int n;
		do { System.out.print("(n > 1) Unesite N: "); n = sc.nextInt(); }
		while (n < 2);
		for (int i = 2; i <= Math.sqrt(n); i++) 
			if (n % i == 0) { System.out.print("\nNije.\n"); return; }
		System.out.print("\nJeste.\n");
	}
	
	public static void z22() {
		
		System.out.print("Unesite broj: "); int n = Math.abs(sc.nextInt());
		int min = 10, max = -1;
		while (n > 0) { int c = n % 10; n /= 10;
			if (min > c) min = c; if (max < c) max = c;
		} System.out.printf("\n[%d, %d] Zbir: %d", min, max, min + max);
	}
	
	public static void z23() {	
		// D - duzina terase (m), N - br. stubica, S - sirina stubica (cm)
		double d, s; int n;
		do { System.out.print("[ unesite validne mjere ]\n");
			System.out.print("\nUnesite D: "); d = Math.abs(sc.nextDouble());
			System.out.print("Unesite N: "); n = Math.abs(sc.nextInt());
			System.out.print("Jos S: "); s = Math.abs(sc.nextDouble()) / 100.0;
		} while (d < (n * s)); if (d == (n * s)) System.out.print("\nR: 0\n");
		else System.out.printf("\nR: %f\n", (d - (n * s)) / (n + 1));
	}
	
	public static void z24() {
		
		double is, po; byte na;
		do { System.out.print("Iznos skolarine: "); is = sc.nextDouble();
		} while (is <= 0);
		do { System.out.print("Prosjecna ocjena: "); po = sc.nextDouble();
		} while (po < 2.0 || po > 5.0);
		do { System.out.print("(0:N, 1:D) Takmicenje: "); na = sc.nextByte();
		} while (na < 0 || na > 1);
		if 		(po >= 4.5) System.out.printf("\nIznos: %d\n", Math.round(is * 0.6));
		else if (na == 1) System.out.printf("\nIznos: %d\n", Math.round(is * 0.7));
		else if (po >= 3.5) System.out.printf("\nIznos: %d\n", Math.round(is * 0.8));
		else if (po >= 2.5) System.out.printf("\nIznos: %d\n", Math.round(is * 0.9));
		else System.out.printf("\nIznos: %d\n", Math.round(is));
	}
	
	public static void z25() {
		// Validacija unosa
		int n, s;
		do { System.out.print("Unesite 4 cif. broj: "); n = Math.abs(sc.nextInt()); }
		while (!(n / 1000 > 0 && n / 1000 < 10));
		// Uslov
		if (n % 2 == 0) {	// Paran
			s = 0; for (int i = 0; i < 4; i++) {
				if ((n % 10) % 2 == 0) s += n % 10; n /= 10; }
		} else {			// Neparan
			s = 1; for (int i = 0; i < 4; i++) {
				if ((n % 10) % 2 != 0) s *= n % 10; n /= 10; }
			}
		System.out.printf("\nS: %d\n", s);
		}
	
	public static void z26() {
		// Mrav na ivici stola... 
		System.out.print("Unesite LDx: "); int ldx = sc.nextInt();
		System.out.print("Unesite LDy: "); int ldy = sc.nextInt();
		System.out.print("Unesite DGx: "); int dgx = sc.nextInt();
		System.out.print("Unesite DGy: "); int dgy = sc.nextInt();
		System.out.print("Unesite Mx: "); int mx = sc.nextInt();
		System.out.print("Unesite My: "); int my = sc.nextInt(); 
		/* Da bi mrav bio na jednoj od ivica, on mora biti na:
		 * 	- Lijeva ivica / desna ivica
		 * 	- Donja ivica / gornja ivica */ 
		// Horizontal check: LX | RX : Y [ ... ]
		if (mx == ldx || mx == dgx) {
			if (my >= ldy && my <= dgy) System.out.print("\nJeste.\n");
			else System.out.print("\nNije.\n"); }
		// Vertical check: DY | UY : X [ ... ]
		else if (my == ldy || my == dgy) { 
			if (mx >= ldx && mx <= dgx) System.out.print("\nJeste.\n");
			else System.out.print("\nNije.\n"); }
		else System.out.print("\nNije.\n");
	}
	
	public static void z27() {
		System.out.print("Unesite broj: "); int n = Math.abs(sc.nextInt());
		int s = 0; do { s += n % 10; n /= 10; } while (n > 0);
		System.out.printf("\nSuma cifara: %d\n", s);
	}
	
	public static void z28() {
		System.out.print("Unesite X: "); double x = sc.nextDouble();
		double rez; if (x <= -7) {
			rez = -2.0 * x + 7.0 / 2.0;
		} else if (x < 1) {
			rez = (Math.pow(x, 2) - 3.0 * x + 5.0) /
					(Math.pow(x, 2) + 2.0);
		} else if (x <= 8) {
			rez = Math.sqrt(Math.pow(x, 2) + 2.0 * x + 2) +
					Math.sqrt(Math.abs(3.0 / 2.0 * x - 4.0 / 7.0));
		} else {
			rez = Math.abs(3.0 / Math.pow(x, 2) - 11.0 * x);
		} System.out.printf("\nRezultat: %.2f\n", rez);
	}
	
	public static void z29() {
		System.out.print("Unesite X: "); double x = sc.nextDouble();
		System.out.print("Uneiste Y: "); double y = sc.nextDouble();
		if (x > 0) {
			if (y == 0) System.out.print("\nDesna X osa.\n");
			else if (y > 0) System.out.print("\nPrvi kvadrant.\n");
			else System.out.print("\nCetvrti kvadrant./n");
		} else if (x == 0) {
			if (y == 0) System.out.print("\nKoordinatni pocetak.\n");
			else if (y > 0 ) System.out.print("\nGornja Y osa.\n");
			else System.out.print("\nDonja Y osa.");
		} else { 
			if (y == 0) System.out.print("\nLijeva X osa.\n");
			else if (y > 0) System.out.print("\nDrugi kvadrant.\n");
			else System.out.print("\nTreci kvadrant.\n");
		}
	}
	
	public static void z30() {
		System.out.print("Unesite N: "); double n = Math.abs(sc.nextDouble());
		System.out.print("Unesite X: "); double x = Math.abs(sc.nextDouble());
		System.out.printf("\nMoze da kupi: %d akcija.\n",
				(int) (n / (x * 1.15)));
	}
	
	public static void z31() {
		final int LIMIT = 50; int s = 0;
		System.out.print("Broj vozaca: "); int n = Math.abs(sc.nextInt());
		for (int i = 0; i < n; i++) {
			System.out.printf(" Unesite brzinu vozaca #%d: ", i + 1); 
			int br = Math.abs(sc.nextInt()); if (br > LIMIT) {
				System.out.printf(" Vozac #%d placa kaznu od: %d €\n",
					i + 1, (br - LIMIT) * 10); s += (br - LIMIT) * 10;
			}
		} System.out.printf("\n Suma kazni: %d\n", s);
	}
}
