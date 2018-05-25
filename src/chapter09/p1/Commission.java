package chapter09.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:29
 */
public class Commission extends Hourly {
    private double totalSales;
    private double xiaoShouYongJinLv;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double xiaoShouYongJinLv) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.xiaoShouYongJinLv = xiaoShouYongJinLv;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        return super.pay() + totalSales * xiaoShouYongJinLv;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotalSales: " + totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getXiaoShouYongJinLv() {
        return xiaoShouYongJinLv;
    }

    public void setXiaoShouYongJinLv(double xiaoShouYongJinLv) {
        this.xiaoShouYongJinLv = xiaoShouYongJinLv;
    }
}
