package com.employee.employeeJPQL;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {
    private double basicSalary;
    private double bonusSalary;
    private double taxAmount;
    private double specialAllowanceSalary;

    public Salary() {
    }

    public Salary(double basicSalary, double bonusSalary, double taxAmount, double specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "basicSalary=" + basicSalary +
                ", bonusSalary=" + bonusSalary +
                ", taxAmount=" + taxAmount +
                ", specialAllowanceSalary=" + specialAllowanceSalary +
                '}';
    }
}
