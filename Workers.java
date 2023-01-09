public class Workers extends Persons implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;


    public Workers(String name, int age, int height, int weight, double minSalary, double maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {

        PensionFund pensionFund = new PensionFund("nameOfFund", true, "28-10-200");

        return pensionFund.countPension(getAge() - 18, minSalary, maxSalary);

    }
}
