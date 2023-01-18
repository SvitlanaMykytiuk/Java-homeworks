import java.util.Objects;

public class PensionFund {

    private static double KOEF_OF_PENSION = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private State isState;
    private final String date;

    public PensionFund(String name, State isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }


    public double countPension(int workingYears, double minSalary, double maxSalary) {
        double average = 0;

        switch (isState) {
            case STATE:
                average = AverageUtils.getAverage(minSalary, maxSalary);
                break;
            case NOTSTATE:
                average = AverageUtils.getAverage(minSalary, maxSalary, AVERAGE_SALARY);
                break;
            case SCAMMERS:
                average = 0;
        }

        return average * KOEF_OF_PENSION * workingYears;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Objects.equals(name, that.name) && isState == that.isState && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, date);
    }
}
