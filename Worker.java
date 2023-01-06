public class Worker extends Person {

    private double minSalary;
    private double maxSalary;


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

}
