package main;

import classes.Company;
import classes.Pensioners;
import classes.Persons;
import classes.Workers;

import java.util.ArrayList;
import java.util.List;

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

        Company first = new Company();
        first.setName("Audi");
        Company second = new Company();
        second.setName("BMW");
        Company third = new Company();
        third.setName("Opel");
        Company fourth = new Company();
        fourth.setName("Honda");

        List<Company> listOfCompaniesIvanov = List.of(first, second, third, fourth);
        workerIvanov.setCompanies(listOfCompaniesIvanov);

        workerIvanov.workExperience();

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
