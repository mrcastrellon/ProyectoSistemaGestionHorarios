/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio.usuarios.admimistrador.usuarios;

import inicio.usuarios.admimistrador.cuatrimestres.*;

/**
 *
 * @author BENJAMIN
 */
public class AsignaciondePrivilegios extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public AsignaciondePrivilegios() {
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

        Cuatrimestre = new javax.swing.JButton();
        Docentes = new javax.swing.JButton();
        HorariosExternos = new javax.swing.JButton();
        HorariosAlumnos = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        GeneraciondeHorarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        SGH = new javax.swing.JLabel();
        LogoUnipoli = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        NombredelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AsignarMaterias = new javax.swing.JButton();
        AltasUsuarios = new javax.swing.JButton();
        AsignaciondePrivilegios = new javax.swing.JButton();
        ModificarUsuarios = new javax.swing.JButton();
        ConsultarUsuarios = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AsignarPrivilegiosCuatrimestre = new javax.swing.JLabel();
        AsignarPrivilegiosDocente = new javax.swing.JLabel();
        AsignarPrivilegiosHorariosExternos = new javax.swing.JLabel();
        AsignarPrivilegiosHorariosAlumnos = new javax.swing.JLabel();
        AsignarPrivilegiosAsignarMateria = new javax.swing.JLabel();
        AsignarPrivilegiosUsuarios = new javax.swing.JLabel();
        AsignarPrivilegiosGeneraciondeHorarios = new javax.swing.JLabel();
        PermitirAccesoCuatrimestres = new javax.swing.JCheckBox();
        PermitirAccesoDocentes = new javax.swing.JCheckBox();
        PermitirAccesoHorariosExternos = new javax.swing.JCheckBox();
        PermitirAccesoHorariosAlumnos = new javax.swing.JCheckBox();
        PermitirAccesoAsignarMateria = new javax.swing.JCheckBox();
        PermitirAccesoUsuarios = new javax.swing.JCheckBox();
        PermitirAccesoGeneraciondeHorarios = new javax.swing.JCheckBox();
        AsignarPrivilegiosGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cuatrimestre.setBackground(new java.awt.Color(255, 102, 0));
        Cuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Cuatrimestre.setText("Cuatrimestre");
        Cuatrimestre.setAlignmentX(0.1F);
        Cuatrimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreActionPerformed(evt);
            }
        });

        Docentes.setBackground(new java.awt.Color(255, 102, 0));
        Docentes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Docentes.setText("Docentes");
        Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentesActionPerformed(evt);
            }
        });

        HorariosExternos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosExternos.setText("Horarios Externos");
        HorariosExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosExternosActionPerformed(evt);
            }
        });

        HorariosAlumnos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos.setText("Horarios Alumnos");
        HorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnosActionPerformed(evt);
            }
        });

        Usuarios.setBackground(new java.awt.Color(255, 102, 0));
        Usuarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        GeneraciondeHorarios.setBackground(new java.awt.Color(255, 102, 102));
        GeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GeneraciondeHorarios.setText("Generación de Horarios");
        GeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraciondeHorariosActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTION DE HORARIOS");

        LogoUnipoli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cabina Interactiva\\Documents\\NetBeansProjects\\imagenes\\descarga.jpg")); // NOI18N

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        NombredelUsuario.setText("Nombre del Usuario");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Pagina Principal");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(23767, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 25));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("Universidad Politecnica de Durango, Area de Desarollo de Software");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        AsignarMaterias.setBackground(new java.awt.Color(255, 102, 0));
        AsignarMaterias.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AsignarMaterias.setText("Asignar Materias");
        AsignarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarMateriasActionPerformed(evt);
            }
        });

        AltasUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasUsuarios.setText("Altas de Usuarios");
        AltasUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasUsuariosActionPerformed(evt);
            }
        });

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Asignacion de Privilegios");

        ModificarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ModificarUsuarios.setText("Modificar Usuarios");

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Consultar Usuarios");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Usuarios");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("Asignar Privilegios");

        AsignarPrivilegiosCuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosCuatrimestre.setText("Cuatrimestres");

        AsignarPrivilegiosDocente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosDocente.setText("Docentes");

        AsignarPrivilegiosHorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosHorariosExternos.setText("Horarios Externos");

        AsignarPrivilegiosHorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosHorariosAlumnos.setText("Horarios Alumnos");

        AsignarPrivilegiosAsignarMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosAsignarMateria.setText("Asignar Materias");

        AsignarPrivilegiosUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosUsuarios.setText("Usuarios");

        AsignarPrivilegiosGeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignarPrivilegiosGeneraciondeHorarios.setText("Generación de Horarios");

        PermitirAccesoCuatrimestres.setText("Permitir Acceso");

        PermitirAccesoDocentes.setText("Permitir Acceso");
        PermitirAccesoDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermitirAccesoDocentesActionPerformed(evt);
            }
        });

        PermitirAccesoHorariosExternos.setText("Permitir Acceso");

        PermitirAccesoHorariosAlumnos.setText("Permitir Acceso");
        PermitirAccesoHorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermitirAccesoHorariosAlumnosActionPerformed(evt);
            }
        });

        PermitirAccesoAsignarMateria.setText("Permitir Acceso");

        PermitirAccesoUsuarios.setText("Permitir Acceso");

        PermitirAccesoGeneraciondeHorarios.setText("Permitir Acceso");
        PermitirAccesoGeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermitirAccesoGeneraciondeHorariosActionPerformed(evt);
            }
        });

        AsignarPrivilegiosGuardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AsignarPrivilegiosGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LogoUnipoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(NombredelUsuario)
                        .addGap(32, 32, 32)
                        .addComponent(CerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Cuatrimestre)
                        .addGap(37, 37, 37)
                        .addComponent(Docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(HorariosExternos)
                        .addGap(52, 52, 52)
                        .addComponent(HorariosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(AsignarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(GeneraciondeHorarios)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AltasUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AsignaciondePrivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModificarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsultarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AsignarPrivilegiosCuatrimestre)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AsignarPrivilegiosDocente)
                            .addComponent(AsignarPrivilegiosHorariosExternos)
                            .addComponent(AsignarPrivilegiosAsignarMateria)
                            .addComponent(AsignarPrivilegiosUsuarios)
                            .addComponent(AsignarPrivilegiosGeneraciondeHorarios)
                            .addComponent(AsignarPrivilegiosHorariosAlumnos))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PermitirAccesoCuatrimestres)
                            .addComponent(PermitirAccesoDocentes)
                            .addComponent(PermitirAccesoHorariosExternos)
                            .addComponent(PermitirAccesoHorariosAlumnos)
                            .addComponent(PermitirAccesoAsignarMateria)
                            .addComponent(PermitirAccesoUsuarios)
                            .addComponent(PermitirAccesoGeneraciondeHorarios)
                            .addComponent(AsignarPrivilegiosGuardar))
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(577, 577, 577))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoUnipoli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CerrarSesion)
                                .addComponent(NombredelUsuario)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuatrimestre)
                    .addComponent(Docentes)
                    .addComponent(HorariosExternos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HorariosAlumnos)
                    .addComponent(Usuarios)
                    .addComponent(GeneraciondeHorarios)
                    .addComponent(AsignarMaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(AltasUsuarios)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AsignarPrivilegiosCuatrimestre)
                            .addComponent(PermitirAccesoCuatrimestres))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AsignarPrivilegiosDocente)
                            .addComponent(PermitirAccesoDocentes))
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsignaciondePrivilegios)
                    .addComponent(AsignarPrivilegiosHorariosExternos)
                    .addComponent(PermitirAccesoHorariosExternos))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarUsuarios)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AsignarPrivilegiosHorariosAlumnos)
                        .addComponent(PermitirAccesoHorariosAlumnos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ConsultarUsuarios)
                        .addGap(0, 185, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AsignarPrivilegiosAsignarMateria)
                            .addComponent(PermitirAccesoAsignarMateria))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AsignarPrivilegiosUsuarios)
                            .addComponent(PermitirAccesoUsuarios))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AsignarPrivilegiosGeneraciondeHorarios)
                            .addComponent(PermitirAccesoGeneraciondeHorarios))
                        .addGap(18, 18, 18)
                        .addComponent(AsignarPrivilegiosGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AsignarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsignarMateriasActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocentesActionPerformed

    private void AltasUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AltasUsuariosActionPerformed

    private void ConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarUsuariosActionPerformed

    private void PermitirAccesoDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermitirAccesoDocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PermitirAccesoDocentesActionPerformed

    private void PermitirAccesoHorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermitirAccesoHorariosAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PermitirAccesoHorariosAlumnosActionPerformed

    private void PermitirAccesoGeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermitirAccesoGeneraciondeHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PermitirAccesoGeneraciondeHorariosActionPerformed

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
            java.util.logging.Logger.getLogger(AsignaciondePrivilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignaciondePrivilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignaciondePrivilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignaciondePrivilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignaciondePrivilegios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltasUsuarios;
    private javax.swing.JButton AsignaciondePrivilegios;
    private javax.swing.JButton AsignarMaterias;
    private javax.swing.JLabel AsignarPrivilegiosAsignarMateria;
    private javax.swing.JLabel AsignarPrivilegiosCuatrimestre;
    private javax.swing.JLabel AsignarPrivilegiosDocente;
    private javax.swing.JLabel AsignarPrivilegiosGeneraciondeHorarios;
    private javax.swing.JButton AsignarPrivilegiosGuardar;
    private javax.swing.JLabel AsignarPrivilegiosHorariosAlumnos;
    private javax.swing.JLabel AsignarPrivilegiosHorariosExternos;
    private javax.swing.JLabel AsignarPrivilegiosUsuarios;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultarUsuarios;
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JButton ModificarUsuarios;
    private javax.swing.JLabel NombredelUsuario;
    private javax.swing.JCheckBox PermitirAccesoAsignarMateria;
    private javax.swing.JCheckBox PermitirAccesoCuatrimestres;
    private javax.swing.JCheckBox PermitirAccesoDocentes;
    private javax.swing.JCheckBox PermitirAccesoGeneraciondeHorarios;
    private javax.swing.JCheckBox PermitirAccesoHorariosAlumnos;
    private javax.swing.JCheckBox PermitirAccesoHorariosExternos;
    private javax.swing.JCheckBox PermitirAccesoUsuarios;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
