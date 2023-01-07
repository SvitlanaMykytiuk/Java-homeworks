public class Workers extends Persons implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;
    private String nameOfFund;
    private boolean isStateFund;
    private String dateOfFund;

    public Workers(String name, int age, int height, int weight, double minSalary, double maxSalary, String nameOfFund, boolean isStateFund, String dateOfFund) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.nameOfFund = nameOfFund;
        this.isStateFund = isStateFund;
        this.dateOfFund = dateOfFund;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {

        PensionFund pensionFund = new PensionFund(nameOfFund, isStateFund, dateOfFund);

        return pensionFund.countPension(getAge() - 18, minSalary, maxSalary);

    }
}
