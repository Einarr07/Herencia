package Geometria2D;

public class Trapecio extends Figuras2D{
    double baseMayor, baseMenor, altura;

    public Trapecio(double baseMayor, double baseMenor, double altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea() {

    }

    @Override
    protected void calcularPerimetro() {

    }
}
