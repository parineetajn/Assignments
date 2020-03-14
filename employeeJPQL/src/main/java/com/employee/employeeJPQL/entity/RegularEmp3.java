package com.employee.employeeJPQL.entity;

import javax.persistence.Entity;

@Entity
public class RegularEmp3 extends Emp3{
    private String ProjectName;

    public RegularEmp3(){}

    public RegularEmp3(String projectName) {
        ProjectName = projectName;
    }

    public RegularEmp3(int id, String name, double salary, String projectName) {
        super(id, name, salary);
        ProjectName = projectName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    @Override
    public String toString() {
        return "RegularEmp1{" +
                "ProjectName='" + ProjectName + '\'' +
                '}';
    }
}
