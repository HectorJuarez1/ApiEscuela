package com.proyecto.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHttp {

    private HttpStatusEnum statusEnum;
    private Object data;

    public ResponseEntity<Object> generateResponse() {
        return ResponseEntity.status(statusEnum.getHttpStatus()).body(data);
    }

}
