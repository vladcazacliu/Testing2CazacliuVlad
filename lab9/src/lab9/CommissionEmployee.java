package lab9;

public class CommissionEmployee extends Employee
{
    private double gross;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double gross, double rate )
    {
        super(first, last, ssn );
        setCommissionRate(rate);
        setGross(gross);
    }

    public final double getGrossSales(){return gross; }
    public final double getCommissionRate() {return commissionRate;}

    public void setCommissionRate( double rate ) {
        if (!(rate < 1.0 && rate > 0.0))
            throw new IllegalArgumentException("Commission must be in range 0-1.");
        else
            commissionRate = rate;
    }


    public void setGross( double gross ){
        if(gross < 0)
            throw new IllegalArgumentException("Gross sales cannot be empty!");
        else
            this.gross = gross;
    }


    public double earnings() {return commissionRate * gross; }

    public String toString()
    {
        return String.format( "%s%s: %.2f%n%s: %.2f%n", super.toString(),"gross", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
}
