package Geometria3D;

public class PiramideCuadrangular extends Figuras3D{
    private double l; // lado
    private double h; // altura
    private double sub_base; // para calcular el área de la base
    private double apotema; // para calcular el apotema

    public PiramideCuadrangular(double l,double h){
        this.l = l;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        sub_base = l*l;
        apotema = Math.sqrt(Math.pow(l,2) + Math.pow(h,2));
    }

    @Override
    public void calcularVolumen(){volumen = (0.3333) * Math.pow(l,2)*h;}

    @Override
    public void calcularSub_Total() {
        sub_total = 0;
    }

    @Override
    public String toString(){
        return "\n********** PIRAMIDE CUADRANGULAR **********\n"+"Volumen: "+getVolumen()+"\nÁrea de la base: "+sub_base+"\nApotema: "+apotema ;
    }
}
