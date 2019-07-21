package pl.sda.exchangerate;

public class View {



    public void showResult(double value, String currency) {

        System.out.println("Aktualna kurs:");
        System.out.println("1 USD  = " + value + " " + currency);
        System.out.println("1 " + currency + " = " + 1/value + " USD");

    }

}
