package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Persons {
    private String name;
    private int age;
    private int height;
    private int weight;

    List<String> listOfChildren = new ArrayList<>();

    public Persons(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Persons() {
    }


    public int getAge() {
        return age;
    }


    public void personInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", рост: " + height + ", вес: " + weight);
    }

    public void personAbilityToWork() {
        if (age <= 18 || age >= 70) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю");
        }
    }

    public List<String> getListOfChildren() {
        return listOfChildren;
    }

    public void setListOfChildren(List<String> listOfChildren) {
        this.listOfChildren = listOfChildren;
    }

    public abstract void die();

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", listOfChildren=" + listOfChildren +
                '}';
    }
}
