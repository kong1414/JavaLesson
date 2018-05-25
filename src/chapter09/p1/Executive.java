package chapter09.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:26
 */
public class Executive extends Employee {
    private double bonus;

    //-----------------------------------------------------------------
    //  Sets up an executive with the specified information.
    //-----------------------------------------------------------------
    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
    }

    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the pay for an executive, which is the
    //  regular employee payment plus a one-time bonus.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}

