package org.example.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class DepartmentNotFoundException extends Exception{
    private final String name;

    public DepartmentNotFoundException(String name) {
        super("No se ha encontrado el departamanto " + name);
        this.name = name;
    }
}
