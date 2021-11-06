package lab9;

public class HourlyEmployee extends Employee
{
    private double hour;
    private double wagePerHour;

    public HourlyEmployee(String first, String last, String ssn, double hour, double wagePerHour){

        super(first, last, ssn);
        setHour(hour);
        setWagePerHour(wagePerHour);
    }

    public double getHour(){return this.hour;}
    public double getWagePerHour(){return wagePerHour;}


    public void setHour(double hour) {
        if(!(hour >= 0 && hour <= 168))
            throw new IllegalArgumentException("Hour cannot be less than zero and more than 168!");
        else
            this.hour = hour;
    }


    public void setWagePerHour(double wagePerHour){
        if(wagePerHour > 0)
            this.wagePerHour = hour;

        else
            throw new IllegalArgumentException("Wage must be positive!");
    }


    public double earnings() {
        return hour > 40 ? 40 * wagePerHour + (hour % 10) * 1.5 * wagePerHour : hour * wagePerHour;
    }


    @Override
    public String toString(){
        return String.format("%s%s: %s%n%s: %s", super.toString(),"Wage per hour", getWagePerHour(), "Hour", getHour());
    }

    public static void main(String[] args){
        HourlyEmployee mas = new HourlyEmployee("masoomeh", "zamani", "48161", 0, 7);
        System.out.println(mas.toString());

        System.out.println(mas.earnings());
        mas.setHour(168);
        System.out.println(mas.toString());


    }


}
