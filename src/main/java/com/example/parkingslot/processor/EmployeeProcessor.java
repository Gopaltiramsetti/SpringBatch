package com.example.parkingslot.processor;

import org.springframework.batch.item.ItemProcessor;

import com.example.parkingslot.model.Employee;
import com.example.parkingslot.model.EmployeeDTO;

public class EmployeeProcessor implements ItemProcessor<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO process(final Employee employee) throws Exception {
        System.out.println("Transforming Employee(s) to EmployeeDTO(s)..");
        final EmployeeDTO empployeeDto = new EmployeeDTO(employee.getEmpid(), employee.getEmpname(),
                employee.getDesignation(), employee.getNoofexp());

        return empployeeDto;
    }

}
