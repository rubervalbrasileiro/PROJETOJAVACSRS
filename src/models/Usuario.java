
package models;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AQUI TEM
 */
public class Usuario {
    private String usuario;
    private String senha;
    private static List<Usuario> usuarios = new ArrayList<>();   // Lista para armazenar os usuários

    public Usuario() {
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // Método para adicionar um usuário
    public static void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    // Método para remover um usuário
    public static void removerUsuario(String nome) {
         usuarios.removeIf(u -> u.getUsuario().equalsIgnoreCase(nome));
    }
    
    // Método para editar um usuário
    public static void editarUsuario(String usuario, String novaSenha) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equalsIgnoreCase(usuario)) {
                u.setSenha(novaSenha);
                break;
            }
        }
    }
    
     // Método para listar todos os usuários
    public static List<Usuario> listarUsuarios() {
        return usuarios; 
    } 
}
