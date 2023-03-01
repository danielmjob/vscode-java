package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection(); // conectando ao banco de dados

            st = conn.createStatement(); // instanciando um objeto do tipo Statement

            rs = st.executeQuery("select * from department"); // comando para poder executar comandos SQL

            while (rs.next()) { // o next() retorna falso se caso estiver no ultimo
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); // deve estar com mesno nome que esta
                                                                                   // no banco de dados
            }

        }
        catch (SQLException e) {
            
            e.printStackTrace();

        }
        finally{

            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
