package com.proyecto.util;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 *
 * @author 
 */
@Getter
public enum HttpStatusEnum {
    
    OK(HttpStatus.OK),
    PETICION_ERROR(HttpStatus.BAD_REQUEST),
    NO_ACEPTABLE(HttpStatus.NOT_ACCEPTABLE),
    NO_DISPONIBLE(HttpStatus.SERVICE_UNAVAILABLE);
    
    private final HttpStatus httpStatus;

    private HttpStatusEnum(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
    
}
