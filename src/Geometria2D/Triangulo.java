package Geometria2D;

public class Triangulo extends Figuras2D{
    double base, altura, lado;

    public Triangulo(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = this.lado;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = base + lado + lado;
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
