package com.client.controller;

import com.client.ExceptionFolder.EmployeeNotFoundException;
import com.client.service.EmployeeServiceController;
import com.google.protobuf.Descriptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeServiceController employeeServiceController;


    @GetMapping("/employess/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getEmployee(@PathVariable int  id) throws EmployeeNotFoundException {
        return employeeServiceController.getEmployee(id);
    }

}
