package com.prueba.crud.service;

import com.prueba.crud.model.Nota;

public interface NotaService {
    //Crear
    Nota newNote(Nota newNote);
    //Consultar
    Iterable<Nota> getAll();
    //Modificar
    Nota modifyNota(Nota note);
    //Delete
    Boolean deleteNota(long idNote);


}
