package com.proyecto.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoModel implements Serializable {

    private String matricula;
    private String situaciom;
    private String paterno;
    private String materno;
    private String nombres;
    private int edad;
    private String cp;
    private String nacionalidad;
    private String fechaNacimiento;
    private String sexo;
    private String tes;

}
