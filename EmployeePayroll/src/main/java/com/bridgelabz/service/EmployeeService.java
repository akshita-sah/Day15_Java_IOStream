package com.bridgelabz.service;

import com.bridgelabz.entity.EmployeePayrollData;

import java.io.IOException;

public class EmployeeService {
    public void run() throws IOException {
        System.out.println("Employee Payroll Service: ");
        EmployeePayrollData employeePayrollData = new EmployeePayrollData();
        employeePayrollData.readFromAConsole();
        System.out.println("Employee Details: ");
        employeePayrollData.writeToConsole();
    }
}
