public class PensionFund {

    final static double KOEF_OF_PENSION = 0.02;

    String nameOfFund;
    boolean isState;
    final String date;

    public PensionFund(String nameOfFund, boolean isState, String date) {
        this.nameOfFund = nameOfFund;
        this.isState = isState;
        this.date = date;
    }

    public double pension(int workingYears, double minSalary, double maxSalary) {
        double average;

        if (isState == true) {
            average = AverageUtils.getAverageOfTwo(minSalary, maxSalary);
        } else {
            average = AverageUtils.getAverageOfThree(minSalary, maxSalary, 1500);
        }

        return average * KOEF_OF_PENSION * workingYears;
    }
}
