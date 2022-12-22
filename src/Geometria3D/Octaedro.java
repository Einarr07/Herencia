package Geometria3D;

public class Octaedro extends Figuras3D{
    private double l; // lado
    private double h; // para calcular la altura de la figura

    public Octaedro(double l) {
        this.l = l;
        calcularVolumen();
        calcularSub_Total();
        h = l* Math.sqrt(2);
    }

    @Override
    public void calcularVolumen(){volumen = Math.pow(l,3)*(Math.sqrt(2))/(3);}

    @Override
    public void calcularSub_Total() {
        sub_total = Math.pow(l,2) * 2 * Math.sqrt(3);
    }

    /*
    private void calAltura(){
        h = l* Math.sqrt(2);
    }
     */

    @Override
    public String toString(){
        return "Volumen: " + getVolumen() + "\nÁrea total: " + getsub_total() + "\nAltura: " + h;
    }

}
