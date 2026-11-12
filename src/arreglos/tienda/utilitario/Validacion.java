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
    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");

            //Este bloque try y catch nos sirve para manejar el error cuando se escribe algo
            //que java no puede transformar a entero ej:HOLA
            try { //sc.nextLine()lee el texto | trim() quita los espacios de los extremos
                // e Integer.parseInt() intenta convertirlo a entero
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                //Se ejecuta si falla la conversion, el tipo de error es NumberFormatException y
                // la variable e guarda los detalles de
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }

    public static int leerEnteroMayorQue(String mensaje, int limite) {
        int dato;

        do {
            dato = leerEntero(mensaje);

            if (dato <= limite) {
                System.out.println("El número debe ser mayor que " + limite + ".");
            }
        } while (dato <= limite);
        return dato;
    }

    public static int leerEnteroMenorQue(String mensaje, int limite) {
        int dato;

        do {
            dato = leerEntero(mensaje);

            if (dato >= limite) {
                System.out.println("El número debe ser menor que " + limite + ".");
            }
        } while (dato >= limite);
        return dato;
    }

    public static int leerEnteroEntre(String mensaje, int minimo, int maximo) {
        int dato;

        do {
            dato = leerEntero(mensaje);

            if (dato < minimo || dato > maximo) {
                System.out.println("El número debe estar entre " + minimo
                        + " y " + maximo + ".");
            }
        } while (dato < minimo || dato > maximo);
        return dato;
    }
}