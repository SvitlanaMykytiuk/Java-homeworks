public class Pensioners extends Persons {

    private double pension;

    private double income = (getAge() - 50) * pension;

    public Pensioners(String name, int age, int height, int weight, double pension) {
        super(name, age, height, weight);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + income);
    }
}
