package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Persons {
    private String name;
    private int age;
    private int height;
    private int weight;

    private List<Persons> children;

    public Persons(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Persons() {
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

    public void kids() {
        System.out.println("У меня " + children.size() + " детей:");
        for (int i = 0; i < children.size(); i++) {
            System.out.println(i + 1 + ") " + children.get(i).name);
        }

    }


    public int getAge() {
        return age;
    }

    public List<Persons> getChildren() {
        return children;
    }

    public void setChildren(List<Persons> children) {
        this.children = children;
    }

    public abstract void die();

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
