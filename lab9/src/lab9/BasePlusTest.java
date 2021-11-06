package lab9;

public class BasePlusTest {

    public static void main(String[] args){

        //Initialize an base plus commission employee and display the result.
        BasePlus mat = new BasePlus("Dan", "Separ", "562", 1000, 0.05, 900);
        System.out.print(mat.toString());
        System.out.println();

        //Modify variables initialized in super class and the base plus class itself and see if the results are applied.
        mat.setBaseSalary(950);
        mat.setCommissionRate(0.2);
        mat.setGross(800);
        mat.setLastName("Sepah");

        System.out.print(mat.toString());
        System.out.println();

        double earning = mat.earnings();

        System.out.printf("Mat gets %.2f this month!", earning);
        System.out.println();


    }



}
