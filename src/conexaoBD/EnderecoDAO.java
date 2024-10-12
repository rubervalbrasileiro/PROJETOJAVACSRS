/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.Cliente;
import models.Endereco;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia Brasileiro
 */
public class EnderecoDAO {
    private Connection conn;
    
    public EnderecoDAO() {
        // Usa a classe Conexao para estabelecer a conexão
    
    Conexao conexao = new Conexao();
        if (conexao.conectar()) {
            this.conn = conexao.getConnection();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
        }
}
    // Construtor que recebe a conexão como parâmetro
    public EnderecoDAO(Connection conn) {
        this.conn = conn;
    }
    
    // Método para buscar Endereço pelo ID
    public boolean atualizarEndereco(Endereco endereco, int idEndereco) {
    String sql = "UPDATE endereco SET logradouro = ?, complemento = ?, bairro = ?, cidade = ?, cep = ?, uf = ? WHERE id_endereco = ?";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, endereco.getLogradouro());
        stmt.setString(2, endereco.getComplemento());
        stmt.setString(3, endereco.getBairro());
        stmt.setString(4, endereco.getCidade());
        stmt.setString(5, endereco.getCep());
        stmt.setString(6, endereco.getUf());
        stmt.setInt(7, idEndereco);
        
        int rowsUpdated = stmt.executeUpdate();
        return rowsUpdated > 0; // Retorna true se a atualização foi bem-sucedida
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar endereço: " + e.getMessage());
        return false;
    }
}

    
     // Método para buscar Endereço pelo ID
    public Endereco obterEnderecoPorId(int idEndereco) {
    Endereco endereco = null;
    String sql = "SELECT * FROM endereco WHERE id_endereco = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, idEndereco);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            endereco = new Endereco();
            endereco.setId_endereco(rs.getInt("id_endereco"));
            endereco.setLogradouro(rs.getString("logradouro"));
            endereco.setComplemento(rs.getString("complemento"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCidade(rs.getString("cidade"));
            endereco.setCep(rs.getString("cep"));
            endereco.setUf(rs.getString("uf"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar endereço: " + e.getMessage());
    }

    return endereco;
}

        public static void main(String[]args){
              Conexao conexao = new Conexao();

        // Tente conectar ao banco de dados
        if (conexao.conectar()) {
            System.out.println("Conexão com o banco de dados foi estabelecida com sucesso!");

            // Realize uma consulta simples para testar a comunicação
            try {
                Statement st = conexao.getConnection().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM endereco");

                // Exiba os resultados
                while (rs.next()) {
                    System.out.println(", Id_Endereco: " + rs.getString("Id_Endereco" 
                                    + ", Logradouro : " + rs.getString("Logradouro")
                                    + ", Complemento : " + rs.getString("Complemento")
                                    + ", Bairro : " + rs.getString("Bairro")
                                    + ", Cidade : " + rs.getString("Cidade")
                                    + ", Cep : " + rs.getString("Cep")
                                    + ", UF : " + rs.getString("UF")
                            )
                    );
                }

            } catch (SQLException e) {
                System.out.println("Erro ao realizar consulta: " + e.getMessage());
            } finally {
                // Desconecte do banco de dados
                conexao.desconectar();
            }
        } else {
            System.out.println("Não foi possível conectar ao banco de dados.");
        }
    }
    
    
}
