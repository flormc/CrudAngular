package com.prueba.crud.service;

import com.prueba.crud.model.Nota;
import com.prueba.crud.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotaServiceImp implements NotaService{
    @Autowired
    private NotaRepository notaRepository;


    @Override
    public Nota newNote(Nota newNote) {
        return notaRepository.save(newNote);
    }

    @Override
    public Iterable<Nota> getAll() {
        return this.notaRepository.findAll();
    }

    @Override
    public Nota modifyNota(Nota note) {
        Optional<Nota> noteFound= this.notaRepository.findById(note.getIdNumber());
        if(noteFound.get() != null){
            noteFound.get().setName(note.getName());
            noteFound.get().setCategory(note.getCategory());
            return this.newNote(noteFound.get());
        }
        return null;
    }

    @Override
    public Boolean deleteNota(long idNote) {
        this.notaRepository.deleteById(idNote);
        return true;
    }
}
