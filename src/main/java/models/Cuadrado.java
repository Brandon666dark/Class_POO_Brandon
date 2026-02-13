package models;

import processing.core.PApplet;

public class Cuadrado extends Figura {

    public Cuadrado(Posicion posicion, Dimension dimension) {
        super(posicion, dimension);
    }

    @Override
    public void dibujar(PApplet app) {
        app.fill(0, 0, 255);
        app.rect(
            posicion.getX(),
            posicion.getY(),
            dimension.getAncho(),
            dimension.getAlto()
        );
    }
}
