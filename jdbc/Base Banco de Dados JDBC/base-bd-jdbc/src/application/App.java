package application;

import java.sql.Connection;

import db.DB;

public class App {
    public static void main(String[] args) {

        // Observação: ao criar novo projeto sempre lembrar de carregar a biblioteca de conexão do MySQL (C:\Program Files (x86)\MySQL\Connector J 8.0)
        
        System.out.println();

        Connection conexao = DB.abrirConexao(); // abrindo uma conexão com Banco de Dados
        DB.fecharConexao(); // encerrando a conexão com o Banco de Dados
    }
}
