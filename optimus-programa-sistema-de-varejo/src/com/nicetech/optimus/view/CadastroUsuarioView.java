/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nicetech.optimus.view;

import com.nicetech.optimus.controller.CadastroLoginController;
import com.nicetech.optimus.controller.JtableUsuario;
import com.nicetech.optimus.controller.UsuarioController;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 *
 * @author deyvid.souza
 */
public class CadastroUsuarioView extends javax.swing.JInternalFrame {

    private CadastroLoginController instanceControllerCadastroLoginController;
    private JtableUsuario instanceControllerJtable;

    /**
     * Creates new form FrmCadastrarPFF
     */
    public CadastroUsuarioView() {

        this.instanceControllerCadastroLoginController = new CadastroLoginController(null);
        instanceControllerJtable = new JtableUsuario(this);

        initComponents();

        instanceControllerJtable.popularJtable();

        // CONFIGURAÇÃO DEFAULT DO FORMULARIO
        //{
        this.getBtnUpdateUsuario().setVisible(false);
        this.getBtnDeleteUsuario().setEnabled(false);
        this.getTxtID().setText(Integer.toString(-1));
        this.getTxtID().setVisible(true);
        this.btnInsertUsuario.setEnabled(false);
        this.getBtnRegistroAnterior().setEnabled(false);
        //}
        //{
        this.getjTableLoadUsers().setRowSelectionInterval(0, 0);
        //}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedDadosCadastrais = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSenha2 = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        labNome = new javax.swing.JLabel();
        labRg = new javax.swing.JLabel();
        labCpf = new javax.swing.JLabel();
        labValidacao = new javax.swing.JLabel();
        txtBuscarUsers = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoadUsers = new javax.swing.JTable();
        btnBuscarUsuario = new javax.swing.JButton();
        btnRegistroAnterior = new javax.swing.JButton();
        btnProximoRegistro = new javax.swing.JButton();
        jRadioButtonOrdenarPorNome = new javax.swing.JRadioButton();
        btnDeleteUsuario = new javax.swing.JButton();
        btnUpdateUsuario = new javax.swing.JButton();
        btnInsertUsuario = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });

        jLabel13.setText("Razão Social");

        txtSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha2ActionPerformed(evt);
            }
        });
        txtSenha2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenha2FocusLost(evt);
            }
        });

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        labNome.setText("Login");

        labRg.setText("Senha");

        labCpf.setText("Senha");

        labValidacao.setText("Por favor, preencha os campos marcados com \"*\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(labNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(278, 278, 278)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labCpf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labRg)))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labCpf)
                        .addGap(6, 6, 6)
                        .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(labValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedDadosCadastrais.addTab("Dados *", jPanel2);

        txtBuscarUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarUsersKeyPressed(evt);
            }
        });

        jTableLoadUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableLoadUsers.getTableHeader().setReorderingAllowed(false);
        jTableLoadUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoadUsersMouseClicked(evt);
            }
        });
        jTableLoadUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableLoadUsersKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLoadUsers);

        btnBuscarUsuario.setText("Buscar - Nome / RG");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnRegistroAnterior.setText("<");
        btnRegistroAnterior.setToolTipText("Registro anterior");
        btnRegistroAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAnteriorActionPerformed(evt);
            }
        });

        btnProximoRegistro.setText(">");
        btnProximoRegistro.setToolTipText("Próximo registro  ");
        btnProximoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoRegistroActionPerformed(evt);
            }
        });

        jRadioButtonOrdenarPorNome.setText("A/Z");
        jRadioButtonOrdenarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOrdenarPorNomeActionPerformed(evt);
            }
        });
        jRadioButtonOrdenarPorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButtonOrdenarPorNomeKeyPressed(evt);
            }
        });

        btnDeleteUsuario.setText("Excluir");
        btnDeleteUsuario.setToolTipText("Após efetuar esta ação não será possível reverte-la.");
        btnDeleteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUsuarioActionPerformed(evt);
            }
        });

        btnUpdateUsuario.setText("Salvar");
        btnUpdateUsuario.setToolTipText("Clique para salvar as alterações.");
        btnUpdateUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUsuarioActionPerformed(evt);
            }
        });

        btnInsertUsuario.setText("Salvar");
        btnInsertUsuario.setToolTipText("Clique para salvar as informações.");
        btnInsertUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jTabbedDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnDeleteUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonOrdenarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnProximoRegistro))
                            .addComponent(btnRegistroAnterior)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnInsertUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteUsuario))
                    .addComponent(jTabbedDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButtonOrdenarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnProximoRegistro)
                        .addComponent(btnRegistroAnterior)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost

    }//GEN-LAST:event_txtLoginFocusLost

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed

    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost

    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha2ActionPerformed

    private void txtSenha2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenha2FocusLost

    }//GEN-LAST:event_txtSenha2FocusLost

    public void resetForm() {

    }
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtBuscarUsersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsersKeyPressed
        if (!this.getTxtBuscarUsers().getText().trim().isEmpty()) {
            getInstanceControllerJtable().searchRecord(this.getTxtBuscarUsers().getText());
        } else {
            getInstanceControllerJtable().popularJtable();
            getjTableLoadUsers().setBackground(Color.white);
        }
    }//GEN-LAST:event_txtBuscarUsersKeyPressed

    private void jTableLoadUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoadUsersMouseClicked
        /*// Visibilidade dos botões.*/
        this.getBtnInsertUsuario().setVisible(false);
        this.getBtnInsertUsuario().setEnabled(false);
        this.getBtnUpdateUsuario().setVisible(true);
        this.getBtnUpdateUsuario().setEnabled(true);
        this.getBtnDeleteUsuario().setVisible(true);
        this.getBtnDeleteUsuario().setEnabled(true);
        // this.btnCadLogin.setEnabled(true);
        /*// end */
        int linha_selecionada = this.getjTableLoadUsers().getSelectedRow();
        this.getTxtLogin().setText(this.getjTableLoadUsers().getValueAt(linha_selecionada, 0).toString());

        int indiceAtual = linha_selecionada;
        int numeroDeLinhas = getjTableLoadUsers().getRowCount() - 1;

        this.getBtnRegistroAnterior().setEnabled(true);
        this.getBtnProximoRegistro().setEnabled(true);

        if (indiceAtual == 0) {
            this.getBtnRegistroAnterior().setEnabled(false);
        }

        if (indiceAtual == numeroDeLinhas) {
            this.getBtnProximoRegistro().setEnabled(false);
        }
    }//GEN-LAST:event_jTableLoadUsersMouseClicked

    private void jTableLoadUsersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableLoadUsersKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableLoadUsersKeyPressed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        if (getInstanceControllerJtable() == null) {
            setInstanceControllerJtable(new JtableUsuario(this));
        }
        if (!this.getTxtBuscarUsers().getText().trim().isEmpty()) {
            getInstanceControllerJtable().searchRecord(this.getTxtBuscarUsers().getText());
        } else {
            getInstanceControllerJtable().popularJtable();
            getjTableLoadUsers().setBackground(Color.white);
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnRegistroAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAnteriorActionPerformed
        int indiceAtual = this.getjTableLoadUsers().getSelectedRow();
        int indiceAnterior = indiceAtual - 1;
        if (getInstanceControllerCadastroLoginController().numeroDeRegistros() > 0) {
            this.getBtnProximoRegistro().setEnabled(true);
            this.getBtnInsertUsuario().setVisible(false);
            this.getBtnUpdateUsuario().setVisible(true);
            this.getBtnUpdateUsuario().setEnabled(true);
            this.getBtnDeleteUsuario().setVisible(true);
            this.getBtnDeleteUsuario().setEnabled(true);
            if (indiceAnterior >= 0) {
                getInstanceControllerJtable().moveRecord(indiceAnterior);
                this.getjTableLoadUsers().setRowSelectionInterval(indiceAnterior, indiceAnterior);
                if (indiceAnterior == 0) {
                    this.getBtnRegistroAnterior().setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_btnRegistroAnteriorActionPerformed

    private void btnProximoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoRegistroActionPerformed
        int indiceAtual = this.getjTableLoadUsers().getSelectedRow();
        int proximoIndice = indiceAtual + 1;
        if (getInstanceControllerCadastroLoginController().numeroDeRegistros() > 0) {
            this.getBtnRegistroAnterior().setEnabled(true);
            this.getBtnInsertUsuario().setVisible(false);
            this.getBtnUpdateUsuario().setVisible(true);
            this.getBtnUpdateUsuario().setEnabled(true);
            this.getBtnDeleteUsuario().setVisible(true);
            this.getBtnDeleteUsuario().setEnabled(true);
            if (proximoIndice > 0) {
                getjTableLoadUsers().convertRowIndexToModel(proximoIndice);
                getInstanceControllerJtable().moveRecord(proximoIndice);
                this.getjTableLoadUsers().setRowSelectionInterval(proximoIndice, proximoIndice);
                if (proximoIndice == getjTableLoadUsers().getRowCount() - 1) {
                    this.getBtnProximoRegistro().setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_btnProximoRegistroActionPerformed

    private void jRadioButtonOrdenarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOrdenarPorNomeActionPerformed
        getInstanceControllerJtable().ordenarPorNome();
    }//GEN-LAST:event_jRadioButtonOrdenarPorNomeActionPerformed

    private void jRadioButtonOrdenarPorNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButtonOrdenarPorNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOrdenarPorNomeKeyPressed

    private void btnDeleteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUsuarioActionPerformed
        int selectedOption = showConfirmDialog(null, "Deseja realmente excluir este cadastro?", "Sistema informa:", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_NO_OPTION) {
            int linha = getjTableLoadUsers().getSelectedRow();
            getInstanceControllerJtable().updateJtable();
            getInstanceControllerCadastroLoginController().delete(linha);// Deleta o registro do xml.
            resetForm();
            /*// Visibilidade dos botões.*/
            this.getBtnInsertUsuario().setVisible(true);
            this.getBtnInsertUsuario().setEnabled(true);
            this.getBtnUpdateUsuario().setVisible(false);
            this.getBtnDeleteUsuario().setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteUsuarioActionPerformed

    private void btnUpdateUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUsuarioActionPerformed

    }//GEN-LAST:event_btnUpdateUsuarioActionPerformed

    private void btnInsertUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUsuarioActionPerformed
        UsuarioController cc = new UsuarioController(this);
        cc.cadastrarUsuario();
    }//GEN-LAST:event_btnInsertUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnDeleteUsuario;
    private javax.swing.JButton btnInsertUsuario;
    private javax.swing.JButton btnProximoRegistro;
    private javax.swing.JButton btnRegistroAnterior;
    private javax.swing.JButton btnUpdateUsuario;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonOrdenarPorNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedDadosCadastrais;
    private javax.swing.JTable jTableLoadUsers;
    private javax.swing.JLabel labCpf;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labRg;
    private javax.swing.JLabel labValidacao;
    private javax.swing.JTextField txtBuscarUsers;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSenha2;
    // End of variables declaration//GEN-END:variables

    public CadastroLoginController getInstanceControllerCadastroLoginController() {
        return instanceControllerCadastroLoginController;
    }

    public void setInstanceControllerCadastroLoginController(CadastroLoginController instanceControllerCadastroLoginController) {
        this.instanceControllerCadastroLoginController = instanceControllerCadastroLoginController;
    }

    public javax.swing.JButton getBtnBuscarUsuario() {
        return btnBuscarUsuario;
    }

    public void setBtnBuscarUsuario(javax.swing.JButton btnBuscarUsuario) {
        this.btnBuscarUsuario = btnBuscarUsuario;
    }

    public javax.swing.JButton getBtnDeleteUsuario() {
        return btnDeleteUsuario;
    }

    public void setBtnDeleteUsuario(javax.swing.JButton btnDeleteUsuario) {
        this.btnDeleteUsuario = btnDeleteUsuario;
    }

    public javax.swing.JButton getBtnInsertUsuario() {
        return btnInsertUsuario;
    }

    public void setBtnInsertUsuario(javax.swing.JButton btnInsertUsuario) {
        this.btnInsertUsuario = btnInsertUsuario;
    }

    public javax.swing.JButton getBtnUpdateUsuario() {
        return btnUpdateUsuario;
    }

    public void setBtnUpdateUsuario(javax.swing.JButton btnUpdateUsuario) {
        this.btnUpdateUsuario = btnUpdateUsuario;
    }

    public javax.swing.JLabel getjLabel1() {
        return getLabNome();
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.setLabNome(jLabel1);
    }

    public JtableUsuario getInstanceControllerJtable() {
        return instanceControllerJtable;
    }

    public void setInstanceControllerJtable(JtableUsuario instanceControllerJtable) {
        this.instanceControllerJtable = instanceControllerJtable;
    }

    public javax.swing.JButton getBtnProximoRegistro() {
        return btnProximoRegistro;
    }

    public void setBtnProximoRegistro(javax.swing.JButton btnProximoRegistro) {
        this.btnProximoRegistro = btnProximoRegistro;
    }

    public javax.swing.JButton getBtnRegistroAnterior() {
        return btnRegistroAnterior;
    }

    public void setBtnRegistroAnterior(javax.swing.JButton btnRegistroAnterior) {
        this.btnRegistroAnterior = btnRegistroAnterior;
    }

    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public javax.swing.JRadioButton getjRadioButtonOrdenarPorNome() {
        return jRadioButtonOrdenarPorNome;
    }

    public void setjRadioButtonOrdenarPorNome(javax.swing.JRadioButton jRadioButtonOrdenarPorNome) {
        this.jRadioButtonOrdenarPorNome = jRadioButtonOrdenarPorNome;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JTabbedPane getjTabbedDadosCadastrais() {
        return jTabbedDadosCadastrais;
    }

    public void setjTabbedDadosCadastrais(javax.swing.JTabbedPane jTabbedDadosCadastrais) {
        this.jTabbedDadosCadastrais = jTabbedDadosCadastrais;
    }

    public javax.swing.JTable getjTableLoadUsers() {
        return jTableLoadUsers;
    }

    public void setjTableLoadUsers(javax.swing.JTable jTableLoadUsers) {
        this.jTableLoadUsers = jTableLoadUsers;
    }

    public javax.swing.JLabel getLabCpf() {
        return labCpf;
    }

    public void setLabCpf(javax.swing.JLabel labCpf) {
        this.labCpf = labCpf;
    }

    public javax.swing.JLabel getLabNome() {
        return labNome;
    }

    public void setLabNome(javax.swing.JLabel labNome) {
        this.labNome = labNome;
    }

    public javax.swing.JLabel getLabRg() {
        return labRg;
    }

    public void setLabRg(javax.swing.JLabel labRg) {
        this.labRg = labRg;
    }

    public javax.swing.JLabel getLabValidacao() {
        return labValidacao;
    }

    public void setLabValidacao(javax.swing.JLabel labValidacao) {
        this.labValidacao = labValidacao;
    }

    public javax.swing.JTextField getTxtBuscarUsers() {
        return txtBuscarUsers;
    }

    public void setTxtBuscarUsers(javax.swing.JTextField txtBuscarUsers) {
        this.txtBuscarUsers = txtBuscarUsers;
    }

    public javax.swing.JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(javax.swing.JTextField txtID) {
        this.txtID = txtID;
    }

    public javax.swing.JTextField getTxtLogin() {
        return txtLogin;
    }

    public void setTxtLogin(javax.swing.JTextField txtLogin) {
        this.txtLogin = txtLogin;
    }

    public javax.swing.JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(javax.swing.JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public javax.swing.JTextField getTxtSenha2() {
        return txtSenha2;
    }

    public void setTxtSenha2(javax.swing.JTextField txtSenha2) {
        this.txtSenha2 = txtSenha2;
    }

}
