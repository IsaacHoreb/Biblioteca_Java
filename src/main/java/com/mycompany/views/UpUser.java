package com.mycompany.views;

import com.company.interfaces.DAOUsers;
import com.mycompany.ilib.DAOUserImp;
import com.mycompany.models.Users_models;

public class UpUser extends javax.swing.JPanel {

    //Lo hacemos global
    boolean isEdition = false;
    Users_models userEdition;

    public UpUser() {
        initComponents();
        leyenda();
    }

    //Segundo constructor, para que sea una edicio y no una creacion nueva de JPanel
    public UpUser(Users_models user) {
        initComponents();
        isEdition = true;
        userEdition = user;
        leyenda();
    }

    public final void leyenda() {
        nameTxt.putClientProperty("JTextField.placeholderText", "Ingrese el Nombre");
        ap1.putClientProperty("JTextField.placeholderText", "Ingrese el Apellido Paterno");
        ap2.putClientProperty("JTextField.placeholderText", "Ingrese el Apellido Materno");
        domic.putClientProperty("JTextField.placeholderText", "Ingrese el Domicilio");
        telef.putClientProperty("JTextField.placeholderText", "Ingrese el Telefono");

        //Si es la Edit, todo cambiara, es para el constructor 2
        if (isEdition) {
            Titles.setText("Editar Usuarios");
            button.setText("Guardar");

            if (userEdition != null) {
                nameTxt.setText(userEdition.getName());
                ap1.setText(userEdition.getLast_name_p());
                ap2.setText(userEdition.getLast_name_m());
                domic.setText(userEdition.getDomicilio());
                telef.setText(userEdition.getTel());
            }

        }

    }

    public void limpiar() {
        nameTxt.setText("");
        ap1.setText("");
        ap2.setText("");
        domic.setText("");
        telef.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titles = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        Text4 = new javax.swing.JLabel();
        ap2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        domic = new javax.swing.JTextField();
        Text6 = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        Titles.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titles.setText("Registrar Nuevo Usuario");

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Nombre");

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Apellido Paterno");

        ap1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap1ActionPerformed(evt);
            }
        });

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Apellido Materno");

        ap2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Domicilio");

        domic.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Teléfono");

        telef.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setPreferredSize(new java.awt.Dimension(167, 35));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Titles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(210, 210, 210))
                            .addComponent(nameTxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(159, 159, 159))
                            .addComponent(ap1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(154, 154, 154))
                            .addComponent(ap2))))
                .addGap(66, 66, 66)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(204, 204, 204))
                    .addComponent(domic)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(208, 208, 208))
                    .addComponent(telef)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(domic, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap1ActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        try {
            String nombre = nameTxt.getText();
            String apP = ap1.getText();
            String apM = ap2.getText();
            String dom = domic.getText();
            String tel = telef.getText();

            //Validacion los campos
            if (nombre.isEmpty() || apP.isEmpty() || apM.isEmpty() || dom.isEmpty() || tel.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                nameTxt.requestFocus();
                return;
            }

            //CREO EL OBJETO
            DAOUsers dao = new DAOUserImp();

            Users_models user = isEdition ? userEdition : new Users_models(); //Creamo la instancia

            user.setName(nombre);
            user.setLast_name_p(apP);
            user.setLast_name_m(apM);
            user.setDomicilio(dom);
            user.setTel(tel);

            if (!isEdition) {
                dao.registar(user);
            } else {
                dao.modificar(user);
            }

            //Es un modo para enviar el mensaje que se desea 
            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " Exitosamente\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                limpiar();
            }

        } catch (Exception e) {
            //Es un modo para enviar el mensaje que se desea
            String errorMsg = isEdition ? "modificar" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un error al " + errorMsg + " el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Titles;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JButton button;
    private javax.swing.JTextField domic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField telef;
    // End of variables declaration//GEN-END:variables
}
