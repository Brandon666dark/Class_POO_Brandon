package models;

import java.awt.Graphics;

public class Cuadrado extends Figura {

    public Cuadrado(Posicion posicion, Dimension dimension, java.awt.Color color) {
        super(posicion, dimension, color);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(
                posicion.getX(),
                posicion.getY(),
                dimension.getAncho(),
                dimension.getAlto()
        );
    }
}
