package Geometria3D;

public class Cono extends Figuras3D{
    private double g; // Altura inclinada;
    private double r; // radio
    private double h; // altura de la figura
    private static double NPi =3.1416;

    public Cono(double r, double h) {
        this.r = r;
        this.h = h;
        calcularVolumen();
        calcularSub_Total();
        g = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
    }

    @Override
    public void calcularVolumen(){volumen = (NPi* Math.pow(r,2)*h)/3;}
    /*
    private void calG(){ // Calcular altura inclinada
        g = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
    }
     */

    @Override
    public void calcularSub_Total() {
        sub_total = NPi*r*(g+r);
    }

    @Override
    public String toString(){
        //return "Volumen: " + getVolumen() + "\nÁrea total: " + getsub_total() + "\nAltura inclinada: " + g;
        return "\n********** CONO **********\n" + super.toString() + "\nAltura inclinada: " + g;
    }
}
