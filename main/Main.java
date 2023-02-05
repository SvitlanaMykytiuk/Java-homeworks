package main;

import classes.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Workers workerIvanov = new Workers("Ivanov", 63, 175, 70, 1000, 2300);

        Persons firstChildIvanov = new Persons("Аня", 12, 134, 40) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };
        Persons secondChildIvanov = new Persons("Оля", 8, 128, 30) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };
        Persons thirdChildIvanov = new Persons("Ваня", 2, 100, 20) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };


        List<Persons> listOfChildrenIvanov = List.of(firstChildIvanov, secondChildIvanov, thirdChildIvanov);
        workerIvanov.setChildren(listOfChildrenIvanov);

        workerIvanov.kids();

        Company first = new Company("Audi");
        Company second = new Company("BMW");
        Company third = new Company("Opel");
        Company fourth = new Company("Honda");

        List<Company> listOfCompaniesIvanov = List.of(first, second, third, fourth);
        workerIvanov.setCompanies(listOfCompaniesIvanov);
        workerIvanov.workExperience();


        PensionFund alfa = new PensionFund("Alfa", TypeOfState.STATE, "01.01.2001");
        PensionFund beta = new PensionFund("Beta", TypeOfState.NOT_STATE, "01.01.2001");
        PensionFund gamma = new PensionFund("Gamma", TypeOfState.SCAMMERS, "01.01.2001");

        Set<PensionFund> set = new HashSet<>();
        set.add(alfa);
        set.add(beta);
        set.add(gamma);

        workerIvanov.setSet(set);
        workerIvanov.calculatePension();

        System.out.println("----------------------------------");
        Pensioners pensionerPetrov = new Pensioners("Petrov", 65, 190, 2000, 2500);
        Persons firstChildPetrov = new Persons("Аня", 12, 134, 40) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };
        Persons secondChildPetrov = new Persons("Оля", 8, 128, 30) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };
        Persons thirdChildPetrov = new Persons("Ваня", 2, 100, 20) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };
        Persons fourthChildPetrov = new Persons("Петя", 5, 120, 25) {
            @Override
            public void die() {
                System.out.println("Человек умер");
            }
        };

        List<Persons> listOfChildrenPetrov = List.of(firstChildPetrov, secondChildPetrov, thirdChildPetrov, fourthChildPetrov);
        pensionerPetrov.setChildren(listOfChildrenPetrov);

        pensionerPetrov.die();
    }

}
