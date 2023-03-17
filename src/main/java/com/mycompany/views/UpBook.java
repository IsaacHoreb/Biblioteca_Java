package com.mycompany.views;

import com.company.interfaces.DAOBooks;
import com.company.utiles.Utils;
import com.mycompany.ilib.DAOBooksImp;
import com.mycompany.models.Books_models;
import java.awt.Color;

public class UpBook extends javax.swing.JPanel {

    //Inicializacion
    boolean isEdition = false;
    Books_models bookEdition;

    public UpBook() {
        initComponents();
        leyenda();
    }

    //Es para la edition para la modificaciones
    public UpBook(Books_models book) {
        initComponents();
        isEdition = true;
        bookEdition = book;
        leyenda();
    }

    public void limpiar() {
        titleTxt.setText("");
        dateTxt.setText("");
        authorTxt.setText("");
        categoryTxt.setText("");
        editTxt.setText("");
        langTxt.setText("");
        pagesTxt.setText("");
        descrTxt.setText("");
        stockTxt.setText("");
        availableTxt.setText("");
        ejemTxt.setText("");
    }

    public final void leyenda() {
        Titles.putClientProperty("FlatLaf.styleClass", "h1");
        Titles.setForeground(Color.black);

        titleTxt.putClientProperty("JTextField.placeholderText", "Ingrese el Titulo");
        dateTxt.putClientProperty("JTextField.placeholderText", "Ingrese la Fecha de Publicación");
        authorTxt.putClientProperty("JTextField.placeholderText", "Ingrese el Autor");
        categoryTxt.putClientProperty("JTextField.placeholderText", "Ingrese la Categoriia");
        editTxt.putClientProperty("JTextField.placeholderText", "Ingrese la Edición");
        langTxt.putClientProperty("JTextField.placeholderText", "Ingrese el Idioma del Libro");
        pagesTxt.putClientProperty("JTextField.placeholderText", "Ingrese las Páginas del Libro");
        descrTxt.putClientProperty("JTextField.placeholderText", "Ingrese la Descripción del Libro");
        stockTxt.putClientProperty("JTextField.placeholderText", "Cantidad Total");
        availableTxt.putClientProperty("JTextField.placeholderText", "Cantidad a Prestar");
        ejemTxt.putClientProperty("JTextField.placeholderText", "Ingrese la Cantidad de Ejemplares");

        if (isEdition) {
            Titles.setText("Editar Books");
            button.setText("Guardar");

            if (bookEdition != null) {
                titleTxt.setText(bookEdition.getTitle());
                dateTxt.setText(bookEdition.getDate());
                authorTxt.setText(bookEdition.getAuthor());
                categoryTxt.setText(bookEdition.getCategoty());
                editTxt.setText(bookEdition.getEdit());
                langTxt.setText(bookEdition.getLang());
                pagesTxt.setText(bookEdition.getPages());
                descrTxt.setText(bookEdition.getDescription());
                stockTxt.setText(bookEdition.getStock() + "");
                availableTxt.setText(bookEdition.getAvailable() + "");
                ejemTxt.setText(bookEdition.getEjemplares());
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titles = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        Text4 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        authorTxt = new javax.swing.JTextField();
        categoryTxt = new javax.swing.JTextField();
        Text6 = new javax.swing.JLabel();
        editTxt = new javax.swing.JTextField();
        Text7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        langTxt = new javax.swing.JTextField();
        Text9 = new javax.swing.JLabel();
        pagesTxt = new javax.swing.JTextField();
        Text10 = new javax.swing.JLabel();
        descrTxt = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        Text12 = new javax.swing.JLabel();
        availableTxt = new javax.swing.JTextField();
        ejemTxt = new javax.swing.JTextField();
        Text13 = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        Titles.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titles.setText("Subir nuevo Libro");

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Título");

        titleTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Fecha de Publicación");

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Autor");

        authorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        categoryTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Categoría");

        editTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Edición");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Idioma");

        langTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Páginas");

        pagesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Descripción");

        descrTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Strock");

        stockTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Disponibles");

        availableTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ejemTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Text13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text13.setText("Ejemplares");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Subir");
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Titles, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text3)
                            .addComponent(titleTxt)
                            .addComponent(Text4)
                            .addComponent(dateTxt)
                            .addComponent(Text5)
                            .addComponent(authorTxt)
                            .addComponent(Text6)
                            .addComponent(categoryTxt)
                            .addComponent(Text7)
                            .addComponent(editTxt))))
                .addGap(71, 71, 71)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text8)
                    .addComponent(langTxt)
                    .addComponent(Text9)
                    .addComponent(pagesTxt)
                    .addComponent(Text10)
                    .addComponent(descrTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Text11)
                        .addGap(112, 112, 112)
                        .addComponent(Text12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stockTxt)
                        .addGap(20, 20, 20)
                        .addComponent(availableTxt))
                    .addComponent(Text13)
                    .addComponent(ejemTxt)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(Text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(categoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(editTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Text8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(langTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Text9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(pagesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Text10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(descrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(Text13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(ejemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String mtitle = titleTxt.getText();
        String date = dateTxt.getText();
        String author = authorTxt.getText();
        String cat = categoryTxt.getText();
        String ed = editTxt.getText();
        String lang = langTxt.getText();
        String pags = pagesTxt.getText();
        String desc = descrTxt.getText();
        String stock = stockTxt.getText();
        String disp = availableTxt.getText();
        String ejem = ejemTxt.getText();

        // Validaciones para los campos
        if (mtitle.isEmpty() || date.isEmpty() || author.isEmpty() || cat.isEmpty() || ed.isEmpty()
                || lang.isEmpty() || pags.isEmpty() || desc.isEmpty() || stock.isEmpty() || disp.isEmpty() || ejem.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(stock) || !Utils.isNumeric(disp)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Stock y Disponibles deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        }

        Books_models book = isEdition ? bookEdition : new Books_models();
        book.setTitle(mtitle);
        book.setDate(date);
        book.setAuthor(author);
        book.setCategoty(cat);
        book.setEdit(ed);
        book.setLang(lang);
        book.setPages(pags);
        book.setDescription(desc);
        book.setEjemplares(ejem);
        book.setStock(Integer.parseInt(stock));
        book.setAvailable(Integer.parseInt(disp));

        try {
            DAOBooks dao = new DAOBooksImp();

            if (!isEdition) {
                dao.registrar(book);
            } else {
                dao.modificar(book);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Libro " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                limpiar();
            }

        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Titles;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JTextField availableTxt;
    private javax.swing.JButton button;
    private javax.swing.JTextField categoryTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField descrTxt;
    private javax.swing.JTextField editTxt;
    private javax.swing.JTextField ejemTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField langTxt;
    private javax.swing.JTextField pagesTxt;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JTextField titleTxt;
    // End of variables declaration//GEN-END:variables
}
