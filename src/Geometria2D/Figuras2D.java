package Geometria2D;

public abstract class Figuras2D {
    double area, perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected abstract void calcularArea();

    protected abstract void calcularPerimetro();
}
