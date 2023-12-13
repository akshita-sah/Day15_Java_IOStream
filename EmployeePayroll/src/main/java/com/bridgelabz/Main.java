package com.bridgelabz;

import com.bridgelabz.service.EmployeeService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EmployeeService employeeService = new EmployeeService();
        employeeService.run();
    }
}
