package Geometria3D;

public class Esfera extends Figuras3D{
    private double r; //radio de las esfera
    private double h; // altura del casquete
    private static double NPi =3.1416;
    private double casquete;
    private double diametro;

    public Esfera(double r, double h) {
        this.r = r;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        casquete = (0.3333)*NPi* Math.pow(h,2)*(3*r-h);
        diametro = 2*r;
    }

    @Override
    public void calcularVolumen() {
        volumen = (1.3333)*NPi* Math.pow(r,3);
    }

    @Override
    public void calcularSub_Total() { // en esta figura no se utiliza el àrea lateral, pero está implementado en la super clase
        sub_total = 0;
    }

    @Override
    public String toString(){
        return "\n********** ESFERA **********\n" + "Volumen: " + getVolumen() + "\nDiametro: " + diametro + "\nCasquete: " + casquete;
    }
}
