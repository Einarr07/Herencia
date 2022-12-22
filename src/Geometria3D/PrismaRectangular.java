package Geometria3D;

public class PrismaRectangular extends Figuras3D{

    private double l; // lado
    private double b; // base
    private double h; // altura
    private double sub_lateral;

    public PrismaRectangular(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        sub_lateral = 2*b*h + 2*h*l;
    }

    @Override
    public void calcularVolumen(){volumen = l*b*h;}

    @Override
    public void calcularSub_Total() {
        sub_total = 2*b*h + 2*h*l + 2*b*l;
    }

    @Override
    public String toString(){
        return "\n********** PRISMA RECTANGULAR **********\n" + super.toString() + "\nÁrea lateral: " + sub_lateral;
    }
}
