package conexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Cliente;
import models.Endereco;

/**
 *
 * @author AQUI TEM
 */

    public class ClienteDAO {

    private Connection conn;

    public ClienteDAO() {
        // Usa a classe Conexao para estabelecer a conexão
        Conexao conexao = new Conexao();
        if (conexao.conectar()) {
            this.conn = conexao.getConnection();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
        }
    }

   public boolean atualizarCliente(Cliente cliente, Endereco endereco) {
    String sqlCliente = "UPDATE cliente SET cod_cliente = ?, status_cliente = ?, nome_cliente = ?, apelido_cliente = ?, celular = ?, celular_whatsapp = ?, data_nasc = ?, estado_civil = ?, nome_mae = ?, nome_pai = ?, cpf_cliente = ?, rg_cliente = ?, cartao_sus = ?, titulo_eleitoral = ?, secao_eleitoral = ?, zona_eleitoral = ?, data_cadastro = ?, observacao = ? WHERE id_cliente = ?";
    
    String sqlEndereco = "UPDATE endereco SET logradouro = ?, bairro = ?, complemento = ?, cidade = ?, cep = ?, uf = ? WHERE id_endereco = ?";

    try {
        // Iniciando a transação
        conn.setAutoCommit(false);

        // Atualizando dados do cliente
        try (PreparedStatement stmtCliente = conn.prepareStatement(sqlCliente)) {
            stmtCliente.setInt(1, cliente.getCod_Cliente());
            stmtCliente.setString(2, cliente.getStatus_Cliente());
            stmtCliente.setString(3, cliente.getNome_Cliente());
            stmtCliente.setString(4, cliente.getApelido_Cliente());
            stmtCliente.setString(5, cliente.getCelular());
            stmtCliente.setString(6, cliente.getCelular_Whatsapp());
            stmtCliente.setString(7, cliente.getData_Nasc());
            stmtCliente.setString(8, cliente.getEstado_Civil());
            stmtCliente.setString(9, cliente.getNome_Mae());
            stmtCliente.setString(10, cliente.getNome_Pai());
            stmtCliente.setString(11, cliente.getCpf_Cliente());
            stmtCliente.setString(12, cliente.getRG_Cliente());
            stmtCliente.setString(13, cliente.getCartao_Sus());
            stmtCliente.setString(14, cliente.getTitulo_Eleitoral());
            stmtCliente.setString(15, cliente.getSecao_Eleitoral());
            stmtCliente.setString(16, cliente.getZona_Eleitoral());
            stmtCliente.setString(17, cliente.getData_Cadastro());
            stmtCliente.setString(18, cliente.getObservacao());
            stmtCliente.setInt(19, cliente.getId_cliente());

            int rowsUpdatedCliente = stmtCliente.executeUpdate(); // Executa a atualização do cliente
        }

        // Atualizando dados do endereço
        try (PreparedStatement stmtEndereco = conn.prepareStatement(sqlEndereco)) {
            stmtEndereco.setString(1, endereco.getLogradouro());
            stmtEndereco.setString(2, endereco.getBairro());
            stmtEndereco.setString(3, endereco.getComplemento());
            stmtEndereco.setString(4, endereco.getCidade());
            stmtEndereco.setString(5, endereco.getCep());
            stmtEndereco.setString(6, endereco.getUf());
            stmtEndereco.setInt(7, endereco.getId_endereco());

            int rowsUpdatedEndereco = stmtEndereco.executeUpdate(); // Executa a atualização do endereço
        }

        // Se ambas as atualizações foram bem-sucedidas, confirma a transação
        conn.commit();
        return true;
    } catch (SQLException e) {
        try {
            conn.rollback(); // Reverte a transação em caso de erro
        } catch (SQLException rollbackEx) {
            JOptionPane.showMessageDialog(null, "Erro ao reverter a transação: " + rollbackEx.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente e endereço: " + e.getMessage());
        return false;
    } finally {
        try {
            conn.setAutoCommit(true); // Garante que o auto-commit seja ativado novamente
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao reativar auto-commit: " + ex.getMessage());
        }
    }
}


    
    public Cliente getClientePorId(int idCliente) {
        
        String sql = "SELECT c.*, e.* FROM cliente c INNER JOIN endereco e ON c.id_endereco = e.id_endereco WHERE c.id_cliente = ?";
        Cliente cliente = null;
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                // Popula o objeto cliente com os dados
                cliente.setCod_Cliente(rs.getInt("Cod_Cliente"));
                cliente.setStatus_Cliente(rs.getString("Status_Cliente"));
                cliente.setNome_Cliente(rs.getString("Nome_Cliente"));
                cliente.setApelido_Cliente(rs.getString("Apelido_Cliente"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setCelular_Whatsapp(rs.getString("Celular_Whatsapp"));
                cliente.setData_Nasc(rs.getString("Data_Nasc"));
                cliente.setEstado_Civil(rs.getString("Estado_Civil"));
                cliente.setNome_Mae(rs.getString("Nome_Mae"));
                cliente.setNome_Pai(rs.getString("Nome_Pai"));
                cliente.setCpf_Cliente(rs.getString("CPF_Cliente"));
                cliente.setRG_Cliente(rs.getString("RG_Cliente"));
                cliente.setCartao_Sus(rs.getString("Cartao_Sus"));
                cliente.setTitulo_Eleitoral(rs.getString("Titulo_Eleitoral"));
                cliente.setSecao_Eleitoral(rs.getString("Secao_Eleitoral"));
                cliente.setZona_Eleitoral(rs.getString("Zona_Eleitoral"));
                cliente.setData_Cadastro(rs.getString("Data_Cadastro"));
                cliente.setObservacao(rs.getString("Observacao"));
                cliente.setId_endereco(rs.getInt(idCliente));
                // Dados do endereço
                Endereco endereco = new Endereco();
                endereco.setLogradouro(rs.getString("Logradouro"));
                endereco.setLogradouro(rs.getString("Complemento"));
                endereco.setLogradouro(rs.getString("Bairro"));
                endereco.setLogradouro(rs.getString("Cidade"));
                endereco.setLogradouro(rs.getString("CEP"));
                endereco.setLogradouro(rs.getString("UF"));
                
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + e.getMessage());
        }

        return cliente;
    }

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + ex.getMessage());
        }
    }

    
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        // Tente conectar ao banco de dados
        if (conexao.conectar()) {
            System.out.println("Conexão com o banco de dados foi estabelecida com sucesso!");

            // Realize uma consulta simples para testar a comunicação
            try {
                Statement st = conexao.getConnection().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM cliente");

                // Exiba os resultados
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id_cliente") + ", Cod_cliente: " + rs.getInt("Cod_cliente") 
                            + ", Status_Cliente: " + rs.getString("Status_Cliente") + ", Nome: " + rs.getString("nome_cliente")
                            + ", Apelido_Cliente: " + rs.getString("Apelido_Cliente") + ", Celular: " + rs.getString("Celular")
                            + ",Celular_Whatsapp : " + rs.getString("Celular_Whatsapp") + ",Data_Nasc : " + rs.getString("Data_Nasc")
                            + ", Estado_Civil: " + rs.getString("Estado_Civil") + ", Nome_Mae: " + rs.getString("Nome_Mae")
                            + ", Nome_Pai: " + rs.getString("Nome_Pai")
                            + ", CPF_Cliente: " + rs.getString("CPF_Cliente") + ", RG_Cliente: " + rs.getString("RG_Cliente")
                            + ",Cartao_Sus: " + rs.getString("Cartao_Sus") + ", Titulo_Eleitoral: " + rs.getString("Titulo_Eleitoral")
                            + ", Secao_Eleitoral: " + rs.getString("Secao_Eleitoral") + ", Zona_Eleitoral: " + rs.getString("Zona_Eleitoral")
                            + ", Data_Cadastro: " + rs.getString("Data_Cadastro")
                            + ", Obsevacao: " + rs.getString("Observacao")
                            + ", Id_Endereco: " + rs.getString("Id_Endereco"
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

    public boolean adicionarCliente(Cliente cliente) {
            String sql = "INSERT INTO cliente (Cod_Cliente, Status_Cliente, Nome_Cliente, Apelido_Cliente, Celular, Celular_Whatsapp, "
                    + "Data_Nasc, Estado_Civil, Nome_Mae, Nome_Pai, CPF_Cliente, RG_Cliente, Cartao_Sus, Titulo_Eleitoral, Secao_Eleitoral, "
                    + "Zona_Eleitoral, Data_Cadastro, Observacao,id_endereco)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, cliente.getCod_Cliente());
                stmt.setString(2, cliente.getStatus_Cliente());
                stmt.setString(3, cliente.getNome_Cliente());
                stmt.setString(4, cliente.getApelido_Cliente());
                stmt.setString(5, cliente.getCelular());
                stmt.setString(6, cliente.getCelular_Whatsapp());
                stmt.setString(7, cliente.getData_Nasc());
                stmt.setString(8, cliente.getEstado_Civil());
                stmt.setString(9, cliente.getNome_Mae());
                stmt.setString(10, cliente.getNome_Pai());
                stmt.setString(11, cliente.getCpf_Cliente());
                stmt.setString(12, cliente.getRG_Cliente());
                stmt.setString(13, cliente.getCartao_Sus());
                stmt.setString(14, cliente.getTitulo_Eleitoral());
                stmt.setString(15, cliente.getSecao_Eleitoral());
                stmt.setString(16, cliente.getZona_Eleitoral());
                stmt.setString(17, cliente.getData_Cadastro());
                stmt.setString(18, cliente.getObservacao());
                stmt.setInt(19, cliente.getId_endereco());

                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }

    public List<Cliente> listarClientes() {
        List<Cliente> listar = new ArrayList<>();
        String sql = "SELECT * FROM cliente";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setCod_Cliente(rs.getInt("cod_Cliente"));
                cliente.setStatus_Cliente(rs.getString("status_Cliente"));
                cliente.setNome_Cliente(rs.getString("nome_Cliente"));
                cliente.setApelido_Cliente(rs.getString("apelido_Cliente"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCelular_Whatsapp(rs.getString("celular_Whatsasap"));
                cliente.setData_Nasc(rs.getString("data_Nasc"));
                cliente.setEstado_Civil(rs.getString("estado_Civil"));
                cliente.setNome_Mae(rs.getString("nome_Mae"));
                cliente.setNome_Pai(rs.getString("nome_Pai"));
                cliente.setCpf_Cliente(rs.getString("cpf_Cliente"));
                cliente.setRG_Cliente(rs.getString("RG_Cliente"));
                cliente.setCartao_Sus(rs.getString("cartao_Sus"));
                cliente.setTitulo_Eleitoral(rs.getString("titulo_Eleitoral"));
                cliente.setSecao_Eleitoral(rs.getString("secao_Eleitoral"));
                cliente.setZona_Eleitoral(rs.getString("zona_Eleitoral"));
                cliente.setData_Cadastro(rs.getString("data_Cadastro"));
                cliente.setObservacao(rs.getString("Observacao"));
                cliente.setId_endereco(rs.getInt("id_endereco"));
                listar.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listar;
    }

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


    public boolean inativarCliente(int idCliente) {
        String sql = "UPDATE cliente SET status_Cliente = 'inativo' WHERE id_cliente = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente); // Define o ID do cliente que será inativado
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // Retorna true se a atualização foi bem-sucedida
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Cliente> listarClientesAtivos() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE status_Cliente = 'inativo'";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                // Popule o objeto cliente com os dados do ResultSet...
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public Cliente obterClientePorId(int idCliente) {
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        Cliente cliente = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setCod_Cliente(rs.getInt("Cod_Cliente"));
                cliente.setStatus_Cliente(rs.getString("Status_Cliente"));
                cliente.setNome_Cliente(rs.getString("Nome_Cliente"));
                cliente.setApelido_Cliente(rs.getString("Apelido_Cliente"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setCelular_Whatsapp(rs.getString("Celular_Whatsapp"));
                cliente.setData_Nasc(rs.getString("Data_Nasc"));
                cliente.setEstado_Civil(rs.getString("Estado_Civil"));
                cliente.setNome_Mae(rs.getString("Nome_Mae"));
                cliente.setNome_Pai(rs.getString("Nome_Pai"));
                cliente.setCpf_Cliente(rs.getString("CPF_Cliente"));
                cliente.setRG_Cliente(rs.getString("RG_Cliente"));
                cliente.setCartao_Sus(rs.getString("Cartao_Sus"));
                cliente.setTitulo_Eleitoral(rs.getString("Titulo_Eleitoral"));
                cliente.setSecao_Eleitoral(rs.getString("Secao_Eleitoral"));
                cliente.setZona_Eleitoral(rs.getString("Zona_Eleitoral"));
                cliente.setData_Cadastro(rs.getString("Data_Cadastro"));
                cliente.setId_endereco(rs.getInt("id_endereco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public Cliente obterClientePorNome(String nomeCliente) {
        String sql = "SELECT * FROM cliente WHERE nome_cliente = ?";
        Cliente cliente = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeCliente);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setCod_Cliente(rs.getInt("Cod_Cliente"));
                cliente.setStatus_Cliente(rs.getString("Status_Cliente"));
                cliente.setNome_Cliente(rs.getString("Nome_Cliente"));
                cliente.setApelido_Cliente(rs.getString("Apelido_Cliente"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setCelular_Whatsapp(rs.getString("Celular_Whatsapp"));
                cliente.setData_Nasc(rs.getString("Data_Nasc"));
                cliente.setEstado_Civil(rs.getString("Estado_Civil"));
                cliente.setNome_Mae(rs.getString("Nome_Mae"));
                cliente.setNome_Pai(rs.getString("Nome_Pai"));
                cliente.setCpf_Cliente(rs.getString("CPF_Cliente"));
                cliente.setRG_Cliente(rs.getString("RG_Cliente"));
                cliente.setCartao_Sus(rs.getString("Cartao_Sus"));
                cliente.setTitulo_Eleitoral(rs.getString("Titulo_Eleitoral"));
                cliente.setSecao_Eleitoral(rs.getString("Secao_Eleitoral"));
                cliente.setZona_Eleitoral(rs.getString("Zona_Eleitoral"));
                cliente.setData_Cadastro(rs.getString("Data_Cadastro"));
                cliente.setId_endereco(rs.getInt("id_endereco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public Cliente obterClientePorCPF(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf_cliente = ?";
        Cliente cliente = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setCod_Cliente(rs.getInt("Cod_Cliente"));
                cliente.setStatus_Cliente(rs.getString("Status_Cliente"));
                cliente.setNome_Cliente(rs.getString("Nome_Cliente"));
                cliente.setApelido_Cliente(rs.getString("Apelido_Cliente"));
                cliente.setCelular(rs.getString("Celular"));
                cliente.setCelular_Whatsapp(rs.getString("Celular_Whatsapp"));
                cliente.setData_Nasc(rs.getString("Data_Nasc"));
                cliente.setEstado_Civil(rs.getString("Estado_Civil"));
                cliente.setNome_Mae(rs.getString("Nome_Mae"));
                cliente.setNome_Pai(rs.getString("Nome_Pai"));
                cliente.setCpf_Cliente(rs.getString("CPF_Cliente"));
                cliente.setRG_Cliente(rs.getString("RG_Cliente"));
                cliente.setCartao_Sus(rs.getString("Cartao_Sus"));
                cliente.setTitulo_Eleitoral(rs.getString("Titulo_Eleitoral"));
                cliente.setSecao_Eleitoral(rs.getString("Secao_Eleitoral"));
                cliente.setZona_Eleitoral(rs.getString("Zona_Eleitoral"));
                cliente.setData_Cadastro(rs.getString("Data_Cadastro"));
                cliente.setId_endereco(rs.getInt("id_endereco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }
}
