package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        Connection conn = null;
        Statement st = null;

        try {

            conn = DB.getConnection(); // conectando ao banco de dados

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            System.out.println("rows1 " + rows1);

            // Gerando um erro propositalmente durante o processo
            // Dessa forma o programa vai quebrar porem terá executado uma parte e a outra não

            int x = 1;
            if (x < 2){
                throw new SQLException("FAKE ERROR");
            }

            System.out.println("rows2 " + rows2);

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
