package ispravka;

import java.util.Scanner;

public class Zadatak2 {
	
	public static final String DD = "DD";
	public static final String MM = "MM";
	public static final String YYYY = "YYYY";

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite IN: "); String in = sc.nextLine(), fi, fo; 
		do { System.out.println("Unesite FI: "); fi = sc.nextLine(); }
		while (!(fi.contains(DD) && fi.contains(MM) && fi.contains(YYYY)));
		do { System.out.println("Unesite FO: "); fo = sc.nextLine(); }
		while (!(fo.contains(DD) && fo.contains(MM) && fo.contains(YYYY)));
		swapFormat(in, fi, fo); sc.close();
//		swapFormat(java.time.LocalDate.now().toString(), "YYYY-MM-DD", "DD/MM/YYYY");
	}
	/* swapFormat */
	private static void swapFormat(String in, String fi, String fo) {
		int	dd = fi.indexOf(DD), mm = fi.indexOf(MM), yyyy = fi.indexOf(YYYY);
		String ddS = in.substring(dd, dd + DD.length()),
			mmS = in.substring(mm, mm + MM.length()),
			yyyyS = in.substring(yyyy, yyyy + YYYY.length());
		fo = fo.replace(DD, ddS); fo = fo.replace(MM, mmS);
		fo = fo.replace(YYYY, yyyyS); System.out.println("Izlaz: " + fo);
	}
}
