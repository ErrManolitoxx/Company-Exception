package org.example.exceptions;

import lombok.*;

@Getter
@EqualsAndHashCode(callSuper = true)
public class EmployeeNotFoundException extends Exception {
    private final String nif;

    public EmployeeNotFoundException(String nif) {
        super("No se ha podido encontrar el empleado con el NIF " + nif);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}
