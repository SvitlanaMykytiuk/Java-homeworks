package classes;

import java.util.List;

public abstract class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    private List<Person> children;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
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

        int index = 1;
        for (Person kids : children) {
            System.out.println(index + ") " + kids.name);
            index++;
        }

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
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

    @Override
    public int compareTo(Person person) {
        if (name.length() > person.getName().length()) {
            return 1;
        }

        if (name.length() < person.getName().length()) {
            return -1;
        }

        if (name.length() == person.getName().length()) {
            if (age > person.getAge()) {
                return 1;
            }
            if (age < person.getAge()) {
                return -1;
            }
            return 0;
        }

        return 0;
    }




}
