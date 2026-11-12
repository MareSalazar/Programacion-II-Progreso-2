package arreglos.tienda.utilitario;

import java.util.Scanner;

public class Validacion {
    private static Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje){
        String dato;
        do{
            System.out.println(mensaje+" : ");
            dato = sc.nextLine();
        }while(dato == null || dato.trim().isEmpty());
        return dato;
    }
}