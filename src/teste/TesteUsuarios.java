
package teste;
import models.Usuario;
/**
 *
 * @author AQUI TEM
 */
public class TesteUsuarios {
    public static void main(String[] args) {
        // Criando instâncias de usuários
        Usuario user1 = new Usuario("Kelly", "12345rs");
        Usuario user2 = new Usuario("Rubinho", "zyz");
        Usuario user3 = new Usuario("Pedro", "2009-03-17");

        // Adicionando usuários à lista
        Usuario.adicionarUsuario(user1);
        Usuario.adicionarUsuario(user2);
        Usuario.adicionarUsuario(user3);
        System.out.println("");

        // Listando usuários
        System.out.println("Usuários após adição:");
        for (Usuario u : Usuario.listarUsuarios()) {
            System.out.println("Nome: " + u.getUsuario() + ", Senha: " + u.getSenha());
            System.out.println("Adionado com sucesso\n");
        }

        // Editando senha de um usuário
        Usuario.editarUsuario("admin", "novaSenhaAdmin");
        System.out.println("\nUsuário após edição de senha:\n");
        for (Usuario u : Usuario.listarUsuarios()) {
            System.out.println("Nome: " + u.getUsuario() + ", Senha: " + u.getSenha());
        }

        // Removendo um usuário
        Usuario.removerUsuario("operador");
        System.out.println("Usuários após remoção:");
        for (Usuario u : Usuario.listarUsuarios()) {
            System.out.println("Nome: " + u.getUsuario() + ", Senha: " + u.getSenha());
            System.out.println("foi removido com sucesso\n");
        }
    
    }
}
