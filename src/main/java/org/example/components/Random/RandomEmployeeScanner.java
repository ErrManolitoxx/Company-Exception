package org.example.components.Random;

import lombok.AllArgsConstructor;
import org.example.Reader;
import org.example.model.Employee;

import java.util.Random;
import java.util.Scanner;

@AllArgsConstructor
public class RandomEmployeeScanner implements Reader<Employee> {
    private final Scanner scanner;

    private final static String[] NAMES = {
            "Bob", "Peppa", "Pocoyo", "George", "Calamardo"
    };

    private final static String[] SURNAMES = {
            "Pig", "Esponja", "Pocoyo", "Pérez", "López"
    };

    private final static String[] JOB = {
            "Becario", "Jefe de departamento", "oficinista"
    };

    private final Random random;

    @Override
    public Employee read() {
        return new Employee(
                "E" + random.nextInt(10000),
                NAMES[random.nextInt(NAMES.length)],
                SURNAMES[random.nextInt(NAMES.length)],
                JOB[random.nextInt(JOB.length)]
        );
    }
}
