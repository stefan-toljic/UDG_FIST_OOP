package priprema_kolokvijum;

import java.util.ArrayList;

public class MeteoPodatak {

	public static void main(String args[]) {
		String in = "c123s015g028t068r002p017h53b100200*CS";
		in = dajPodatke(in); System.out.print(in);
	}
	
	private String nazivMjerneStanice;
	private String datumVrijemeOcitavanja;
	private float temperatura;
	private float vlaznostVazduha;
	private float pritisak;
		
	public MeteoPodatak() { }
	public MeteoPodatak(String s0, String s1, float f0, float f1, float f2) {
		setNazivMjerneStanice(s0);
		setDatumVrijemeOcitavanja(s1);
		setTemperatura(f0);
		setVlaznostVazduha(f1);
		setPritisak(f2);
	}
	
	public String getNazivMjerneStanice() {
		return nazivMjerneStanice;
	}

	public void setNazivMjerneStanice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}

	public String getDatumVrijemeOcitavanja() {
		return datumVrijemeOcitavanja;
	}

	public void setDatumVrijemeOcitavanja(String datumVrijemeOcitavanja) {
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getVlaznostVazduha() {
		return vlaznostVazduha;
	}

	public void setVlaznostVazduha(float vlaznostVazduha) {
		this.vlaznostVazduha = vlaznostVazduha;
	}

	public float getPritisak() {
		return pritisak;
	}

	public void setPritisak(float pritisak) {
		this.pritisak = pritisak;
	}
	
	public static ArrayList<MeteoPodatak> izdvojPodatkeStanice(ArrayList<MeteoPodatak> in, String nazivStanice) {
		ArrayList<MeteoPodatak> out = new ArrayList<MeteoPodatak>();
		for (MeteoPodatak x : in)
			if (x.getNazivMjerneStanice().equals(nazivStanice))
				out.add(x);
		return out;
	}
	
	public static float odrediMaxTempZaDan(ArrayList<MeteoPodatak> in, String datum) {
		float max = Float.MIN_VALUE;
		for (MeteoPodatak x : in)
			if (x.getDatumVrijemeOcitavanja().startsWith(datum))
				if (x.getTemperatura() > max)
					max = x.getTemperatura();
		return max;
	}

	public static String dajPodatke(String s) {
		String out = ""; s = s.toLowerCase();
		// obradi temperaturu
		int ind = s.indexOf('t'); System.out.println(ind);
		String s0 = s.substring(ind+1, ind+4); float t = Float.parseFloat(s0);
		t = (t-32) * (float) 5/9;
		System.out.println(s0 + " , " + t);
		// obradi vlaznost
		ind = s.indexOf('h'); System.out.println(ind);
		s0 = s.substring(ind+1, ind+3); float h = Float.parseFloat(s0);
		System.out.println(s0 + " , " + h);
		// obradi pritisak
		ind = s.indexOf('b'); System.out.println(ind);
		s0 = s.substring(ind+1, ind+6); float b = Float.parseFloat(s0);
		System.out.println(s0 + " , " + b);
		// formatiranje
		out = String.format("{\n\t\"temp\": %.1f,\n\t\"vlaznost\": %.1f%%,\n\t\"pritisak\": %.1f\n}", t, h, b);
		return out;
	}
	
	@Override
	public String toString() {
		return "MeteoPodatak [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVrijemeOcitavanja="
				+ datumVrijemeOcitavanja + ", temperatura=" + temperatura + ", vlaznostVazduha=" + vlaznostVazduha
				+ ", pritisak=" + pritisak + "]";
	}
}
