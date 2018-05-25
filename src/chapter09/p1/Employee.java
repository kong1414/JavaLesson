package chapter09.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:25
 */
public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Sets up an employee with the specified information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return payRate;
    }
}
