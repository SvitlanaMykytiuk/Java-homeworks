public class Pensioner extends Person {

    private double minSalary;
    private double maxSalary;
    private double pension;

    private double income = (getAge() - 50) * pension;

    public Pensioner(String name, int age, int height, int weight, double minSalary, double maxSalary, double pension) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + income);
    }
}
