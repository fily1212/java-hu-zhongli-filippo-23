package com.engim.dbesempio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaRepository {

    static final String DB_URL = "jdbc:mysql://localhost:3306/java";
    static final String USER = "java";
    static final String PASS = "java";
    public static void select(){
        try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nome, cognome, email FROM persona");

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", nome: " + rs.getString("nome"));
                System.out.print(", cognome: " + rs.getString("cognome"));
                System.out.println(", email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        select();
    }

    public static List<Persona> getPersone() {
        List<Persona> persone = new ArrayList<>();
        try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nome, cognome, email FROM persona");

            // Extract data from result set
            while (rs.next()) {
                persone.add(
                        new Persona(
                                rs.getInt("id"),
                                rs.getString("nome"),
                                rs.getString("cognome"),
                                rs.getString("email")));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persone;

    }
}
