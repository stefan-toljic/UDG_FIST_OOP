package ispravka;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String args[]) {
			
		ArrayList<Zadatak3> magacin = new ArrayList<Zadatak3>();
		magacin.add(new Zadatak3("A01", "b36", 1, 2));
		magacin.add(new Zadatak3("A01", "b37", 2, 3));
		magacin.add(new Zadatak3("A02", "c11", 3, 4));
		magacin.add(new Zadatak3("A03", "d25", 4, 5));
		for (Zadatak3 x : magacin) System.out.println(x);
		String oznakaModula = "c11", nazivModula = "A01";
		testNadjiModul(magacin, oznakaModula);		// dobar
		testModulaDostupno(magacin, nazivModula);	// dobar
		testNadjiModul(null, "123");				// los 
		testModulaDostupno(null, "123");			// los
		testNadjiModul(magacin, null);				// los 
		testModulaDostupno(magacin, null);			// los
	}
	
	private static void testNadjiModul(ArrayList<Zadatak3> magacin,
			String oznakaModula) {
		int modulRB = Zadatak3.nadjiModul(magacin, oznakaModula);
		if (modulRB == Zadatak3.ERROR_CODE)
			System.out.printf("\n{%s} modula nema.\n", oznakaModula);
		else if (modulRB == Zadatak3.NULL_POINTER) 
			System.out.println("\nGreska sa unosom.");
		else System.out.printf("\nR.B. modula {%s}: %d\n",
				oznakaModula, modulRB + 1);
	}
	
	private static void testModulaDostupno(ArrayList<Zadatak3> magacin,
			String nazivModula) {
		int modulaD = Zadatak3.modulaDostupno(magacin, nazivModula);
		if (modulaD == Zadatak3.NULL_POINTER)
			System.out.println("\nGreska sa unosom.");
		else System.out.printf("\nModula {%s} dostupno: %d\n",
				nazivModula, modulaD);
	}
	/* CONST */
	public static final int ERROR_CODE = -1;
	public static final int NULL_POINTER = -2;
	/* var */
	private String nazivModula;
	private String oznakaModula;
	private int brojPolice;
	private int brojMagacina;
	/* constructor */
	public Zadatak3() { setNazivModula(""); setOznakaModula(""); }
	public Zadatak3(String nazivModula, String oznakaModula, int brojPolice, int brojMagacina) {
		this();
		this.setNazivModula(nazivModula);
		this.setOznakaModula(oznakaModula);
		this.setBrojPolice(brojPolice);
		this.setBrojMagacina(brojMagacina);
	}
	public String getNazivModula() {
		return nazivModula;
	}
	public void setNazivModula(String nazivModula) {
		if (nazivModula == null) return;
		this.nazivModula = nazivModula;
	}
	public String getOznakaModula() {
		return oznakaModula;
	}
	public void setOznakaModula(String oznakaModula) {
		if (oznakaModula == null) return;
		this.oznakaModula = oznakaModula;
	}
	public int getBrojPolice() {
		return brojPolice;
	}
	public void setBrojPolice(int brojPolice) {
		if (brojPolice < 0) return;
		this.brojPolice = brojPolice;
	}
	public int getBrojMagacina() {
		return brojMagacina;
	}
	public void setBrojMagacina(int brojMagacina) {
		if (brojMagacina < 0) return; 
		this.brojMagacina = brojMagacina;
	}
	/* nadjiModul */
	public static int nadjiModul(ArrayList<Zadatak3> lista, String oznakaModula) {
		if (lista == null || oznakaModula == null) return NULL_POINTER;
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getOznakaModula().equals(oznakaModula)) return i;
		return ERROR_CODE;
	}
	/* modulaDostupno */
	public static int modulaDostupno(ArrayList<Zadatak3> lista, String nazivModula) {
		if (lista == null || nazivModula == null) return NULL_POINTER;
		int i = 0; for (Zadatak3 x : lista)
			if(x.getNazivModula().equals(nazivModula)) i++;
		return i;
	}
	@Override
	public String toString() {
		return "ElektroModul { naziv: " + nazivModula + ", oznaka: " + oznakaModula + ", brojPolice: " + brojPolice
				+ ", brojMagacina: " + brojMagacina + " }";
	}
}
