package com.mycompany.ilib;

import com.company.interfaces.DAOUsers;
import com.mycompany.db.Conexion;
import com.mycompany.models.Users_models;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOUserImp extends Conexion implements DAOUsers {

    @Override
    public void registar(Users_models user) throws Exception {
        try {
            this.conectar();

            try (PreparedStatement st = conexion.prepareStatement("INSERT INTO users(name,last_name_p,last_name_m,domicilio,tel) VALUES(?,?,?,?,?)")) {
                st.setString(1, user.getName());
                st.setString(2, user.getLast_name_p());
                st.setString(3, user.getLast_name_m());
                st.setString(4, user.getDomicilio());
                st.setString(5, user.getTel());
                //st.setInt(6, user.getSanctions());
                //st.setInt(7, user.getSanc_money());

                st.executeUpdate();
                st.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public void modificar(Users_models user) throws Exception {
        try {
            this.conectar();

            try (PreparedStatement st = conexion.prepareStatement("UPDATE users SET name = ?, last_name_p = ?, last_name_m = ?, domicilio = ?, tel = ? WHERE id = ?")) {
                st.setString(1, user.getName());
                st.setString(2, user.getLast_name_p());
                st.setString(3, user.getLast_name_m());
                st.setString(4, user.getDomicilio());
                st.setString(5, user.getTel());
                st.setInt(6, user.getId());
                //st.setInt(6, user.getSanctions());
                //st.setInt(7, user.getSanc_money());
                st.executeUpdate();
                st.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        } finally {
            this.cerrarConexion();
        }

    }

    @Override
    public void eliminar(int UserId) throws Exception {
        try {
            this.conectar();

            try (PreparedStatement st = conexion.prepareStatement("DELETE FROM users WHERE id = ?")) {
                st.setInt(1, UserId);
                st.executeUpdate();
                st.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        } finally {
            this.cerrarConexion();
        }
    }

    @Override
    public List<Users_models> listar(String name) throws Exception {

        List<Users_models> lista = null;

        try {
            this.conectar();

            String Query = name.isEmpty() ? "SELECT * FROM users" : "SELECT * FROM users WHERE name LIKE '%" + name + "%'";

            try (PreparedStatement st = conexion.prepareStatement(Query)) {

                lista = new ArrayList();

                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {

                        Users_models user = new Users_models();

                        user.setId(rs.getInt("Id"));
                        user.setName(rs.getString("name"));
                        user.setLast_name_p(rs.getString("last_name_p"));
                        user.setLast_name_m(rs.getString("last_name_m"));
                        user.setDomicilio(rs.getString("domicilio"));
                        user.setTel(rs.getString("tel"));
                        user.setSanctions(rs.getInt("sanctions"));
                        user.setSanc_money(rs.getInt("sanc_money"));

                        lista.add(user);
                    }
                    rs.close();
                    st.close();
                }
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }
        return lista;
    }

    @Override
    public Users_models getUserById(int UserId) throws Exception {

        Users_models user = new Users_models();

        try {
            this.conectar();

            try (PreparedStatement st = conexion.prepareStatement("SELECT * FROM users WHERE id = ?")) {

                st.setInt(1, UserId);

                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        user.setId(rs.getInt("Id"));
                        user.setName(rs.getString("name"));
                        user.setLast_name_p(rs.getString("last_name_p"));
                        user.setLast_name_m(rs.getString("last_name_m"));
                        user.setDomicilio(rs.getString("domicilio"));
                        user.setTel(rs.getString("tel"));
                        user.setSanctions(rs.getInt("sanctions"));
                        user.setSanc_money(rs.getInt("sanc_money"));
                    }
                    rs.close();
                    st.close();
                }
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

        return user;

    }

    @Override
    public void sancionar(Users_models user) throws Exception {
        try {
            this.conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET sanctions = ?, sanc_money = ? WHERE id = ?")) {
                st.setInt(1, user.getSanctions());
                st.setInt(2, user.getSanc_money());
                st.setInt(3, user.getId());
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }

}
