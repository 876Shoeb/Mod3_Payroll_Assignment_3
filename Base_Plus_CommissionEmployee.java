public class Base_Plus_CommissionEmployee {
    private double baseSalary;

    public Base_Plus_CommissionEmployee(string firstName, string lastName, string socialSecurityNumber,
                                        double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName,socialSecurityNumber, grossSales, commissionRate);

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
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString()
    {
        return String.format("%s, %s; %s; $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
