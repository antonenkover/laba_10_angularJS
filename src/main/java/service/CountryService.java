package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Department;
import exception.DepartmentNotFoundException;

public class DepartmentService {

    static HashMap<Integer, Department> departmentIdMap = getDepartmentIdMap();


    public DepartmentService() {
        super();

        if (departmentIdMap == null) {
            departmentIdMap = new HashMap<Integer, Department>();
            Department dairy = new Department(1, "Dairy", 12345);
            Department food = new Department(4, "Food", 234);
            Department drinks = new Department(3, "Drinks", 111);
            Department pastry = new Department(2, "Pastry", 2564);


            departmentIdMap.put(1, dairy);
            departmentIdMap.put(4, food);
            departmentIdMap.put(3, drinks);
            departmentIdMap.put(2, pastry);
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<Department>(departmentIdMap.values());
        return departments;
    }

    public Department getDepartment(int id) {
        Department department = departmentIdMap.get(id);
        if (department == null) {
            throw new Department("Department with id " + id + " not found");
        }
        return department;
    }

    public Department addDepartment(Department department) {
        department.setId(getMaxId() + 1);
        departmentIdMap.put(department.getId(), department);
        return department;
    }

    public Department updateDepartment(Department department) {
        if (department.getId() <= 0)
            return null;
        departmentIdMap.put(department.getId(), department);
        return department;
    }

    public void deleteDepartment(int id) {
        departmentIdMap.remove(id);
    }

    public static HashMap<Integer, Department> getDepartmentIdMap() {
        return departmentIdMap;
    }

    // Utility method to get max id
    public static int getMaxId() {
        int max = 0;
        for (int id : departmentIdMap.keySet()) {
            if (max <= id)
                max = id;

        }
        return max;
    }
}
