package models;

import java.awt.Color;
import java.awt.Graphics;

public class Caja {

    private Posicion posicion;
    private Dimension dimension;
    private Color color;

    public Caja(Posicion posicion, Dimension dimension, Color color) {
        this.posicion = posicion;
        this.dimension = dimension;
        this.color = color;
    }

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
