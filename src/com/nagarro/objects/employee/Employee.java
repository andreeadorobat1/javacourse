package com.nagarro.objects.employee;

public class Employee {

    private String name;
    private Department departmentAssigendTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartmentAssigendTo() {
        return departmentAssigendTo;
    }

    public void setDepartmentAssigendTo(Department departmentAssigendTo) {
        this.departmentAssigendTo = departmentAssigendTo;
    }
}
