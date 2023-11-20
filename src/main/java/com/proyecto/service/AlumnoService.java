package com.proyecto.service;

import com.proyecto.model.AlumnoModel;
import com.proyecto.repository.AlumnoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private AlumnoRepository rep;

    @Override
    public List<AlumnoModel> getAlumno() {
        return rep.selectAlumno();
    }

}
