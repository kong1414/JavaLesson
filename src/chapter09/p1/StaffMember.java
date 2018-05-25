package chapter09.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:25
 */
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Sets up a staff member using the specified information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    @Override
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}
