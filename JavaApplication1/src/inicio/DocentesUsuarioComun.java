/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;


/**
 *
 * @author BENJAMIN
 */
public class DocentesUsuarioComun extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public DocentesUsuarioComun() {
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
        AltasdeUsuarios = new javax.swing.JButton();
        AsignaciondePrivilegios = new javax.swing.JButton();
        ModificaciondeUsuarios = new javax.swing.JButton();
        ConsultarUsuarios = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        NombredelUsuario.setText("Nombre del Usuario");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Página Principal");

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
                .addGap(401, 401, 401))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        AltasdeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasdeUsuarios.setText("Alta Docentes");
        AltasdeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasdeUsuariosActionPerformed(evt);
            }
        });

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Modificar Docentes");
        AsignaciondePrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaciondePrivilegiosActionPerformed(evt);
            }
        });

        ModificaciondeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ModificaciondeUsuarios.setText("Alta de Disponibilidad");
        ModificaciondeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaciondeUsuariosActionPerformed(evt);
            }
        });

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Modificar Disponibilidad");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Docentes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UNIPOLI.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(LogoUnipoli, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(NombredelUsuario)
                .addGap(32, 32, 32)
                .addComponent(CerrarSesion)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AltasdeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AsignaciondePrivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificaciondeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(AltasdeUsuarios)
                        .addGap(32, 32, 32)
                        .addComponent(AsignaciondePrivilegios)
                        .addGap(32, 32, 32)
                        .addComponent(ModificaciondeUsuarios)
                        .addGap(34, 34, 34)
                        .addComponent(ConsultarUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AltasdeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasdeUsuariosActionPerformed
        // Link para modulo altas de asignaturas
        AltasAsignaturas obj=new AltasAsignaturas();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_AltasdeUsuariosActionPerformed

    private void ConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosActionPerformed
        // Link para alta cuatrimestre
        AltasCuatrimestre obj=new AltasCuatrimestre();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultarUsuariosActionPerformed

    private void ModificaciondeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaciondeUsuariosActionPerformed
        // Link para eliminar asignatura
        EliminarAsignaturas obj=new EliminarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModificaciondeUsuariosActionPerformed

    private void AsignaciondePrivilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignaciondePrivilegiosActionPerformed
        // Link para modificar asignatura
        ModificarAsignaturas obj=new ModificarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_AsignaciondePrivilegiosActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltasdeUsuarios;
    private javax.swing.JButton AsignaciondePrivilegios;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultarUsuarios;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JButton ModificaciondeUsuarios;
    private javax.swing.JLabel NombredelUsuario;
    private javax.swing.JLabel SGH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}