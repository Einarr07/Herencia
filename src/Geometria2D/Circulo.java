package Geometria2D;

public class Circulo extends Figuras2D{
    double pi = 3.1416;
    double radio;

    public Circulo (double radio){
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {
        area = pi * Math.pow(radio, 2);
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 2 * pi * radio;
    }
}
