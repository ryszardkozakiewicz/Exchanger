package pl.sda.exchangerate;

public class App {
    public static void main(String[] args) {

        String url = "https://api.exchangerate-api.com/v4/latest/USD";
        String currencyString;
        float value;

        Controller controller = new Controller(new JsonService());

        currencyString = controller.getCurrency();
        value = controller.getValue(currencyString);
        controller.showResult(value, currencyString);


    }

}
