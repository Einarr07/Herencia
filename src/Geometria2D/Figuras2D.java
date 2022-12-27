package Geometria2D;

public abstract class Figuras2D {
    double area, perimetro, linea_transversal;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getLinea_transversal() {
        return linea_transversal;
    }

    protected abstract void calcularArea();

    protected abstract void calcularPerimetro();

    protected abstract void calcularLinea();
}