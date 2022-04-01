package com.XTi.Projects;

public class PayrollSystem {

    public static void Employee (String[] args)
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Shoeb", "Harris",
                "777-06-8920", 50000.00);

        Hourly_Employee Hourly_Employee = new Hourly_Employee("Randale", "Brown", "876-36-4543", 1523.74, 40);


        Commission_Employee commission_Employee = new Commission_Employee("Lenice", "Brissett",
                "912-00-9654", 700, 1.05);

        Base_Plus_CommissionEmployee base_plus_commissionEmployee =new Base_Plus_CommissionEmployee("Nicola", "Gray",
                "707-05-0598", 5000, 03, 20000 );

        System.out.println("Employee Processed Individually");

        System.out.printf("%n%s%n%s: $%..2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", Hourly_Employee, "earned", Hourly_Employee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", commission_Employee, "earned", commission_Employee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", base_plus_commissionEmployee, "earned", base_plus_commissionEmployee.earnings());
            }
        }


