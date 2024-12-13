package utils;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void limpiarBuffer() {
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Consumir el salto de línea sobrante
        }
    }

    public static void clean_terminal() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Borrar consola windows
        } catch (IOException | InterruptedException e) {
            System.out.print("\033[H\033[2J"); //Borrar consola linux
            System.out.flush();
        }
            //Los de mac se pueden joder :D
    }
}
