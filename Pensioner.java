public class Pensioner extends Person {

    private double minSalary;
    private double maxSalary;
    private boolean isState;


    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public boolean getIsState() {
        return isState;
    }

    public void setIsState(boolean isState) {
        this.isState = isState;
    }

    PensionFund pensionFund = new PensionFund(getName(), isState, getAge());
    double pension = pensionFund.countPension(getAge(), minSalary, maxSalary);

    public double countIncome(int age, double pension) {
        double income;
        if (age > 50) {
            income = (age - 50) * pension;
        } else {
            income = 0;
        }
        return income;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + countIncome(getAge(), pension));
    }

}
