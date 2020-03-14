package com.employee.employeeJPQL.entity;

import javax.persistence.Entity;

@Entity
public class TraineeEmp3 extends Emp3{
    private int AssessmentScore;

    public TraineeEmp3(){}

    public TraineeEmp3(int assessmentScore) {
        AssessmentScore = assessmentScore;
    }

    public TraineeEmp3(int id, String name, double salary, int assessmentScore) {
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
