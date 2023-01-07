public abstract class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int money;


    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
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

    public abstract void die();

}
