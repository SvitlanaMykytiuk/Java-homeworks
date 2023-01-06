public class MainForPensioner {

    public static void main(String[] args) {
        Pensioner pensioner = new Pensioner("Ivanov", 70, 180, 85, 2000, 3000, true);

        pensioner.printPension();
        pensioner.die();
    }



}
