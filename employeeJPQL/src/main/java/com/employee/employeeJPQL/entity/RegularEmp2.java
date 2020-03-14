package com.employee.employeeJPQL.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class RegularEmp2 extends Emp2 {
    private String ProjectName;

    public RegularEmp2(){}

    public RegularEmp2(String projectName) {
        ProjectName = projectName;
    }

    public RegularEmp2(int id, String name, double salary, String projectName) {
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
