package com.proyecto.util;

import lombok.Getter;

/**
 *
 * @author Admin
 */
@Getter
public enum Cadenas {

    SIN_RESULTADOS("No hay resultados."),
    DATOS_INCORRECTOS("Datos incorrectos."),
    ERROR_REGISTRO("Error al crear el registro."),
    ERROR_FINALIZAR("Error al finalizar la tarea."),
    ERROR_SUBIR_ARCHIVOS("Error al subir los archivos."),
    ERROR_ELIMINAR_ARCHIVO("Error al eliminar el archivo."),
    VALIDA_DATOS("Valida datos.");

    private final String valor;

    private Cadenas(String valor) {
        this.valor = valor;
    }

}
