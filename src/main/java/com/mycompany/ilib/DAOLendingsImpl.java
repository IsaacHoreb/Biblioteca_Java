package com.mycompany.ilib;

import com.company.interfaces.DAOLendings;
import com.mycompany.db.Conexion;
import com.mycompany.models.Books_models;
import com.mycompany.models.Lendings_models;
import com.mycompany.models.Users_models;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOLendingsImpl extends Conexion implements DAOLendings {

    @Override
    public void registrar(Lendings_models lending) throws Exception {
        try {
            this.conectar();
            try (PreparedStatement st = conexion.prepareStatement("INSERT INTO lendings(user_id, book_id, date_out) VALUES(?,?,?);")) {
                st.setInt(1, lending.getUser_id());
                st.setInt(2, lending.getBook_id());
                st.setString(3, lending.getDate_out());
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public void modificar(Lendings_models lending) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = conexion.prepareStatement("UPDATE lendings SET user_id = ?, book_id = ?, date_out = ?, date_return = ? WHERE id = ?");
            st.setInt(1, lending.getUser_id());
            st.setInt(2, lending.getBook_id());
            st.setString(3, lending.getDate_out());
            st.setString(4, lending.getDate_return());
            st.setInt(5, lending.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }

    @Override
    public Lendings_models getLending(Users_models user, Books_models book) throws Exception {
        Lendings_models lending = null;

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM lendings WHERE user_id = ? AND book_id = ? AND date_return IS NULL ORDER BY id DESC LIMIT 1");
            st.setInt(1, user.getId());
            st.setInt(2, book.getId());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lending = new Lendings_models();
                lending.setId(rs.getInt("id"));
                lending.setUser_id(rs.getInt("user_id"));
                lending.setBook_id(rs.getInt("book_id"));
                lending.setDate_out(rs.getString("date_out"));
                lending.setDate_return(rs.getString("date_return"));
            }

            st.close();
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

        return lending;

    }

    @Override
    public List<Lendings_models> listar() throws Exception {
        List<Lendings_models> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM lendings ORDER BY id DESC");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Lendings_models lending = new Lendings_models();
                lending.setId(rs.getInt("id"));
                lending.setUser_id(rs.getInt("user_id"));
                lending.setBook_id(rs.getInt("book_id"));
                lending.setDate_out(rs.getString("date_out"));
                lending.setDate_return(rs.getString("date_return"));
                lista.add(lending);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
        return lista;
    }

}
