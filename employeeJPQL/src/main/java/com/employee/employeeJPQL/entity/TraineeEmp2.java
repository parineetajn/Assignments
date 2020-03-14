package com.employee.employeeJPQL.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class TraineeEmp2 extends Emp2{
    private int AssessmentScore;

    public TraineeEmp2(){}

    public TraineeEmp2(int assessmentScore) {
        AssessmentScore = assessmentScore;
    }

    public TraineeEmp2(int id, String name, double salary, int assessmentScore) {
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
