package Geometria3D;

public class PrismaTriangular extends Figuras3D{
    private double l; // lado
    private double h; // altura
    private double sub_lateral;

    public PrismaTriangular (double l, double h) {
        this.l = l;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        sub_lateral = 3*l*h;
    }

    @Override
    public void calcularVolumen(){volumen = ((Math.sqrt(3))/(4))* Math.pow(l,2) * h;}

    @Override
    public void calcularSub_Total() {
        sub_total = l * (((Math.sqrt(3))/(2))*l + 3*h);
    }

    @Override
    public String toString(){
        return "\n********** PRISMA TRIANGULAR **********\n" + super.toString() + "\nÁrea lateral: " + sub_lateral;
    }
}
