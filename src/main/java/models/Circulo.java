package models;

import processing.core.PApplet;

public class Circulo {

    private Posicion pos;
    private int radio;
    private int color;

    public Circulo(Posicion pos, int radio, int color) {
        this.pos = pos;
        this.radio = radio;
        this.color = color;
    }

    public void dibujar(PApplet p) {
        p.fill(color);
        p.ellipse(pos.getX(), pos.getY(), radio * 2, radio * 2);
    }
}
