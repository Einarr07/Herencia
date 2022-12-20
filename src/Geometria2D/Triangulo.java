package Geometria2D;

public class Triangulo extends Figuras2D{
    double base, altura, lado;

    public Triangulo(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = this.lado;
        calcularArea();
        calcularPerimetro();
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    protected void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = base + lado + lado;
    }
}
