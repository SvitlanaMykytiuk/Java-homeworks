package classes;

import classes.AbleToCalculatePension;
import classes.Persons;
import classes.TypeOfState;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Workers extends Persons implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;

    private List<Company> Companies;

    Set<PensionFund> set;


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
        double additionForKids = getChildren().size() * 200;
        double maxPension = 0;
        String nameOfPensionFound = null;

        for (PensionFund pensionFound : set) {
            double pension = pensionFound.countPension(getAge() - 18, minSalary + additionForKids, maxSalary);
            if (pension > maxPension) {
                maxPension = pension;
                nameOfPensionFound = pensionFound.getName();
            }
        }
        System.out.println("Наиболее выгодный персионный фонд: " + nameOfPensionFound + ", размер пенсии: " + maxPension);
        return maxPension;
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

    public Set<PensionFund> getSet() {
        return set;
    }

    public void setSet(Set<PensionFund> set) {
        this.set = set;
    }
}
