package com.company.interfaces;

import com.mycompany.models.Users_models;
import java.util.List;

public interface DAOUsers {

    //public void actualizar(Users user);
    public void registar(Users_models user) throws Exception;

    public void modificar(Users_models user) throws Exception;

    public void sancionar(Users_models user) throws Exception;

    public void eliminar(int UserId) throws Exception;

    public List<Users_models> listar(String name) throws Exception;

    public Users_models getUserById(int UserId) throws Exception;

}
