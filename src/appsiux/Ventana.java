package appsiux;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFileChooser;



public class Ventana extends javax.swing.JFrame implements Serializable{

    //javax.swing.JList<String> listMateria;
    static MateriaListModel modelMaterias = new MateriaListModel();
    static AlumnoListModel modelAlumnos= new AlumnoListModel();
    static ProfesorListModel modelProfesores = new ProfesorListModel();
    public static int n=0; //id alumno
    public static int m=0;//id profesor
    public static int o=0;//id materia
    Ventana v;
   

   
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        buttonProfesores = new javax.swing.JButton();
        buttonMaterias = new javax.swing.JButton();
        buttonAlumnos = new javax.swing.JButton();
        buttonBuscar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonCargar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(414, 233));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonProfesores.setForeground(new java.awt.Color(255, 255, 255));
        buttonProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonProfesores.setText("Profesores");
        buttonProfesores.setBorder(null);
        buttonProfesores.setBorderPainted(false);
        buttonProfesores.setContentAreaFilled(false);
        buttonProfesores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(buttonProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        buttonMaterias.setForeground(new java.awt.Color(255, 255, 255));
        buttonMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonMaterias.setText("Materias");
        buttonMaterias.setBorder(null);
        buttonMaterias.setBorderPainted(false);
        buttonMaterias.setContentAreaFilled(false);
        buttonMaterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 30));

        buttonAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        buttonAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonAlumnos.setText("Alumnos");
        buttonAlumnos.setBorder(null);
        buttonAlumnos.setBorderPainted(false);
        buttonAlumnos.setContentAreaFilled(false);
        buttonAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 30));

        buttonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonBuscar.setText("Buscar");
        buttonBuscar.setBorder(null);
        buttonBuscar.setBorderPainted(false);
        buttonBuscar.setContentAreaFilled(false);
        buttonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, 30));

        buttonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        buttonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.setBorder(null);
        buttonGuardar.setBorderPainted(false);
        buttonGuardar.setContentAreaFilled(false);
        buttonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 30));

        buttonCargar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bNaranja.png"))); // NOI18N
        buttonCargar.setText("Cargar");
        buttonCargar.setBorder(null);
        buttonCargar.setBorderPainted(false);
        buttonCargar.setContentAreaFilled(false);
        buttonCargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 30));

        buttonSalir.setText("SALIR");
        buttonSalir.setBorderPainted(false);
        buttonSalir.setContentAreaFilled(false);
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SIUpng.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoVentana4.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(424, 233));
        jLabel1.setMinimumSize(new java.awt.Dimension(422, 233));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMateriasActionPerformed
    VerMaterias vermaterias;
    vermaterias = new VerMaterias(modelMaterias, v);
    vermaterias.setVisible(true);
     
    }//GEN-LAST:event_buttonMateriasActionPerformed
    
    private void buttonAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlumnosActionPerformed
        v = new Ventana();
        VerAlumnos veralumnos= new VerAlumnos(modelMaterias, modelAlumnos,v);
        veralumnos.setVisible(true);
    }//GEN-LAST:event_buttonAlumnosActionPerformed

    private void buttonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProfesoresActionPerformed
        VerProfesores verprofesores= new VerProfesores( modelMaterias, modelProfesores, v);
        verprofesores.setVisible(true);
    }//GEN-LAST:event_buttonProfesoresActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
       Buscar buscar = new Buscar(modelMaterias, modelProfesores, modelAlumnos);
       buscar.setVisible(true);
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
     //Creamos el objeto JFileChooser
    JFileChooser fc=new JFileChooser();
    //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
    int seleccion=fc.showSaveDialog(this);
    //Si el usuario, da clic en aceptar
    if(seleccion==JFileChooser.APPROVE_OPTION){
     //Seleccionamos el fichero
    File fichero =fc.getSelectedFile();
    ObjectOutputStream escribiendoFichero = null;
        try {
            escribiendoFichero = new ObjectOutputStream( 
                     new FileOutputStream(fichero.getAbsolutePath()+".dat"));
                     
        
        escribiendoFichero.writeObject(modelAlumnos.getListAlumno());
        escribiendoFichero.writeObject(modelMaterias.getListMateria());
        escribiendoFichero.writeObject(modelProfesores.getProfesorList());
        escribiendoFichero.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if(seleccion == JFileChooser.CANCEL_OPTION){
        JOptionPane.showMessageDialog(this,"Cancelado");
    }else if (seleccion== JFileChooser.ERROR_OPTION){
         JOptionPane.showMessageDialog(this,"Error");
    }
    
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void buttonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarActionPerformed
    JFileChooser fc=new JFileChooser();
    //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
    int seleccion=fc.showOpenDialog(this);
    //Si el usuario, da clic en aceptar
    if(seleccion==JFileChooser.APPROVE_OPTION){
    //Seleccionamos el fichero
    File fichero=fc.getSelectedFile();
    //Ecribe la ruta del fichero seleccionado en el campo de texto
    fichero.getAbsolutePath();
      try {                                         
            ObjectInputStream leyendoFichero = null;
           
            leyendoFichero = new ObjectInputStream(new FileInputStream( fichero.getAbsolutePath()));
            
            modelAlumnos.setListAlumnos(( ArrayList <Alumno> )leyendoFichero.readObject());
            modelMaterias.setListMateria(( ArrayList <Materia> )leyendoFichero.readObject());
            modelProfesores.setListProfesor(( ArrayList <Profesor> )leyendoFichero.readObject());
                leyendoFichero.close();
               
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_buttonCargarActionPerformed

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = ++n;
    }

    public static int getM() {
        return m;
    }

    public static void setM(int m) {
        Ventana.m = ++m;
    }

    public static int getO() {
        return o;
    }

    public static void setO(int o) {
        Ventana.o = ++o;
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlumnos;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonCargar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonMaterias;
    private javax.swing.JButton buttonProfesores;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}