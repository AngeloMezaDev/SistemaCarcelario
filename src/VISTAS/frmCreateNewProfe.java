/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTAS;

import CONTROLADOR.Validaciones;
import CONTROLADOR.ctrlRegistroNuevoProfe;
import MODELO.Profesor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yordan
 */
public class frmCreateNewProfe extends javax.swing.JFrame {

    /**
     * Creates new form frmCreateNewProfe
     */
    private ctrlRegistroNuevoProfe controlador;
    private Validaciones valido;
    public frmCreateNewProfe() {
        initComponents();
        controlador = new ctrlRegistroNuevoProfe(); // Inicializar la instancia de la clase controladora
        valido= new Validaciones();
        controlador.cargarDatosProfesores((DefaultTableModel) JTableProfesoresExistentes.getModel());
        JTableProfesoresExistentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombresProf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosProf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedulaProf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEspecialidadProf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAnioExp = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioProf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoProf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblidProfesor = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtPasswordProf = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrarProfeNuevo = new javax.swing.JButton();
        btnEditarProfe = new javax.swing.JButton();
        btnEliminarProfe = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProfesoresExistentes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBanner.setBackground(new java.awt.Color(122, 72, 221));
        jPanelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Administracion Profesores");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExit2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(lblExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelExit2Layout.setVerticalGroup(
            jPanelExit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanelBanner.add(jPanelExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Imagenes_Alcaide/teacher.png.png"))); // NOI18N
        jPanelBanner.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        getContentPane().add(jPanelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 70));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtNombresProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombresProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtApellidosProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidosProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, -1));

        jLabel3.setText("Cédula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtCedulaProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedulaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 170, -1));

        jLabel4.setText("Especialidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        txtEspecialidadProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtEspecialidadProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 170, -1));

        jLabel5.setText("Años de Experiencia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        txtAnioExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioExpKeyTyped(evt);
            }
        });
        jPanel1.add(txtAnioExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 93, -1));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 520, 10));

        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        txtUsuarioProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuarioProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 170, -1));

        jLabel7.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel7.setText("CREDENCIALES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel8.setText("Correo Electronico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        txtCorreoProf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoProfKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreoProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, -1));

        jLabel9.setText("Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel12.setText("Confirme su contraseña:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel13.setText("ID:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblidProfesor.setText("#");
        jPanel1.add(lblidProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, -1));

        jLabel14.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jDateFechaNacimiento.setDateFormatString("yyyy/MM/dd");
        jDateFechaNacimiento.setFocusable(false);
        jPanel1.add(jDateFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 140, -1));
        jPanel1.add(txtPasswordProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, -1));
        jPanel1.add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 570, 330));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 115, 45));

        btnRegistrarProfeNuevo.setBackground(new java.awt.Color(153, 255, 102));
        btnRegistrarProfeNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarProfeNuevo.setText("REGISTRAR");
        btnRegistrarProfeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarProfeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 115, 45));

        btnEditarProfe.setText("MODIFICAR");
        btnEditarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProfeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 115, 45));

        btnEliminarProfe.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProfe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarProfe.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProfe.setText("ELIMINAR");
        btnEliminarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 115, 45));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 115, 33));

        JTableProfesoresExistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_PROFESOR", "NOMBRES", "APELLIDOS", "CEDULA", "CORREO", "ESPECIALIDAD", "EXPERIENCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableProfesoresExistentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableProfesoresExistentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableProfesoresExistentes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 780, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExit2MouseClicked

    private void lblExit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseEntered
        jPanelExit2.setBackground(Color.red);
        lblExit2.setBackground(Color.white);
    }//GEN-LAST:event_lblExit2MouseEntered

    private void lblExit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseExited
        jPanelExit2.setBackground(new Color(122, 72, 221));
    }//GEN-LAST:event_lblExit2MouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmProfesoresAlcaide profeAlc = new frmProfesoresAlcaide();
        this.dispose();
        profeAlc.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarProfeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfeNuevoActionPerformed

        try {
            // Obtener los valores de los campos de texto
            String codigoProfesor = "#P0001";
            String cedula = txtCedulaProf.getText();
            String nombres = txtNombresProf.getText();
            String apellidos = txtApellidosProf.getText();
            String correo = valido.validarCorreoElectronico(txtCorreoProf.getText());
            String usuario = valido.validarNombreUsuario(txtUsuarioProf.getText());
            char[] password = txtPasswordProf.getPassword();
            char[] passwordConfirm = txtPasswordConfirm.getPassword();
            String contra= valido.validadContrasena(new String(password));
            String contraConfirm= new String(passwordConfirm);
            String especialidad = txtEspecialidadProf.getText();
            int experiencia = Integer.parseInt(txtAnioExp.getText());
            Date FechaNac=jDateFechaNacimiento.getDate();
            if(cedula.isEmpty()||nombres.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || txtAnioExp.getText().isEmpty()
                   || usuario.isEmpty()|| contra.isEmpty() || contraConfirm.isEmpty() || especialidad.isEmpty() || FechaNac==null){
                JOptionPane.showMessageDialog(this,
                    "Existen campos vacios o datos invalidos, por favor verifique que los datos sean correctos.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(!contra.equals(contraConfirm)){
                    JOptionPane.showMessageDialog(this,
                    "La contraseña no coincide con la confirmacion, por favor verifique sean iguales",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
                    // Detener el evento
                    return;
            }else{
                // Crear el mensaje de confirmación
                String mensaje = "¿Deseas Registar al Profesor: " + nombres+" "+apellidos +" ?"
                        + "\n OJO: Verifique que su numero de cedula sea correcto"
                        + " \nporque este valor, no es modificable";
                int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar Resgistro", JOptionPane.YES_NO_OPTION);
                // Verificar la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    // Crear la instancia de Profesor
                    Profesor profesor = new Profesor(codigoProfesor, especialidad, experiencia, cedula, nombres, apellidos, usuario, contra, correo,FechaNac);
                    codigoProfesor = profesor.GenerarIdProfesor(cedula);
                    profesor.setCodigoProfesor(codigoProfesor);//asignar el id generado
                    // Guardar los datos en la base de datos
                    ctrlRegistroNuevoProfe registro = new ctrlRegistroNuevoProfe();
                    registro.RegistrarNuevoProfe(profesor);
                    
                    // Mostrar mensaje al usuario
                    JOptionPane.showMessageDialog(this, "Los datos se han añadido correctamente.");
                    limpiarInputs();
                } else {
                    // Detener el evento
                    return;
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
        // Actualizar la tabla de profesores (si es necesario)
        controlador.cargarDatosProfesores((DefaultTableModel) JTableProfesoresExistentes.getModel());

    }//GEN-LAST:event_btnRegistrarProfeNuevoActionPerformed

    private void btnEditarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProfeActionPerformed
        // Obtener los datos del profesor a editar
        String idProfesor = lblidProfesor.getText();
        if(!controlador.existeProfesor(idProfesor)){
            JOptionPane.showMessageDialog(this,
            "El profesor con el ID especificado no existe\n"
                    + "VERIFIQUE: que haya seleccionado a un profesor/a .",
            "Error",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nuevosNombres = txtNombresProf.getText();
        String nuevosApellidos = txtApellidosProf.getText();
        String nuevaCedula = txtCedulaProf.getText();
        String nuevoCorreo = valido.validarCorreoElectronico(txtCorreoProf.getText());
        String nuevaEspecialidad = txtEspecialidadProf.getText();
        String nuevoUsuario=valido.validarNombreUsuario(txtUsuarioProf.getText());
        char[] password = txtPasswordProf.getPassword();
        String NuevaContra= valido.validadContrasena(new String(password));
        char[] passwordConf = txtPasswordConfirm.getPassword();
        String NuevaContraConf= new String(passwordConf);
        int nuevaExperiencia = Integer.parseInt(txtAnioExp.getText());
        Date FechaNac=jDateFechaNacimiento.getDate();

        if(nuevaCedula.isEmpty()||nuevosNombres.isEmpty() || nuevosApellidos.isEmpty() || nuevoCorreo.isEmpty() || txtAnioExp.getText().isEmpty()||NuevaContraConf.isEmpty()
                 || nuevoUsuario.isEmpty()|| NuevaContra.isEmpty() || NuevaContraConf.isEmpty() || txtEspecialidadProf.getText().isEmpty() || FechaNac==null){
            JOptionPane.showMessageDialog(this,
             "Existen campos vacios o datos invalidos, por favor verifique que los datos sean correctos.",
             "Advertencia",
             JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!NuevaContra.equals(NuevaContraConf)){
                    JOptionPane.showMessageDialog(this,
                    "La contraseña no coincide con la confirmacion, por favor verifique sean iguales",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
                    // Detener el evento
                    return;
            }else{
                
                String mensaje = "¿Deseas Modificar al Profesor/a: " + nuevosApellidos+"\nCon Id: "+ idProfesor+ " ?";
                int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar Resgistro", JOptionPane.YES_NO_OPTION);
                // Verificar la opción seleccionada
                if (opcion == JOptionPane.YES_OPTION) {
                    // Llamar al método editarProfesor para realizar la edición
                    controlador.editarProfesor(idProfesor,nuevaCedula, nuevosNombres, nuevosApellidos, nuevoCorreo, 
                   nuevaEspecialidad, nuevaExperiencia,nuevoUsuario,NuevaContra,FechaNac);  
                } else {
                    // Detener el evento
                    return;
                }
            limpiarInputs();
        }
        
    // Actualizar la tabla de profesores con los datos actualizados
        DefaultTableModel modeloTabla = (DefaultTableModel) JTableProfesoresExistentes.getModel();
        modeloTabla.setRowCount(0); // Limpiar los datos existentes en la tabla
        controlador.cargarDatosProfesores(modeloTabla);

    // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Profesor editado correctamente", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnEditarProfeActionPerformed

    private void btnEliminarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfeActionPerformed
        // Obtener el ID del profesor seleccionado
        String idProfesor = lblidProfesor.getText();
        if(!controlador.existeProfesor(idProfesor)){
            JOptionPane.showMessageDialog(this,
            "El profesor con el ID especificado no existe\n"
                    + "VERIFIQUE: que haya seleccionado a un profesor/a .",
            "Error",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombreProf=txtNombresProf.getText()+" "+ txtApellidosProf.getText();
        int asignaciones=controlador.consultarAsignacionesProfesor(idProfesor);
       
            //Verificar si tiene asiganciones hechas
            if(asignaciones>=1){
                 JOptionPane.showMessageDialog(this,
             " "+nombreProf+"tiene "+asignaciones+ " Asigancion/es"
                     + "\nSi elimina este Profesor/a tambien se"
                     + "\neliminaran sus asiganciones",
             "Advertencia",
             JOptionPane.WARNING_MESSAGE);       
            }
             // Crear el mensaje de confirmación
            String mensaje = "¿Está seguro de Eliminar al Profesor/a: " + nombreProf+ " ?";
            int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
            // Verificar la opción seleccionada
            if (opcion == JOptionPane.YES_OPTION) {
                // Llamar al método eliminarProfesor del controlador
                controlador.eliminarProfesor(idProfesor);
            } else {
                // Detener el evento
                return;
            }
            limpiarInputs();
        // Actualizar la tabla de profesores (si es necesario)
        controlador.cargarDatosProfesores((DefaultTableModel) JTableProfesoresExistentes.getModel());
    }//GEN-LAST:event_btnEliminarProfeActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarInputs();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void JTableProfesoresExistentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableProfesoresExistentesMouseClicked
        int filaSeleccionada = JTableProfesoresExistentes.getSelectedRow();
        List<Profesor> profesores = controlador.cargarDatosProfesores((DefaultTableModel) JTableProfesoresExistentes.getModel());
        // Obtener el profesor seleccionado de la lista
        Profesor profesor = profesores.get(filaSeleccionada);

        // Obtener los datos del profesor
        String idProfesor = profesor.getCodigoProfesor();
        String nombres = profesor.getNombres();
        String apellidos = profesor.getApellidos();
        String cedula = profesor.getCedula();
        String correo = profesor.getCorreo();
        String especialidad = profesor.getEspecialidad();
        int experiencia = profesor.getAñosExperiencia();
        String usuario = profesor.getUser();
        String contrasena = profesor.getPassword();
        Date fechaNac=profesor.getFechaNacimiento();
        // Establecer los datos en los campos de texto
        lblidProfesor.setText(idProfesor);
        txtNombresProf.setText(nombres);
        txtApellidosProf.setText(apellidos);
        txtCedulaProf.setText(cedula);
        txtCedulaProf.setEditable(false);
        txtCorreoProf.setText(correo);
        txtEspecialidadProf.setText(especialidad);
        txtAnioExp.setText("" + experiencia);
        txtUsuarioProf.setText(usuario);
        txtPasswordProf.setText(contrasena);
        txtPasswordConfirm.setText(contrasena);
        jDateFechaNacimiento.setDate(fechaNac);
        // Restaurar la selección después de la actualización
        if (filaSeleccionada != -1) {
            JTableProfesoresExistentes.getSelectionModel().setSelectionInterval(filaSeleccionada, filaSeleccionada);
        }
    }//GEN-LAST:event_JTableProfesoresExistentesMouseClicked

    private void txtNombresProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresProfKeyTyped
         valido.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombresProfKeyTyped

    private void txtApellidosProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosProfKeyTyped
        valido.validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidosProfKeyTyped

    private void txtEspecialidadProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadProfKeyTyped
        valido.validarSoloLetras(evt);
    }//GEN-LAST:event_txtEspecialidadProfKeyTyped

    private void txtCedulaProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaProfKeyTyped
        valido.validarCedula(evt, txtCedulaProf.getText());
    }//GEN-LAST:event_txtCedulaProfKeyTyped

    private void txtAnioExpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioExpKeyTyped
        char c = evt.getKeyChar();
        // Verificar si la tecla presionada es un número y si ya hay 10 dígitos en el campo.
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE|| txtAnioExp.getText().length() >= 2 ) {
            evt.consume();
            // Mostrar un JOptionPane informativo.
            JOptionPane.showMessageDialog(this,
                    "Solo se permiten números y máximo 2 dígitos.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtAnioExpKeyTyped

    private void txtCorreoProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProfKeyTyped
        //
        String texto=txtCorreoProf.getText();
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != KeyEvent.VK_BACK_SPACE
                && c != '@' && c != '.' && c != '+' && c != '_') {
            evt.consume();
            // Mostrar un JOptionPane informativo.
            JOptionPane.showMessageDialog(null,
                    "El correo electrónico solo puede contener letras, números, '@', '.', '+', '_' y espacios.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        } else if (c == '@' && texto.contains("@")) {
            evt.consume();
            // Mostrar un JOptionPane informativo.
            JOptionPane.showMessageDialog(null,
                    "El correo electrónico solo puede contener un símbolo '@'.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        } else if (c == '.' && texto.contains(".") && texto.lastIndexOf('.') > texto.lastIndexOf('@')) {
            evt.consume();
            // Mostrar un JOptionPane informativo.
            JOptionPane.showMessageDialog(null,
                    "El correo electrónico solo puede contener un símbolo '.' después del '@'.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCorreoProfKeyTyped

    private void txtUsuarioProfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioProfKeyTyped
         char c = evt.getKeyChar();
        // Permitir letras, números y la tecla "Borrar"
        if (!Character.isLetterOrDigit(c) && c != KeyEvent.VK_BACK_SPACE ) {
            evt.consume();
            // Mostrar un JOptionPane informativo.
            JOptionPane.showMessageDialog(this,
                    "Solo se permiten letras y números en el usuario.\nRecuerde tambien que NO se admiten espacios",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtUsuarioProfKeyTyped
   
    
    private void limpiarInputs() {
        txtNombresProf.setText("");
        txtApellidosProf.setText("");
        txtCedulaProf.setText("");
        txtCedulaProf.setEditable(true);
        txtEspecialidadProf.setText("");
        txtAnioExp.setText("");
        txtUsuarioProf.setText("");
        txtCorreoProf.setText("");
        txtPasswordProf.setText("");
        txtPasswordConfirm.setText("");
        jDateFechaNacimiento.setDate(null);
        JTableProfesoresExistentes.clearSelection();
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
            java.util.logging.Logger.getLogger(frmCreateNewProfe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCreateNewProfe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCreateNewProfe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCreateNewProfe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCreateNewProfe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableProfesoresExistentes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarProfe;
    private javax.swing.JButton btnEliminarProfe;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarProfeNuevo;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBanner;
    private javax.swing.JPanel jPanelExit2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit2;
    private javax.swing.JLabel lblidProfesor;
    private javax.swing.JTextField txtAnioExp;
    private javax.swing.JTextField txtApellidosProf;
    private javax.swing.JTextField txtCedulaProf;
    private javax.swing.JTextField txtCorreoProf;
    private javax.swing.JTextField txtEspecialidadProf;
    private javax.swing.JTextField txtNombresProf;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JPasswordField txtPasswordProf;
    private javax.swing.JTextField txtUsuarioProf;
    // End of variables declaration//GEN-END:variables
}
