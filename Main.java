public class Main {

    public static void main(String[] args) {

        Workers worker = new Workers("Ivanov", 59, 175, 70, 3000, 3500, "StateFund", true, "28-10-200");

        System.out.println(worker.calculatePension());
    }

}
