package com.nagarro.helpers;

import com.nagarro.objects.employee.Department;

public class DepartmentHelper {

    public static Department find(int departmentNumber) {
        if (departmentNumber == 1) {
            return new Department("HR", 1);
        } else if (departmentNumber == 2) {
            return new Department("JAVA", 2);
        } else if (departmentNumber == 3) {
            return new Department("Testing", 3);
        }
        return null;
    }

}
