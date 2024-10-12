
package models;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Familia Brasileiro
 */
public class MenuPrincipal extends JFrame {
    private JButton btnHome, btnCadastro, btnAgenda, btnFiltro, btnSaude, btnAdvogado, btnRelatorio, btnImpressao, btnOutros;

    public MenuPrincipal() {
        // Configuração da janela principal
        setTitle("Menu Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criando os botões
        btnHome = new JButton("Home");
        btnCadastro = new JButton("Cadastro");
        btnAgenda = new JButton("Agenda");
        btnFiltro = new JButton("Filtro");
        btnSaude = new JButton("Saúde");
        btnAdvogado = new JButton("Advogado");
        btnRelatorio = new JButton("Relatório");
        btnImpressao = new JButton("Impressão");
        btnOutros = new JButton("Outros");

        // Configurando o layout do painel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10)); // Grid de 3x3 com espaçamento de 10 pixels

        // Adicionando os botões ao painel
        panel.add(btnHome);
        panel.add(btnCadastro);
        panel.add(btnAgenda);
        panel.add(btnFiltro);
        panel.add(btnSaude);
        panel.add(btnAdvogado);
        panel.add(btnRelatorio);
        panel.add(btnImpressao);
        panel.add(btnOutros);

        // Adicionando o painel à janela
        add(panel);

        // Configurando os listeners para os botões
        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Home
                JOptionPane.showMessageDialog(null, "Você clicou em Home!");
            }
        });

        btnCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Cadastro
                JOptionPane.showMessageDialog(null, "Você clicou em Cadastro!");
            }
        });

        btnAgenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Agenda
                JOptionPane.showMessageDialog(null, "Você clicou em Agenda!");
            }
        });

        btnFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Filtro
                JOptionPane.showMessageDialog(null, "Você clicou em Filtro!");
            }
        });

        btnSaude.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Saúde
                JOptionPane.showMessageDialog(null, "Você clicou em Saúde!");
            }
        });

        btnAdvogado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Advogado
                JOptionPane.showMessageDialog(null, "Você clicou em Advogado!");
            }
        });

        btnRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Relatório
                JOptionPane.showMessageDialog(null, "Você clicou em Relatório!");
            }
        });

        btnImpressao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Impressão
                JOptionPane.showMessageDialog(null, "Você clicou em Impressão!");
            }
        });

        btnOutros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para o botão Outros
                JOptionPane.showMessageDialog(null, "Você clicou em Outros!");
            }
        });
    }

}
