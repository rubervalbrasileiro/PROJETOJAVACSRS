package conexaoBD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 * Classe responsável pela Conexão com o Banco de Dados Vs1 - Ultima atualização
 * 13/09/24
 *
 * @author Ruberval Brasileiro
 */
public class Conexao {

    private Connection conn; //criando um objeto do tipo connection chamado conn
    private Statement st;    //criando um objeto do tipo Statement chamado st para  execução de comando SQL

    private String url = "jdbc:mysql://localhost:3306/csrs"; // nome do banco de dados
    private String user = "root"; // usuario
    private String password = "#SENAC986525"; //senha do MySQL

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Carrega o driver MySQL
            conn = DriverManager.getConnection(url, user, password); // Estabelece a conexão
            System.out.println("Conexão realizada com sucesso");

            // Executa uma consulta simples para verificar a conexão
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM cliente");
            if (rs.next()) {
                System.out.println("Clientes cadastrados: " + rs.getInt(1));
            }
            return true; // Conexão realizada com sucesso
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco: " + ex.getMessage());
            return false; // Falha na conexão
        }
    }
// Método para obter a conexão atual

    public Connection getConnection() {
        return conn;
    }

    // Método para desconectar do banco de dados
    public void desconectar() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexão fechada com sucesso.");
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
    }
}
