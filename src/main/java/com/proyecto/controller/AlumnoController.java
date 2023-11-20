package com.proyecto.controller;

import com.proyecto.model.AlumnoModel;
import com.proyecto.service.IAlumnoService;
import com.proyecto.util.Cadenas;
import com.proyecto.util.HttpStatusEnum;
import com.proyecto.util.MensajeError;
import com.proyecto.util.ResponseHttp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hector.coyotl
 */
@RestController
@RequestMapping("Alumno")
@CrossOrigin("*")
public class AlumnoController {
    
    
    @Autowired
    private IAlumnoService service;

    @GetMapping()
    public ResponseEntity<Object> getAlumnos() {
        ResponseHttp respuesta = new ResponseHttp(HttpStatusEnum.NO_ACEPTABLE, new MensajeError(Cadenas.SIN_RESULTADOS.getValor()));
        List<AlumnoModel> lista = service.getAlumno();
        if (!lista.isEmpty()) {
            respuesta = new ResponseHttp(HttpStatusEnum.OK, lista);
        }
        return respuesta.generateResponse();
    }
    
}
