package Geometria3D;

public class Cubo extends Figuras3D{
    private double lado;
    private double sub_lateral;


    public Cubo(double lado){
        this.lado = lado;
        calcularVolumen();
        calcularSub_Total();
        sub_lateral = Math.pow(lado,2);
    }

    @Override
    public void calcularVolumen(){volumen = Math.pow(lado,3);}

    @Override
    public void calcularSub_Total() {
        sub_total = 6*Math.pow(lado,2);
    }

    @Override
    public String toString(){
        return "\n********** CUBO **********\n" + super.toString() + "\nÁrea lateral: " + sub_lateral;
    }

    /*
    @Override
    public void calcularSub_lateral(){
        sub_lateral = Math.pow(lado,2);
    }

    @Override
    protected void calcularApotema() {
        apotema =0;
    }
     */
}