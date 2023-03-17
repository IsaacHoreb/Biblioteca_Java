package com.company.interfaces;

import com.mycompany.models.Books_models;
import java.util.List;

public interface DAOBooks {

    public void registrar(Books_models book) throws Exception;

    public void modificar(Books_models book) throws Exception;

    public void eliminar(int bookId) throws Exception;

    public List<Books_models> listar(String title) throws Exception;

    public Books_models getBookById(int bookId) throws Exception;

}
