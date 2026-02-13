package com.mycompany.poo;

import processing.core.PApplet;
import models.*;

public class POO extends PApplet {

    private Circulo circulo;
    private Cuadrado cuadrado;

    public static void main(String[] args) {
        PApplet.main("com.mycompany.poo.POO");
    }

    @Override
    public void settings() {
        size(800, 500);
    }

    @Override
    public void setup() {
        circulo = new Circulo(
                new Posicion(100, 100),
                new Dimension(60, 60)
        );

        cuadrado = new Cuadrado(
                new Posicion(300, 200),
                new Dimension(80, 80)
        );
    }

    @Override
    public void draw() {
        background(255);

        circulo.mover();
        circulo.rebotar(this);
        circulo.dibujar(this);

        cuadrado.mover();
        cuadrado.rebotar(this);
        cuadrado.dibujar(this);
    }
}
