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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else System.out.println("Возраст не соответствует расчету пенсии");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
