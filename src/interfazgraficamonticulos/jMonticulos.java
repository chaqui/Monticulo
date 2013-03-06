/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficamonticulos;

import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author chaqui
 * A Dios sea la Gloria
 */
public class jMonticulos extends javax.swing.JFrame {
   private Monticulo mont = new  Monticulo();
   private int p1;
   private UltimaLinea ultima = new UltimaLinea();
   private boolean bp1=true;
   private boolean bp2=false, bl=true,bp=true;

    /**
     * Creates new form jMonticulos
     */
    public jMonticulos() {
        initComponents();
        this.repaint();
    }


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
        jLabelNomN = new javax.swing.JLabel();
        jLabelTel1 = new javax.swing.JLabel();
        jLabelClaveN = new javax.swing.JLabel();
        jNombreR = new javax.swing.JLabel();
        jTelefonoR = new javax.swing.JLabel();
        jClaveR = new javax.swing.JLabel();

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
        jNodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodoMouseExited(evt);
            }
        });

        jNodo1.setText("01");
        jNodo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo1MouseEntered(evt);
            }
        });

        jNodo2.setText("02");
        jNodo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo2MouseEntered(evt);
            }
        });

        jNodo3.setText("03");
        jNodo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo3MouseEntered(evt);
            }
        });

        jNodo4.setText("04");
        jNodo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo4MouseEntered(evt);
            }
        });

        jNodo5.setText("05");
        jNodo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo5MouseEntered(evt);
            }
        });

        jNodo6.setText("06");
        jNodo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo6MouseEntered(evt);
            }
        });

        jNodo7.setText("07");
        jNodo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo7MouseExited(evt);
            }
        });

        jNodo8.setText("08");
        jNodo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo8MouseExited(evt);
            }
        });

        jNodo9.setText("09");
        jNodo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo9MouseExited(evt);
            }
        });

        jNodo10.setText("10");
        jNodo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo10MouseExited(evt);
            }
        });

        jNodo11.setText("11");
        jNodo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo11MouseExited(evt);
            }
        });

        jNodo12.setText("12");
        jNodo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo12MouseExited(evt);
            }
        });

        jNodo13.setText("13");
        jNodo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo13MouseExited(evt);
            }
        });

        jNodo14.setText("14");
        jNodo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo14MouseExited(evt);
            }
        });

        jNodo15.setText("15");
        jNodo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo15MouseExited(evt);
            }
        });

        jNodo16.setText("16");
        jNodo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo16MouseExited(evt);
            }
        });

        jNodo17.setText("17");
        jNodo17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo17MouseExited(evt);
            }
        });

        jNodo18.setText("18");
        jNodo18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo18MouseExited(evt);
            }
        });

        jNodo19.setText("19");
        jNodo19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo19MouseExited(evt);
            }
        });

        jNodo20.setText("20");
        jNodo20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo20MouseExited(evt);
            }
        });

        jNodo21.setText("21");
        jNodo21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo21MouseExited(evt);
            }
        });

        jNodo22.setText("22");
        jNodo22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo22MouseExited(evt);
            }
        });

        jNodo23.setText("23");
        jNodo23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo23MouseExited(evt);
            }
        });

        jNodo24.setText("24");
        jNodo24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo24MouseExited(evt);
            }
        });

        jNodo25.setText("25");
        jNodo25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo25MouseExited(evt);
            }
        });

        jNodo26.setText("26");
        jNodo26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo26MouseExited(evt);
            }
        });

        jNodo27.setText("27");
        jNodo27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo27MouseExited(evt);
            }
        });

        jNodo28.setText("28");
        jNodo28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo28MouseExited(evt);
            }
        });

        jNodo29.setText("29");
        jNodo29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo29MouseExited(evt);
            }
        });

        jNodo30.setText("30");
        jNodo30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNodo30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNodo30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNodo30MouseExited(evt);
            }
        });

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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jNodo27)
                                                        .addGap(70, 70, 70)
                                                        .addComponent(jNodo28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelNomN)
                                                            .addComponent(jLabelTel1)
                                                            .addComponent(jLabelClaveN))
                                                        .addGap(49, 49, 49)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTelefonoR)
                                                            .addComponent(jNombreR)
                                                            .addComponent(jClaveR))
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomN)
                    .addComponent(jNombreR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTel1)
                    .addComponent(jTelefonoR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClaveN)
                    .addComponent(jClaveR))
                .addContainerGap(81, Short.MAX_VALUE))
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
   //Metodo para ingresat Informacion
    private void BtIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngresarActionPerformed

        if (this.jClave.getText()!="" && this.JTelefono1.getText()!="" && this.jNombre.getText()!="") {
            System.out.println(this.jClave.getText());
            int clave = Integer.parseInt(this.jClave.getText());
            try{
            String nombre = this.jNombre.getText();
            String telefono = this.JTelefono1.getText();
            Usuario us = new Usuario(clave,nombre,telefono);

            this.bp2=true;
            if (this.mont.getSize()<31) {
                this.p1=this.mont.getSize();
                this.mont.ingresar(us);
                for (int i = 0; i <= this.p1; i++) {
                    this.listaLabels[i].setText(String.valueOf(this.mont.getClaveUsuario(i)));
                }

                this.listaLabels[this.p1].setVisible(true);
                  this.repaint();   
                 for (int i = 0; i <= this.p1; i++) {
                    this.listaLabels[i].repaint();
                }
            }   
            else
            {
                JOptionPane.showMessageDialog(null, "Numero de nodos completo", "Nodos Completos", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
              catch(Exception e){
                           JOptionPane.showMessageDialog(null, "Un dato mal ingresado ", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            
             JOptionPane.showMessageDialog(null, "Error", "Un campo no tiene datos", JOptionPane.INFORMATION_MESSAGE);

        }
                    
          
            
        
    }//GEN-LAST:event_BtIngresarActionPerformed
    //Metodo para eliminar informacion
    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed

try{
            int p3=this.mont.getSize();
            Usuario us;
            us = this.mont.eliminar();
            this.jClaveS.setText(String.valueOf(us.getClave()));
            this.jNombreS.setText(us.getNombre());
            this.JTelefonoS.setText(us.getElefono());
            this.listaLabels[p3].setText(" ");
            this.listaLabels[p3].setVisible(false);
            System.out.println("error "+String.valueOf(p3)+" "+String.valueOf(this.mont.getSize()));
            for (int i = 0; i < this.mont.getSize(); i++) {
                    this.listaLabels[i].setText(String.valueOf(this.mont.getClaveUsuario(i)));
                }
            this.listaLabels[p3].setText(" ");
            this.listaLabels[this.mont.getSize()].setText(" ");
            this.listaLabels[this.mont.getSize()].setVisible(false);
            System.out.println("p3: "+this.listaLabels[p3]);
            this.repaint();
           
}
catch(NullPointerException e){
               JOptionPane.showMessageDialog(null, "Monticulo Limpio", "Error", JOptionPane.INFORMATION_MESSAGE);
}
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
             this.ingresarLabels();
    }//GEN-LAST:event_formWindowOpened

    private void jNodo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo2MouseClicked
        // TODO add your handling code here:
        this.buscar(2);
    }//GEN-LAST:event_jNodo2MouseClicked

    private void jNodo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo3MouseClicked
        // TODO add your handling code here:
        this.buscar(3);
    }//GEN-LAST:event_jNodo3MouseClicked

    private void jNodo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo4MouseClicked
        // TODO add your handling code here:
        this.buscar(4);
    }//GEN-LAST:event_jNodo4MouseClicked

    private void jNodo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo5MouseClicked
        // TODO add your handling code here:
        this.buscar(5);
    }//GEN-LAST:event_jNodo5MouseClicked

    private void jNodo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo8MouseClicked
        // TODO add your handling code here:
        this.buscar(8);
    }//GEN-LAST:event_jNodo8MouseClicked

    private void jNodo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo9MouseClicked
        // TODO add your handling code here:
        this.buscar(9);
    }//GEN-LAST:event_jNodo9MouseClicked

    private void jNodo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo10MouseClicked
        // TODO add your handling code here:
        this.buscar(10);
    }//GEN-LAST:event_jNodo10MouseClicked

    private void jNodo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo11MouseClicked
        // TODO add your handling code here:
        this.buscar(11);
    }//GEN-LAST:event_jNodo11MouseClicked

    private void jNodo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo12MouseClicked
        // TODO add your handling code here:
        this.buscar(12);
    }//GEN-LAST:event_jNodo12MouseClicked

    private void jNodo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo13MouseClicked
        // TODO add your handling code here:
        this.buscar(13);
    }//GEN-LAST:event_jNodo13MouseClicked

    private void jNodo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo14MouseClicked
        // TODO add your handling code here:
        this.buscar(14);
    }//GEN-LAST:event_jNodo14MouseClicked

    private void jNodo15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo15MouseClicked
        // TODO add your handling code here:
        this.buscar(15);
    }//GEN-LAST:event_jNodo15MouseClicked

    private void jNodo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo16MouseClicked
        // TODO add your handling code here:
        this.buscar(16);
    }//GEN-LAST:event_jNodo16MouseClicked

    private void jNodo17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo17MouseClicked
        // TODO add your handling code here:
        this.buscar(17);
    }//GEN-LAST:event_jNodo17MouseClicked

    private void jNodo18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo18MouseClicked
        // TODO add your handling code here:
        this.buscar(18);
    }//GEN-LAST:event_jNodo18MouseClicked

    private void jNodo19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo19MouseClicked
        // TODO add your handling code here:
        this.buscar(19);
    }//GEN-LAST:event_jNodo19MouseClicked

    private void jNodo20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo20MouseClicked
        // TODO add your handling code here:
        this.buscar(20);
    }//GEN-LAST:event_jNodo20MouseClicked

    private void jNodo21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo21MouseClicked
        // TODO add your handling code here:
        this.buscar(21);
    }//GEN-LAST:event_jNodo21MouseClicked

    private void jNodo22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo22MouseClicked
        // TODO add your handling code here:
        this.buscar(22);
    }//GEN-LAST:event_jNodo22MouseClicked

    private void jNodo23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo23MouseClicked
        // TODO add your handling code here:
        this.buscar(23);
    }//GEN-LAST:event_jNodo23MouseClicked

    private void jNodo24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo24MouseClicked
        // TODO add your handling code here:
        this.buscar(24);
    }//GEN-LAST:event_jNodo24MouseClicked

    private void jNodo25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo25MouseClicked
        // TODO add your handling code here:
        this.buscar(25);
    }//GEN-LAST:event_jNodo25MouseClicked

    private void jNodo26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo26MouseClicked
        // TODO add your handling code here:
         this.buscar(26);
    }//GEN-LAST:event_jNodo26MouseClicked

    private void jNodo27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo27MouseClicked
        // TODO add your handling code here:
         this.buscar(27);
    }//GEN-LAST:event_jNodo27MouseClicked

    private void jNodo28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo28MouseClicked
        // TODO add your handling code here:
        this.buscar(28);
    }//GEN-LAST:event_jNodo28MouseClicked

    private void jNodo29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo29MouseClicked
        // TODO add your handling code here:
        this.buscar(29);
    }//GEN-LAST:event_jNodo29MouseClicked

    private void jNodo30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo30MouseClicked
        // TODO add your handling code here:
        this.buscar(30);
    }//GEN-LAST:event_jNodo30MouseClicked

    private void jNodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodoMouseEntered
        // TODO add your handling code here:
           this.buscar(0);
    }//GEN-LAST:event_jNodoMouseEntered

    private void jNodo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo1MouseEntered
            // TODO add your handling code here:
           this.buscar(1);
    }//GEN-LAST:event_jNodo1MouseEntered

    private void jNodo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo2MouseEntered
        // TODO add your handling code here:
           this.buscar(2);
    }//GEN-LAST:event_jNodo2MouseEntered

    private void jNodo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo3MouseEntered
        // TODO add your handling code here:
           this.buscar(3);
    }//GEN-LAST:event_jNodo3MouseEntered

    private void jNodo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo4MouseEntered
        // TODO add your handling code here:
           this.buscar(4);
    }//GEN-LAST:event_jNodo4MouseEntered

    private void jNodo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo5MouseEntered
        // TODO add your handling code here:
           this.buscar(5);
    }//GEN-LAST:event_jNodo5MouseEntered

    private void jNodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodoMouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodoMouseExited

    private void jNodo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo6MouseEntered
        // TODO add your handling code here:
        this.buscar(6);
    }//GEN-LAST:event_jNodo6MouseEntered

    private void jNodo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo7MouseEntered
        // TODO add your handling code here:
        this.buscar(7);
    }//GEN-LAST:event_jNodo7MouseEntered

    private void jNodo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo7MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo7MouseExited

    private void jNodo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo8MouseEntered
        // TODO add your handling code here:
        this.buscar(8);
    }//GEN-LAST:event_jNodo8MouseEntered

    private void jNodo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo9MouseEntered
        // TODO add your handling code here:
        this.buscar(9);
    }//GEN-LAST:event_jNodo9MouseEntered

    private void jNodo10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo10MouseEntered
        // TODO add your handling code here:
        this.buscar(10);
    }//GEN-LAST:event_jNodo10MouseEntered

    private void jNodo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo11MouseEntered
        // TODO add your handling code here:
        this.buscar(11);
    }//GEN-LAST:event_jNodo11MouseEntered

    private void jNodo12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo12MouseEntered
        // TODO add your handling code here:
        this.buscar(12);
    }//GEN-LAST:event_jNodo12MouseEntered

    private void jNodo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo13MouseEntered
        // TODO add your handling code here:
        this.buscar(13);
    }//GEN-LAST:event_jNodo13MouseEntered

    private void jNodo14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo14MouseEntered
        // TODO add your handling code here:
        this.buscar(14);
    }//GEN-LAST:event_jNodo14MouseEntered

    private void jNodo15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo15MouseEntered
        // TODO add your handling code here:
        this.buscar(15);
    }//GEN-LAST:event_jNodo15MouseEntered

    private void jNodo16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo16MouseEntered
        // TODO add your handling code here:
        this.buscar(16);
    }//GEN-LAST:event_jNodo16MouseEntered

    private void jNodo17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo17MouseEntered
        // TODO add your handling code here:
        this.buscar(17);
    }//GEN-LAST:event_jNodo17MouseEntered

    private void jNodo18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo18MouseEntered
        // TODO add your handling code here:
        this.buscar(18);
    }//GEN-LAST:event_jNodo18MouseEntered

    private void jNodo19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo19MouseEntered
        // TODO add your handling code here:
        this.buscar(19);
    }//GEN-LAST:event_jNodo19MouseEntered

    private void jNodo20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo20MouseEntered
        // TODO add your handling code here:
        this.buscar(20);
    }//GEN-LAST:event_jNodo20MouseEntered

    private void jNodo21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo21MouseEntered
        // TODO add your handling code here:
        this.buscar(21);
    }//GEN-LAST:event_jNodo21MouseEntered

    private void jNodo22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo22MouseEntered
        // TODO add your handling code here:
        this.buscar(22);
    }//GEN-LAST:event_jNodo22MouseEntered

    private void jNodo23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo23MouseEntered
        // TODO add your handling code here:
        this.buscar(23);
    }//GEN-LAST:event_jNodo23MouseEntered

    private void jNodo24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo24MouseEntered
        // TODO add your handling code here:
        this.buscar(24);
    }//GEN-LAST:event_jNodo24MouseEntered

    private void jNodo25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo25MouseEntered
        // TODO add your handling code here:
        this.buscar(25);
    }//GEN-LAST:event_jNodo25MouseEntered

    private void jNodo26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo26MouseEntered
        // TODO add your handling code here:
        this.buscar(26);
    }//GEN-LAST:event_jNodo26MouseEntered

    private void jNodo27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo27MouseEntered
        // TODO add your handling code here:
        this.buscar(27);
    }//GEN-LAST:event_jNodo27MouseEntered

    private void jNodo28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo28MouseEntered
        // TODO add your handling code here:
        this.buscar(28);
    }//GEN-LAST:event_jNodo28MouseEntered

    private void jNodo29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo29MouseEntered
        // TODO add your handling code here:
        this.buscar(29);
    }//GEN-LAST:event_jNodo29MouseEntered

    private void jNodo30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo30MouseEntered
        // TODO add your handling code here:
        this.buscar(30);
    }//GEN-LAST:event_jNodo30MouseEntered

    private void jNodo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo8MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo8MouseExited

    private void jNodo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo9MouseExited
        // TODO add your handling code here:
       this.limpiar();
    }//GEN-LAST:event_jNodo9MouseExited

    private void jNodo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo10MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo10MouseExited

    private void jNodo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo11MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo11MouseExited

    private void jNodo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo12MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo12MouseExited

    private void jNodo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo13MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo13MouseExited

    private void jNodo14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo14MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo14MouseExited

    private void jNodo15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo15MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo15MouseExited

    private void jNodo16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo16MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo16MouseExited

    private void jNodo17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo17MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo17MouseExited

    private void jNodo18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo18MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo18MouseExited

    private void jNodo19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo19MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo19MouseExited

    private void jNodo20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo20MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo20MouseExited

    private void jNodo21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo21MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo21MouseExited

    private void jNodo22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo22MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo22MouseExited

    private void jNodo23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo23MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo23MouseExited

    private void jNodo24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo24MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo24MouseExited

    private void jNodo25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo25MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo25MouseExited

    private void jNodo26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo26MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo26MouseExited

    private void jNodo27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo27MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo27MouseExited

    private void jNodo28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo28MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo28MouseExited

    private void jNodo29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo29MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo29MouseExited

    private void jNodo30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNodo30MouseExited
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jNodo30MouseExited
    private void limpiar(){
          this.jLabelNomN.setText(" ");
        this.jLabelClaveN.setText(" ");
        this.jLabelTel1.setText(" ");
         this.jClaveR.setText(" ");
        this.jNombreR.setText(" ");
        this.jTelefonoR.setText(" ");
    }
    private void buscar(int nodo)
    {
        this.jLabelNomN.setText("Nombre: ");
        this.jLabelClaveN.setText("Clave: ");
        this.jLabelTel1.setText("Telefono: ");
        this.jClaveR.setText(String.valueOf(this.mont.getClaveUsuario(nodo)));
        this.jNombreR.setText(this.mont.getNombreUsuario(nodo));
        this.jTelefonoR.setText(this.mont.getTelefonoUsuario(nodo));
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        int x,y,width,height,x1,y1,padre,b;
        width=30;
        height=30;
        if (bp1) {
            System.out.println("bp1");
            x= this.listaLabels[0].getX()-7;
            y=this.listaLabels[0].getY()+15;
            g.drawArc(x, y, width, height, 0, 360);
            this.bp1=false;
        }
        else{
            if (bp2) {
                //Dbujar arcos
                System.out.println("bp2");
                for (int i = 0; i < this.mont.getSize()+1; i++) {
                    x= this.listaLabels[i].getX()-7;
                    y=this.listaLabels[i].getY()+15;

                    g.drawArc(x, y, width, height, 0, 360);
                
                //Dibujar lineas
                    padre = this.mont.Padre(i);
                    if (padre>=0) {
                        x=this.listaLabels[padre].getX()+10;
                        y=this.listaLabels[padre].getY()+45;
                    }
                        b=i%2;
                        System.out.println("b: "+String.valueOf(b));
                    if (b==0) {
                        x1=this.listaLabels[i].getX()-8;
                        y1=this.listaLabels[i].getY()+30;
                        g.drawLine(x, y, x1, y1);
                    }
                    else{
                         x1=this.listaLabels[i].getX()+20;
                        y1=this.listaLabels[i].getY()+30;
                        g.drawLine(x, y, x1, y1);
                    }

                }
            }
        }          
    }
           
    public static void main(String args[]) {

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
    private javax.swing.JLabel jClaveR;
    private javax.swing.JTextField jClaveS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClaveN;
    private javax.swing.JLabel jLabelNomN;
    private javax.swing.JLabel jLabelTel1;
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
    private javax.swing.JLabel jNombreR;
    private javax.swing.JTextField jNombreS;
    private javax.swing.JLabel jTelefonoR;
    // End of variables declaration//GEN-END:variables
}