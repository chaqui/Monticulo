/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficamonticulos;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.util.LinkedList;

/**
 *
 * @author chaqui
 */
public class jMonticulos extends javax.swing.JFrame {
   private Monticulo mont = new  Monticulo();
   private int p1;
   private UltimaLinea ultima = new UltimaLinea();

    /**
     * Creates new form jMonticulos
     */
    public jMonticulos() {
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

        jNombre = new javax.swing.JTextField();
        jClave = new javax.swing.JTextField();
        JTelefono1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jClaveS = new javax.swing.JTextField();
        jNombreS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTelefonoS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtEliminar = new javax.swing.JButton();
        jNodo = new javax.swing.JLabel();
        jNodo1 = new javax.swing.JLabel();
        jNodo2 = new javax.swing.JLabel();
        jNodo3 = new javax.swing.JLabel();
        jNodo4 = new javax.swing.JLabel();
        jNodo5 = new javax.swing.JLabel();
        jNodo6 = new javax.swing.JLabel();
        jNodo7 = new javax.swing.JLabel();
        jNodo8 = new javax.swing.JLabel();
        jNodo9 = new javax.swing.JLabel();
        jNodo10 = new javax.swing.JLabel();
        jNodo11 = new javax.swing.JLabel();
        jNodo12 = new javax.swing.JLabel();
        jNodo13 = new javax.swing.JLabel();
        jNodo14 = new javax.swing.JLabel();
        jNodo15 = new javax.swing.JLabel();
        jNodo16 = new javax.swing.JLabel();
        jNodo17 = new javax.swing.JLabel();
        jNodo18 = new javax.swing.JLabel();
        jNodo19 = new javax.swing.JLabel();
        jNodo20 = new javax.swing.JLabel();
        jNodo21 = new javax.swing.JLabel();
        jNodo22 = new javax.swing.JLabel();
        jNodo23 = new javax.swing.JLabel();
        jNodo24 = new javax.swing.JLabel();
        jNodo25 = new javax.swing.JLabel();
        jNodo26 = new javax.swing.JLabel();
        jNodo27 = new javax.swing.JLabel();
        jNodo28 = new javax.swing.JLabel();
        jNodo29 = new javax.swing.JLabel();
        jNodo30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Telefono:");

        jLabel3.setText("Clave:");

        BtIngresar.setText("Ingresar");
        BtIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIngresarActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono:");

        jClaveS.setEnabled(false);

        jNombreS.setEnabled(false);

        jLabel5.setText("Nombre:");

        JTelefonoS.setEnabled(false);

        jLabel6.setText("Clave:");

        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        jNodo.setText("00");

        jNodo1.setText("01");

        jNodo2.setText("02");

        jNodo3.setText("03");

        jNodo4.setText("04");

        jNodo5.setText("05");

        jNodo6.setText("06");

        jNodo7.setText("07");

        jNodo8.setText("08");

        jNodo9.setText("09");

        jNodo10.setText("10");

        jNodo11.setText("11");

        jNodo12.setText("12");

        jNodo13.setText("13");

        jNodo14.setText("14");

        jNodo15.setText("15");

        jNodo16.setText("16");

        jNodo17.setText("17");

        jNodo18.setText("18");

        jNodo19.setText("19");

        jNodo20.setText("20");

        jNodo21.setText("21");

        jNodo22.setText("22");

        jNodo23.setText("23");

        jNodo24.setText("24");

        jNodo25.setText("25");

        jNodo26.setText("26");

        jNodo27.setText("27");

        jNodo28.setText("28");

        jNodo29.setText("29");

        jNodo30.setText("30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNodo15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jNodo16)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jNodo17)
                                .addGap(70, 70, 70)
                                .addComponent(jNodo18)
                                .addGap(45, 45, 45)
                                .addComponent(jNodo19)
                                .addGap(68, 68, 68)
                                .addComponent(jNodo20)
                                .addGap(61, 61, 61)
                                .addComponent(jNodo21)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNodo3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(jNodo1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jNodo8)
                                                .addGap(122, 122, 122)
                                                .addComponent(jNodo9)))
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(275, 275, 275)
                                                .addComponent(jNodo))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addComponent(jNodo22)
                                                .addGap(51, 51, 51)
                                                .addComponent(jNodo23))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addComponent(jNodo4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jNodo13)
                                                .addGap(115, 115, 115))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(198, 198, 198)
                                                .addComponent(jNodo26)
                                                .addGap(59, 59, 59)
                                                .addComponent(jNodo27)
                                                .addGap(70, 70, 70)
                                                .addComponent(jNodo28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)))
                                        .addGap(7, 7, 7)
                                        .addComponent(jNodo29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jNodo14)
                                                .addGap(76, 76, 76))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jNodo30)
                                                .addGap(34, 34, 34))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jNodo5)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jNodo2)
                                        .addGap(326, 326, 326))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jClave, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(BtIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNodo24)
                                .addGap(531, 531, 531))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jNodo10)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jClaveS, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(632, 632, 632))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTelefonoS, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jNodo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtEliminar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jNodo25)))
                        .addGap(277, 277, 277)
                        .addComponent(jNodo6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNodo11)
                        .addGap(106, 106, 106)
                        .addComponent(jNodo12)))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTelefonoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(BtEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jClaveS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(BtIngresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(46, 46, 46)
                .addComponent(jNodo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNodo1)
                    .addComponent(jNodo2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNodo3)
                    .addComponent(jNodo4)
                    .addComponent(jNodo5)
                    .addComponent(jNodo6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNodo8)
                    .addComponent(jNodo9)
                    .addComponent(jNodo10)
                    .addComponent(jNodo11)
                    .addComponent(jNodo12)
                    .addComponent(jNodo13)
                    .addComponent(jNodo14)
                    .addComponent(jNodo7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNodo16)
                    .addComponent(jNodo17)
                    .addComponent(jNodo18)
                    .addComponent(jNodo19)
                    .addComponent(jNodo20)
                    .addComponent(jNodo21)
                    .addComponent(jNodo22)
                    .addComponent(jNodo23)
                    .addComponent(jNodo24)
                    .addComponent(jNodo27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNodo28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNodo29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNodo30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNodo26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNodo25)
                    .addComponent(jNodo15))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
   private   javax.swing.JLabel[] listaLabels = new   javax.swing.JLabel[31];
   private void ingresarLabels(){
       listaLabels[0]= this.jNodo;
       listaLabels[1]= this.jNodo1;
       listaLabels[2]= this.jNodo2;
       listaLabels[3]= this.jNodo3;
       listaLabels[4]= this.jNodo4;
       listaLabels[5]= this.jNodo5;
       listaLabels[6]= this.jNodo6;
       listaLabels[7]= this.jNodo7;
       listaLabels[8]= this.jNodo8;
       listaLabels[9]= this.jNodo9;
       listaLabels[10]= this.jNodo10;
       listaLabels[11]= this.jNodo11;
       listaLabels[12]= this.jNodo12;
       listaLabels[13]= this.jNodo13;
       listaLabels[14]= this.jNodo14;
       listaLabels[15]= this.jNodo15;
       listaLabels[16]= this.jNodo16;
       listaLabels[17]= this.jNodo17;
       listaLabels[18]= this.jNodo18;
       listaLabels[19]= this.jNodo19;
       listaLabels[20]= this.jNodo20;
       listaLabels[21]= this.jNodo21;
       listaLabels[22]= this.jNodo22;
       listaLabels[23]= this.jNodo23;
       listaLabels[24]= this.jNodo24;
       listaLabels[25]= this.jNodo25;
       listaLabels[26]= this.jNodo26;
       listaLabels[27]= this.jNodo27;
       listaLabels[28]= this.jNodo28;
       listaLabels[29]= this.jNodo29;
       listaLabels[30]= this.jNodo30;
       for (int i = 0; i < 31; i++) {
           listaLabels[i].setVisible(false);
       }
       
   }
   
    private void BtIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngresarActionPerformed
        // TODO add your handling code here:
        if (this.jClave.getText()!="" && this.JTelefono1.getText()!="" && this.jNombre.getText()!="") {
            
            int clave = Integer.getInteger(this.jClave.getText());
            String nombre = this.jNombre.getText();
            String telefono = this.JTelefono1.getText();
            Usuario us = new Usuario(clave,nombre,telefono);
            
            if (this.mont.getSize()<31) {
                this.p1=this.mont.getSize();
                this.mont.ingresar(us);
                
                for (int i = 0; i <= this.p1+1; i++) {
                    this.listaLabels[i].setText(String.valueOf(this.mont.getClaveUsuario(i)));
                }
                
                this.listaLabels[this.p1].setVisible(true);
            }   
            else
            {
                JOptionPane.showMessageDialog(null, "Numero de nodos completo", "Nodos Completos", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        
        else{
            
             JOptionPane.showMessageDialog(null, "Error", "Un campo no tiene datos", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }//GEN-LAST:event_BtIngresarActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        // TODO add your handling code here:
         try
        {
            int p3=this.mont.getSize();
            Usuario us;
            us = this.mont.eliminar();
            this.jClaveS.setText(String.valueOf(us.getClave()));
            this.jNombreS.setText(us.getNombre());
            this.JTelefonoS.setText(us.getElefono());
            this.listaLabels[p3].setText("");
            this.listaLabels[p3].setVisible(false);
            for (int i = 0; i < p3; i++) {
                    this.listaLabels[i].setText(String.valueOf(this.mont.getClaveUsuario(i)));
                }
        }
        catch(NullPointerException e)
        {
            
              JOptionPane.showMessageDialog(null, "Error", "Ya no hay mas elementos que mostrar", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.ingresarLabels();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(jMonticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jMonticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jMonticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jMonticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jMonticulos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtIngresar;
    private javax.swing.JTextField JTelefono1;
    private javax.swing.JTextField JTelefonoS;
    private javax.swing.JTextField jClave;
    private javax.swing.JTextField jClaveS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jNodo;
    private javax.swing.JLabel jNodo1;
    private javax.swing.JLabel jNodo10;
    private javax.swing.JLabel jNodo11;
    private javax.swing.JLabel jNodo12;
    private javax.swing.JLabel jNodo13;
    private javax.swing.JLabel jNodo14;
    private javax.swing.JLabel jNodo15;
    private javax.swing.JLabel jNodo16;
    private javax.swing.JLabel jNodo17;
    private javax.swing.JLabel jNodo18;
    private javax.swing.JLabel jNodo19;
    private javax.swing.JLabel jNodo2;
    private javax.swing.JLabel jNodo20;
    private javax.swing.JLabel jNodo21;
    private javax.swing.JLabel jNodo22;
    private javax.swing.JLabel jNodo23;
    private javax.swing.JLabel jNodo24;
    private javax.swing.JLabel jNodo25;
    private javax.swing.JLabel jNodo26;
    private javax.swing.JLabel jNodo27;
    private javax.swing.JLabel jNodo28;
    private javax.swing.JLabel jNodo29;
    private javax.swing.JLabel jNodo3;
    private javax.swing.JLabel jNodo30;
    private javax.swing.JLabel jNodo4;
    private javax.swing.JLabel jNodo5;
    private javax.swing.JLabel jNodo6;
    private javax.swing.JLabel jNodo7;
    private javax.swing.JLabel jNodo8;
    private javax.swing.JLabel jNodo9;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jNombreS;
    // End of variables declaration//GEN-END:variables
}
