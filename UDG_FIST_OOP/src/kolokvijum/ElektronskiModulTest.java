package kolokvijum;

import java.util.ArrayList;

public class ElektronskiModulTest {

	public static void main(String args[]) {
		
		ArrayList<ElektronskiModul> moduli = new ArrayList<ElektronskiModul>();
		
		moduli.add(new ElektronskiModul("MX0", "0001", "001", 1));
		moduli.add(new ElektronskiModul("MX1", "0010", "001", 1));
		moduli.add(new ElektronskiModul("MX2", "0100", "002", 2));
		moduli.add(new ElektronskiModul("MX2", "0101", "001", 3));
		moduli.add(new ElektronskiModul("MX2", "0110", "003", 1));
		moduli.add(new ElektronskiModul("MX3", "1000", "003", 3));
		
		System.out.println("Indeks modula: " + ElektronskiModul.nadjiPoziciju(moduli, "0010"));
		System.out.println("Indeks modula: " + ElektronskiModul.nadjiPoziciju(moduli, "1000"));
		System.out.println();
		System.out.println("Modula dostupno: " + ElektronskiModul.modulaDostupno(moduli, "MX3"));
		System.out.println("Modula dostupno: " + ElektronskiModul.modulaDostupno(moduli, "MX2"));
	}
}
