package application;

import java.sql.Connection;

import db.DB;

public class Program {
    public static void main(String[] args) {
        System.out.println();
        
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
