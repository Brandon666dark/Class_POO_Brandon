package models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangulo {

    private Posicion posicion;
    private int base;
    private int altura;
    private Color color;

    public Triangulo(Posicion posicion, int base, int altura, Color color) {
        this.posicion = posicion;
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        int[] x = {
            posicion.getX(),
            posicion.getX() + base / 2,
            posicion.getX() + base
        };

        int[] y = {
            posicion.getY() + altura,
            posicion.getY(),
            posicion.getY() + altura
        };

        g.setColor(color);
        g.fillPolygon(new Polygon(x, y, 3));
    }
}
