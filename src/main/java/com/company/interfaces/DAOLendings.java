package com.company.interfaces;

import com.mycompany.models.Books_models;
import com.mycompany.models.Lendings_models;
import com.mycompany.models.Users_models;

import java.util.List;

public interface DAOLendings {

    public void registrar(Lendings_models lending) throws Exception;

    public void modificar(Lendings_models lending) throws Exception;

    public Lendings_models getLending(Users_models user, Books_models book) throws Exception;

    // public void eliminar(Lendings user) throws Exception;
    public List<Lendings_models> listar() throws Exception;

}
