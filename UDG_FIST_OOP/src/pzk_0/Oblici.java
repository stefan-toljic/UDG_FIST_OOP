package pzk_0;

public class Oblici {

	public static void main(String args[]) {
		tprl(5); System.out.println();
		tpol(5); System.out.println();
		tprd(5); System.out.println();
		tpod(5); System.out.println();
		pr(5); System.out.println();
		pi(5); System.out.println();
		rr(5); System.out.println();
		ri(5); System.out.println();
		ph(5, 5); System.out.println();
		pf(5, 5); System.out.println();
	}
	
	private static void red(int r, int z) {
		for (int i = 0; i < r; i++) System.out.print(' ');
		for (int i = 0; i < z; i++) System.out.print('*');
		System.out.println();
	}
	
	public static void tprl(int n) {
		for (int i = 1; i <= n; i++) red(0, i);
	}
	
	public static void tpol(int n) {
		for (int i = n; i >= 1; i--) red(0, i);
	}
	
	public static void tprd(int n) {
		for (int i = 1; i <= n; i++) red(n - i, i);
	}
	
	public static void tpod(int n) {
		for (int i = n; i >= 1; i--) red(n - i, i);
	}
	
	public static void pr(int n) {
		for (int i = 1; i <= n; i++) red(n - i, i * 2 - 1);
	}
	
	public static void pi(int n) {
		for (int i = n; i >= 1; i--) red(n - i, i * 2 - 1);
	}
	
	public static void rr(int n) {
		for (int i = 1; i <= n; i++) 	 red(n - i, i * 2 - 1);
		for (int i = n - 1; i >= 1; i--) red(n - i, i * 2 - 1);
	}
	
	public static void ri(int n) {
		for (int i = n; i >= 1; i--) red(n - i, i * 2 - 1); 
		for (int i = 2; i <= n; i++) red(n - i, i * 2 - 1);
	}
	
	public static void ph(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++)
				if (i == 0 || i == a - 1)		System.out.print('*');
				else
					if (j == 0 || j == b - 1)	System.out.print('*');
					else					 	System.out.print(' ');
			System.out.println();
		}
	}
	
	public static void pf(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) System.out.print('*');
			System.out.println();
		}
	}
}
