/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import conexaoBD.Conexao;

/**
 * Classe responsável pela Conexão com o Banco de Dados Vs1 - Ultima atualização
 * 13/09/24
 *
 * @author Ruberval Brasileiro
 */
public class TesteConexao {
    public static void main(String[]args){
  // Cria uma instância da classe Conexao
        Conexao conexao = new Conexao();
        
        // Tenta conectar ao banco de dados
        if (conexao.conectar()) {
            System.out.println("Teste de conexão bem-sucedido!");
            
            // Realiza operações, se necessário (aqui já tem a verificação da quantidade de clientes na classe Conexao)
            
            // Desconecta do banco de dados
            conexao.desconectar();
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }
    }

}