/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import com.toedter.calendar.JDateChooser;
import controller.ControllerAvioes;
import controller.ControllerClientes;
import controller.ControllerViagens;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.TableModelAvioes;
import model.TableModelClientes;


/**
 *
 * @author evandro
 */
public class JFrameCadViagens extends javax.swing.JFrame {

    private ControllerViagens cv;
    private ControllerAvioes ca;
    private ControllerClientes cc;
   
    public JFrameCadViagens(ControllerViagens viagemControle, ControllerAvioes aviaoControle, ControllerClientes clienteControle) {
        initComponents();
        cv = viagemControle;
        ca = aviaoControle;
        cc = clienteControle;
        cv.setViewViagens(this);
        jTable1.setModel(cv.getViewTabela());
        jTable2.setModel(ca.getViewTabela());
        jTable3.setModel(cc.getViewTabela());
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputCodigo = new javax.swing.JTextField();
        inputCidadeOrigem = new javax.swing.JTextField();
        jButtonInserir = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        inputDataSaida = new com.toedter.calendar.JDateChooser();
        inputDataChegada = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxAviao = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        inputCidadeDestino = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Viagens");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Viagens");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(206, 206, 206))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Código:");

        jLabel3.setText("Data saída:");

        jLabel4.setText("Data Chegada:");

        jLabel5.setText("Cidade Origem:");

        inputCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodigoFocusLost(evt);
            }
        });

        inputCidadeOrigem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCidadeOrigemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCidadeOrigemFocusLost(evt);
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

        inputDataSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputDataSaidaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputDataSaidaFocusLost(evt);
            }
        });

        inputDataChegada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputDataChegadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputDataChegadaFocusLost(evt);
            }
        });

        jLabel7.setText("Valor (R$):");

        inputValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputValorFocusLost(evt);
            }
        });

        jLabel8.setText("Avião:");

        ComboBoxAviao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Cliente:");

        ComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Cidade Destino:");

        inputCidadeDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCidadeDestinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCidadeDestinoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCidadeOrigem)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ComboBoxCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboBoxAviao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputDataChegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputDataSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(inputCodigo, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputCidadeDestino)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInserir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(inputDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonLimparCampos)
                    .addComponent(jButtonEditar))
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Cadastro de Viagens", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Aviões", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Clientes", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        cv.selectAll();
        cv.populateComboBoxs();
        ca.selectAll();
        cc.selectAll();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButtonInserir.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);    
        cv.selectOne();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
    }//GEN-LAST:event_jTable1MouseEntered

    private void inputValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorFocusLost

    private void inputValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorFocusGained

    private void inputDataChegadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDataChegadaFocusLost
        inputDataChegada.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputDataChegadaFocusLost

    private void inputDataChegadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDataChegadaFocusGained
        inputDataChegada.setBackground(Color.YELLOW);
    }//GEN-LAST:event_inputDataChegadaFocusGained

    private void inputDataSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDataSaidaFocusLost
        inputDataSaida.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputDataSaidaFocusLost

    private void inputDataSaidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputDataSaidaFocusGained
        inputDataSaida.setBackground(Color.YELLOW);
    }//GEN-LAST:event_inputDataSaidaFocusGained

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        cv.edit();
        cv.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        cv.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        cv.removeOne();
        cv.clearFields();
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonInserir.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        cv.save(); //controle de avioes
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void inputCidadeOrigemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeOrigemFocusLost
        inputCidadeOrigem.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputCidadeOrigemFocusLost

    private void inputCidadeOrigemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeOrigemFocusGained
        inputCidadeOrigem.setBackground(Color.YELLOW);
    }//GEN-LAST:event_inputCidadeOrigemFocusGained

    private void inputCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodigoFocusLost
        inputCodigo.setBackground(Color.WHITE);
    }//GEN-LAST:event_inputCodigoFocusLost

    private void inputCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodigoFocusGained
        inputCodigo.setBackground(Color.YELLOW);
    }//GEN-LAST:event_inputCodigoFocusGained

    private void inputCidadeDestinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeDestinoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCidadeDestinoFocusGained

    private void inputCidadeDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCidadeDestinoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCidadeDestinoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxAviao;
    private javax.swing.JComboBox ComboBoxCliente;
    private javax.swing.JTextField inputCidadeDestino;
    private javax.swing.JTextField inputCidadeOrigem;
    private javax.swing.JTextField inputCodigo;
    private com.toedter.calendar.JDateChooser inputDataChegada;
    private com.toedter.calendar.JDateChooser inputDataSaida;
    private javax.swing.JTextField inputValor;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables



    public JTable getjTable1() {
        return jTable1;
    }
    
   public JComboBox getComboBoxAviao() {
        return ComboBoxAviao;
    }

    public JComboBox getComboBoxCliente() {
        return ComboBoxCliente;
    }

    public JTextField getInputCidadeDestino() {
        return inputCidadeDestino;
    }

    public JTextField getInputCidadeOrigem() {
        return inputCidadeOrigem;
    }

    public JTextField getInputCodigo() {
        return inputCodigo;
    }

    public JDateChooser getInputDataChegada() {
        return inputDataChegada;
    }

    public JDateChooser getInputDataSaida() {
        return inputDataSaida;
    }

    public JTextField getInputValor() {
        return inputValor;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public JTable getjTable3() {
        return jTable3;
    }


    
}
