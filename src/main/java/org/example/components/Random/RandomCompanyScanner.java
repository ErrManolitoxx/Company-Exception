package org.example.components.Random;

import lombok.AllArgsConstructor;
import org.example.Reader;
import org.example.model.Company;

import java.util.HashMap;
import java.util.Random;

@AllArgsConstructor
public class RandomCompanyScanner implements Reader<Company> {

    private final Random random;

    private final static String[] NAMES = {"Mercadona", "HiperHusera", "Adidas", "Apple"};


    @Override
    public Company read() {
        return new Company(
                NAMES[random.nextInt(NAMES.length)],
                "X" + random.nextInt(10000),
                new HashMap<>()

        );
    }
}
