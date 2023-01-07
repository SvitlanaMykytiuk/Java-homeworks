public class PensionFund {

    private static double KOEF_OF_PENSION = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private boolean isState;
    private final String date;

    public PensionFund(String name, boolean isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }


    public double countPension(int workingYears, double minSalary, double maxSalary) {
        double average;

        if (isState) {
            average = AverageUtils.getAverageOfTwo(minSalary, maxSalary);
        } else {
            average = AverageUtils.getAverageOfThree(minSalary, maxSalary, AVERAGE_SALARY);
        }

        return average * KOEF_OF_PENSION * workingYears;
    }

}
