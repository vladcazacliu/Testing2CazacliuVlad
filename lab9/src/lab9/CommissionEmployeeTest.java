package lab9;

public class CommissionEmployeeTest {

    public static void main(String[] args){

        CommissionEmployee employee = new CommissionEmployee("sara", "shahmohamadi", "7577381", 600, 0.01);
        System.out.print(employee.toString());
        System.out.println();

        //Modifying the information.
        employee.setFirstName("Sara");
        employee.setLastName("Shahmohamadi");
        employee.setSocialSecurityNumber("3577281");
        employee.setGross(720);


        //Check to see if the changes are applied.
        System.out.print(employee.toString());




    }
}

