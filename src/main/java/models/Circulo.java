package models;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {

    private Posicion posicion;
    private int radio;
    private Color color;

    public Circulo(Posicion posicion, int radio, Color color) {
        this.posicion = posicion;
        this.radio = radio;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(
            posicion.getX(),
            posicion.getY(),
            radio * 2,
            radio * 2
        );
    }
}
