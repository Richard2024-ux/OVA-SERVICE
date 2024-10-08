package co.edu.uceva.ovaservice.model.service;

import co.edu.uceva.ovaservice.model.dao.OvaDao;
import co.edu.uceva.ovaservice.model.entities.Ova;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase implementa los metodos de la interfaz IOvaService y se encarga de realizar
 * las operaciones CRUD de la entidad Ova
 */
@Service
public class OvaServiceImpl implements IOvaService {
    @Autowired
    OvaDao ovaDao;

    @Override
    public List<Ova> listar() {
        return (List<Ova>) ovaDao.findAll();
    }

    @Override
    public void delete(Ova ova) {
        ovaDao.delete(ova);
    }

    @Override
    public Ova save(Ova ova) {
        return ovaDao.save(ova);
    }

    @Override
    public Ova findById(Long id) {
        return ovaDao.findById(id).orElse(null);
    }

    @Override
    public Ova update(Ova ova) {
        return ovaDao.save(ova);
    }
}
