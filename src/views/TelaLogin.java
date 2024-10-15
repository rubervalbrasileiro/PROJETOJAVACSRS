
package views;

import conexaoBD.Conexao;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**Tela de Loging Projeto CSRS
 *Vs.1 Finalizada 15/10/24
 * @author Ruberval Brasileiro
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(white);

        //usuario.put("admin", new Usuario("Kelly", "12345rs", "Administrador"));
        // usuarios.put("operador", new Usuario("operador", "1234", "Operador"));
        //usuarios.put("usuario", new Usuario("usuario", "1234", "Usuário"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblUsuarioImag = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblSenhaImag = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnAcessar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(870, 570));
        setMinimumSize(new java.awt.Dimension(870, 570));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoRSRS.png"))); // NOI18N
        lblLogo.setToolTipText("Logo do Centro Sociar");
        lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 420, 320));

        jPanel1.setBackground(new java.awt.Color(140, 197, 61));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        lblUsuarioImag.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuarioImag.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblUsuarioImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario.png"))); // NOI18N

        txtUsuario.setToolTipText("Digite o Usuário");
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUsuario.setNextFocusableComponent(pswSenha);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblSenha.setText("Senha");

        lblSenhaImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chave.png"))); // NOI18N

        pswSenha.setToolTipText("Informe a Senha");
        pswSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pswSenha.setNextFocusableComponent(btnAcessar);
        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });

        btnAcessar.setBackground(new java.awt.Color(255, 255, 255));
        btnAcessar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(140, 197, 61));
        btnAcessar.setText("ACESSAR");
        btnAcessar.setToolTipText("Botão Acessar");
        btnAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        btnAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAcessarKeyPressed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(140, 197, 61));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setToolTipText("Botão Acessar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsuarioImag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addGap(143, 143, 143))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblSenhaImag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAcessar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(btnCadastrar)))
                            .addGap(38, 38, 38)))
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioImag)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenhaImag)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(75, 75, 75))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 490));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(185, 157, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BR Software   ");

        lblData.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(185, 157, 55));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("Data");
        lblData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 157, 55), null, null));
        lblData.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDataAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblHora.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(185, 157, 55));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Hora");
        lblHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 157, 55), null, null));

        btnFechar.setBackground(new java.awt.Color(153, 153, 153));
        btnFechar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnFechar.setText("X");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnFechar)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblData)
                    .addComponent(lblHora))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 890, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here: Avança para Botaão Login
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    btnAcessar.requestFocusInWindow();
                }
            }
        });
    }//GEN-LAST:event_pswSenhaActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        // TODO add your handling code here: validação do usuario e senha
        String usuario = txtUsuario.getText().trim();
        String senha = new String(pswSenha.getPassword());

        if (usuario.isEmpty() || senha.isBlank()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexao conexao = new Conexao();
        if (conexao.conectar()) {
            try {
                String verificaUsuarioQuery = "SELECT * FROM usuario WHERE Nome_Usuario = ?";
                PreparedStatement verificaStmt = conexao.getConnection().prepareStatement(verificaUsuarioQuery);
                verificaStmt.setString(1, usuario);
                ResultSet rs1 = verificaStmt.executeQuery();
                // Verificando se o usuário foi encontrado
                if (rs1.next()) {
                    JOptionPane.showMessageDialog(this, "Login realizado com sucesso.", "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);
                    // Aqui você pode abrir a tela do menu, por exemplo:
                    new Menu().setVisible(true);
                    this.dispose(); // Fecha a tela de login

                } else {
                    JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao realizar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexao.desconectar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        txtUsuario.setText("");
        pswSenha.setText("");
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:  Avançar para senha
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            // Move o foco para o campo txtSenha
            pswSenha.requestFocusInWindow();
        }

        // Verifica se os campos estão preenchidos

    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here: 

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDataAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_lblDataAncestorAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(dataSistema));

        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnAcessar.requestFocus();
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here: Cadastrar usuario
        String usuario = txtUsuario.getText().trim();
        String senha = new String(pswSenha.getPassword());

        if (usuario.isEmpty() || senha.isBlank()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Conexao conexao = new Conexao();
        if (conexao.conectar()) {
            try {
                // Verifica se o usuário já existe no banco de dados
                String verificaUsuarioQuery = "SELECT * FROM usuario WHERE Nome_Usuario = ?";
                PreparedStatement verificaStmt = conexao.getConnection().prepareStatement(verificaUsuarioQuery);
                verificaStmt.setString(1, usuario);
                ResultSet rs = verificaStmt.executeQuery();

                if (rs.next()) {
                    // Usuário já existe, exibe uma mensagem
                    JOptionPane.showMessageDialog(this, "Usuário já cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Usuário não existe, então cadastra um novo usuário
                    String insertQuery = "INSERT INTO usuario (Nome_Usuario, Senha_Usuario) VALUES (?, ?)";
                    PreparedStatement insertStmt = conexao.getConnection().prepareStatement(insertQuery);
                    insertStmt.setString(1, usuario);
                    insertStmt.setString(2, senha);
                    int rowsAffected = insertStmt.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao realizar operação no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexao.desconectar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Limpa os campos de texto
        txtUsuario.setText("");
        pswSenha.setText("");

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here: Fechar a tela
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAcessarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            String usuario = txtUsuario.getText().trim();
            String senha = new String(pswSenha.getPassword());

            if (usuario.isEmpty() || senha.isBlank()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Conexao conexao = new Conexao();
            if (conexao.conectar()) {
                try {
                    String verificaUsuarioQuery = "SELECT * FROM usuario WHERE Nome_Usuario = ?";
                    PreparedStatement verificaStmt = conexao.getConnection().prepareStatement(verificaUsuarioQuery);
                    verificaStmt.setString(1, usuario);
                    ResultSet rs1 = verificaStmt.executeQuery();
                    // Verificando se o usuário foi encontrado
                    if (rs1.next()) {
                        JOptionPane.showMessageDialog(this, "Login realizado com sucesso.", "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);
                        // Aqui você pode abrir a tela do menu, por exemplo:
                        new Menu().setVisible(true);
                        this.dispose(); // Fecha a tela de login

                    } else {
                        JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao realizar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conexao.desconectar();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Falha na conexão com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            txtUsuario.setText("");
            pswSenha.setText("");
            dispose();
        }
    }//GEN-LAST:event_btnAcessarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenhaImag;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioImag;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
