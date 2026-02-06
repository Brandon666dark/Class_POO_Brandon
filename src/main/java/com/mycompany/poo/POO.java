package com.mycompany.poo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import models.*;

public class POO extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // ===== SOL =====
        Circulo sol = new Circulo(new Posicion(50, 40), 40, Color.YELLOW);
        sol.dibujar(g);

        // ===== CASA =====
        Caja casa = new Caja(
                new Posicion(150, 180),
                new Dimension(200, 150),
                new Color(178, 102, 51)
        );
        casa.dibujar(g);

        // ===== TECHO (TRIANGULO) =====
        Triangulo techo = new Triangulo(
                new Posicion(130, 130),
                240,
                60,
                Color.RED
        );
        techo.dibujar(g);

        // ===== PUERTA =====
        Caja puerta = new Caja(
                new Posicion(235, 240),
                new Dimension(40, 90),
                Color.DARK_GRAY
        );
        puerta.dibujar(g);

        // ===== VENTANAS =====
        Caja ventana1 = new Caja(
                new Posicion(175, 210),
                new Dimension(40, 40),
                Color.CYAN
        );

        Caja ventana2 = new Caja(
                new Posicion(285, 210),
                new Dimension(40, 40),
                Color.CYAN
        );

        ventana1.dibujar(g);
        ventana2.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Figura POO - Caja, Circulo y Triangulo");
        POO panel = new POO();

        ventana.add(panel);
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
