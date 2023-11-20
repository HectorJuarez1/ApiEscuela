package com.proyecto.repository;

import com.proyecto.model.AlumnoModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */
@Repository
public class AlumnoRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public List<AlumnoModel> selectAlumno() {
        List<AlumnoModel> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Dpersonal";
            lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(AlumnoModel.class), new Object[]{});
        } catch (DataAccessException ex) {
            //Registro.escribe(Registro.getClase(), Registro.getMetodo(), ex.getMessage(), PropiedadRegistro.ERROR);
        }
        return lista;
    }

}
