package kolokvijum;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		System.out.println("test");
		z1();
		z2();
	}
	
	private static void z1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite N: "); 
		toBinary(Math.abs(sc.nextInt()), 16);
		sc.close();
	}
	
	// ZAPIS: Broj bitova u binarnoj reprezentaciji broja
	private static void toBinary(int n, int zapis) {
		// 1 2^0
		// 2 2^1
		// 4 2^2
		// 8 2^3
		// 16 2^4
		// 32 2^5
		// 64 2^6
		// 128 2^7
//		while(n / x < 1) {
//			x /= 2;
//		} System.out.println("x: " + x);
		String s = "";
		for (int i = zapis - 1; i >= 0; i--) {
			System.out.println("i: " + i + ", n: " + n);
			if ((n - Math.pow(2, i)) >= 0) {
				n -= Math.pow(2, i);
				s += '1';
			} else 
				s += '0';
		} System.out.println(n);
		System.out.println("rez: " + s);
	}
	
	private static void z2() {
		// Mene zbunjuje postavka ovog zadatka...
		// Ne razumijem sta je fiksna komponenta, a sta nije
		// Da li je za svaki format uvijek zajednicko MM DD YYYY???
		String test = "11/03/2026";
		String format = "MM/DD/YYYY";
		String zeljeniFormat = "DD-MM-YYYY";
		System.out.println(test);
		System.out.println(konvertujDatum(test, format, zeljeniFormat));
	}
	
	// DD 2
	// MM 2
	// YYYY 4
	
	private static String konvertujDatum(String datum, String formatIn, String formatOut) {
		String out = "";
		int dani, mjeseci, godine;
		// struktura
		int indexD = formatIn.indexOf('D');
		String day = datum.substring(indexD, indexD + 2);
		System.out.println(day);
		int indexM = formatIn.indexOf('M');
		String month = datum.substring(indexM, indexM + 2);
		System.out.println(month);
		int indexY = formatIn.indexOf('Y');
		String year = datum.substring(indexY, indexY + 4);
		System.out.println(year);
		// delimiteri
//		int indexDD = indexD + 2;
//		System.out.println(datum.charAt(indexDD));
//		int indexMD = indexM + 2;
//		System.out.println(datum.charAt(indexMD));
		// nadji redosled
		formatOut = formatOut.replace("DD", day);
		formatOut = formatOut.replace("MM", month);
		formatOut = formatOut.replace("YYYY", year);
		out = formatOut;
		return out;
		// Kako sam glup...
	}
}
