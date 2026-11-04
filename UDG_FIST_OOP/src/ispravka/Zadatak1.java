package ispravka;

import java.util.Scanner;

public class Zadatak1 {
	
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
//		z1a();	// Binary
//		z1b();	// Octal
//		drawBinary(127);
//		drawOctal(500);
		speedTest();
		sc.close();
	}
	/* Zadatak 1: Dekadni u binarni */
	private static void z1a() {
		int n; while (!sc.hasNextInt()) { sc.next(); }
		do { System.out.print("Unesite N: "); n = sc.nextInt(); }
		while (n <= 0); /* prirodni: 1, 2, 3... */
		toBinary1(n);	// String
		toBinary2(n);	// StringBuilder
	}
	/* toBinary using String */
	private static void toBinary1(int n) {	// String
		System.out.println("_toBinary1:");
		/* start_time */ long t = System.nanoTime();
		String s = ""; while (n > 0) {
			s += n % 2; n /= 2;
			System.out.println(s);
		} System.out.println("Izlaz: " + new StringBuilder(s).reverse());
		/* end_time */ t = System.nanoTime() - t; 
		/* difference */ System.out.println("_execution_time: " + t + " ns\n");
	}
	/* toBinary using StringBuilder */
	private static void toBinary2(int n) {	
		System.out.println("_toBinary2:");
		/* start_time */ long t = System.nanoTime();
		StringBuilder s = new StringBuilder(); while (n > 0) {
			s.append(n % 2); n /= 2;
			System.out.println(s);
		} System.out.println("Izlaz: " + s.reverse()); 
		/* end_time */ t = System.nanoTime() - t; 
		/* difference */ System.out.println("_execution_time: " + t + " ns\n");
	}
	/* Zadatak 1: Dekadni u oktalni */
	private static void z1b() {
		int n; while (!sc.hasNextInt()) { sc.next(); }
		do { System.out.print("Unesite N: "); n = sc.nextInt(); }
		while (n <= 0); /* prirodni: 1, 2, 3... */
		toOctal1(n);	// String
		toOctal2(n);	// StringBuilder
	}
	/* toOctal using String */ 
	private static void toOctal1(int n) {
		System.out.println("_toOctal1:");
		/* start_time */ long t = System.nanoTime();
		String s = ""; while (n > 0) {
			s += n % 8; n /= 8;
			System.out.println(s);
		} System.out.println("Rezultat: " + new StringBuilder(s).reverse());
		/* end_time */ t = System.nanoTime() - t; 
		/* difference */ System.out.println("_execution_time: " + t + " ns\n");
	}
	/* toOctal using StringBuilder */
	private static void toOctal2(int n) {
		System.out.println("_toOctal2: ");
		/* start_time */ long t = System.nanoTime();
		StringBuilder s = new StringBuilder(); while (n > 0) {
			s.append(n % 8); n /= 8;
			System.out.println(s);
		} System.out.println("Izlaz: " + s.reverse());
		/* end_time */ t = System.nanoTime() - t; 
		/* difference */ System.out.println("_execution_time: " + t + " ns\n");
	}
	/* drawBinary */
	private static void drawBinary(int n) {
		System.out.println("_drawBinary:");
		StringBuilder s = new StringBuilder(); while (n > 0) {
			System.out.printf("\nN: %d, (N/2): %d, (N%%2): %d\n", n, n/2, n%2);
			s.append(n % 2); System.out.printf("_s: { %s }\n", s); n /= 2;
		} System.out.println("\nIzlaz: " + s.reverse());
	}
	/* drawOctal */
	private static void drawOctal(int n) {
		System.out.println("_drawOctal:");
		StringBuilder s = new StringBuilder(); while (n > 0) {
			System.out.printf("\nN: %d, (N/8): %d, (N%%8): %d\n", n, n/8, n%8);
			s.append(n % 8); System.out.printf("_s: { %s }\n", s); n /= 8;
		} System.out.println("\nIzlaz: " + s.reverse());
	}
	/* speedTest */ 
	private static void speedTest() {
		long t, t1, t2;
		t = System.nanoTime(); for (int i = 0; i < 50_000; i++) toBinary1(i);
		t1 = System.nanoTime() - t; 
		t = System.nanoTime(); for (int i = 0; i < 50_000; i++) toBinary2(i);
		t2 = System.nanoTime() - t;
		System.out.printf("_speed1: %d ns\n_speed2: %d ns", t1, t2);
	}
}
