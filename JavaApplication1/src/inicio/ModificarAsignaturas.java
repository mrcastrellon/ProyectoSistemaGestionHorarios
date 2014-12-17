/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;

// son los import nesesarios eee
import Conexion_base_de_datos.Conexion;
import inicio.AltasAsignaturas;
import inicio.AltasCuatrimestre;
import inicio.AsignarAsignatura;
import inicio.Docentes;
import inicio.EliminarAsignaturas;
import inicio.HorariosAlumnos;
import inicio.HorariosExternos;
import inicio.IngresaralSistema;
import inicio.PaginaPrincipalGeneraciondeHorarios;
import inicio.Usuarios;
import inicio.cuatrimestres;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 
 */
public class ModificarAsignaturas extends javax.swing.JFrame {
 
    /**
     * Creates new form INTERFAZ
     */
    public ModificarAsignaturas() {
        initComponents();
        mostrardatosmodificar();
    }
     void mostrardatosmodificar(){
                 
       modelomodificar = new DefaultTableModel();
       modelomodificar.addColumn("ID");
       modelomodificar.addColumn("Nombre");
       modelomodificar.addColumn("Clave");
       modelomodificar.addColumn("creditos");
       modelomodificar.addColumn("horas");
           
            String sqlmodificar = "SELECT *FROM asignatura WHERE cuatrimestre_id LIKE '%" + buscarmodificarr.getText() + "%' "
                    + "OR nombre LIKE '%" + buscarmodificarr.getText() + "%'"
                    + "OR clave LIKE '%" + buscarmodificarr.getText() + "%'"
                    + "OR creditos LIKE '%" + buscarmodificarr.getText() + "%'"
                    + "OR horas LIKE '%" + buscarmodificarr.getText() + "%'";
        
        tablamodificarasignaturas.setModel(modelomodificar);
        String []datos = new String [10];
        try{
        Statement st = con2.createStatement();
        ResultSet rs= st.executeQuery(sqlmodificar);
        while (rs.next()){
        datos [0]=rs.getString(1);
        datos [1]=rs.getString(2);
        datos [2]=rs.getString(3);
        datos [3]=rs.getString(4);
        datos [4]=rs.getString(5);
        
        
         modelomodificar.addRow(datos);
        tablamodificarasignaturas.setModel(modelomodificar);
}
    }catch (Exception e){
       //  Logger.getLogger(consultadocentes.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("chupando faros" + e);
    }
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
        AltasdeUsuarios = new javax.swing.JButton();
        AsignaciondePrivilegios = new javax.swing.JButton();
        ModificaciondeUsuarios = new javax.swing.JButton();
        ConsultarUsuarios = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AltaGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamodificarasignaturas = new javax.swing.JTable();
        botonguardarcambio = new javax.swing.JButton();
        campoid = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        nombremodificar = new javax.swing.JTextField();
        Id1 = new javax.swing.JLabel();
        creditosmodificar = new javax.swing.JTextField();
        clavemodificar = new javax.swing.JTextField();
        horasmodificar = new javax.swing.JTextField();
        Id2 = new javax.swing.JLabel();
        Creditos = new javax.swing.JLabel();
        Creditos1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        try {
            buscarmodificarr =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "inicio.ModificarAsignaturas_buscarmodificarr");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

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

        AsignarMaterias.setBackground(new java.awt.Color(255, 102, 0));
        AsignarMaterias.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AsignarMaterias.setText("Asignar Materias");
        AsignarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarMateriasActionPerformed(evt);
            }
        });

        AltasdeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasdeUsuarios.setText("Altas Asignaturas");
        AltasdeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasdeUsuariosActionPerformed(evt);
            }
        });

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Modificar Asignatura");
        AsignaciondePrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaciondePrivilegiosActionPerformed(evt);
            }
        });

        ModificaciondeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ModificaciondeUsuarios.setText("Eliminar Asignatura");
        ModificaciondeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaciondeUsuariosActionPerformed(evt);
            }
        });

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Alta Cuatrimestres");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Usuarios");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText(" Modificar Asignaturas");

        AltaGuardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AltaGuardar.setText("Guardar");
        AltaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaGuardarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablamodificarasignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablamodificarasignaturas);

        botonguardarcambio.setText("Modificar seleccionado");
        botonguardarcambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarcambioActionPerformed(evt);
            }
        });

        Id.setText("Id");

        Id1.setText("Nombre");

        Id2.setText("Clave");

        Creditos.setText("Creditos");

        Creditos1.setText("Horas");

        jLabel1.setText("Buscar asignatura");

        buscarmodificarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarmodificarrActionPerformed(evt);
            }
        });
        buscarmodificarr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarmodificarrKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LogoUnipoli, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(577, 577, 577))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AltasdeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AsignaciondePrivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificaciondeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscarmodificarr, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Id))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombremodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(clavemodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(creditosmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Creditos1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(horasmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonguardarcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AltaGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(39, 39, 39)
                        .addComponent(AltasdeUsuarios)
                        .addGap(32, 32, 32)
                        .addComponent(AsignaciondePrivilegios)
                        .addGap(33, 33, 33)
                        .addComponent(ModificaciondeUsuarios)
                        .addGap(36, 36, 36)
                        .addComponent(ConsultarUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonguardarcambio)
                            .addComponent(jLabel1)
                            .addComponent(buscarmodificarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Creditos1)
                            .addComponent(Creditos)
                            .addComponent(Id2)
                            .addComponent(Id1)
                            .addComponent(Id))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clavemodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditosmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombremodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaGuardar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Link para cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AsignarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarMateriasActionPerformed
        // Link para modulo horarios alumnos
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_AsignarMateriasActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_DocentesActionPerformed

    private void AltasdeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasdeUsuariosActionPerformed
        // Link para alta de asignatura
        AltasAsignaturas obj=new AltasAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_AltasdeUsuariosActionPerformed

    private void ConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosActionPerformed
        // Link para dar de alta un cuatrimestre
        AltasCuatrimestre obj=new AltasCuatrimestre();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultarUsuariosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Solo para que refresque los datos
        mostrardatosmodificar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AsignaciondePrivilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignaciondePrivilegiosActionPerformed
        // Link para modificar asignatura
        ModificarAsignaturas obj=new ModificarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_AsignaciondePrivilegiosActionPerformed

    private void ModificaciondeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaciondeUsuariosActionPerformed
        // Link para eliminar asignatura
        EliminarAsignaturas obj=new EliminarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModificaciondeUsuariosActionPerformed

    private void botonguardarcambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarcambioActionPerformed
        // TODO add your handling code here:
        try {
        int fila= tablamodificarasignaturas.getSelectedRow();
    if(fila>=0){
        campoid.setText(tablamodificarasignaturas.getValueAt(fila, 0).toString());
        nombremodificar.setText(tablamodificarasignaturas.getValueAt(fila, 1).toString());
        clavemodificar.setText(tablamodificarasignaturas.getValueAt(fila, 2).toString());
        creditosmodificar.setText(tablamodificarasignaturas.getValueAt(fila, 3).toString());
        horasmodificar.setText(tablamodificarasignaturas.getValueAt(fila, 4).toString());
       
        
         }
    }catch (Exception e) {
        System.out.print(e.getMessage());
        JOptionPane.showMessageDialog(rootPane,"Ingresa los datos correctamente");
        mostrardatosmodificar();   
     }    
    }//GEN-LAST:event_botonguardarcambioActionPerformed

      
    private void AltaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaGuardarActionPerformed
       
        try {
        PreparedStatement pst;
        pst = con2.prepareStatement("UPDATE asignatura SET nombre='"+nombremodificar.getText()+"',clave='"+clavemodificar.getText()+"',creditos='"+creditosmodificar.getText()+"',horas='"+horasmodificar.getText()+"' WHERE cuatrimestre_id='"+campoid.getText()+"'");
        pst.executeUpdate();
        mostrardatosmodificar();
        JOptionPane.showMessageDialog(rootPane,"Datos modificados correctamente");
        
          
        }catch (Exception e) {
        System.out.print(e.getMessage());
        JOptionPane.showMessageDialog(rootPane,"Ingrese los datos correctamente");
        mostrardatosmodificar();
        
        
    }           
                
    }//GEN-LAST:event_AltaGuardarActionPerformed

    private void buscarmodificarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarmodificarrActionPerformed
        // TODO add your handling code here:
        mostrardatosmodificar();
    }//GEN-LAST:event_buscarmodificarrActionPerformed

    private void buscarmodificarrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarmodificarrKeyPressed
        // TODO add your handling code here:
        mostrardatosmodificar();
    }//GEN-LAST:event_buscarmodificarrKeyPressed

    
    
   
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AltaGuardar;
    private javax.swing.JButton AltasdeUsuarios;
    private javax.swing.JButton AsignaciondePrivilegios;
    private javax.swing.JButton AsignarMaterias;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultarUsuarios;
    private javax.swing.JLabel Creditos;
    private javax.swing.JLabel Creditos1;
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Id1;
    private javax.swing.JLabel Id2;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JButton ModificaciondeUsuarios;
    private javax.swing.JLabel NombredelUsuario;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton botonguardarcambio;
    public javax.swing.JTextField buscarmodificarr;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField clavemodificar;
    private javax.swing.JTextField creditosmodificar;
    private javax.swing.JTextField horasmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombremodificar;
    private javax.swing.JTable tablamodificarasignaturas;
    // End of variables declaration//GEN-END:variables
   
    
        Conexion con=new Conexion();
        Connection con2=con.conexion();
        DefaultTableModel modelomodificar;
}
