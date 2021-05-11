package com.nagarro.application;

import com.nagarro.helpers.DepartmentHelper;
import com.nagarro.objects.employee.Department;
import com.nagarro.objects.employee.Employee;

public class AssignEmployee {
    public static Employee employee1;
    public static Employee employee2;

    public static void main(String[] args) {
        //first employee
        employee1 = new Employee();
        employee1.setName("John Doe");

        Department department = DepartmentHelper.find(1);
        department.assignEmployee(employee1);

        //print dept employees
        System.out.println("Printing department " + department.getName() + " round 1");
        department.printEmployees();

        //second employee
        employee2 = new Employee();
        employee2.setName("Jane Smith");

        department.assignEmployee(employee2);

        //print dept employees
        System.out.println("Printing department " + department.getName() + " round 2");
        department.printEmployees();

        AnimalExemple animal = new AnimalExemple();
    }
}
