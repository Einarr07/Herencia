package Geometria3D;
import java.util.Scanner;

public class Menu3d {
    Scanner entrada = new Scanner(System.in);

    //Menu para escoger las figuras
    public int menu_figuras3d(){
        int op;
        do {
            System.out.println("\n----------------------------------");
            System.out.println("| ESCOJA UNA FIGURA GEOMETRICA 3D  |");
            System.out.println("----------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Cilindro                          |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Esfera                            |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Cono                              |");
            System.out.println("|                                           |");
            System.out.println("|     4.- Cubo                              |");
            System.out.println("|                                           |");
            System.out.println("|     5.- Octaedro                          |");
            System.out.println("|                                           |");
            System.out.println("|     6.- Piramide Cuadrangular             |");
            System.out.println("|                                           |");
            System.out.println("|     7.- Prisma Hexagonal                  |");
            System.out.println("|                                           |");
            System.out.println("|     8.- Prisma Triangular                 |");
            System.out.println("|                                           |");
            System.out.println("|     9.- Rectangulo                        |");
            System.out.println("|                                           |");
            System.out.println("|     10.- Tetraedro                        |");
            System.out.println("|                                           |");
            System.out.println("|      0.- SALIR                            |");
            System.out.println("|                                           |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 10)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }while ((op < 0) || (op > 10));
        return op;
    }//Fin del menu_figuras 3d
}
