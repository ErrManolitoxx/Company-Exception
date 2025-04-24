package org.ies.example.components;

import org.example.exceptions.DepartmentNotFoundException;
import org.example.model.Company;
import org.example.model.Department;
import org.example.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyTest {

    @Test
    public void findEmployeesTest() throws DepartmentNotFoundException {
        var company = createTestCompany();
        var employee = company.getDepartmentEmployees("Ventas");
        var expected = List.of(
                new Employee("1234A", "Pepe", "Guerroro", "Encargado")
        );
        Assertions.assertEquals(expected, employee);

    }

    private Company createTestCompany() {

        Map<String, Department> departmentsByName = Map.of(
                "Ventas",
                new Department(
                        "Programador",
                        List.of(
                                new Employee("1234X", "Paco", "Paquito", "Programador")
                        )

                ),
                "Programador",
                new Department(
                        "Programador",
                        List.of(
                                new Employee("1234X", "Paco", "Paquito", "Programador")
                        )

                )

        );

        return new Company("Coca-Cola", "12345X", departmentsByName);
    }



}
