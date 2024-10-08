package co.edu.uceva.ovaservice.model.dao;

import co.edu.uceva.ovaservice.model.entities.Ova;
import org.springframework.data.repository.CrudRepository;

// DAO: Data Access Object: Manejar las operaciones CRUD de la entidad Ova

/**
 * Esta interfaz hereda de CrudRepository y se encarga de realizar las operaciones CRUD de la entidad Ova
 */
public interface OvaDao extends CrudRepository<Ova, Long> {
}

