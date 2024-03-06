package com.prueba.crud.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Nota {
    @Id
    @Column
    private Long idNumber;

    @Column
    private String name;

    @Column
    private String category;

}
