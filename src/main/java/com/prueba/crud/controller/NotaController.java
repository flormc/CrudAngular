package com.prueba.crud.controller;

import com.prueba.crud.model.Nota;
import com.prueba.crud.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Nota")
public class NotaController {
    @Autowired
    private NotaService notaService;

    @PostMapping("/New")
    public Nota newNote(@RequestBody Nota newNote){
        return this.notaService.newNote(newNote);
    }

    @GetMapping("/Show")
    public Iterable<Nota> getAll(){
        return notaService.getAll();
    }

    @PostMapping("/Update")
    public Nota updateNote(@RequestBody Nota nota) {
        return this.notaService.modifyNota(nota);
    }

    @PostMapping(value = "/{id}")
    public Boolean deleteNote(@PathVariable (value = "id") Long id){
        return this.notaService.deleteNota(id);
    }
}
