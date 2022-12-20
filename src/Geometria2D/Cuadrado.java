package Geometria2D;

public class Cuadrado extends Figuras2D{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {
        area = lado * lado;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado*4;
    }
}
