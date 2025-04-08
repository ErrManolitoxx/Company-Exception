package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.example.exceptions.DepartmentNotFoundException;

import java.util.List;
import java.util.Map;

@Data
@Log4j
@AllArgsConstructor
public class Company {

    private String name;
    private String CIF;
    private Map<String, Department> departmentsByName;

    public void showDepartments() {
        departmentsByName.values().forEach(log::info);
    }

    public List<Employee> findEmployeesDepartment() {

    }
}
