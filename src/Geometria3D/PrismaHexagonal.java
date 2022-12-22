package Geometria3D;

public class PrismaHexagonal extends Figuras3D{
    private double l; // lado
    private double h; // altura
    private double apotema; // para calcular el apotema

    public PrismaHexagonal(double l,double h){
        this.l = l;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        apotema = (volumen)/3*l*h;
    }

    @Override
    public void calcularVolumen(){volumen = ((3*Math.sqrt(3))/(2))* Math.pow(l,2)* h;}

    @Override
    public void calcularSub_Total() {
        sub_total = 6*apotema*l + 6*l*h;
    }

    @Override
    public String toString(){
        return "\n********** PRISMA HEXAGONAL **********\n" + super.toString() + "\nApotema: " + apotema;
    }
}
