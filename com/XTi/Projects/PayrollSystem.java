package com.XTi.Projects;

public class PayrollSystem {

    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        Hourly_Employee hourlyEmployee= new Hourly_Employee("Randale", "Brown", "222-22-212", 16.74, 40);
        Commission_Employee commission_Employee = new Commission_Employee("Lenice", "Brissett", "333-11-222", 1000, .06);
        Base_Plus_CommissionEmployee base_plus_commissionEmployee =new Base_Plus_CommissionEmployee("Nicola", "Gray", "444-55-021", 5000, 04, 300 );

        System.out.println("employee processed imdividually");

        System.out.printf("%n%s%n%s: $%..2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", commission_Employee, "earned", commission_Employee.earnings());
        System.out.printf("%s%n%s:$%,.2f%n%n", base_plus_commissionEmployee, "earned", base_plus_commissionEmployee.earnings());
            }
        }


