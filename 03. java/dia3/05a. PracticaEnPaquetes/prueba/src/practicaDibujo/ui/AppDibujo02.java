package practicaDibujo.ui;

import practicaDibujo.domain.*;
import practicaDibujo.util.Util;
import java.awt.Color;
import java.awt.Dimension;



public class AppDibujo02 {
	public static void main(String[] args)
	{
		Dibujo dibujo = new Dibujo();
		//Esto sólo lo muestro como ejemplo de cómo en java se puede acceder a la interfaz de objeto y jugar con él investigando por el javadoc, en este caso JFrame.
		int alturaVentana = dibujo.getContentPane().getSize().height;
		int anchuraVentana = dibujo.getContentPane().getSize().width;

		dibujo.addFigura(new Circulo(0,0, 100,true,Color.BLUE));
		Util.wait(1);
		dibujo.addFigura(new Cuadrado(anchuraVentana-100, 0, 100,true,Color.RED));
		Util.wait(1);
		dibujo.addFigura(new Circulo(anchuraVentana-200, alturaVentana-200, 200,true,Color.GREEN));
		Util.wait(1);
		dibujo.addFigura(new Cuadrado(0, alturaVentana-100, 100,false,Color.ORANGE));

	}
}
