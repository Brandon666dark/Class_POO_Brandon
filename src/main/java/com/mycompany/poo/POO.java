package com.mycompany.poo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.*;

public class POO extends JPanel {

    private Circulo circulo;
    private Cuadrado cuadrado;

    private int dx = 3;
    private int dy = 3;

    public POO() {

        circulo = new Circulo(
                new Posicion(50, 50),
                new Dimension(60, 60),
                Color.RED
        );

        cuadrado = new Cuadrado(
                new Posicion(200, 100),
                new Dimension(80, 80),
                Color.BLUE
        );

        Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                circulo.mover(dx, dy);

                // Rebote horizontal
                if (circulo.getPosicion().getX() <= 0 ||
                    circulo.getPosicion().getX() + circulo.getDimension().getAncho() >= getWidth()) {
                    dx *= -1;
                }

                // Rebote vertical
                if (circulo.getPosicion().getY() <= 0 ||
                    circulo.getPosicion().getY() + circulo.getDimension().getAlto() >= getHeight()) {
                    dy *= -1;
                }

                repaint();
            }
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        circulo.dibujar(g);
        cuadrado.dibujar(g);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Proyecto POO - Animación");
        POO panel = new POO();

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
