package petro_stefan_oop;

import mia_stefan_oop.Pravougaonik;

public class GameObject {

	private int x;
	private int y;
	private int w;
	private int h;
	
	public GameObject() { }
	public GameObject(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setW(w);
		setH(h);
	}
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}
	protected int getW() {
		return w;
	}
	protected void setW(int w) {
		if (w <= 0) {
			System.out.print("setW: Sirina <= 0\n");
			return;
		}
		this.w = w;
	}
	protected int getH() {
		return h;
	}
	protected void setH(int h) {
		if (h <= 0) {
			System.out.print("setH: Visina <= 0\n");
			return;
		}
		this.h = h;
	}
	
	@Override	
	// TODO
	public String toString() {
		return "GameObject [x=" + x + ", y=" + y + ", w=" + w + ", h=" + h + "]";
	}
	
	public boolean intersetcts(GameObject go) {
			// Tacke: P[DL, GD], E[DL, GD]
			final int	P_DL_X = getX(),
					  	E_DL_X = go.getX(),
					  	P_GD_X = getX() + getW(),
					  	E_GD_X = go.getX() + go.getW(),
					  	P_DL_Y = getY(),
					  	E_DL_Y = go.getY(),
					  	P_GD_Y = getY() + getH(),
						E_GD_Y =go.getY() + go.getH();
			// Provjera preklapanja osa
			if (	(E_DL_X <= P_GD_X && E_GD_X >= P_DL_X)
				&&	(E_DL_Y <= P_GD_Y && E_GD_Y >= P_DL_Y))
				return true;
			return false;
		}
}
