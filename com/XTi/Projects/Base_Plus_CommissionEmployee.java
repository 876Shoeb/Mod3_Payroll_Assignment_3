package com.XTi.Projects;

public abstract class Base_Plus_CommissionEmployee extends Employee {
    private double baseSalary;

    public Base_Plus_CommissionEmployee(String firstname, String lastname, String socialsecurityNum,
                                        double GrossSales, double CommissionRate, double baseSalary){
            super(firstname, lastname, socialsecurityNum);


        if(baseSalary < 0.0)
            throw new IllegalArgumentException("base salary must be >=0.0");

        this.baseSalary = baseSalary;

    }
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary<0.0)
            throw new IllegalArgumentException("base salary must be >=0.0");

        this.baseSalary = baseSalary;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %s; %s; $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}

