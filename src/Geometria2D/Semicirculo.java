package Geometria2D;

public class Semicirculo extends  Figuras2D{
    double pi = 3.1416;
    double radio;

    public Semicirculo (double radio){
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {
        area = (pi * Math.pow(radio, 2) ) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (pi * radio) + (2 * radio);
    }
}
