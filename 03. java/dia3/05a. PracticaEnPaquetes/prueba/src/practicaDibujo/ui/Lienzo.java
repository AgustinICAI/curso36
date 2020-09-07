package practicaDibujo.ui;
import practicaDibujo.domain.*;
import java.awt.*;
import javax.swing.JFrame;

public class Lienzo extends Canvas {
  Figura figuras[];
  static int FIGURASLENGTH = 10;
  int ultimaFiguraInsertada;

  public Lienzo() {
    super();
    figuras = new Figura[FIGURASLENGTH];
    ultimaFiguraInsertada = 0;
  }

  void setFiguras(Figura[] figuras) {
    this.figuras = figuras;
    FIGURASLENGTH = figuras.length;
    this.repaint();
  }

  void addFigura(Figura c) {
    if (ultimaFiguraInsertada < figuras.length) {
      figuras[ultimaFiguraInsertada] = c;
      ultimaFiguraInsertada = ultimaFiguraInsertada + 1;
      this.repaint();
    } else
      System.err.println(
          "NO SE PUEDEN INSERTAR MAS FIGURAS YA QUE LA CLASE LIENZO ESTA PENSADA PARA " + FIGURASLENGTH + "CUADRADOS");
  }

  public void paint(Graphics g) {
    for (int j = 0; j < figuras.length; j++)
      if (figuras[j] != null)
      {
        g.setColor(figuras[j].getColor());
        if (figuras[j] instanceof Cuadrado)
        {
          Cuadrado c = (Cuadrado)figuras[j];
          if (figuras[j].isRelleno())
            g.fillRect(figuras[j].getX(), figuras[j].getY(), c.getLado(), c.getLado());
          else
            g.drawRect(figuras[j].getX(), figuras[j].getY(), c.getLado(), c.getLado());
        }
        else if (figuras[j] instanceof Circulo)
          if (figuras[j].isRelleno())
            g.fillOval(figuras[j].getX(), figuras[j].getY(), ((Circulo)figuras[j]).getDiametro(), ((Circulo)figuras[j]).getDiametro());
          else
            g.drawOval(figuras[j].getX(), figuras[j].getY(), ((Circulo)figuras[j]).getDiametro(), ((Circulo)figuras[j]).getDiametro());
        else
          System.err.println("NO SE RECONOCE LA FIGURA A PINTAR");

      }
  }
}
