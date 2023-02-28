package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    // Classe para carregar as propriedades para conexão e desconexão com Banco de Dados

    private static Connection conexao = null; // inicia conexão com valor nulo mostrando que não existe conexão ativa


    // carregando o arquivo com as propriedades da conexão
    private static Properties carregarPropriedades() { // Método "PRIVADO" pois só poderá ser usado dentro da classe

        try (FileInputStream fs = new FileInputStream("db.properties")) { // aqui é chamado o arquivo
            Properties propriedades = new Properties(); // aqui instanciada a classe propriedades
            propriedades.load(fs); // faz a leitura do arquivo FileInputStream
            return propriedades; 

        } catch (IOException e) {

            throw new DbException(e.getMessage()); // lança a exceção que foi criada

        }

    }


    // conectando ao Banco de Dados
    public static Connection abrirConexao(){

        if (conexao == null){
            try{
                Properties propriedades = carregarPropriedades(); // carregando as propriedades da conexão
                String url = propriedades.getProperty("dburl"); // salvando o caminho para o banco - tem que estar igual ao arquivo db.propriedades
                conexao = DriverManager.getConnection(url, propriedades);// driver para conexão com banco recebe a url e o arquivo com os outros dados da conexão
            }catch(SQLException e){
                throw new DbException(e.getMessage());
            }
            
        }

        return conexao;

    }


    // fechando a conexão com Banco de Dados
    public static void fecharConexao(){
        
        if (conexao !=null){

            try {
                conexao.close(); // fecha a conexão
            } catch (SQLException e) {
               throw new DbException(e.getMessage());
            }

        }
    }


    
}
