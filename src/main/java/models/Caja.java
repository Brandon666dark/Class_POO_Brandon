package models;

import processing.core.PApplet;

public class Caja {

    private Posicion pos;
    private Dimension dim;
    private int color;

    public Caja(Posicion pos, Dimension dim, int color) {
        this.pos = pos;
        this.dim = dim;
        this.color = color;
    }

    public void dibujar(PApplet p) {
        p.fill(color);
        p.rect(pos.getX(), pos.getY(), dim.getAncho(), dim.getAlto());
    }
}
