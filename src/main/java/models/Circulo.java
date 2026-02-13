package models;

import processing.core.PApplet;

public class Circulo extends Figura {

    public Circulo(Posicion posicion, Dimension dimension) {
        super(posicion, dimension);
    }

    @Override
    public void dibujar(PApplet app) {
        app.fill(255, 0, 0);
        app.ellipse(
            posicion.getX(),
            posicion.getY(),
            dimension.getAncho(),
            dimension.getAlto()
        );
    }
}
