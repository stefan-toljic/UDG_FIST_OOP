package zzv_2;

public class Color {

	private int red;
	private int green;
	private int blue;
	
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		if (red < 0 || red > 255)
			System.out.print("setRed: value_oob\n");
		else
			this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		if (green < 0 || green > 255)
			System.out.print("setGreen: value_oob\n");
		else
			this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		if (blue < 0 || blue > 255)
			System.out.print("setBlue: value_oob\n");
		else
			this.blue = blue;
	}
	
	public void addRed(int v) {
		if (red + v > 255) 		red = 255;	// V > 255
		else if (red + v < 0)	red = 0;	// V < 0
		else 					red += v;	// 0 <= V <= 255
	}
	
	public void addGreen(int v) {
		if (green + v > 255) 	green = 255;	// V > 255
		else if (green + v < 0)	green = 0;		// V < 0
		else 					green += v;		// 0 <= V <= 255
	}
	
	public void addBlue(int v) {
		if (blue + v > 255) 	blue = 255;	// V > 255
		else if (blue + v < 0)	blue = 0;	// V < 0
		else 					blue += v;	// 0 <= V <= 255
	}
	
	public void printColor() {
		System.out.printf("red: %d, green: %d, blue: %d\n", red, green, blue);
	}
}
