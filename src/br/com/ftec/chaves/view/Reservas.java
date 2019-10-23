/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.view;

import br.com.ftec.chaves.control.ColaboradorDAO;
import br.com.ftec.chaves.control.ReservaDAO;
import br.com.ftec.chaves.control.SalaDAO;
import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
//import br.com.ftec.controll.SalaDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public class Reservas extends javax.swing.JFrame {
    private int id;
    /**
     * Creates new form Monitor
     */
    public Reservas() {
        initComponents();
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
        cmbTurno = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox<>();
        cmbDiaSemana = new javax.swing.JComboBox<>();
        cmbResponsavel = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReservas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadastroSala = new javax.swing.JMenu();
        btnCadastroColaborador = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sala:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dia da Semana");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Turno:");

        cmbTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "manha", "tarde", "noite" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Responsável:");

        btnReservar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        txtSenha.setText("jPasswordField1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Senha:");

        cmbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado", "Domingo" }));

        cmbResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReservasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbReservas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnReservar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnCadastroSala.setText("Cadastrar sala");
        btnCadastroSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroSalaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCadastroSala);

        btnCadastroColaborador.setText("Cadastrar colaborador");
        btnCadastroColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroColaboradorMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCadastroColaborador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroSalaMouseClicked
       CadastroSala cs = new CadastroSala();
       cs.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnCadastroSalaMouseClicked

    private void btnCadastroColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroColaboradorMouseClicked
        //new LoginColaborador().setVisible(true);
        CadastroColaborador cc = new CadastroColaborador();
        cc.setVisible(true);
        this.setVisible(false);
  
    }//GEN-LAST:event_btnCadastroColaboradorMouseClicked

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // TODO add your handling code here:
        Reserva r = new Reserva();
        r.setTurno(cmbDiaSemana.getSelectedItem().toString());
        r.setTurno(cmbTurno.getSelectedItem().toString());
        
        ColaboradorDAO c = new ColaboradorDAO();
        SalaDAO s = new SalaDAO();
        try {
            r.setColaborador(c.buscaColaboradorCpf(cmbResponsavel.getSelectedItem().toString()));
            r.setSala(s.buscaSalaPorSala(cmbSala.getSelectedItem().toString()));
            ReservaDAO dao = new ReservaDAO();
            dao.salvar(r);
        } catch (Exception ex) {
            Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnReservarActionPerformed

    private void tbReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReservasMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbReservasMouseClicked

    
    private void montaTabela() throws Exception{
        DefaultTableModel dftm = (DefaultTableModel) tbReservas.getModel();
        dftm.setNumRows(0);
        tbReservas.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbReservas.getColumnModel().getColumn(0).setHeaderValue("Colaborador");
        tbReservas.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbReservas.getColumnModel().getColumn(1).setHeaderValue("Dia");
        tbReservas.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbReservas.getColumnModel().getColumn(2).setHeaderValue("Sala");
        tbReservas.getColumnModel().getColumn(3).setPreferredWidth(20);
        tbReservas.getColumnModel().getColumn(3).setHeaderValue("Turno");
        
        ReservaDAO dao = new ReservaDAO();
        
        for(Reserva r: dao.listaReservas()){
            dftm.addRow(new Object[]{
                
                r.getColaborador().getId(),
                r.getDia(),
                r.getSala().getId(),
                r.getTurno(),}
            );
        }
    }
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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reservas reservas = new Reservas();
                reservas.setVisible(true);
                try {
                    reservas.montaComboSala();
                    reservas.montaComboColaborador();
                    reservas.montaTabela();
                } catch (Exception ex) {
                    Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void montaComboSala() throws Exception{
        
        List<Sala> listaSalaObjeto = new ArrayList<>();
        List<String> listaSalaDescricao = new ArrayList<>();
        
        SalaDAO salaDao = new SalaDAO();
        listaSalaObjeto = salaDao.listaSalas();
        
        for (int i = 0; i < listaSalaObjeto.size(); i++){
            listaSalaDescricao.add(listaSalaObjeto.get(i).getSala());
        }
        
        DefaultComboBoxModel dfcmb = new DefaultComboBoxModel(listaSalaDescricao.toArray());
        cmbSala.setModel(dfcmb);   
    }
    
    public void montaComboColaborador() throws Exception{
        
        List<Colaborador> listaColaboradorObjeto = new ArrayList<>();
        //List<String> listaColaboradorNome = new ArrayList<>();
        
        ColaboradorDAO colaboradorDao = new ColaboradorDAO();
        listaColaboradorObjeto = colaboradorDao.listaColaboradores();
        
       /* for (int i = 0; i < listaColaboradorObjeto.size(); i++){
            listaColaboradorNome.add(listaColaboradorObjeto.get(i).getNome());
        }*/
        
        DefaultComboBoxModel dfcmb = new DefaultComboBoxModel(listaColaboradorObjeto.toArray());
        cmbResponsavel.setModel(dfcmb);
        
        // reescrever o método toString()
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastroColaborador;
    private javax.swing.JMenu btnCadastroSala;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cmbDiaSemana;
    private javax.swing.JComboBox<String> cmbResponsavel;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JComboBox cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbReservas;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
