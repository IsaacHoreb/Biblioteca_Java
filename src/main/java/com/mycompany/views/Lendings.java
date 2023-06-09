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

public class Lendings extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Lendings() {
        initComponents();
        InitStyle();
        leyenda();
    }

    public final void leyenda() {
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario");
        libroTxt.putClientProperty("JTextField.placeholderText", "Ingrese el id del libro");
    }

    private void InitStyle() {
        folioUser.putClientProperty("FlatLaf.styleClass", "large");
        folioUser.setForeground(Color.black);
        libroId.putClientProperty("FlatLaf.styleClass", "large");
        libroId.setForeground(Color.black);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        libroId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        libroId.setText("Libro ID");

        folioTxt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        folioTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Prestar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prestamo.jpg"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jSeparator1)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(folioTxt)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(libroId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(207, 207, 207))
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(libroTxt)
                .addGap(10, 10, 10))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(folioUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(182, 182, 182))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(236, 236, 236))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1)
                .addGap(10, 10, 10))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(libroId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(libroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(folioUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(360, 360, 360))
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

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
            DAOUsers daoUser = new DAOUserImp();

            // Validamos existencia del usuario
            Users_models currentUser = daoUser.getUserById(Integer.parseInt(folio));
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
            } // Validamos disponibilidad del libro.
            else if (currentBook.getAvailable() < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más libros disponibles con esa ID para prestar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroTxt.requestFocus();
                return;
            }

            DAOLendings daoLendings = new DAOLendingsImpl();

            // Validamos que el usuario no tenga ya ese libro prestado.
            Lendings_models currentLending = daoLendings.getLending(currentUser, currentBook);
            if (currentLending != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroTxt.requestFocus();
                return;
            }

            // Todo OK: Prestamos libro.
            Lendings_models lending = new Lendings_models();
            lending.setBook_id(currentBook.getId());
            lending.setUser_id(currentUser.getId());
            lending.setDate_out(Utils.getFechaActual());
            daoLendings.registrar(lending);

            // Modificamos el libro restandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() - 1);
            daoBooks.modificar(currentBook);

            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getName() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroTxt.setText("");

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
    // End of variables declaration//GEN-END:variables
}
