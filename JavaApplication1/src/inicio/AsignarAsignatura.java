/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;

import Conexion_base_de_datos.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


//librerias posibles solo las agrege por que en los ejemplos asi salia..-.

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;
import java.time.Clock;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author BENJAMIN
 */
public class AsignarAsignatura extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public AsignarAsignatura() {
        initComponents();
        mostrardatosencombobox1();
        mostrardatosencombobox2();
        mostrardatosencombobox3();
        mostrardatosencombobox4();
        mostrardatosencombobox5();
        mostrardatosdocente();
        setResizable(false);
        setSize(1350,750);
        setTitle("Asignar asignaturas");
        
      
        
        
        
    }
    
    
    
      
    //maS para los combo box
   
   
    
    
    
            
            
            
        
        
    

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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HorariosAlumnos1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboasignatura1 = new javax.swing.JComboBox();
        comboasignatura2 = new javax.swing.JComboBox();
        comboasignatura3 = new javax.swing.JComboBox();
        comboasignatura4 = new javax.swing.JComboBox();
        comboasignatura5 = new javax.swing.JComboBox();
        nombredocenteasignatura = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jSeparator1.setBounds(0, 85, 1592, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1592, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 675, 1592, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 617, 56);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1469, 51, 113, 25);

        jLabel1.setText("Nombre del Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1344, 57, 93, 14);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Página Principal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(843, 137, 222, 35);

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
                .addContainerGap(778, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 683, 1592, 23);

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

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("Asignar Asignatura");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(881, 178, 145, 17);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setText("Seleccione el Docente para Asignar Asignatura");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 310, 282, 17);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Materia 1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 310, 71, 21);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Materia 2");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 370, 71, 21);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Materia 3");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 440, 71, 21);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Materia 4");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(620, 510, 71, 21);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Materia 5");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(620, 570, 71, 21);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(790, 610, 100, 25);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton3.setText("Cancelar");
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 610, 100, 25);

        comboasignatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboasignatura1ActionPerformed(evt);
            }
        });
        getContentPane().add(comboasignatura1);
        comboasignatura1.setBounds(730, 310, 283, 20);

        comboasignatura2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboasignatura2MouseClicked(evt);
            }
        });
        comboasignatura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboasignatura2ActionPerformed(evt);
            }
        });
        getContentPane().add(comboasignatura2);
        comboasignatura2.setBounds(730, 370, 283, 20);

        getContentPane().add(comboasignatura3);
        comboasignatura3.setBounds(730, 440, 280, 20);

        getContentPane().add(comboasignatura4);
        comboasignatura4.setBounds(730, 510, 283, 20);

        comboasignatura5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboasignatura5ActionPerformed(evt);
            }
        });
        getContentPane().add(comboasignatura5);
        comboasignatura5.setBounds(730, 570, 283, 20);

        nombredocenteasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombredocenteasignaturaActionPerformed(evt);
            }
        });
        getContentPane().add(nombredocenteasignatura);
        nombredocenteasignatura.setBounds(220, 360, 300, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // Link para modulo horarios externos
        HorariosExternos obj=new HorariosExternos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // Link para modulo usuarios
        Usuarios obj=new Usuarios();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // Link para modulo usuarios
        PaginaPrincipalGeneraciondeHorarios obj=new PaginaPrincipalGeneraciondeHorarios();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // Link para modulo cuatrimestres
        cuatrimestres obj=new cuatrimestres();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // Link para modulo horarios alumnos
        HorariosAlumnos obj=new HorariosAlumnos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HorariosAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnos1ActionPerformed
        // Link para modulo horarios alumnos
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HorariosAlumnos1ActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        dispose();  
    }//GEN-LAST:event_DocentesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String mensajeerror="Error al guardar";
        //podemos programarlo de esta manera o de la anterior donde separabamos donde teniamos el String
        //getSelectedItem va despues del combo box ----
        
        //String sql="INSERT INTO cuatrimestre (no_cuatrimestre,turno,grupo)VALUES('"+cuatrimestreactivar.getSelectedItem()+"','"+turnoactivar.getSelectedItem()+"','"+grupoactivar.getSelectedItem()+"')";
            
        
        String sqlasignaturas="INSERT INTO asignacion_materia (asignatura1,asignatura2,asignatura3,asignatura4,asignatura5,nombrecompletodocente,id_docente_asignarmateria) VALUES ('"+comboasignatura1.getSelectedItem()+"','"+comboasignatura2.getSelectedItem()+"','"+comboasignatura3.getSelectedItem()+"','"+comboasignatura4.getSelectedItem()+"','"+comboasignatura5.getSelectedItem()+"','"+nombredocenteasignatura.getSelectedItem()+"','"+nombredocenteasignatura.getSelectedIndex()+"')";
        try {
            //se usa el mismo execute y preparestatement
            PreparedStatement pst=con3.prepareStatement(sqlasignaturas);
             //pst.setString(1,tablaasignarasignaturas.getText());
            int n=pst.executeUpdate();
            if (n>=0){
             //mensajes de felicidades
                JOptionPane.showMessageDialog(rootPane,"registrado con exito en la base de datos");
                System.out.println("Guardado correctamente");
                // poner el metodo actualizar mostrardatos();
            }
            {

            }
        }catch (Exception e){
            //lo puse de esta manera para mostrarle que no introdujo correctamente los datos
            JOptionPane.showMessageDialog(rootPane,mensajeerror);
            //este mensaje solo se imprimira en el registro--
            System.out.println("Ingresa los datos correctamente" + e);

        
    }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboasignatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboasignatura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboasignatura1ActionPerformed

    private void comboasignatura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboasignatura2ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_comboasignatura2ActionPerformed

    private void comboasignatura2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboasignatura2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboasignatura2MouseClicked

    private void comboasignatura5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboasignatura5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboasignatura5ActionPerformed

    private void nombredocenteasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombredocenteasignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombredocenteasignaturaActionPerformed
 
   //combobox numero 1
    private void mostrardatosencombobox1(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre FROM asignatura";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        comboasignatura1.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre"));
         
         modelocombo.add(rs.getString("nombre"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           comboasignatura1.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }
    //combobox numero 2
    private void mostrardatosencombobox2(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre FROM asignatura";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        comboasignatura2.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre"));
         
         modelocombo.add(rs.getString("nombre"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           comboasignatura2.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }
    //combobox numero 3
    private void mostrardatosencombobox3(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre FROM asignatura";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        comboasignatura3.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre"));
         
         modelocombo.add(rs.getString("nombre"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           comboasignatura3.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }
    //combobox numero 4
    private void mostrardatosencombobox4(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre FROM asignatura";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        comboasignatura4.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre"));
         
         modelocombo.add(rs.getString("nombre"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           comboasignatura4.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }
    //combobox numero 5
    private void mostrardatosencombobox5(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre FROM asignatura";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        comboasignatura5.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre"));
         
         modelocombo.add(rs.getString("nombre"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           comboasignatura5.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }
    //para seleccionar el docente
    private void mostrardatosdocente(){
        ArrayList modelocombo=new ArrayList();
        String consulta="SELECT nombre_completo,id_docente FROM docentes";
       try {
        Statement st= con3.createStatement();
        ResultSet rs =st.executeQuery(consulta);
        nombredocenteasignatura.removeAllItems();
         while(rs.next()){
             System.out.println(rs.getString("nombre_completo"));
         
         modelocombo.add(rs.getString("nombre_completo"));
         //cmbDB.addItem("modelocombo");
         //String consultaatabla = rs.getString("nombre");
         }  
         
         for(int i=0; i<modelocombo.size();i++){
           nombredocenteasignatura.addItem(modelocombo.get(i));  
         }
                   
        System.out.println("Si consulta");
        //System.out.println(rs.getString("nombre"));
           //JOptionPane.showMessageDialog(rootPane,"Se consulto correctamente");
         
        } catch (Exception e) {
            System.out.println("No funciona"+e);
            JOptionPane.showMessageDialog(rootPane,"Error al consultar");
        } 
    
    
    }



    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosAlumnos1;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JComboBox comboasignatura1;
    private javax.swing.JComboBox comboasignatura2;
    private javax.swing.JComboBox comboasignatura3;
    private javax.swing.JComboBox comboasignatura4;
    private javax.swing.JComboBox comboasignatura5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox nombredocenteasignatura;
    // End of variables declaration//GEN-END:variables

 Conexion con=new Conexion();
        Connection con2=con.conexion();
        Connection con3=con.conexion();
        DefaultTableModel modeloasignarasignatura;
        
        //otra conexion para ver si funciona el combo box consultando de la base de datos
        
       
        
        
        }