package com.mycompany.ilib;

import com.company.interfaces.DAOBooks;
import com.mycompany.db.Conexion;
import com.mycompany.models.Books_models;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOBooksImp extends Conexion implements DAOBooks {

    @Override
    public void registrar(Books_models book) throws Exception {
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement("INSERT INTO books(title, date, author, category, edit, lang, pages, description, ejemplares, stock, available) VALUES(?,?,?,?,?,?,?,?,?,?,?)")) {
                st.setString(1, book.getTitle());
                st.setString(2, book.getDate());
                st.setString(3, book.getAuthor());
                st.setString(4, book.getCategoty());
                st.setString(5, book.getEdit());
                st.setString(6, book.getLang());
                st.setString(7, book.getPages());
                st.setString(8, book.getDescription());
                st.setString(9, book.getEjemplares());
                st.setInt(10, book.getStock());
                st.setInt(11, book.getAvailable());

                st.executeUpdate();
                st.close();
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }

    @Override
    public void modificar(Books_models book) throws Exception {
        try {
            this.conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("UPDATE books SET title = ?, date = ?, author = ?, category = ?, edit = ?, lang = ?, pages = ?, description = ?, ejemplares = ?, stock = ?, available = ? WHERE id = ?")) {
                st.setString(1, book.getTitle());
                st.setString(2, book.getDate());
                st.setString(3, book.getAuthor());
                st.setString(4, book.getCategoty());
                st.setString(5, book.getEdit());
                st.setString(6, book.getLang());
                st.setString(7, book.getPages());
                st.setString(8, book.getDescription());
                st.setString(9, book.getEjemplares());
                st.setInt(10, book.getStock());
                st.setInt(11, book.getAvailable());
                st.setInt(12, book.getId());

                st.executeUpdate();
                st.close();
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public void eliminar(int bookId) throws Exception {
        try {
            this.conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("DELETE FROM books WHERE id = ?;")) {
                st.setInt(1, bookId);

                st.executeUpdate();
                st.close();
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public List<Books_models> listar(String title) throws Exception {

        List<Books_models> lista = null;

        try {
            this.conectar();

            String Query = title.isEmpty() ? "SELECT * FROM books;" : "SELECT * FROM books WHERE title LIKE '%" + title + "%';";

            try (PreparedStatement st = this.conexion.prepareStatement(Query)) {

                lista = new ArrayList();
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Books_models book = new Books_models();
                    book.setId(rs.getInt("id"));
                    book.setTitle(rs.getString("title"));
                    book.setDate(rs.getString("date"));
                    book.setAuthor(rs.getString("author"));
                    book.setCategoty(rs.getString("category"));
                    book.setEdit(rs.getString("edit"));
                    book.setLang(rs.getString("lang"));
                    book.setPages(rs.getString("pages"));
                    book.setDescription(rs.getString("description"));
                    book.setEjemplares(rs.getString("ejemplares"));
                    book.setStock(rs.getInt("stock"));
                    book.setAvailable(rs.getInt("available"));

                    lista.add(book);
                }
                rs.close();
                st.close();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
        return lista;
    }

    @Override
    public Books_models getBookById(int bookId) throws Exception {
        Books_models book = null;

        try {
            this.conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM books WHERE id = ? LIMIT 1;")) {

                st.setInt(1, bookId);

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    book = new Books_models();
                    book.setId(rs.getInt("id"));
                    book.setTitle(rs.getString("title"));
                    book.setDate(rs.getString("date"));
                    book.setAuthor(rs.getString("author"));
                    book.setCategoty(rs.getString("category"));
                    book.setEdit(rs.getString("edit"));
                    book.setLang(rs.getString("lang"));
                    book.setPages(rs.getString("pages"));
                    book.setDescription(rs.getString("description"));
                    book.setEjemplares(rs.getString("ejemplares"));
                    book.setStock(rs.getInt("stock"));
                    book.setAvailable(rs.getInt("available"));
                }
                rs.close();
                st.close();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
        return book;
    }

}
