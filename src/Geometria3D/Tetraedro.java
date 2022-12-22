package Geometria3D;

public class Tetraedro extends Figuras3D{
    private double l;
    private double h; // para calcular altura

    public Tetraedro(double l){
        this.l = l;
        calcularVolumen();
        calcularSub_Total();
        h = (l* Math.sqrt(6))/(3);
    }

    @Override
    public void calcularVolumen(){volumen = (Math.pow(l,3)*Math.sqrt(2))/(12);}

    @Override
    public void calcularSub_Total() {
        sub_total = Math.sqrt(3) * Math.pow(l,2);
    }

    @Override
    public String toString(){
        return "\n********** TETRAEDRO **********\n" + super.toString() + "\nAltura: " + h;
    }

}
