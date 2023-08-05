/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTAS;

import CONTROLADOR.ctrlProfesores;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author Angelo Meza
 */
public class frmConsultarAsistenciasProfe extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultarAsistenciasProfe
     */
    private static String usuario = "";
    private static String contraseña = "";
    private ctrlProfesores ctrlProf;

    public frmConsultarAsistenciasProfe(String usuario, String contraseña) {
        initComponents();
        ctrlProf = new ctrlProfesores();
        try {
            String idProfesor = ctrlProf.getIdProfesor(usuario);
            ctrlProf.cargarTalleresDocente(cmbTallerConsulta, idProfesor); // Cargar talleres al abrir el formulario
            ctrlProf.cargarGruposDocente(cmbGrupoConsulta, idProfesor); // Cargar grupos al abrir el formulario
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar la excepción según sea necesario
        }

//        TableColumn tc = jTableConsultaAsis.getColumnModel().getColumn(6);
//        tc.setCellEditor(jTableConsultaAsis.getDefaultEditor(Boolean.class));
//        tc.setCellRenderer(jTableConsultaAsis.getDefaultRenderer(Boolean.class));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBanner = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelExit2 = new javax.swing.JPanel();
        lblExit2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PanelOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbGrupoConsulta = new javax.swing.JComboBox<>();
        cmbTallerConsulta = new javax.swing.JComboBox<>();
        jDateConsulta = new com.toedter.calendar.JDateChooser();
        btnCargarAsistencias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaAsis = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(187, 187, 187));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanelBanner.setBackground(new java.awt.Color(122, 72, 221));
        jPanelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("CONSULTA ASISTENCIAS");
        jPanelBanner.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("PROFESORES");
        jPanelBanner.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanelExit2.setBackground(new java.awt.Color(122, 72, 221));

        lblExit2.setBackground(new java.awt.Color(33, 45, 62));
        lblExit2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblExit2.setForeground(new java.awt.Color(255, 255, 255));
        lblExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit2.setText("X");
        lblExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExit2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExit2Layout = new javax.swing.GroupLayout(jPanelExit2);
        jPanelExit2.setLayout(jPanelExit2Layout);
        jPanelExit2Layout.setHorizontalGroup(
            jPanelExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanelExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelExit2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelExit2Layout.setVerticalGroup(
            jPanelExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelExit2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelBanner.add(jPanelExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Imagenes_Alcaide/teacher.png.png"))); // NOI18N
        jPanelBanner.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Grupo");
        PanelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 30));

        jLabel2.setText("Taller");
        PanelOpciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 30));

        PanelOpciones.add(cmbGrupoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 140, -1));

        PanelOpciones.add(cmbTallerConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 140, -1));
        PanelOpciones.add(jDateConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 140, -1));

        btnCargarAsistencias.setText("CARGAR");
        btnCargarAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAsistenciasActionPerformed(evt);
            }
        });
        PanelOpciones.add(btnCargarAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 130, 40));

        jTableConsultaAsis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ASISTENCIA", "ID_RECLUSO", "NOMBRE", "TALLER", "GRUPO", "FECHA", "ASISTENCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsultaAsis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExit2MouseClicked

    private void lblExit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseEntered
        jPanelExit2.setBackground(Color.RED);
        lblExit2.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblExit2MouseEntered

    private void lblExit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseExited
        jPanelExit2.setBackground(new Color(122, 72, 221));
    }//GEN-LAST:event_lblExit2MouseExited

    private void btnCargarAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAsistenciasActionPerformed
        String tallerSeleccionado = cmbTallerConsulta.getSelectedItem().toString();
        String grupoSeleccionado = cmbGrupoConsulta.getSelectedItem().toString();
        Date fechaSeleccionada = jDateConsulta.getDate();

        if (tallerSeleccionado.isEmpty() || grupoSeleccionado.isEmpty() || fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un taller, un grupo y una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            ctrlProf.cargarAsistencias(cmbTallerConsulta, cmbGrupoConsulta, jDateConsulta, jTableConsultaAsis);
        } catch (SQLException ex) {
            Logger.getLogger(frmConsultarAsistenciasProfe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCargarAsistenciasActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultarAsistenciasProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultarAsistenciasProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultarAsistenciasProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultarAsistenciasProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultarAsistenciasProfe(usuario, contraseña).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton btnCargarAsistencias;
    private javax.swing.JComboBox<String> cmbGrupoConsulta;
    private javax.swing.JComboBox<String> cmbTallerConsulta;
    private com.toedter.calendar.JDateChooser jDateConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelBanner;
    private javax.swing.JPanel jPanelExit2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaAsis;
    private javax.swing.JLabel lblExit2;
    // End of variables declaration//GEN-END:variables
}
