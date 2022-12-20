package Geometria2D;

public class Heptagono extends Figuras2D{
    double longitud, apotema;

    public Heptagono(double longitud, double apotema){
        this.longitud = longitud;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {
        area = (7 * longitud * apotema) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 7 * longitud;
    }
}
