package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.example.exceptions.DepartmentNotFoundException;
import org.example.exceptions.EmployeeNotFoundException;

import java.util.List;
import java.util.Map;

@Data
@Log4j
@AllArgsConstructor
public class Company {

    private String name;
    private String cif;
    private Map<String, Department> departmentsByName;

    public void showDepartments() {
        for (var deparment : departmentsByName.values()) {
            log.info(deparment.toString());
        }
    }

    public List<Employee> getDepartmentEmployees(String departmentName) throws DepartmentNotFoundException {
        return findDepartment(departmentName).getEmployees();
    }


    public Department findDepartment (String departmentName) throws DepartmentNotFoundException{

        if (departmentsByName.containsKey(departmentName)) {
            return departmentsByName.get(departmentName);
        } else {
            throw new DepartmentNotFoundException(departmentName);
        }

    }
    public Employee findEmployee(String nif) throws EmployeeNotFoundException {
        return departmentsByName
                .values()
                .stream()
                .flatMap(d -> d.getEmployees().stream())
                .filter(e -> e.getNif().equals(nif))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException(nif));

    }
}

