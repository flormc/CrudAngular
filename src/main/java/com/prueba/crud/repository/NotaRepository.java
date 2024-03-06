package com.prueba.crud.repository;

import com.prueba.crud.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository <Nota, Long > {


}
