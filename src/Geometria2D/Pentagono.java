package Geometria2D;

public class Pentagono extends Figuras2D{
    double longitud, apotema;

    public Pentagono(double longitud, double apotema){
        this.longitud = longitud;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = (5 * longitud * apotema) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 5 * longitud;
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = (5.0 * (5.0 - 3.0) / 2.0);
    }
}
