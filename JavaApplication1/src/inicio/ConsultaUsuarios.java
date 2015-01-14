/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;

import Conexion_base_de_datos.Conexion;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author MARCOS
 */
public class ConsultaUsuarios extends javax.swing.JFrame  {
      
    public ConsultaUsuarios() {
        initComponents();
        mostrardatos ();
    }
    
    public ConsultaUsuarios(String usuario){
        initComponents();
        label1.setText(usuario);
        setResizable(true);
        setVisible(true);
        mostrardatos ();
        altusu=usuario;
    }
    void limpiar (){
    campoid.setText("");
    camponombre.setText("");
    campousuario.setText("");
    campocontraseña.setText("");
    
} 
  private void mostrardatos(){
        modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("nombre_usuario");
        modelo.addColumn("contrasena");
        modelo.addColumn("tipo_usuario");
        tablausuarios.setModel(modelo);
        String []datos = new String [5];
        try{
        Statement st = con2.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM usuarios");
        while (rs.next()){
        datos [0]=rs.getString(1);
        datos [1]=rs.getString(2);
        datos [2]=rs.getString(3);
        datos [3]=rs.getString(4);
        datos [4]=rs.getString(5);
        
       
       
        modelo.addRow(datos);
        tablausuarios.setModel(modelo);
}
    }catch (Exception e){
       //  Logger.getLogger(consultadocentes.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("error vuelve a intentarlo" + e);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
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
        jButton1 = new javax.swing.JButton();
        usuar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HorariosAlumnos1 = new javax.swing.JButton();
        AltaUsuario = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        camponombre = new javax.swing.JTextField();
        campousuario = new javax.swing.JTextField();
        campocontraseña = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        campoid = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        tipousuario = new javax.swing.JComboBox();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1300, 648));
        getContentPane().setLayout(null);

