package models;

import processing.core.PApplet;

public class Triangulo {

    private Posicion pos;
    private int base;
    private int altura;
    private int color;

    public Triangulo(Posicion pos, int base, int altura, int color) {
        this.pos = pos;
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public void dibujar(PApplet p) {
        p.fill(color);
        p.triangle(
            pos.getX(), pos.getY() + altura,
            pos.getX() + base / 2, pos.getY(),
            pos.getX() + base, pos.getY() + altura
        );
    }
}
