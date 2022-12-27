package Geometria2D;

public class Rectangulo extends Figuras2D{
    double base, altura;

    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = base * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (base*2) + (altura*2);
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