        Cuatrimestre.setBackground(new java.awt.Color(255, 102, 0));
        Cuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Cuatrimestre.setText("Cuatrimestre");
        Cuatrimestre.setAlignmentX(0.1F);
        Cuatrimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreActionPerformed(evt);
            }
        });
        getContentPane().add(Cuatrimestre);
        Cuatrimestre.setBounds(68, 93, 111, 25);

        Docentes.setBackground(new java.awt.Color(255, 102, 0));
        Docentes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Docentes.setText("Docentes");
        Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentesActionPerformed(evt);
            }
        });
        getContentPane().add(Docentes);
        Docentes.setBounds(216, 93, 104, 25);

        HorariosExternos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosExternos.setText("Horarios Externos");
        HorariosExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosExternosActionPerformed(evt);
            }
        });
        getContentPane().add(HorariosExternos);
        HorariosExternos.setBounds(370, 93, 141, 25);

        HorariosAlumnos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos.setText("Horarios Alumnos");
        HorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(HorariosAlumnos);
        HorariosAlumnos.setBounds(563, 93, 148, 25);

        Usuarios.setBackground(new java.awt.Color(255, 102, 0));
        Usuarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(Usuarios);
        Usuarios.setBounds(934, 93, 93, 25);

        GeneraciondeHorarios.setBackground(new java.awt.Color(255, 102, 102));
        GeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GeneraciondeHorarios.setText("Generación de Horarios");
        GeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraciondeHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(GeneraciondeHorarios);
        GeneraciondeHorarios.setBounds(1068, 93, 173, 25);

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 85, 1287, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1287, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 632, 1287, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 405, 56);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1164, 51, 113, 25);
        getContentPane().add(usuar);
        usuar.setBounds(1132, 51, 0, 0);

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
                .addContainerGap(466, Short.MAX_VALUE)
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
        jPanel2.setBounds(0, 640, 1287, 23);

        HorariosAlumnos1.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos1.setText("Asignar Materias");
        HorariosAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnos1ActionPerformed(evt);
            }
        });
        getContentPane().add(HorariosAlumnos1);
        HorariosAlumnos1.setBounds(747, 93, 148, 25);

        AltaUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltaUsuario.setText("Altas de Usuarios");
        AltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(AltaUsuario);
        AltaUsuario.setBounds(70, 300, 197, 27);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton4.setText("Modificar Usuarios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 420, 197, 27);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setText("Usuarios");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 150, 140, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setText("Consultar Usuarios");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 190, 230, 26);

        eliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        eliminar.setText("Eliminar Usuarios");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(590, 420, 197, 27);

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Usuario", "Contraseña", "Tipo de Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablausuarios.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablausuarios);
        if (tablausuarios.getColumnModel().getColumnCount() > 0) {
            tablausuarios.getColumnModel().getColumn(0).setResizable(false);
            tablausuarios.getColumnModel().getColumn(1).setResizable(false);
            tablausuarios.getColumnModel().getColumn(2).setResizable(false);
            tablausuarios.getColumnModel().getColumn(3).setResizable(false);
            tablausuarios.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(362, 298, 452, 98);
        getContentPane().add(camponombre);
        camponombre.setBounds(892, 347, 132, 20);
        getContentPane().add(campousuario);
        campousuario.setBounds(892, 385, 132, 20);

        campocontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(campocontraseña);
        campocontraseña.setBounds(892, 421, 132, 20);

        Modificar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Modificar.setText("Actualizar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(880, 520, 140, 25);
        getContentPane().add(campoid);
        campoid.setBounds(892, 298, 132, 20);

        label1.setText("jLabel1");
        getContentPane().add(label1);
        label1.setBounds(1010, 50, 150, 30);

        tipousuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Invitado" }));
        getContentPane().add(tipousuario);
        tipousuario.setBounds(890, 470, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // Link para modulo horarios externos
        HorariosExternos obj=new HorariosExternos();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // Link para modulo usuarios
        Usuarios obj=new Usuarios();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // Link para modulo generación de horarios
        PaginaPrincipalGeneraciondeHorarios obj=new PaginaPrincipalGeneraciondeHorarios();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // Link para modulo cuatrimestres
        cuatrimestres obj=new cuatrimestres();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // Link para modulo horarios alumnos
        HorariosAlumnos obj=new HorariosAlumnos();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void HorariosAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnos1ActionPerformed
        // Link para modulo asignar materias
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HorariosAlumnos1ActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_DocentesActionPerformed

    private void AltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaUsuarioActionPerformed
        // Link para altas usuarios
        AltasUsuarios obj=new AltasUsuarios(altusu);
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AltaUsuarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int fila= tablausuarios.getSelectedRow();
    if(fila>=0){
        campoid.setText(tablausuarios.getValueAt(fila, 0).toString());
        camponombre.setText(tablausuarios.getValueAt(fila, 1).toString());
        campousuario.setText(tablausuarios.getValueAt(fila, 2).toString());
        campocontraseña.setText(tablausuarios.getValueAt(fila, 3).toString());
        
    }
    else{
    JOptionPane.showMessageDialog(rootPane,"no seleciono fila");
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String id=tablausuarios.getValueAt(tablausuarios.getSelectedRow(), 0).toString();
        try {
            
            // si gustamos imprimir el id
            //JOptionPane.showMessageDialog(rootPane, id);
            Statement st = con2.createStatement();
          //modelo.executeUpdate("DELETE FROM asignatura WHERE ='"+id+"'");
            st.executeUpdate("DELETE FROM usuarios WHERE id='"+id+"'");
    
            JOptionPane.showMessageDialog(rootPane,"Usuario eliminado correctamente");
            mostrardatos();
           } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Selecciona un usuario" + e);
            System.out.print(e);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       //MENU DONDE SE REALIZA LA ACTUALIZACION.
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void campocontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocontraseñaActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
        PreparedStatement pst;
            pst = con2.prepareStatement("UPDATE usuarios SET nombre='"+camponombre.getText()+"',nombre_usuario='"+campousuario.getText()+"',contrasena='"+campocontraseña.getText()+"',tipo_usuario='"+tipousuario.getSelectedItem()+"' WHERE id='"+campoid.getText()+"'");
        pst.executeUpdate();
        mostrardatos();
        limpiar();
        JOptionPane.showInternalMessageDialog(null, "Información Actualizada");
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    }//GEN-LAST:event_ModificarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaUsuario;
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosAlumnos1;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JTextField campocontraseña;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField camponombre;
    private javax.swing.JTextField campousuario;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label1;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JComboBox tipousuario;
    private javax.swing.JLabel usuar;
    // End of variables declaration//GEN-END:variables
Conexion con=new Conexion();
        Connection con2=con.conexion();
        DefaultTableModel modelo;
        private String altusu;
}
