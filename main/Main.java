package main;

import classes.Company;
import classes.Pensioners;
import classes.Workers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Workers firstWorker = new Workers("Ivanov", 63, 175, 70, 1000, 2300);

        List<String> listOfChildrenIvanov = List.of("Аня", "Оля", "Ваня");
        firstWorker.setChildren(listOfChildrenIvanov);

        firstWorker.kids();

        Company first = new Company();
        first.setName("Audi");
        Company second = new Company();
        second.setName("BMW");
        Company third = new Company();
        third.setName("Opel");
        Company fourth = new Company();
        fourth.setName("Honda");

        List<Company> listOfCompaniesIvanov = List.of(first, second, third, fourth);
        firstWorker.setCompanies(listOfCompaniesIvanov);

        firstWorker.workExperience();

        System.out.println("----------------------------------");
        Pensioners pensioners = new Pensioners("Petrov", 65, 190, 2000, 2500);

        List<String> listOfChildrenPetrov = new ArrayList<>();
        listOfChildrenPetrov.add("Аня");
        listOfChildrenPetrov.add("Оля");
        listOfChildrenPetrov.add("Ваня");
        listOfChildrenPetrov.add("Петя");

        pensioners.setChildren(listOfChildrenPetrov);

        pensioners.die();
    }

}
