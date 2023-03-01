package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                + "(?,?,?,?,?)"); // ? PARA CADA CAMPO QUE SERÁ PREENCHIDO DEPOIS

                st.setString(1, "Carl Purple"); // numero da interrogação, dado
                st.setString(2, "carl@gmail.com");
                st.setDate(3, new Date(sdf.parse("22/04/1985").getTime())); // no prepereStatement DEVE SER obrigatoriament DATE do SQL
                st.setDouble(4, 3000.0);
                st.setInt(5, 4);

                int rowsAffected = st.executeUpdate(); // resulta no numero de linhas alteradas

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
