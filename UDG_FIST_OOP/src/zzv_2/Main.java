package zzv_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		test2();
	}
	
	private static void test2() {
		System.out.print("Unesite br. studenata: ");
		final int NO_STUDENTS = new Scanner(System.in).nextInt();
		Random r = new Random();
		char ime = 'A', prezime = 'B';
		for(int i = 0; i < NO_STUDENTS; i++) {
			Student s = new Student(
					"" + ime++ + i,
					"" + prezime++ + i,
					"RN00" + i,
					8 + r.nextInt(3), 8 + r.nextInt(3), 8 + r.nextInt(3));
			s.azurirajStipendiju();
		} Student.stampajSpisak();
	}
}
