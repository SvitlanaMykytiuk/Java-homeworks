package main;

import classes.Pensioners;
import classes.Workers;

public class Main {

    public static void main(String[] args) {
        Workers worker = new Workers("Ivanov", 63, 175, 70, 1000, 2300);

        System.out.println(worker.calculatePension());
        System.out.println(worker.getListOfChildren().size());

        worker.getListOfChildren().add("Anna");
        worker.getListOfChildren().add("Oleg");

        System.out.println(worker.calculatePension());

        Pensioners pensioners = new Pensioners("Ivanov", 65, 190, 2000, 2500);
        pensioners.getListOfChildren().add("Anna");
        pensioners.getListOfChildren().add("Oleg");

        pensioners.die();
    }

}
