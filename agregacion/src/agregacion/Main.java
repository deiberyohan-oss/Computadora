package agregacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usamos un ArrayList en vez de un arreglo normal porque todavía
        // no sabemos cuántos accesorios va a elegir el usuario.
        // Al final, cuando ya sepamos el total, lo convertimos a Accesorio[]
        // (que es lo que le pide el constructor de Computadora).
        ArrayList<Accesorio> accesorios = new ArrayList<>();

        System.out.println("=== ARMA TU COMPUTADORA ===");
        System.out.print("¿Cuál es el modelo de la computadora? ");
        String modelo = sc.nextLine();

        int opcion = -1;

        // Repetimos el menú hasta que el usuario elija la opción 0 (salir)
        while (opcion != 0) {
            System.out.println("\n¿Qué accesorio quieres agregar?");
            System.out.println("1. Parlante");
            System.out.println("2. Teclado");
            System.out.println("3. Mouse");
            System.out.println("4. Monitor");
            System.out.println("0. Terminar y encender la computadora");
            System.out.print("Elige una opción: ");

            // nextInt() lee el número, pero deja un salto de línea pendiente
            // en el buffer, por eso después hay que usar sc.nextLine() extra
            // para "limpiarlo" antes de volver a leer texto.
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Marca del parlante: ");
                    String marcaParlante = sc.nextLine();
                    accesorios.add(new Parlante(marcaParlante));
                    System.out.println(" Parlante agregado.");
                    break;

                case 2:
                    System.out.print("Marca del teclado: ");
                    String marcaTeclado = sc.nextLine();
                    System.out.print("¿Es mecánico? (s/n): ");
                    boolean esMecanico = sc.nextLine().equalsIgnoreCase("s");
                    accesorios.add(new Teclado(marcaTeclado, esMecanico));
                    System.out.println(" Teclado agregado.");
                    break;

                case 3:
                    System.out.print("Marca del mouse: ");
                    String marcaMouse = sc.nextLine();
                    System.out.print("¿Cuántos DPI tiene? ");
                    int dpi = sc.nextInt();
                    sc.nextLine(); // limpiar el buffer otra vez
                    accesorios.add(new Mouse(marcaMouse, dpi));
                    System.out.println(" Mouse agregado.");
                    break;

                case 4:
                    System.out.print("Marca del monitor: ");
                    String marcaMonitor = sc.nextLine();
                    System.out.print("¿Cuántas pulgadas tiene? ");
                    int pulgadas = sc.nextInt();
                    sc.nextLine(); // limpiar el buffer otra vez
                    accesorios.add(new Monitor(marcaMonitor, pulgadas));
                    System.out.println(" Monitor agregado.");
                    break;

                case 0:
                    System.out.println("Terminando la selección de accesorios...");
                    break;

                default:
                    System.out.println(" Opción no válida, intenta de nuevo.");
            }
        }

        sc.close();

        if (accesorios.isEmpty()) {
            System.out.println("\nNo agregaste ningún accesorio. La computadora se enciende sola.");
        }

        // Aquí se arma la Computadora con TODO lo que el usuario eligió.
        Computadora pc = new Computadora(modelo, accesorios.toArray(new Accesorio[0]));

        System.out.println("\n----------------------------------------\n");
        pc.encender();
        pc.mostrarEstado();

        System.out.println("\n----------------------------------------\n");

        // Se demuestra otra vez que los accesorios sobreviven a la computadora
        pc.apagar();
        pc = null;

        System.out.println("La computadora ya no existe, pero tus accesorios siguen aquí:");
        for (Accesorio a : accesorios) {
            a.conectar();
        }
    }
}