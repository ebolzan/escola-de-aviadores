/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.ControllerAlunos;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author evandro
 */
public class JFrameCadAlunos extends javax.swing.JFrame {

    private ControllerAlunos ca;
   
    public JFrameCadAlunos(ControllerAlunos alunoControle) {
        initComponents();
        ca = alunoControle;
        ca.setViewAlunos(this);
        jTable1.setModel(ca.getViewTabela());
    }



    public JTextField getInputEndereco() {
        return inputEndereco;
    }

    public void setInputEndereco(JTextField inputEndereco) {
        this.inputEndereco = inputEndereco;
    }

    public JTextField getInputMatricula() {
        return inputMatricula;
    }

    public void setInputMatricula(JTextField inputMatricula) {
        this.inputMatricula = inputMatricula;
    }

    public JTextField getInputNome() {
        return inputNome;
    }

    public void setInputNome(JTextField inputNome) {
        this.inputNome = inputNome;
    }

    public JTextField getInputTelefone() {
        return inputTelefone;
    }

    public void setInputTelefone(JTextField inputTelefone) {
        this.inputTelefone = (JFormattedTextField) inputTelefone;
    }

    public JTextField getInputTipoSanguineo() {
        return inputTipoSanguineo;
    }

    public void setInputTipoSanguineo(JTextField inputTipoSanguineo) {
        this.inputTipoSanguineo = inputTipoSanguineo;
    }

    public JButton getjButton1() {
        return jButtonInserir;
    }

    public void setjButton1(JButton jButton1) {
        this.jButtonInserir = jButton1;
    }

    public void showError(String msn)
    {
        JOptionPane.showMessageDialog(rootPane, msn);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputMatricula = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        inputTipoSanguineo = new javax.swing.JTextField();
        jButtonInserir = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        inputTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Matricula:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Tipo Sanguíneo:");

        inputMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMatriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMatriculaFocusLost(evt);
            }
        });

        inputNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputNomeFocusLost(evt);
            }
        });

        inputEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputEnderecoFocusLost(evt);
            }
        });

        inputTipoSanguineo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTipoSanguineoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTipoSanguineoFocusLost(evt);
            }
        });

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Save.png"))); // NOI18N
        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Erase.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Abort.png"))); // NOI18N
        jButtonLimparCampos.setText("Limpar");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Modify.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        try {
            inputTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTelefoneFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInserir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonLimparCampos)
                    .addComponent(jButtonEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Cadastro de Alunos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        ca.save(); //controle de alunos
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        ca.removeOne();
        ca.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        ca.selectAll();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        ca.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButtonInserir.setEnabled(false);
        jButtonExcluir.setEnabled(true);    
        ca.selectOne();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
    }//GEN-LAST:event_jTable1MouseEntered

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        ca.edit();
        ca.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void inputMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatriculaFocusGained
        inputMatricula.setBackground(Color.YELLOW);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_inputMatriculaFocusGained

    private void inputMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMatriculaFocusLost
        inputMatricula.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputMatriculaFocusLost

    private void inputNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeFocusGained
        inputNome.setBackground(Color.YELLOW);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_inputNomeFocusGained

    private void inputNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNomeFocusLost
        inputNome.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputNomeFocusLost

    private void inputEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEnderecoFocusGained
        inputEndereco.setBackground(Color.YELLOW);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_inputEnderecoFocusGained

    private void inputEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEnderecoFocusLost
        inputEndereco.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputEnderecoFocusLost

    private void inputTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefoneFocusGained
        inputTelefone.setBackground(Color.YELLOW);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_inputTelefoneFocusGained

    private void inputTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTelefoneFocusLost
         inputTelefone.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputTelefoneFocusLost

    private void inputTipoSanguineoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTipoSanguineoFocusLost
        inputTipoSanguineo.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputTipoSanguineoFocusLost

    private void inputTipoSanguineoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTipoSanguineoFocusGained
        inputTipoSanguineo.setBackground(Color.YELLOW);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_inputTipoSanguineoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputMatricula;
    private javax.swing.JTextField inputNome;
    private javax.swing.JFormattedTextField inputTelefone;
    private javax.swing.JTextField inputTipoSanguineo;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public JTable getjTable1() {
        return jTable1;
    }
}
