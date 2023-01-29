package classes;

public class Pensioners extends Persons {

    private double pension;

    public Pensioners(String name, int age, int height, int weight, double pension) {
        super(name, age, height, weight);
        this.pension = pension;
    }

    @Override
    public void die() {

        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) * pension);
        System.out.println("Зато у меня " + getChildren().size() + " детей");
    }
}
