package com.employee.employeeJPQL.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Trainee_emp1")
public class TraineeEmp1 extends Emp1 {
    private int AssessmentScore;

    public TraineeEmp1(){}

    public TraineeEmp1(int assessmentScore) {
        AssessmentScore = assessmentScore;
    }

    public TraineeEmp1(int id, String name, double salary, int assessmentScore) {
        super(id, name, salary);
        AssessmentScore = assessmentScore;
    }

    public int getAssessmentScore() {
        return AssessmentScore;
    }

    public void setAssessmentScore(int assessmentScore) {
        AssessmentScore = assessmentScore;
    }

    @Override
    public String toString() {
        return "TraineeEmp1{" +
                "AssessmentScore=" + AssessmentScore +
                '}';
    }
}
