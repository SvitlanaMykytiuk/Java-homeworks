package classes;

import classes.AbleToCalculatePension;
import classes.Persons;
import classes.TypeOfState;

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

        PensionFund pensionFund = new PensionFund("nameOfFund", TypeOfState.STATE, "28-10-200");

        return pensionFund.countPension(getAge() - 18, minSalary, maxSalary, listOfChildren.size());

    }

    public void setNewSalary () {
        minSalary = 1000;
        maxSalary = 2000;
    }
}
