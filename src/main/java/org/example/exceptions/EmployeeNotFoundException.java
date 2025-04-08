package org.example.exceptions;

import lombok.*;

@Getter
@EqualsAndHashCode(callSuper = true)
public class EmployeeNotFoundException extends Exception {
    private String nif;

    public EmployeeNotFoundException(String message, String nif) {
        super("No se ha podido encontrar el empleado con el NIF " + nif);
        this.nif = nif;
    }
}
