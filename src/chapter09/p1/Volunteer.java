package chapter09.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:25
 */
public class Volunteer extends StaffMember {
    //-----------------------------------------------------------------
    //  Sets up a volunteer using the specified information.
    //-----------------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return 0.0;
    }
}
