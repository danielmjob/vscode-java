package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        Connection conn = null;
        PreparedStatement st = null;

        try {

            conn = DB.getConnection(); // conectando ao banco de dados

            st = conn.prepareStatement(
                    "DELETE FROM department " // comando sql para atualizar dados na table seller
                            + "WHERE " // >> ALERTA << NUNCA esquecer de colocar o WHERE tanto no DELETE quanto no
                                       // UPDATE (para restringir os valores que serão alterados)
                            + "Id = ?");

            st.setInt(1, 2); // apagará departmento que estiver com Id 5 - so ocorrerá se o departmento
                             // estiver vazio
            /*
             * acima apliquei propositalmente um departmento onde a pessoas cadastradas,
             * assim ele gera uma exceção
             * 
             * Exception in thread "main" db.DbIntegrityException: Cannot delete or update a
             * parent row: a foreign key constraint
             * fails (`coursejdbc`.`seller`, CONSTRAINT `seller_ibfk_1` FOREIGN KEY
             * (`DepartmentId`) REFERENCES `department` (`Id`))
             * at application.Program.main(Program.java:38)
             * 
             */

            int rowsAffected = st.executeUpdate(); // executa e retorna em "int" quantas linhas foram alteradas

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
