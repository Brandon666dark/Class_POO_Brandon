package models;

import processing.core.PApplet;

public abstract class Figura {

    protected Posicion posicion;
    protected Dimension dimension;
    protected float dx = 3;
    protected float dy = 3;

    public Figura(Posicion posicion, Dimension dimension) {
        this.posicion = posicion;
        this.dimension = dimension;
    }

    public void mover() {
        posicion.setX(posicion.getX() + dx);
        posicion.setY(posicion.getY() + dy);
    }

    public void rebotar(PApplet app) {

        if (posicion.getX() <= 0 || 
            posicion.getX() + dimension.getAncho() >= app.width) {
            dx *= -1;
        }

        if (posicion.getY() <= 0 || 
            posicion.getY() + dimension.getAlto() >= app.height) {
            dy *= -1;
        }
    }

    public abstract void dibujar(PApplet app);
}
