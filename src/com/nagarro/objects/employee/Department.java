package com.nagarro.objects.employee;

import com.nagarro.application.AnimalExemple;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int id;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void assignEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void printEmployees() {
        List<Employee> employeeList = getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println("Employee " + employee.getName());
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", employeeList=" + employeeList +
                '}';

        AnimalExemple animal = new AnimalExemple();
    }
}
