package Geometria2D;

import java.util.Scanner;

public class Menus {
    Scanner entrada = new Scanner(System.in);
    public int menu() {
        int op = -1;
        while ((op < 0) || (op > 2)) {
            System.out.println("-------------------------------------------------");
            System.out.println("| BIENVENIDO AL CALCULO DE FIGURAS GEOMETRICAS 2D|");
            System.out.println("-------------------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- CALCULAR FIGURAS                  |");
            System.out.println("|                                           |");
            System.out.println("|     2.- SALIR                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 2)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin menu de opciones

    //Menu para escoger las figuras
    public int menu_figuras(){
        int op = -1;
        while ((op < 0) || (op > 10)) {
            System.out.println("--------------------------------");
            System.out.println("| ESCOJA UNA FIGURA GEOMETRICA |");
            System.out.println("--------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Cuadrados                         |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Triangulos                        |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Rectangulos                       |");
            System.out.println("|                                           |");
            System.out.println("|     4.- Circulos                          |");
            System.out.println("|                                           |");
            System.out.println("|     5.- Heptagono                         |");
            System.out.println("|                                           |");
            System.out.println("|     6.- Hexagono                          |");
            System.out.println("|                                           |");
            System.out.println("|     7.- Pentagono                         |");
            System.out.println("|                                           |");
            System.out.println("|     8.- Rombo                             |");
            System.out.println("|                                           |");
            System.out.println("|     9.- Semicirculo                       |");
            System.out.println("|                                           |");
            System.out.println("|     10.- Trapecio                         |");
            System.out.println("|                                           |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 10)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin del menu_figuras
}