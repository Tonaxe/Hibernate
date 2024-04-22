package org.example;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.sql.SQLException;

public class MainApp {
    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        // Crear una instancia de FileAccessor para manejar las operaciones con la base de datos
        FileAccessor fileAccessor;
        try {
            fileAccessor = new FileAccessor();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            return;
        }

        // Mostrar el menú y ejecutar las acciones según la selección del usuario
        Menu menu = new Menu(fileAccessor);
        menu.mostrarMenu();

        // Cerrar la conexión al finalizar
        fileAccessor.closeConnection();
    }
}

