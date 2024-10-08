package co.edu.uceva.ovaservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * La clase Ova es una entidad que se mapea con la tabla ova en la base de datos.
 */
@Data
@Entity
public class Ova {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int intensidad;
    private String semestre;
}


