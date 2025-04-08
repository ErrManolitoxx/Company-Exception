package org.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class DepartmentNotFoundException extends Exception{
    private String name;

    public DepartmentNotFoundException(String message, String name) {
        super("No se ha encontrado el departamanto " + name);
        this.name = name;
    }
}
