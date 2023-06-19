package com;

public class EmployeeDetails {

    public int id;

    public String email;

    public int departmentId;

    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDetails(int id, String email, int departmentId, String name) {
        this.id = id;
        this.email = email;
        this.departmentId = departmentId;
        this.name = name;
    }

    public EmployeeDetails() {

    }
}
