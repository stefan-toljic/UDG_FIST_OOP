package pzk_0;

public class Main {
	
	public static void main(String args[]) {
//		_pTRL(5);
//		_pTOL(5);
//		_pTRD(5);
//		_pTOD(5);
//		_piramida(5);
//		_oPiramida(5);
		_romb(5);
		_pSat(5);
	}
	
	static void crtajRomb1(int n) {
		for (int i = 0; i < n - 1; i++) {
			int razmaci = n - i - 1, zvijezdice = i;
			for (int j = 0; j < razmaci; j++) 		System.out.print(' ');
			for (int j = 0; j < zvijezdice; j++)	System.out.print('*');
			System.out.print('*'); 					// centralna *
			for (int j = 0; j < zvijezdice; j++)	System.out.print('*');
			System.out.println();					// novi red
		}
		for (int i = 0; i < n; i++) {
			int razmaci = i, zvijezdice = n - i - 1;
			for (int j = 0; j < razmaci; j++) 		System.out.print(' ');
			for (int j = 0; j < zvijezdice; j++)	System.out.print('*');
			System.out.print('*'); 					// centralna *
			for (int j = 0; j < zvijezdice; j++)	System.out.print('*');
			System.out.println();					// novi red
		}
	}
	
	static void crtajKvadrat1(int n) {
		String blok0 = "", blok1 = "";
		for (int i = 0; i < n; i++)		blok0 += '*';
		for (int i = 0; i < n; i++)
			if (i == 0 || i == n - 1)	blok1 += '*';
			else						blok1 += ' ';
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1)	System.out.println(blok0);
			else 						System.out.println(blok1);
		}
	}
	
	static void crtajKvadrat2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1)	System.out.print('*');
				else												System.out.print(' ');
			System.out.println();
		}
	}
	
	static void crtajSahTablu1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if ((i + j) % 2 == 0)	System.out.print('#');
				else					System.out.print('.');
			System.out.println();
		}
	}
	///////////////////////////////////////////////////////////////
	static void pTRL(int n) {	// pravougli Trougao Rastuci Lijevo
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++)	System.out.print('*');
			System.out.println();
		}
	}
	// 1.1
	static void pTOL(int n) {	// pravougli Trougao Opadajuci Lijevo
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++)	System.out.print('*');
			System.out.println();
		}
	}
	// 1.2
	static void pTRD(int n) {	// pravougli Trougao Rastuci Desno
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++)	
				if (j < (n - i))	System.out.print(' ');
				else				System.out.print('*');
			System.out.println();
		}
	}
	// 1.3a
	static void pTOD(int n) {	// pravougli Trougao Opadajuci Desno
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (j < i)	System.out.print(' ');
				else 		System.out.print('*');
			System.out.println();
		}
	}
	// 1.3b
	static void piramida(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (j < (n - i - 1))	System.out.print(' ');
				else 					System.out.print('*');
			for (int j = 0; j < i; j++)	System.out.print('*');
			System.out.println();
		}
	}
	// 1.4
	static void obrnutaP(int n) {	// obrnuta Piramida
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (j < i)							System.out.print(' ');
				else								System.out.print('*');
			for (int j = 0; j < (n - i - 1); j++)	System.out.print('*');
			System.out.println();
		}
	}
	// 1.5
	static void romb(int n) {
		for (int i = 0; i < n; i++) {			// gornja piramida
			for (int j = 0; j < n; j++)
				if (j < (n - i - 1))			System.out.print(' ');
				else							System.out.print('*');
			for (int j = 0; j < i; j++)			System.out.print('*');
			System.out.println();
		}
		for (int i = 1; i < n; i++) {			// donja piramida
			for (int j = 0; j < (n - 1); j++)	
				if (j < i)						System.out.print(' ');
				else							System.out.print('*');
			for (int j = 0; j < (n - i); j++)	System.out.print('*');
			System.out.println();
		}
	}
	// 1.6
	static void pjescaniSat(int n) {
		for (int i = 0; i < n; i++) {				// gornja piramida
			for (int j = 0; j < n; j++)
				if (j < i)							System.out.print(' ');
				else								System.out.print('*');
			for (int j = 0; j < (n - i - 1); j++)	System.out.print('*');
			System.out.println();
		}
		for (int i = 1; i < n; i++) {				// donja piramida
			for (int j = 0; j < n; j++)
				if (j < (n - i - 1))				System.out.print(' ');
				else								System.out.print('*');
			for (int j = 0; j < i; j++)				System.out.print('*');
			System.out.println();
		}
	}
	// 1.7
	///////////////////////////////
	static void red(int r, int z) {
		for (int i = 0; i < r; i++)	System.out.print(' ');
		for (int i = 0; i < z; i++) System.out.print('*');
		System.out.println();
	}
	static void _pTRL(int n) {
		for (int i = 1; i <= n; i++)		red(0, i);
	} // 1.1
	static void _pTOL(int n) {
		for (int i = n; i >= 1; i--)		red(0, i);
	} // 1.2
	static void _pTRD(int n) {
		for (int i = 1; i <= n; i++)		red(n - i, i);
	} // 1.3a
	static void _pTOD(int n) {
		for (int i = n; i >= 1; i--)		red(n - i, i);
	} // 1.3b
	static void _piramida(int n) {
		for (int i = 0; i < n; i++)			red(n - i - 1, i * 2 + 1);
	} // 1.4
	static void _oPiramida(int n) {
		for (int i = n - 1; i >= 0; i--)	red(n - i - 1, i * 2 + 1);
	} // 1.5
	static void _romb(int n) {
		for (int i = 0; i < n; i++)			red(n - i - 1, i * 2 + 1);
		for (int i = n - 2; i >= 0; i--)	red(n - i - 1, i * 2 + 1);
	} // 1.6
	static void _pSat(int n) {
		for (int i = n - 1; i >= 0; i--)	red(n - i - 1, i * 2 + 1);
		for (int i = 1; i < n; i++)			red(n - i - 1, i * 2 + 1);
	} // 1.7
}
