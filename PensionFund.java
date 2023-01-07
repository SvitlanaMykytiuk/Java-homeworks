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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsState() {
        return isState;
    }

    public void setIsState(boolean isState) {
        this.isState = isState;
    }

    public String getDate() {
        return date;
    }


    public double countPension(int age, double minSalary, double maxSalary) {
        int workingYears;
        double average;

        if (age >= 60) {
            workingYears = 42;
        } else if (age > 18) {
            workingYears = age - 18;
        } else {
            workingYears = 0;
        }

        if (isState) {
            average = AverageUtils.getAverageOfTwo(minSalary, maxSalary);
        } else {
            average = AverageUtils.getAverageOfThree(minSalary, maxSalary, AVERAGE_SALARY);
        }

        return average * KOEF_OF_PENSION * workingYears;
    }

}
