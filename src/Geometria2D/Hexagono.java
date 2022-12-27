package Geometria2D;

public class Hexagono extends Figuras2D{

    double longitud, apotema;

    public Hexagono(double longitud, double apotema){
        this.longitud = longitud;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = 3 * longitud * apotema;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 6 * longitud;
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = (6.0 * (6.0 - 3.0) / 2.0);
    }
}
