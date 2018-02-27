package pe.lesd.practica02.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import pe.lesd.practica02.bean.ItemBean;
import pe.lesd.practica02.bean.PrestamoBean;
import pe.lesd.practica02.service.PrestamoService;


/**
 *
 * @author DOCENTE
 */
public class Pract01View extends javax.swing.JFrame {

  /**
   * Creates new form Pract01View
   */
  public Pract01View() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboTipoCliente = new javax.swing.JComboBox<>();
        txtCapital = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboMeses = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepo = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTA DE CURSOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D A T O S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Capital:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Interes:");

        cboTipoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONES---", "PERSONA NATURAL", "PERSONA JURIDICA" }));
        cboTipoCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoClienteItemStateChanged(evt);
            }
        });
        cboTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoClienteActionPerformed(evt);
            }
        });

        txtCapital.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtInteres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInteres.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tiempo:");

        cboMeses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboMeses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMesesItemStateChanged(evt);
            }
        });
        cboMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesesActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapital))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R E S U L T A D O", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 204))); // NOI18N

        tblRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUOTA", "CAPITAL", "INTERES", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRepo.setRowHeight(25);
        tblRepo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblRepo);
        if (tblRepo.getColumnModel().getColumnCount() > 0) {
            tblRepo.getColumnModel().getColumn(0).setPreferredWidth(75);
            tblRepo.getColumnModel().getColumn(1).setPreferredWidth(75);
            tblRepo.getColumnModel().getColumn(2).setPreferredWidth(75);
            tblRepo.getColumnModel().getColumn(3).setPreferredWidth(75);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
      
     //DATOS
      String tipoCliente = cboTipoCliente.getSelectedItem().toString();
      double capital = Double.parseDouble(txtCapital.getText());
      double interes = Double.parseDouble(txtInteres.getText());
      int meses = Integer.parseInt(cboMeses.getSelectedItem().toString());
      
      
       PrestamoBean bean = new PrestamoBean(tipoCliente, capital, meses);
       
      //PROCESO
      PrestamoService prestamoService = new PrestamoService();
      bean = prestamoService.procesarPrestamo(bean); 
      
      //REPORTE
      
       String[] conceptos = {"Cuota", 
        "Capital",
        "Interes",
        "Total"};
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblRepo.getModel();
        tabla.setRowCount(0);
        for (ItemBean item:bean.getReporte()) {
            Object[] rowData = {item.getCuota(), item.getCapital(),item.getInteres(), item.getTotal()};
            tabla.addRow(rowData);
        }
      
      
  }//GEN-LAST:event_btnProcesarActionPerformed

    private void cboTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoClienteActionPerformed
      
    }//GEN-LAST:event_cboTipoClienteActionPerformed

    private void cboMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMesesActionPerformed

    private void cboMesesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMesesItemStateChanged
 
    }//GEN-LAST:event_cboMesesItemStateChanged

    private void cboTipoClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoClienteItemStateChanged
        String tipoCliente = cboTipoCliente.getSelectedItem().toString();
        PrestamoService prestamoService = new PrestamoService();
        double innteres = prestamoService.calcPorcInteres(tipoCliente);
        if(evt.getStateChange() == ItemEvent.SELECTED)
       {
           if(this.cboTipoCliente.getSelectedIndex()>0)
           {
               this.cboMeses.setModel(new DefaultComboBoxModel(this.getMeses(this.cboTipoCliente.getSelectedItem().toString())));
           }
       }
       txtInteres.setText("" + innteres);
    }//GEN-LAST:event_cboTipoClienteItemStateChanged

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
      java.util.logging.Logger.getLogger(Pract01View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Pract01View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Pract01View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Pract01View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Pract01View().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboMeses;
    private javax.swing.JComboBox<String> cboTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepo;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtInteres;
    // End of variables declaration//GEN-END:variables

 public String[] getMeses(String tcliente){
        String[] meses  = new String[31];
        if (tcliente.equalsIgnoreCase("PERSONA NATURAL")) {
            meses[0]="6";
            meses[1]="7";
            meses[2]="8";
            meses[3]="9";
            meses[4]="10";
            meses[5]="11";
            meses[6]="12";
            meses[7]="13";
            meses[8]="14";
            meses[9]="15";
            meses[10]="16";
            meses[11]="17";
            meses[12]="18";
            meses[13]="19";
            meses[14]="20";
            meses[15]="21";
            meses[16]="22";
            meses[17]="23";
            meses[18]="24";
            meses[19]="25";
            meses[20]="26";
            meses[21]="27";
            meses[22]="28";
            meses[23]="29";
            meses[24]="30";
            meses[25]="31";
            meses[26]="32";
            meses[27]="33";
            meses[28]="34";
            meses[29]="35";
            meses[30]="36";
        }
        
        if (tcliente.equalsIgnoreCase("PERSONA JURIDICA")) {
            meses[0]="12";
            meses[1]="13";
            meses[2]="14";
            meses[3]="15";
            meses[4]="16";
            meses[5]="17";
            meses[6]="18";
            meses[7]="19";
            meses[8]="20";
            meses[9]="21";
            meses[10]="22";
            meses[11]="23";
            meses[12]="24";
            meses[13]="25";
            meses[14]="26";
            meses[15]="27";
            meses[16]="28";
            meses[17]="29";
            meses[18]="30";
            meses[19]="31";
            meses[20]="32";
            meses[21]="33";
            meses[22]="34";
            meses[23]="35";
            meses[24]="36";
            meses[25]="37";
            meses[26]="38";
            meses[27]="39";
            meses[28]="40";
            meses[29]="41";
            meses[30]="42";
        }

        return meses;
    }
}
