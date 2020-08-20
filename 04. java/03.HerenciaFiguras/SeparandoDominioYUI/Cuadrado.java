import java.awt.Color;

public class Cuadrado extends Figura {
	int lado;

	public Cuadrado(int x, int y, int lado,boolean relleno,Color color) {
		super(x,y,relleno,color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
