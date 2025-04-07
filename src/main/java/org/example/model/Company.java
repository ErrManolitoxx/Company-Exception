package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Company {

    private String name;
    private String CIF;
    private TreeSet<Department> departments;
}
