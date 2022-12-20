import Geometria2D.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Captura de datos
        Scanner entrada = new Scanner(System.in);
        //Menu
        Menus menu_de_figuras = new Menus();
        Menus menu_de_opciones = new Menus();
        //Variables
        int op_figuras = 0;
        boolean salir = false;
        while (!salir) {
            switch (menu_de_opciones.menu()) {
                case 1: //Caso para calcular las careas
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1) {
                        System.out.println("Ingrese las dimenciones del cuadrado");
                        double lados = entrada.nextDouble();
                        Cuadrado cuadrado1 = new Cuadrado(lados); //Cuadrado
                        System.out.println("Area cuadrado: " + cuadrado1.getArea());
                        System.out.println("Perimetro cuadrado: " + cuadrado1.getPerimetro());
                    } else if (op_figuras == 2) {
                        System.out.println("Ingrese la base del triangulo");
                        double base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triangulo");
                        double altura = entrada.nextDouble();
                        System.out.println("Ingrese el lado del triangulo");
                        double lado = entrada.nextDouble();
                        Triangulo triangulo1 = new Triangulo(base,altura,lado); //Triangulo
                        System.out.println("Area triangulo: " + triangulo1.getArea());
                        System.out.println("Perimetro triangulo: " + triangulo1.getPerimetro());
                    } else if (op_figuras == 3) {
                        System.out.println("Ingrese la base del rectangulo");
                        double base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del rectangulo");
                        double altura = entrada.nextDouble();
                        Rectangulo rectangulo1 = new Rectangulo(base,altura); //Rectangulo
                        System.out.println("Area rectangulo: " + rectangulo1.getArea());
                        System.out.println("Perimetro rectangulo: " + rectangulo1.getPerimetro());
                    } else if (op_figuras == 4) {
                        System.out.println("Ingrese el radio del circulo");
                        double radio = entrada.nextDouble();
                        Circulo circulo1 = new Circulo(radio); //Circulo
                        System.out.println("Area circulo: " + circulo1.getArea());
                        System.out.println("Perimetro circulo: " + circulo1.getPerimetro());
                    } else if (op_figuras == 5) {
                        System.out.println("Heptagono regular");
                        System.out.println("Ingrese la longitud del heptagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese la aoptema del heptagono");
                        double apotema = entrada.nextDouble();
                        Heptagono heptagono1 = new Heptagono(longitud,apotema); //Heptagono
                        System.out.println("Area heptagono: " + heptagono1.getArea());
                        System.out.println("Perimetro heptagono: " + heptagono1.getPerimetro());
                    } else if (op_figuras == 6) {
                        System.out.println("Hexagono regular");
                        System.out.println("Ingrese la longitud del hexagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese el apotema del hexagono");
                        double apotema = entrada.nextDouble();
                        Hexagono hexagono1 = new Hexagono(longitud, apotema); //Hexagono
                        System.out.println("Area hexagono: " + hexagono1.getArea());
                        System.out.println("Perimetro hexagono: " + hexagono1.getPerimetro());
                    } else if (op_figuras == 7) {
                        System.out.println("Ingrese la longitud del pentagono");
                        double longitud = entrada.nextDouble();
                        System.out.println("Ingrese el apotema del pentagono");
                        double apotema = entrada.nextDouble();
                        Pentagono pentagono1 = new Pentagono(longitud, apotema); //Pentagono
                        System.out.println("Area pentagono: " + pentagono1.getArea());
                        System.out.println("Perimetro pentagono: " + pentagono1.getPerimetro());
                    } else if (op_figuras == 8) {
                        System.out.println("Ingrese la diagonal mayor del rombo");
                        double diagonalMayor = entrada.nextDouble();
                        System.out.println("Ingrese la diagonal menor del rombo");
                        double diagonaMenor = entrada.nextDouble();
                        Rombo rombo1 = new Rombo(diagonalMayor,diagonaMenor); //Rombo
                        System.out.println("Area rombo: " + rombo1.getArea());
                        System.out.println("Perimetro rombo: " + rombo1.getPerimetro());
                    } else if (op_figuras == 9) {
                        System.out.println("Ingrese el radio del semi circulo");
                        double radio = entrada.nextDouble();
                        Semicirculo semi1 = new Semicirculo(radio); //Semicirculo
                        System.out.println("Area semi circulo: " + semi1.getArea());
                        System.out.println("Perimetro semi circulo: " + semi1.getPerimetro());
                    } else if (op_figuras == 10) {
                        System.out.println("Ingrese la base MAYOR del trapecio");
                        double baseMayor = entrada.nextDouble();
                        System.out.println("Ingrese la base MENOR del trapecio");
                        double baseMenor = entrada.nextDouble();
                        System.out.println("Ingrese la alguta del trapecio");
                        double altura = entrada.nextDouble();
                        Trapecio trapecio1 = new Trapecio(baseMayor, baseMenor,altura); //Trapecio
                        System.out.println("Area trapecio: " + trapecio1.getArea());
                        System.out.println("Perimetro trapecio: " + trapecio1.getPerimetro());
                    }
                    break;
                case 2: //Caso de salida
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------");
                    System.out.println("| OPCION NO VALIDA|");
                    System.out.println("-------------------");
            }//Fin switch
        }//Fin while
        System.out.println("-------------------------");
        System.out.println("| GRACIAS, VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}