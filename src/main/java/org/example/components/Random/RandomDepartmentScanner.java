package org.example.components.Random;

import lombok.AllArgsConstructor;
import org.example.Reader;
import org.example.model.Department;

import java.util.ArrayList;
import java.util.Random;

@AllArgsConstructor
public class RandomDepartmentScanner implements Reader<Department> {

    private final Random random;
    private final RandomEmployeeScanner randomEmployeeScanner;


    private final static String[] NAMES = {
            "Recursos Humanos", "Administración RRSS", "Cara el público"
    };

    @Override
    public Department read() {
        return new Department(
                NAMES[random.nextInt(NAMES.length)],
                new ArrayList<>()
                );
    }
}
