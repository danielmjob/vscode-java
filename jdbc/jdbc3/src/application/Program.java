package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try{

            conn = DB.getConnection();
            st = conn.prepareStatement(
                "INSERT INTO seller"
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                + "VALUES "
                + "(?,?,?,?,?)",  // ? PARA CADA CAMPO QUE SERÁ PREENCHIDO DEPOIS
                Statement.RETURN_GENERATED_KEYS); // retorna a chave

                st.setString(1, "Carl Purple"); // numero da interrogação, dado
                st.setString(2, "carl@gmail.com");
                st.setDate(3, new Date(sdf.parse("22/04/1985").getTime())); // no prepereStatement DEVE SER obrigatoriament DATE do SQL
                st.setDouble(4, 3000.0);
                st.setInt(5, 4);

                int rowsAffected = st.executeUpdate(); // resulta no numero de linhas alteradas

                if (rowsAffected > 0){
                    ResultSet rs = st.getGeneratedKeys(); // retorna um objeto do tipo ResulSet com o valor da chave alterada
                    
                    // nesse caso não seria obrigatório o while pois esta sendo alterado apenas um vendedor que so resultaria e uma chave, porem ja esta sendo implementado casos onde seja inserido mais de um
                    while(rs.next()){
                        int id = rs.getInt(1); // pega o valor da primeira coluna (1)
                        System.out.println("Done! Id = " + id);
                    }
                }
                else{
                    System.out.println("No rows affected");
                }

                System.out.println("Done! Rows affected: " + rowsAffected); // mostra quantas linhas foram alteradas

        }catch(SQLException e){
            e.printStackTrace();

        }catch(ParseException e){
            e.printStackTrace();
        }finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
       
    }
}
