package Geometria2D;

public class Cuadrado extends Figuras2D{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = lado * lado;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado*4;
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
    }
}
