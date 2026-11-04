package kolokvijum;

import java.util.ArrayList;

public class ElektronskiModul {

	private String nazivModula;
	private String identifikacioniBroj;
	private String identifikatorPolice;
	private int redniBrojKutije;
	
	public ElektronskiModul(String nazivModula, String identifikacioniBroj, String identifikatorPolice,
			int redniBrojKutije) {
		this.nazivModula = nazivModula;
		this.identifikacioniBroj = identifikacioniBroj;
		this.identifikatorPolice = identifikatorPolice;
		this.redniBrojKutije = redniBrojKutije;
	}

	public String getNazivModula() {
		return nazivModula;
	}

	public void setNazivModula(String nazivModula) {
		this.nazivModula = nazivModula;
	}

	public String getIdentifikacioniBroj() {
		return identifikacioniBroj;
	}

	public void setIdentifikacioniBroj(String identifikacioniBroj) {
		this.identifikacioniBroj = identifikacioniBroj;
	}

	public String getIdentifikatorPolice() {
		return identifikatorPolice;
	}

	public void setIdentifikatorPolice(String identifikatorPolice) {
		this.identifikatorPolice = identifikatorPolice;
	}

	public int getRedniBrojKutije() {
		return redniBrojKutije;
	}

	public void setRedniBrojKutije(int redniBrojKutije) {
		this.redniBrojKutije = redniBrojKutije;
	}

	@Override
	public String toString() {
		return "ElektronskiModul [nazivModula=" + nazivModula + ", identifikacioniBroj=" + identifikacioniBroj
				+ ", identifikatorPolice=" + identifikatorPolice + ", redniBrojKutije=" + redniBrojKutije + "]";
	}
	
	public static int nadjiPoziciju(ArrayList<ElektronskiModul> lista, String identifikacioniBroj) {
		int errorCode = Integer.MIN_VALUE; // signal za gresku
		for (ElektronskiModul x : lista)
			if (x.getIdentifikacioniBroj().equals(identifikacioniBroj))
				return lista.indexOf(x);
		return errorCode;
	}
	
	public static int modulaDostupno(ArrayList<ElektronskiModul> inventar, String nazivModula) {
		int naStanju = 0;
		for (ElektronskiModul x : inventar)
			if (x.getNazivModula().equals(nazivModula))
				naStanju++;
		return naStanju;
	}
}
