package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        Connection conn = null;
        Statement st = null;

        try {

            conn = DB.getConnection(); // conectando ao banco de dados

            conn.setAutoCommit(false); // evita que as operações sejam confirmadas automaticamente

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");


            // Gerando um erro propositalmente durante o processo
            // Dessa forma o programa vai quebrar porem mas devido ao uso de (setAutoCommit, commit e rollback) o promagam não executará nada

            int x = 1;
            if (x < 2){
                throw new SQLException("FAKE ERROR");
            }

            
            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);

            conn.commit(); // colocado no final para que so sejam feitas as alterações se tudo tiver dado certo

        } catch (SQLException e) {
            try {

                conn.rollback(); // em caso de algum erro (exception) desfaça tudo ou seja volte para o modo original
                throw new DbException("Trasaction rolled back! Caused by: " + e.getMessage());

            } catch (SQLException e1) {
                throw new DbException("Erro trying to rollback! Caused by:" + e1.getMessage());
            } 

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
