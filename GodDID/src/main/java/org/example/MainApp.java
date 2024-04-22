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

        FileAccessor fileAccessor;
        try {
            fileAccessor = new FileAccessor();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            return;
        }

        Menu menu = new Menu(fileAccessor);
        menu.mostrarMenu();

        fileAccessor.closeConnection();
    }
}

