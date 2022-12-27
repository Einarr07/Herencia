package Geometria2D;

public class Rombo extends Figuras2D{
    double diagonalMayor, diagonaMenor, ladosRombo;

    public Rombo (double diagonalMayor, double diagonaMenor, double ladosRombo){
        this.diagonalMayor = diagonalMayor;
        this.diagonaMenor = diagonaMenor;
        this.ladosRombo = ladosRombo;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = (diagonalMayor * diagonaMenor) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = Math.sqrt(Math.pow(diagonalMayor, 2) + Math.pow(diagonaMenor, 2));
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = Math.sqrt( 4 * Math.pow(ladosRombo, 2) - Math.pow(diagonalMayor, 2));
    }
}
