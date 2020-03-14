package com.employee.employeeJPQL.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Regular_emp1")
public class RegularEmp1 extends Emp1 {
    private String ProjectName;

    public RegularEmp1(){}

    public RegularEmp1(String projectName) {
        ProjectName = projectName;
    }

    public RegularEmp1(int id, String name, double salary, String projectName) {
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
