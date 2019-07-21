package pl.sda.exchangerate;

import java.util.Scanner;

public class Controller {

    private JsonService jsonService;

    public Controller(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    public String getCurrency() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj skrót waluty (3 duże litery");
        String currencyString = scan.nextLine();
        return currencyString;
    }


    public void showResult(float value, String currency) {
        View view = new View();
        view.showResult(3, currency);
    }


    public float getValue(String currencyString) {



        return 0;
    }
}
