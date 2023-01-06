public class MainForPension {
    public static void main(String[] args) {

        PensionFund firstPensionFund = new PensionFund("My Pension", true, "01.01.2023");
        PensionFund secondPensionFund = new PensionFund("My Second Pension", false, "01.01.2023");



        System.out.println(firstPensionFund.pension(25, 2000, 3000));
        System.out.println(secondPensionFund.pension(25, 2000, 3000));

    }
}
