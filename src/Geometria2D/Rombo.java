package Geometria2D;

public class Rombo extends Figuras2D{
    double diagonalMayor, diagonaMenor;

    public Rombo (double diagonalMayor, double diagonaMenor){
        this.diagonalMayor = diagonalMayor;
        this.diagonaMenor = diagonaMenor;
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
