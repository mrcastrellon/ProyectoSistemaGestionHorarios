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
        this.setSize(1000,600);
    }
    public DocentesUsuarioComun(String usuario) {
        initComponents();
        this.setSize(1000,600);
        usuar.setText(usuario);
        setVisible(true);
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
        usuar = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(1300, 648));
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 85, 1304, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1304, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 682, 1304, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 329, 56);

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion);
        CerrarSesion.setBounds(1181, 51, 113, 25);

        usuar.setText("Nombre del Usuario");
        getContentPane().add(usuar);
        usuar.setBounds(1056, 57, 93, 14);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Página Principal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(555, 137, 222, 35);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 690, 1304, 23);

        AltasdeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasdeUsuarios.setText("Alta Docentes");
        AltasdeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasdeUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(AltasdeUsuarios);
        AltasdeUsuarios.setBounds(72, 292, 189, 27);

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Modificar Docentes");
        AsignaciondePrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaciondePrivilegiosActionPerformed(evt);
            }
        });
        getContentPane().add(AsignaciondePrivilegios);
        AsignaciondePrivilegios.setBounds(72, 351, 189, 27);

        ModificaciondeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ModificaciondeUsuarios.setText("Alta de Disponibilidad");
        ModificaciondeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaciondeUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(ModificaciondeUsuarios);
        ModificaciondeUsuarios.setBounds(72, 410, 189, 27);

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Modificar Disponibilidad");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarUsuarios);
        ConsultarUsuarios.setBounds(72, 471, 189, 27);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Docentes");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(629, 178, 98, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UNIPOLI.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 261, 918, 304);

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
    private javax.swing.JLabel SGH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel usuar;
    // End of variables declaration//GEN-END:variables
}
