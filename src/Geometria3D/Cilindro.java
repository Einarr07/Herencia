package Geometria3D;

public class Cilindro extends Figuras3D{
    private double r; // radio
    private double h; // altura de la figura
    private static double NPi =3.1416;
    private double sub_lateral;

    public Cilindro(double r, double h){
        this.r = r;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        sub_lateral = 2*NPi*r*h;
    }

    @Override
    public void calcularVolumen(){volumen = NPi*Math.pow(r,2)*h;}

    @Override
    public void calcularSub_Total() {
            sub_total = 2*NPi*r*(r+h);
    }
    /*
    private void calSub_lateral(){
        sub_lateral = 2*NPi*r*h;
    }
     */

    @Override
    public String toString(){
        return "\n********** CILINDRO **********\n" + super.toString() + "\nÁrea lateral: " + sub_lateral;
    }

        /*
        @Override
        public void calcularSub_lateral(){
            sub_lateral = 2*NPi*r*h;
        }

        @Override
        protected void calcularApotema() {
            apotema =0;
        }
         */
}
