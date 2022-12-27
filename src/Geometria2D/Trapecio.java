package Geometria2D;

public class Trapecio extends Figuras2D{
    double baseMayor, baseMenor, altura, ladoIz, ladoDr, angulo;

    public Trapecio(double baseMayor, double baseMenor, double altura, double ladoIz, double ladoDr, double angulo){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoIz = ladoIz;
        this.ladoDr = ladoDr;
        this.angulo = angulo;
        calcularArea();
        calcularPerimetro();
        calcularLinea();
    }
    @Override
    protected void calcularArea() {
        area = ((baseMayor + baseMenor) / 2) * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = baseMayor + baseMenor + ladoIz + ladoDr;
    }

    @Override
    protected void calcularLinea() {
        linea_transversal = Math.sqrt((Math.pow(baseMayor, 2) + Math.pow(ladoDr, 2)) -(2 *
                (baseMayor * ladoDr)) * Math.cos(angulo));
    }
}
