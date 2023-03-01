package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {
    public static void main(String[] args) {
        System.out.println();
        
       Connection conn = null;
       PreparedStatement st = null;

       try{

        conn = DB.getConnection(); // conectando ao banco de dados

        st = conn.prepareStatement(
            "UPDATE seller " // comando sql para atualizar dados na table seller
            +"SET BaseSalary = BaseSalary + ? " // vai receber o que ja tinha no salario mais um valor ? que será definido
            + "WHERE " // >> ALERTA << NUNCA esquecer de colocar o WHERE tanto no UPDATE quanto no DELETE (para restringir os valores que serão alterados)
            +"(DepartmentId = ?)"); // irá alterar o salario de todos os que estiverem no departamento ? que será definido


            st.setDouble(1, 200.0); // aumentara em 200.0 o valor da primeira interrogação
            st.setInt(2, 2); // alterara apenas o salario de quem estiver no departamento 2

            int rowsAffected = st.executeUpdate(); // executa e retorna em "int" quantas linhas foram alteradas
            System.out.println("Done! Rows affected: " + rowsAffected);
       }catch(SQLException e){
        e.printStackTrace();

       }finally{
        DB.closeStatement(st);
        DB.closeConnection();
       }

    }
}
