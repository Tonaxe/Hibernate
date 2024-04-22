package org.example;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private FileAccessor fileAccessor;

    public Menu(FileAccessor fileAccessor) {
        this.fileAccessor = fileAccessor;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:");
            System.out.println("1. Cargar datos desde archivos a la base de datos");
            System.out.println("2. Mostrar datos desde la base de datos");
            System.out.println("3. Mostrar datos de la tabla Match");
            System.out.println("4. Mostrar datos de la tabla Team");
            System.out.println("5. Mostrar datos de la tabla Player");
            System.out.println("6. Mostrar datos de la tabla Plays");
            System.out.println("7. Borrar todos los datos de todas las tablas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        cargarDatos();
                    } catch (IOException | SQLException e) {
                        System.err.println("Error al cargar los datos: " + e.getMessage());
                    }
                    break;
                case 2:
                    mostrarTodosLosDatos();
                    break;
                case 3:
                    mostrarMatch();
                    break;
                case 4:
                    mostrarTeam();
                    break;
                case 5:
                    mostrarPlayer();
                    break;
                case 6:
                    mostrarPlays();
                    break;
                case 7:
                    try {
                        borrarDatos();
                    } catch (SQLException e) {
                        System.err.println("Error al borrar los datos: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private void cargarDatos() throws IOException, SQLException {
        fileAccessor.readTeamsFile("team.txt");
        fileAccessor.readMatchesFile("match.txt");
        fileAccessor.readPlayersFile("player.txt");
        fileAccessor.readPlaysFile("plays.txt");
        System.out.println("Datos cargados correctamente en la base de datos.");
    }

    public void mostrarTodosLosDatos() {
        System.out.println("Datos de la tabla Teams:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM team");

        System.out.println("\nDatos de la tabla Matches:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM match");

        System.out.println("\nDatos de la tabla Players:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM player");

        System.out.println("\nDatos de la tabla Plays:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM plays");
    }

    public void mostrarMatch() {
        System.out.println("Datos de la tabla Match:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM match");
    }

    public void mostrarPlayer() {
        System.out.println("Datos de la tabla Player:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM player");
    }

    public void mostrarPlays() {
        System.out.println("Datos de la tabla Plays:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM plays");
    }

    public void mostrarTeam() {
        System.out.println("Datos de la tabla Team:");
        fileAccessor.mostrarDatosTabla("SELECT * FROM team");
    }

    private void borrarDatos() throws SQLException {
        fileAccessor.borrarDatos();
        System.out.println("Todos los datos han sido borrados de todas las tablas.");
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
