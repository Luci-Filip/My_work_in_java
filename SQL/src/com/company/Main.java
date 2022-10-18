package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Calea catre fisierul care va stoca baza de date. In cazul in care nu exista, acesta va fi creat.
        String cale = "C:\\Users\\user\\IdeaProjects\\SQL";//"D:\\Projects\\Wellcode\\GetHired\\db.sql";
        // In cazul in care folosesti OS X sau Linux, va arata in genul "/home/user/tutorial/db.sql"
        String url = "jdbc:sqlite:" + cale;
        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("conectat cu succes");
            String query = "SELECT 1+1 AS result";
            Statement statement = connection.createStatement();
            System.out.println(statement.executeQuery(query).getInt("result")); // va afisa 2
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
