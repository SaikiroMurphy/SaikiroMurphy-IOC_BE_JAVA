package Ex3;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter.setRate(23000);
        
        int vnd = 115000;
        double usd = CurrencyConverter.toUSD(vnd);
        System.out.println(vnd + " VND = " + CurrencyConverter.formatUSD(usd));
        
        usd = 5;
        vnd = (int) CurrencyConverter.toVND(usd);
        System.out.println(CurrencyConverter.formatUSD(usd) + " = " + vnd + " VND");

        CurrencyConverter.setRate(26500);

        vnd = 265000;
        usd = CurrencyConverter.toUSD(vnd);
        System.out.println(vnd + " VND = " + CurrencyConverter.formatUSD(usd));

        usd = 10;
        vnd = (int) CurrencyConverter.toVND(usd);
        System.out.println(CurrencyConverter.formatUSD(usd) + " = " + vnd + " VND");
    }
}
