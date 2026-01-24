package Ex3;

public class CurrencyConverter {
    static private double rate;

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        CurrencyConverter.rate = rate;
    }

    public static double toUSD (int vnd) {
        return vnd / rate;
    }

    public static double toVND (double usd) {
        return usd * rate;
    }

    public static String formatUSD (double usd) {
        return String.format("$%.2f", usd);
    }
}
