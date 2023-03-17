package com.mycompany.views;

import com.company.interfaces.DAOUsers;
import com.mycompany.ilib.DAOUserImp;
import com.mycompany.ilib.Dashboard;
import javax.swing.table.DefaultTableModel;

public class Users extends javax.swing.JPanel {

    public Users() {
        initComponents();
        leyenda();
        //LoadUsers();
    }

    public final void leyenda() {
        usrnm.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del usuario a buscar");
    }

    private void LoadUsers() {
        try {
            DAOUsers dao = new DAOUserImp();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //Para la tabla
            //List<Users_models> lista = dao.listar();
            model.setRowCount(0); //Limpiar la tabla
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(), u.getLast_name_p(), u.getLast_name_m(), u.getDomicilio(), u.getTel()}));
            //dao.listar().forEach((u) -> System.out.println(u.getName()));
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error", "Mensaje", 2);
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Titles = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(750, 430));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        Titles.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titles.setText("Usuarios");

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        search.setBackground(new java.awt.Color(18, 90, 173));
        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Apellido M.", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(390, 272));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        delete.setBackground(new java.awt.Color(18, 90, 173));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Borrar");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(18, 90, 173));
        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar");
        mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(18, 90, 173));
        nuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(18, 90, 173));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Editar");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titles))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(search))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrar)
                .addGap(11, 11, 11)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Titles)
                .addGap(7, 7, 7)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(edit)
                    .addComponent(mostrar)
                    .addComponent(nuevo)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        Dashboard.ShowJPanel(new UpUser());
    }//GEN-LAST:event_nuevoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        LoadUsers();
    }//GEN-LAST:event_mostrarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            if (jTable1.getSelectedRow() > -1) {
                DAOUsers dao = new DAOUserImp();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //Para la tabla

                for (int i : jTable1.getSelectedRows()) {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a eliminar \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }


    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                int userId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOUsers dao = new DAOUserImp();

                //Para abrir la otra ventana de UpUser, convertido a Edit
                Dashboard.ShowJPanel(new UpUser(dao.getUserById(userId)));

            } catch (Exception e) {
                System.out.println("Error");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a editar \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_editActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            String usersQuery = usrnm.getText();

            if (usersQuery.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debes ingresar el nombre del usuario a buscar \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                usrnm.requestFocus();
                return;
            }

            DAOUsers dao = new DAOUserImp();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //Para la tabla
            //List<Users_models> lista = dao.listar();
            model.setRowCount(0); //Limpiar la tabla
            dao.listar(usersQuery).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(), u.getLast_name_p(), u.getLast_name_m(), u.getDomicilio(), u.getTel()}));
            //dao.listar().forEach((u) -> System.out.println(u.getName()));
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error", "Mensaje", 2);
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio Un Error \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titles;
    private javax.swing.JPanel bg;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton search;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
