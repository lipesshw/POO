/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ru.cardapioru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 *
 * @author lipe
 */
public class InterfacePrincipal extends javax.swing.JFrame {
    
   
    List<String> database;

    public InterfacePrincipal() {
        initComponents();
        database = new ArrayList<>();
        getContentPane().setBackground(Color.WHITE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelComoConectar = new javax.swing.JLabel();
        BotaoLogarAluno = new javax.swing.JButton();
        BotaoLogarFuncionario = new javax.swing.JButton();
        LogoUFJ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante Universitário - UFJ");
        setBackground(new java.awt.Color(0, 51, 51));
        setFocusable(false);
        setResizable(false);

        LabelComoConectar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelComoConectar.setText("Escolha como deseja se conectar:");

        BotaoLogarAluno.setBackground(new java.awt.Color(208, 215, 222));
        BotaoLogarAluno.setText("Aluno");
        BotaoLogarAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotaoLogarAluno.setBorderPainted(false);
        BotaoLogarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogarAluno.setFocusPainted(false);
        BotaoLogarAluno.setFocusable(false);
        BotaoLogarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarAlunoActionPerformed(evt);
            }
        });

        BotaoLogarFuncionario.setBackground(new java.awt.Color(208, 215, 222));
        BotaoLogarFuncionario.setText("Funcionário");
        BotaoLogarFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoLogarFuncionario.setBorderPainted(false);
        BotaoLogarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogarFuncionario.setFocusPainted(false);
        BotaoLogarFuncionario.setFocusable(false);
        BotaoLogarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarFuncionarioActionPerformed(evt);
            }
        });

        LogoUFJ.setIcon(new javax.swing.ImageIcon("C:\\Users\\lipe\\Documents\\cardapioru\\src\\main\\logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LogoUFJ)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoLogarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(BotaoLogarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelComoConectar))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LogoUFJ, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelComoConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLogarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoLogarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loginFuncionario() {

    JFrame janela = new JFrame();
    janela.setTitle("Login Funcionário");
    janela.setSize(300, 200);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLocationRelativeTo(null);
    janela.setBackground(Color.WHITE);
    janela.setFocusable(false);
    janela.setResizable(false);

    JPanel painel = new JPanel(new GridLayout(5, 2, 5, 5)); 
    painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    painel.setBackground(Color.WHITE); 


    JLabel loginlabel = new JLabel("Usuário:");
    JTextField loginfield = new JTextField(10);
    loginfield.setPreferredSize(new Dimension(150, 30));

  
    JLabel senhalabel = new JLabel("Senha:");
    JPasswordField senhafield = new JPasswordField(10);


    painel.add(loginlabel);
    painel.add(loginfield);
    painel.add(senhalabel);
    painel.add(senhafield);


    JButton loginbutton = new JButton("Logar");
    loginbutton.setBackground(new java.awt.Color(208, 215, 222));
    loginbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    loginbutton.setBorderPainted(false);
    loginbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    loginbutton.setFocusPainted(false);
    loginbutton.setFocusable(false);


    Font buttonFont = new Font("Arial", Font.BOLD, 12);
    loginbutton.setFont(buttonFont);


    painel.add(loginbutton);


    janela.add(painel, BorderLayout.CENTER);


    loginbutton.addActionListener(e -> {

        String login = loginfield.getText();
        char[] senharchars = senhafield.getPassword();
        String senha = new String(senharchars);

       
        if (login.equals("admin") && senha.equals("123")) {
            janela.dispose();
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
            Janela_Cardapio_Funcionario();
            
            
        } else {

            JOptionPane.showMessageDialog(null, "O usuário ou a senha estao incorretos!");
        }
    });


    janela.setVisible(true);

}

    void Janela_Cardapio_Funcionario() {

        List<JTextField> listadecardapio = new ArrayList<>();

        JFrame janelacardapio = new JFrame("Cadastrar Cardápio");
        janelacardapio.setSize(600, 400);
        janelacardapio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelacardapio.setLocationRelativeTo(null);
        janelacardapio.getContentPane().setLayout(new BorderLayout(10, 10));

        JLabel rotulotitulo = new JLabel("Cadastrar Cardápio");
        rotulotitulo.setFont(new Font("Arial", Font.BOLD, 24));
        rotulotitulo.setHorizontalAlignment(JLabel.CENTER);
    rotulotitulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JPanel painel = new JPanel(new GridLayout(7, 2, 10, 10));
        
    painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        String[] diasdasemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };

        JComboBox<String> caixadediasdasemana = new JComboBox<>(diasdasemana);

        JLabel rotulodocardapio = new JLabel("Cardápio do dia escolhido :");
        JTextField cardapioTextField = new JTextField();

        
         cardapioTextField.setPreferredSize(new Dimension(300, 30));
        JButton botaocadastrar = new JButton("Cadastrar");
        JButton menuinicial = new JButton("Deslogar");
        JButton deletarcardapio = new JButton("Deletar cardápio");

        deletarcardapio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DeletarLista();
                
                JOptionPane.showMessageDialog(null, "Cardápio removido com sucesso!");
            }
        });


        menuinicial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                janelacardapio.dispose();
            }
        });


        botaocadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String diaSelecionado = (String) caixadediasdasemana.getSelectedItem();
                String cardapio = cardapioTextField.getText();

                String dadosCardapio = diaSelecionado + ": " + cardapio;


                listadecardapio.add(new JTextField(dadosCardapio));
                database.add(dadosCardapio);
                
                JOptionPane.showMessageDialog(null, "Cardápio adicionado com sucesso!");

                cardapioTextField.setText("");

            }
        });
        
        estilizarBotao(botaocadastrar);
        estilizarBotao(menuinicial);
        estilizarBotao(deletarcardapio);

        painel.add(caixadediasdasemana);
        painel.add(rotulodocardapio);
        painel.add(cardapioTextField);
        painel.add(botaocadastrar);
        painel.add(deletarcardapio);
        painel.add(menuinicial);

        janelacardapio.add(rotulotitulo, BorderLayout.NORTH);
        janelacardapio.add(painel, BorderLayout.CENTER);

        janelacardapio.setVisible(true);
    }
    
    private void estilizarBotao(JButton button) {
    button.setBackground(new Color(208, 215, 222));
    button.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    button.setBorderPainted(false);
    button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button.setFocusPainted(false);
}

    void DeletarLista() {
        database.clear();
    }       
        
    private void BotaoLogarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarAlunoActionPerformed

    if (database.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhum cardápio cadastrado!");
    } else {
        JanelaMostrar janela = new JanelaMostrar(InterfacePrincipal.this);
        janela.setVisible(true);
    }
    }//GEN-LAST:event_BotaoLogarAlunoActionPerformed

    private void BotaoLogarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarFuncionarioActionPerformed
       loginFuncionario();  

    }//GEN-LAST:event_BotaoLogarFuncionarioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotaoLogarAluno;
    private javax.swing.JButton BotaoLogarFuncionario;
    private javax.swing.JLabel LabelComoConectar;
    private javax.swing.JLabel LogoUFJ;
    // End of variables declaration//GEN-END:variables
}
