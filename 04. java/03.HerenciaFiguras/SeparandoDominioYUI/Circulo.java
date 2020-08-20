import java.awt.Color;

public class Circulo extends Figura {
	int diametro;


	Circulo(int x, int y, int diametro,boolean relleno,Color color) {
		super(x,y,relleno,color);
		this.diametro = diametro;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


}
