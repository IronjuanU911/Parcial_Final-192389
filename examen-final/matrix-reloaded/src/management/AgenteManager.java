package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.util.ArrayList;

public class AgenteManager {
    private ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente);
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        ConsoleUtils.clean_terminal();        while (continuar) {
            ConsoleUtils.clean_terminal();
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Generar reporte agentes");
            System.out.println("4. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

            switch (opcion) {
                case 1 -> registrarAgente();
                case 2 -> mostrarAgentes();
                case 3 -> generar_reporte_agente();
                case 4 -> {continuar = false;}
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    public void generar_reporte_agente(){
        int cantidad_agentes = agentes.size();
        for (int i = 0;cantidad_agentes >= i;i++){
            Agente agente = agentes.get(i);
            System.out.println("Nombre: " + agente.getNombre() + "Misiones: " + agente.generarReporte());
        }
    }
}