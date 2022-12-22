package Geometria3D;

public abstract class Figuras3D {
    protected double volumen;
    protected double sub_total;
    //protected double sub_lateral;
    //protected double apotema;

    public double getVolumen() {
        return volumen;
    }

    public double getsub_total() {
        return sub_total;
    }

    /*
    public double getSub_lateral() {
        return sub_lateral;
    }

    public double getApotema() {
        return apotema;
    }

     */
    protected abstract void calcularVolumen();
    protected abstract void calcularSub_Total();
    //protected abstract void calcularSub_lateral();
    //protected abstract void calcularApotema();

    @Override
    public String toString(){
        return "Volumen: " + volumen + "\nArea total: " + sub_total;
    }

}
