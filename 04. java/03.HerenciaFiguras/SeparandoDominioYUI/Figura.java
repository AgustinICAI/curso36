import java.awt.Color;

public abstract class Figura {
	int x;
	int y;
	int lado;
	boolean relleno;
	Color color;

	/**
	 * Inicializa todos los atributos del objeto
	 * 
	 * @param x    Posición x de la ventana en pixels
	 * @param y    Posición x de la ventana en pixels
	 * @param lado Tamaño del cuadrado en pixels
	 */
	Figura(int x, int y, boolean relleno, Color color) {
		this.setX(x);
		this.setY(y);
		this.setRelleno(relleno);
		this.setColor(color);
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getLado() {
		return lado;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
