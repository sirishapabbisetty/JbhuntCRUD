package com.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private static Map<String, Employee> employeedetails = new HashMap();

    static {
        Employee emp = new Employee();
        emp.setEmpid("4292");
        emp.setEmpname("sirisha");
        emp.setEmpsalary("1000");
        employeedetails.put(emp.getEmpid(), emp);

    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(employeedetails.values(), HttpStatus.OK);

    }


}
	

