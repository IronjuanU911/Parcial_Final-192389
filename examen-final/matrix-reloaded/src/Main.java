import management.*;
import utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        ConsoleUtils.clean_terminal();
        boolean _continue = true;
        String warning = "";
        while (_continue){
            System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
            System.out.println("Elige una píldora para continuar:");
            System.out.println("1. Píldora Roja: Agentes de la Resistencia");
            System.out.println("2. Píldora Azul: Control de Anomalías");
            System.out.println("3. Salir");
            
            int opcion = ConsoleUtils.leerEntero(warning + "Selecciona una opción (1 o 3): ");
    
            if (opcion == 1) {
                AgenteManager agenteManager = new AgenteManager();
                agenteManager.mostrarMenu();
            } else if (opcion == 2) {
                AnomaliaManager anomaliaManager = new AnomaliaManager();
                anomaliaManager.mostrarMenu();
            } else if (opcion == 3){
                _continue = false;
            } else {
                warning = "Opción no válida. ";
                
            }
            warning = "";
            ConsoleUtils.clean_terminal();
        }
        
    }

    /*
     * Requerimiento 5 escojido
     */


}




