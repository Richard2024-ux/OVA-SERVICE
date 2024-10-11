package co.edu.uceva.ovaservice.controller;

import co.edu.uceva.ovaservice.model.entities.Ova;
import co.edu.uceva.ovaservice.model.service.OvaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Ova y se mapea con la url /api/v1/ova-service
 * y se encarga de exponer los servicios rest de la entidad Ova para realizar las operaciones CRUD
 * de la entidad Ova. Se encarga de recibir las peticiones http y retornar las respuestas http.
 */
@RestController
@RequestMapping("/api/v1/ova-service")
public class OvaRestController {

    @Autowired
    private OvaServiceImpl ovaService; // Inyecto el servicio de la entidad Ova para realizar las operaciones CRUD

    /**
     * Este metodo se encarga de retornar una lista de todos los OVAs
     * @return retorna una lista de todos los OVAs
     */
    @GetMapping("/ovas")
    public List<Ova> listar() {
        return this.ovaService.listar();
    }

    /**
     * Este metodo se encarga de retornar un OVA por su id y se mapea con la url /api/ova-service/ovas/{id}
     * @param id es el id del OVA a buscar
     * @return retorna un OVA por su id
     */
    @GetMapping("/ovas/{id}")
    public Ova buscarOva(@PathVariable Long id) {
        return this.ovaService.findById(id);
    }

    /**
     * Este metodo guarda un OVA y me retorna el objeto de tipo Ova ya guardado con su id asignado
     * @param ova es el objeto de tipo Ova a guardar (sin el id)
     * @return retorna el objeto de tipo Ova guardado con su id asignado
     */
    @PostMapping("/ova")
    public Ova guardarOva(@RequestBody Ova ova) {
        return this.ovaService.save(ova);
    }

    /**
     * Este metodo actualiza un OVA y me retorna el objeto de tipo Ova ya actualizado
     * @param ova es el objeto de tipo Ova a actualizar (con el id)
     * @return retorna el objeto de tipo Ova actualizado
     */

    @PutMapping("/ova")
    public ResponseEntity<?> actualizarOva(@RequestBody Ova ova) {
        try {
            Ova ovaActualizado = this.ovaService.save(ova);
            return new ResponseEntity<>(ovaActualizado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar el OVA: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Este metodo elimina un OVA por su id
     * @param id es el id del OVA a eliminar
     */
    @DeleteMapping("/ovas/{id}")
    public void eliminarOva(@PathVariable Long id) {
        Ova ova = this.ovaService.findById(id); // Encuentro un OVA por su id
        this.ovaService.delete(ova);
    }

}

