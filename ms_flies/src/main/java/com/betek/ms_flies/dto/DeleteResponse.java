package com.betek.ms_flies.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteResponse<T> {

    private String objectType;
    private String objectName;
    private String message;

    public DeleteResponse(String objectType, String objectName) {
        this.objectType = objectType;
        this.objectName = objectName;
        this.message = "Ha sido eliminado satisfactoriamente";
    }
}
