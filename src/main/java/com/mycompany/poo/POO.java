package com.mycompany.poo;

import processing.core.PApplet;
import models.*;

public class POO extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.mycompany.poo.POO");
    }

    @Override
    public void settings() {
        size(500, 400);
    }

    @Override
    public void setup() {
        background(255);
    }

    @Override
    public void draw() {
        background(255);

        // ===== SOL =====
        Circulo sol = new Circulo(new Posicion(50, 40), 40, color(255, 255, 0));
        sol.dibujar(this);

        // ===== CASA =====
        Caja casa = new Caja(
                new Posicion(150, 180),
                new Dimension(200, 150),
                color(178, 102, 51)
        );
        casa.dibujar(this);

        // ===== TECHO =====
        Triangulo techo = new Triangulo(
                new Posicion(130, 130),
                240,
                60,
                color(255, 0, 0)
        );
        techo.dibujar(this);

        // ===== PUERTA =====
        Caja puerta = new Caja(
                new Posicion(235, 240),
                new Dimension(40, 90),
                color(80)
        );
        puerta.dibujar(this);

        // ===== VENTANAS =====
        Caja ventana1 = new Caja(
                new Posicion(175, 210),
                new Dimension(40, 40),
                color(0, 255, 255)
        );

        Caja ventana2 = new Caja(
                new Posicion(285, 210),
                new Dimension(40, 40),
                color(0, 255, 255)
        );

        ventana1.dibujar(this);
        ventana2.dibujar(this);
    }
}
