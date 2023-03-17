package com.mycompany.views;

import com.company.interfaces.DAOBooks;
import com.company.interfaces.DAOLendings;
import com.company.interfaces.DAOUsers;
import com.company.utiles.Utils;
import com.mycompany.ilib.DAOBooksImp;
import com.mycompany.ilib.DAOLendingsImpl;
import com.mycompany.ilib.DAOUserImp;
import com.mycompany.models.Books_models;
import com.mycompany.models.Lendings_models;
import com.mycompany.models.Users_models;
import java.awt.Color;
import java.util.Date;

public class Returns extends javax.swing.JPanel {

    //Inicializacion para los dias
    private final int MAX_DAYS_RETURN = 5;
    private final int COST_DAY_SANC = 10;

    public Returns() {
        initComponents();
        InitStyle();
        leyenda();
    }

    public final void leyenda() {
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario");
        libroTxt.putClientProperty("JTextField.placeholderText", "Ingrese el id del libro");
    }

    private void InitStyle() {
        titleTxt.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        titleTxt.setForeground(Color.black);
        folioUser.putClientProperty("FlatLaf.styleClass", "large");
        folioUser.setForeground(Color.black);
        libroId.putClientProperty("FlatLaf.styleClass", "large");
        libroId.setForeground(Color.black);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        folioUser = new javax.swing.JLabel();
        libroTxt = new javax.swing.JTextField();
        libroId = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        titleTxt = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        folioUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        folioUser.setText("Folio Usuario");

        libroTxt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        libroTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        libroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroTxtActionPerformed(evt);
            }
        });

        libroId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        libroId.setText("Libro ID");

        folioTxt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        folioTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Devolver");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        titleTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleTxt.setText("Devolución de Libro");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iStock.jpg"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folioUser)
                            .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(libroId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(folioUser)
                .addGap(10, 10, 10)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imagen))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(libroId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(libroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleTxt))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void libroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libroTxtActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        String folio = folioTxt.getText();
        String bookId = libroTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {

            DAOUsers daoUsers = new DAOUserImp();

            // Validamos existencia del usuario
            Users_models currentUser = daoUsers.getUserById(Integer.parseInt(folio));
            if (currentUser == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }

            DAOBooks daoBooks = new DAOBooksImp();

            // Validamos existencia del libro
            Books_models currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            if (currentBook == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroTxt.requestFocus();
                return;
            }

            DAOLendings daoLendings = new DAOLendingsImpl();

            // Validamos que el usuario tenga ese libro prestado.
            Lendings_models currentLending = daoLendings.getLending(currentUser, currentBook);
            if (currentLending == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroTxt.requestFocus();
                return;
            }

            // Todo OK: Devolvemos libro.
            currentLending.setDate_return(Utils.getFechaActual());
            daoLendings.modificar(currentLending);

            // Modificamos el libro sumandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() + 1);
            daoBooks.modificar(currentBook);

            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " devuelto exitosamente por " + currentUser.getName() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroTxt.setText("");

            // Verificamos sanciones
            int days = Utils.diferenciasDeFechas(Utils.stringToDate(currentLending.getDate_out()), new Date());
            if (days > MAX_DAYS_RETURN) {
                int daysDelayed = days - MAX_DAYS_RETURN;
                int sancMoney = daysDelayed * COST_DAY_SANC;

                // Aumentamos sanción del usuario y en dinero.
                currentUser.setSanctions(currentUser.getSanctions() + 1);
                currentUser.setSanc_money(currentUser.getSanc_money() + sancMoney);
                daoUsers.sancionar(currentUser);
                javax.swing.JOptionPane.showMessageDialog(this, "¡USUARIO SANCIONADO POR ENTREGA A DESTIEMPO! ($" + sancMoney + ") \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel folioUser;
    private javax.swing.JLabel imagen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel libroId;
    private javax.swing.JTextField libroTxt;
    private javax.swing.JLabel titleTxt;
    // End of variables declaration//GEN-END:variables
}
