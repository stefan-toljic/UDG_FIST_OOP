package zzv_2;

import java.util.ArrayList;

public class Student {
	
	private static ArrayList<Student> lista = new ArrayList<Student>();

	private String ime;
	private String prezime;
	private String brojIndeksa;	// Namjerno String (ID: char + numeric)
	private int ocjena1;		// 5 - 10
	private int ocjena2;		// 5 - 10
	private int ocjena3;		// 5 - 10
	private boolean stipendija;
	
	public Student(String ime, String prezime, String brojIndeksa, int ocjena1, int ocjena2, int ocjena3) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
		lista.add(this);
	}

	public static void stampajSpisak() {
		for (Student stu : lista)
			System.out.printf("Ime: %s, Prezime: %s, Stipendija: %s\n",
					stu.getIme(), stu.getPrezime(), stu.imaStipendiju() ? "Da" : "Ne");
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getOcjena1() {
		return ocjena1;
	}

	public void setOcjena1(int ocjena1) {
		if (ocjena1 >= 5 && ocjena1 <= 10)
		{ this.ocjena1 = ocjena1; this.azurirajStipendiju(); }
		else System.out.println("Los unos. [5, 10]");
	}

	public int getOcjena2() {
		return ocjena2;
	}

	public void setOcjena2(int ocjena2) {
		if (ocjena2 >= 5 && ocjena2 <= 10)
		{ this.ocjena2 = ocjena2; this.azurirajStipendiju(); }
		else System.out.println("Los unos. [5, 10]");
	}

	public int getOcjena3() {
		return ocjena3;
	}

	public void setOcjena3(int ocjena3) {
		if (ocjena3 >= 5 && ocjena3 <= 10)
		{ this.ocjena3 = ocjena3; this.azurirajStipendiju(); }
		else System.out.println("Los unos. [5, 10]");
	}
	
	public boolean imaStipendiju() {
		return stipendija;
	}
	
	public void azurirajStipendiju() {
		if ((((double) (ocjena1 + ocjena2 + ocjena3)) / 3.0) > 9.0)
			stipendija = true;
		else
			stipendija = false;
	}
}
