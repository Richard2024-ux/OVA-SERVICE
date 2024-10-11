package co.edu.uceva.ovaservice.model.service;

import co.edu.uceva.ovaservice.model.entities.Ova;
import java.util.List;

public interface IOvaService {
    List<Ova> listar(); // Lista todos los OVAs
    void delete(Ova ova); // Elimina un OVA de la base de datos
    Ova save(Ova ova); // Guarda un OVA y me retorna un objeto de tipo Ova
    Ova findById(Long id); // Busca un OVA por su id y me retorna un objeto de tipo Ova
    Ova Update(Ova ova); // Actualiza un OVA y me retorna un objeto de tipo Ova
}

