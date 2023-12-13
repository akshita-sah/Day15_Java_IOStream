package com.bridgelabz.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeePayrollData {
    private static int id;
    private static String name;
    private static long salary;

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public static void readFromAConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter employee id: ");
        id = Integer.parseInt(reader.readLine());
        System.out.println("Enter employee name: ");
        name = reader.readLine();
        System.out.println("Enter the employee salary: ");
        salary = Long.parseLong(reader.readLine());
    }

    public void writeToConsole()
    {
        System.out.println(id + " "+name+" "+salary);
    }
}
