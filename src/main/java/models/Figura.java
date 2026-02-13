package models;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {

    protected Posicion posicion;
    protected Dimension dimension;
    protected Color color;

    public Figura(Posicion posicion, Dimension dimension, Color color) {
        this.posicion = posicion;
        this.dimension = dimension;
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void mover(int dx, int dy) {
        posicion.setX(posicion.getX() + dx);
        posicion.setY(posicion.getY() + dy);
    }

    public abstract void dibujar(Graphics g);
}
