import Geometria2D.*;
import Geometria3D.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Captura de datos
        Scanner entrada = new Scanner(System.in);

        //Menu de figuras 2 dimensiones
        Menus menu_de_figuras = new Menus();
        Menus menu_de_opciones = new Menus();
        int op_figuras ;//recibe opción de figuras 2d

        //Menu de figuras 3 dimensiones
        Menu3d menu_de_figuras3d = new Menu3d();
        int op3d ; //recibe opción de figuras 3d

        double r,h,b,l; // variables temporales para figuras 3 dimensiones

        boolean salir = false;//variable para salir del bucle while
        while (!salir) {
            switch (menu_de_opciones.menu()) {
                case 1: //Caso para calcular las careas
                    op_figuras = menu_de_figuras.menu_figuras(); //recibe opción de figuras 2d
                    if (op_figuras == 1) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese las dimenciones del cuadrado");
                        double lados = entrada.nextDouble();
                        Cuadrado cuadrado1 = new Cuadrado(lados); //Cuadrado
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area cuadrado: " + cuadrado1.getArea());
                        System.out.println("Perimetro cuadrado: " + cuadrado1.getPerimetro());
                        System.out.println("La diagonal del cuadrado es: " + cuadrado1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 2) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese la base del triangulo");
                        double base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triangulo");
                        double altura = entrada.nextDouble();
                        System.out.println("Ingrese el lado del triangulo");
                        double lado = entrada.nextDouble();
                        Triangulo triangulo1 = new Triangulo(base,altura,lado); //Triangulo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area triangulo: " + triangulo1.getArea());
                        System.out.println("Perimetro triangulo: " + triangulo1.getPerimetro());
                        System.out.println("La hipotenusa del triangulo es: " + triangulo1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 3) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese la base del rectangulo");
                        double base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del rectangulo");
                        double altura = entrada.nextDouble();
                        Rectangulo rectangulo1 = new Rectangulo(base,altura); //Rectangulo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area rectangulo: " + rectangulo1.getArea());
                        System.out.println("Perimetro rectangulo: " + rectangulo1.getPerimetro());
                        System.out.println("La diagonal del rectangulo es: " + rectangulo1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 4) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese el radio del circulo");
                        double radio = entrada.nextDouble();
                        Circulo circulo1 = new Circulo(radio); //Circulo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area circulo: " + circulo1.getArea());
                        System.out.println("Perimetro circulo: " + circulo1.getPerimetro());
                        System.out.println("La longitud de la circunferencia es: " + circulo1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 5) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Heptagono regular");
                        System.out.println("Ingrese la longitud del heptagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese la aoptema del heptagono");
                        double apotema = entrada.nextDouble();
                        Heptagono heptagono1 = new Heptagono(longitud,apotema); //Heptagono
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area heptagono: " + heptagono1.getArea());
                        System.out.println("Perimetro heptagono: " + heptagono1.getPerimetro());
                        System.out.println("La cantidad de diagonales del heptagono es: " +
                                heptagono1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 6) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Hexagono regular");
                        System.out.println("Ingrese la longitud del hexagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese el apotema del hexagono");
                        double apotema = entrada.nextDouble();
                        Hexagono hexagono1 = new Hexagono(longitud, apotema); //Hexagono
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area hexagono: " + hexagono1.getArea());
                        System.out.println("Perimetro hexagono: " + hexagono1.getPerimetro());
                        System.out.println("La cantidad de diagonales del hexagono es: " +
                                hexagono1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 7) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese la longitud del pentagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese el apotema del pentagono");
                        double apotema = entrada.nextDouble();
                        Pentagono pentagono1 = new Pentagono(longitud, apotema); //Pentagono
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area pentagono: " + pentagono1.getArea());
                        System.out.println("Perimetro pentagono: " + pentagono1.getPerimetro());
                        System.out.println("La cantidad de diagonales del pentagono es: " +
                                pentagono1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 8) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese la diagonal mayor del rombo");
                        double diagonalMayor = entrada.nextDouble();
                        System.out.println("Ingrese la diagonal menor del rombo");
                        double diagonaMenor = entrada.nextDouble();
                        System.out.println("Ingrese el valor de los lados del rombo");
                        double ladosRombo = entrada.nextDouble();
                        Rombo rombo1 = new Rombo(diagonalMayor,diagonaMenor,ladosRombo); //Rombo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area rombo: " + rombo1.getArea());
                        System.out.println("Perimetro rombo: " + rombo1.getPerimetro());
                        System.out.println("La diagonal menor es: " + rombo1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 9) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese el radio del semi circulo");
                        double radio = entrada.nextDouble();
                        Semicirculo semi1 = new Semicirculo(radio); //Semicirculo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area semi circulo: " + semi1.getArea());
                        System.out.println("Perimetro semi circulo: " + semi1.getPerimetro());
                        System.out.println("La altura del centroide es: " + semi1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    } else if (op_figuras == 10) {
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese la base MAYOR del trapecio");
                        double baseMayor = entrada.nextDouble();
                        System.out.println("Ingrese la base MENOR del trapecio");
                        double baseMenor = entrada.nextDouble();
                        System.out.println("Ingrese la altura del trapecio");
                        double altura = entrada.nextDouble();
                        System.out.println("Ingrese el lado Izquiero del trapecio");
                        double ladoIz = entrada.nextDouble();
                        System.out.println("Ingrese el lado derecho del trapecio");
                        double ladoDr = entrada.nextDouble();
                        System.out.println("Ingrese el angulo del trapecio");
                        double angulo = entrada.nextDouble();
                        Trapecio trapecio1 = new Trapecio(baseMayor, baseMenor,altura, ladoIz, ladoDr, angulo); //Trapecio
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Area trapecio: " + trapecio1.getArea());
                        System.out.println("Perimetro trapecio: " + trapecio1.getPerimetro());
                        System.out.println("Longitud de la diagonal es: " + trapecio1.getLinea_transversal());
                        System.out.println("--- --- --- --- --- --- ---");
                    }
                    break;
                case 2: //Caso para las figuras 3d
                    op3d = menu_de_figuras3d.menu_figuras3d();//recibe opción de figuras 3d

                    if (op3d == 1) { // Calcular cilindro
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese radio: ");
                        r = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        Cilindro cilindro = new Cilindro(r,h);
                        System.out.println(cilindro.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 2) { // Calcular Esfera
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese radio: ");
                        r = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        Esfera esfera = new Esfera(r,h);
                        System.out.println(esfera.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 3) {//Calcular Cono
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese radio: ");
                        r = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        Cono cono = new Cono(r,h);
                        System.out.println(cono.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 4) {// Calcular Cubo
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        Cubo cubo = new Cubo(l);
                        System.out.println(cubo.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 5) {
                        // Calcular Octaedro
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        Octaedro octaedro = new Octaedro(l);
                        System.out.println(octaedro.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 6) {// Calcular Piramide Cuadrangular
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        PiramideCuadrangular PiCuadrangular = new PiramideCuadrangular(l,h);
                        System.out.println(PiCuadrangular.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 7) {//Calcular Prisma Hexagonal
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        PrismaHexagonal PHexagonal = new PrismaHexagonal(l,h);
                        System.out.println(PHexagonal.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 8) {// Calcular Prisma Triangular
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        PrismaTriangular PTriangular = new PrismaTriangular(l,h);
                        System.out.println(PTriangular.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 9) {// Calcular Prisma Rectangular
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese lado: ");
                        l = entrada.nextDouble();
                        System.out.println("Ingrese altura: ");
                        h = entrada.nextDouble();
                        System.out.println("Ingrese base: ");
                        b = entrada.nextDouble();
                        PrismaRectangular rectangulo = new PrismaRectangular(l,b,h);
                        System.out.println(rectangulo.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");

                    }else if (op3d == 10) {//Calcular Tetraedro
                        System.out.println("--- --- --- --- --- --- ---");
                        System.out.println("Ingrese el lado: ");
                        l = entrada.nextDouble();
                        Tetraedro tetraedro = new Tetraedro(l);
                        System.out.println(tetraedro.toString());// llama al método(toString) que imprime los resultados
                        System.out.println("--- --- --- --- --- --- ---");
                    }
                    break;
                case 3:
                    salir = true;
                    break;
            }//Fin switch
        }//Fin while
        System.out.println("-------------------------");
        System.out.println("| GRACIAS, VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}