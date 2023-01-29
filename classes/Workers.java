package classes;

import classes.AbleToCalculatePension;
import classes.Persons;
import classes.TypeOfState;

import java.util.ArrayList;
import java.util.List;

public class Workers extends Persons implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;

    private List<Company> Companies;


    public Workers(String name, int age, int height, int weight, double minSalary, double maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public void workExperience() {
        System.out.print("Я работал в следующих компаниях: ");
        for (Company company : Companies) {
            System.out.print(company.getName() + " ");
        }
        System.out.println();

    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {

        PensionFund pensionFund = new PensionFund("nameOfFund", TypeOfState.STATE, "28-10-200");

        return pensionFund.countPension(getAge() - 18, minSalary, maxSalary, getChildren().size());

    }

    public void setNewSalary() {
        minSalary = 1000;
        maxSalary = 2000;
    }

    public List<Company> getCompanies() {
        return Companies;
    }

    public void setCompanies(List<Company> companies) {
        Companies = companies;
    }
}
