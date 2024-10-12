/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author AQUI TEM
 */
public class Saude extends javax.swing.JFrame {

    /**
     * Creates new form Saude
     */
    public Saude() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnFundo = new javax.swing.JPanel();
        btnAgenda = new javax.swing.JButton();
        btnFiltro = new javax.swing.JButton();
        btnSaude = new javax.swing.JButton();
        btnAdvogado = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnImpressao = new javax.swing.JButton();
        btnOutros = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        lblCodCliente = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblWhatssap = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtStatus1 = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCodCliente3 = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtWhatssap1 = new javax.swing.JTextField();
        lblNomeCliente1 = new javax.swing.JLabel();
        lblNomeMae = new javax.swing.JLabel();
        txtNomeCliente1 = new javax.swing.JTextField();
        txtCPF1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtRG1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        txtDataNasc3 = new javax.swing.JTextField();
        txtCartaoSus2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        lblOBS = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        btnSaida1 = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        txtCartaoSus3 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 115, 190));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnFundo.setBackground(new java.awt.Color(140, 197, 61));

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        btnAgenda.setToolTipText("Agenda");
        btnAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filtro.png"))); // NOI18N
        btnFiltro.setToolTipText("Filtrar");
        btnFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        btnSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saude (2).png"))); // NOI18N
        btnSaude.setToolTipText("Saúde");
        btnSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdvogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/advogados (2).png"))); // NOI18N
        btnAdvogado.setToolTipText("Advogados");
        btnAdvogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/relatorio.png"))); // NOI18N
        btnRelatorio.setToolTipText("Relatório");
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnImpressao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/impressão.png"))); // NOI18N
        btnImpressao.setToolTipText("Impressão");
        btnImpressao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressaoActionPerformed(evt);
            }
        });

        btnOutros.setBackground(new java.awt.Color(140, 197, 61));
        btnOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        btnOutros.setToolTipText("Outras Solicitações");
        btnOutros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(140, 197, 61));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home2.png"))); // NOI18N
        btnHome.setToolTipText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(140, 197, 61));
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cadastro.png"))); // NOI18N
        btnCadastro.setToolTipText("Cadastrar");
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFundoLayout = new javax.swing.GroupLayout(jpnFundo);
        jpnFundo.setLayout(jpnFundoLayout);
        jpnFundoLayout.setHorizontalGroup(
            jpnFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFundoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jpnFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnFundoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdvogado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnFundoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnFundoLayout.setVerticalGroup(
            jpnFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdvogado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnOutros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpnFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 490));

        lblCodCliente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCodCliente.setText("Cod. Cliente:");
        jPanel1.add(lblCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lblStatus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, -1));

        lblApelido.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApelido.setText("Cartão SUS:");
        jPanel1.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 80, -1));

        lblWhatssap.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblWhatssap.setForeground(new java.awt.Color(255, 255, 255));
        lblWhatssap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWhatssap.setText("Whatssap:");
        jPanel1.add(lblWhatssap, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 120, -1));

        lblDataNasc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNasc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDataNasc.setText("Data Nascimento");
        jPanel1.add(lblDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        lblCPF.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCPF.setText("CPF:");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 100, -1));

        lblRG.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblRG.setForeground(new java.awt.Color(255, 255, 255));
        lblRG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRG.setText("RG:");
        jPanel1.add(lblRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 90, -1));

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Data Solicitação:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, -1));

        txtStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 130, -1));

        txtStatus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, -1));

        lblCelular.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCelular.setText("Celular:");
        jPanel1.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, -1));

        txtCodCliente3.setToolTipText("Códogo");
        txtCodCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(txtCodCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, 30));

        txtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 30));

        txtWhatssap1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(txtWhatssap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, 30));

        lblNomeCliente1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNomeCliente1.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCliente1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomeCliente1.setText("Nome:");
        jPanel1.add(lblNomeCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 90, -1));

        lblNomeMae.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNomeMae.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeMae.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomeMae.setText("Solicitação:");
        jPanel1.add(lblNomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, -1));

        txtNomeCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNomeCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomeCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 360, 30));

        txtCPF1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPF1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 160, 30));

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Especialidade:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, -1));

        txtRG1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRG1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtRG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 30));

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Exames:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, -1));

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Status:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 50, -1));

        lblDataCadastro.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDataCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDataCadastro.setText("Und de Saúde:");
        jPanel1.add(lblDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, -1));

        txtDataNasc3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(txtDataNasc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 120, 30));

        txtCartaoSus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCartaoSus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaoSus2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCartaoSus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, 30));

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Data Prevista:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        jTextAreaOBS.setColumns(20);
        jTextAreaOBS.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOBS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 680, 120));

        lblOBS.setForeground(new java.awt.Color(255, 255, 255));
        lblOBS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOBS.setText("OBS:");
        jPanel1.add(lblOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 50, -1));

        btnProximo.setBackground(new java.awt.Color(0, 115, 190));
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/proximo.png"))); // NOI18N
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 50, 40));

        btnSaida1.setBackground(new java.awt.Color(0, 115, 190));
        btnSaida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saida.png"))); // NOI18N
        btnSaida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaida1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 50, 40));

        btnAnterior.setBackground(new java.awt.Color(0, 115, 190));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 50, 40));

        btnSalvarCadastro.setBackground(new java.awt.Color(0, 115, 190));
        btnSalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diskete.png"))); // NOI18N
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 60, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Exame", "Cirurgia", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguardando Vaga", "Pendente", "Concluido", "Remarcado", "Não Compareceu", " ", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 110, -1));

        jRadioButton1.setText("Cardiológico");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jRadioButton2.setText("Pré-Operatório");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jRadioButton3.setText("Endoscópia");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jRadioButton4.setText("Utra-Som");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clínica", "Posto de Saúde", "Hospital" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 120, -1));

        txtCartaoSus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCartaoSus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaoSus3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCartaoSus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiólogista", "Clinico Geral", "Dentista", "Gastrologista", "Ginecologista", "Neurologista", "Oftalmologista", "Oncologista", "Reumatologista", " " }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // TODO add your handling code here: Filtra Cliente
        Filtro telaFiltro = new Filtro();
        telaFiltro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here: Ir para o Menu
        Menu telaMenu = new Menu();
        telaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:Tela Cadastra
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus1ActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtNomeCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCliente1ActionPerformed

    private void txtCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPF1ActionPerformed

    private void txtRG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRG1ActionPerformed

    private void txtCartaoSus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaoSus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartaoSus2ActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here: Sair do Sistema
        dispose();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnSaida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaida1ActionPerformed
        // TODO add your handling code here:Sair do Sistema
        Menu telaMenu = new Menu();
        telaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSaida1ActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnImpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressaoActionPerformed
        // TODO add your handling code here: Ir para impressão
        Impressao telaImpressao = new Impressao();
        telaImpressao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnImpressaoActionPerformed

    private void btnOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosActionPerformed
        // TODO add your handling code here: ir para outros
        Outros telaOutros = new Outros();
        telaOutros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOutrosActionPerformed

    private void txtCartaoSus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaoSus3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartaoSus3ActionPerformed

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
            java.util.logging.Logger.getLogger(Saude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saude().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvogado;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnImpressao;
    private javax.swing.JButton btnOutros;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSaida1;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnSaude;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOBS;
    private javax.swing.JPanel jpnFundo;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JLabel lblNomeMae;
    private javax.swing.JLabel lblOBS;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblWhatssap;
    private javax.swing.JTextField txtCPF1;
    private javax.swing.JTextField txtCartaoSus2;
    private javax.swing.JTextField txtCartaoSus3;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodCliente3;
    private javax.swing.JTextField txtDataNasc3;
    private javax.swing.JTextField txtNomeCliente1;
    private javax.swing.JTextField txtRG1;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStatus1;
    private javax.swing.JTextField txtWhatssap1;
    // End of variables declaration//GEN-END:variables
}
