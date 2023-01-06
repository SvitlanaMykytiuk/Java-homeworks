public class PensionFund {

    private final static double KOEF_OF_PENSION = 0.02;

    private String name;
    private boolean isState;
    private final int age;

    public PensionFund(String name, boolean isState, int age) {
        this.name = name;
        this.isState = isState;
        this.age = age;
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

    public int getAge() {
        return age;
    }


    public double countPension(int age, double minSalary, double maxSalary) {
        double average;
        int workingYears;

        if (age >= 60) {
            workingYears = 42;
        } else {
            workingYears = age - 18;
        }

        if (isState == true) {
            average = AverageUtils.getAverageOfTwo(minSalary, maxSalary);
        } else {
            average = AverageUtils.getAverageOfThree(minSalary, maxSalary, 1500);
        }

        return average * KOEF_OF_PENSION * workingYears;
    }
}
