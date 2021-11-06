package lab9;

public class BasePlus extends CommissionEmployee
{
    private double baseSalary;

    public BasePlus(String first, String last, String ssn, double gross, double commissionRate, double baseSalary){
        super(first, last, ssn, gross, commissionRate);
        setBaseSalary(baseSalary);
    }


    public double getBaseSalary(){return this.baseSalary;}
    public final void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative!");
        else
            this.baseSalary = baseSalary;}

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}
