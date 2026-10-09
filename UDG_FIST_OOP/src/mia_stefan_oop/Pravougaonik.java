package mia_stefan_oop;

public class Pravougaonik {

	private Tacka dl;
	private int sirina;
	private int visina;

	public Pravougaonik(Tacka dl, int sirina, int visina) {
		setDl(dl);
		setSirina(sirina);	// Nazalost mora se...
		setVisina(visina);	// ... validacije jer.
	}
	
	public Pravougaonik(int x, int y, int sirina, int visina) {
		this(new Tacka(x, y), sirina, visina); // OMG
	}

	public Tacka getDl() {
		return dl;
	}

	public void setDl(Tacka dl) {
		if (dl == null) { System.out.print("_setDl: null pointer\n");
			return; } this.dl = dl; // IS_NULL ? return : setDl
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		if (sirina < 0) {
			System.out.print("_setSirina: vrijednost nije dozvoljena\n");
			return; // namjerno prekidam izvrsavanje funkcije
		} this.sirina = sirina; // validacija prosla
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		if (visina < 0) {
			System.out.print("_setVisina: vrijednost nije dozvoljena\n");
			return; // namjerno prekidam izvrsavanje funkcije
		} this.visina = visina; // validacija prosla
	}
	
	public boolean kolizija(Pravougaonik p) {
		// Tjemena: { t1, t2, t3, t4 } -> Enemy
		final int LEN = 4; Tacka[] tjemena = new Tacka[LEN];
		tjemena[0] = new Tacka(
				p.getDl().getX(),					// X
				p.getDl().getY());					// Y
		tjemena[1] = new Tacka(
				p.getDl().getX() + p.getSirina(),	// X + W
				p.getDl().getY());					// Y
		tjemena[2] = new Tacka(
				p.getDl().getX(),					// X
				p.getDl().getY() + p.getVisina());	// Y + H
		tjemena[3] = new Tacka(
				p.getDl().getX() + p.getSirina(),	// X + W
				p.getDl().getY() + p.getVisina());	// Y + H
		// Podesavanje ivica -> Player
		int 	dlx = getDl().getX(), 		// LH (low horizontal)
				dly = getDl().getY(),		// LV (low vertical)
				gdx = dlx + getSirina(),	// HH (high horizontal)
				gdy = dly + getVisina();	// HV (high vertical)
		// Provjera kolizije
		// #1 Provjera preklapanja osa [NOVO_CAREVO_RUHO] // Sasvim dovoljno...
		if (	(tjemena[0].getX() <= gdx && tjemena[3].getX() >= dlx)	// X: DL[E/P]:GD[P/E]
			&&	(tjemena[0].getY() <= gdy && tjemena[3].getY() >= dly))	// Y: DL[E/P]:GD[P/E]
				return true;
		// #2 Provjera tjemena (Enemy) [STARO_DOBRO_RJESENJE] // Sada suvisno...
		for (int i = 0; i < LEN; i++) {
			if (	(tjemena[i].getX() >= dlx && tjemena[i].getX() <= gdx)	// LH <= x <= HH
				&&	(tjemena[i].getY() >= dly && tjemena[i].getY() <= gdy))	// LV <= y <= HV
				return true;
		} return false; // Nije doslo do kolizije
	}
	
	public boolean kolizijaV2(Pravougaonik p) {
		// Tacke: P[DL, GD], E[DL, GD]
		final int	P_DL_X = getDl().getX(),
				  	E_DL_X = p.getDl().getX(),
				  	P_GD_X = getDl().getX() + getSirina(),
				  	E_GD_X = p.getDl().getX() + p.getSirina(),
				  	P_DL_Y = getDl().getY(),
				  	E_DL_Y = p.getDl().getY(),
				  	P_GD_Y = getDl().getY() + getVisina(),
					E_GD_Y = p.getDl().getY() + p.getVisina();
		// Provjera preklapanja osa
		if (	(E_DL_X <= P_GD_X && E_GD_X >= P_DL_X)
			&&	(E_DL_Y <= P_GD_Y && E_GD_Y >= P_DL_Y))
			return true;
		return false;
	}
}
