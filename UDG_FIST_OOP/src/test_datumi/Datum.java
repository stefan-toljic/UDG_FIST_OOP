package test_datumi;

public class Datum {
	/* const */
	public static final String D1 = "/";
	public static final String D2 = "-";
	public static final String DAN = "DD";
	public static final String MJESEC = "MM";
	public static final String GODINA = "YYYY";
	public static final String FORMAT_1A = DAN + D1 + MJESEC + D1 + GODINA;
	public static final String FORMAT_1B = MJESEC + D1 + DAN + D1 + GODINA;
	public static final String FORMAT_1C = GODINA + D1 + MJESEC + D1 + DAN;
	public static final String FORMAT_2A = DAN + D2 + MJESEC + D2 + GODINA;
	public static final String FORMAT_2B = MJESEC + D2 + DAN + D2 + GODINA;
	public static final String FORMAT_2C = GODINA + D2 + MJESEC + D2 + DAN;
	/* var */
	private String date;
	/* constructor */
	public Datum(String date) {
		this.date = date;
	}
	/* get/set */
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		if (date == null) {
			System.out.println("_setDate: IN = null"); return;
		} this.date = date;
	}
	/* formatSwap */
	public static String formatSwap(String date, String fi, String fo) {
		int id = fi.indexOf(DAN);
		int im = fi.indexOf(MJESEC);
		int ig = fi.indexOf(GODINA);
		String sd = date.substring(id, id + DAN.length());
		String sm = date.substring(im, im + MJESEC.length());
		String sg = date.substring(ig, ig + GODINA.length());
		fo = fo.replace(DAN, sd); fo = fo.replace(MJESEC, sm);
		fo = fo.replace(GODINA, sg); return fo;
	}
	/* TEST */
	public static void main(String args[]) {
		String d = "05/11/2026";
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_1A, d);
		d = formatSwap(d, FORMAT_1A, FORMAT_1B);
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_1B, d);
		d = formatSwap(d, FORMAT_1B, FORMAT_1C);
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_1C, d);
		d = formatSwap(d, FORMAT_1C, FORMAT_2A);
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_2A, d);
		d = formatSwap(d, FORMAT_2A, FORMAT_2B);
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_2B, d);
		d = formatSwap(d, FORMAT_2B, FORMAT_2C);
		System.out.printf("{\n\tFormat: %s,\n\tDate: %s\n}\n", FORMAT_2C, d);
	}
}
