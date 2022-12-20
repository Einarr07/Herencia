package Geometria3D;

public class Cilindro extends Figuras3D{
        private double r;
        private double h;
        private static double NPi =3.1416;

        public Cilindro(double r, double h){
            this.r = r;
            this.h = h;
            calcularVolumen();
            calcularSub_Total();
            calcularSub_lateral();
        }

        @Override
        public void calcularVolumen(){volumen = NPi*Math.pow(r,2)*h;}

        @Override
        public void calcularSub_Total() {
            sub_total = 2*NPi*r*(r+h);
        }

        @Override
        public void calcularSub_lateral(){
            sub_lateral = 2*NPi*r*h;
        }

        @Override
        protected void calcularApotema() {
            apotema =0;
        }
}
