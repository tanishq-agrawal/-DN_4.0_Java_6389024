 public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;

        double[] growthRates = {0.05, 0.042, 0.038, 0.06, 0.025};

        double futureValue = FinancialForecast.forecastWithPastRates(presentValue, growthRates, 0);

        System.out.printf("Initial Value: %.2f\n", presentValue);
        System.out.println("Growth Rates: ");
        for (int i = 0; i < growthRates.length; i++) {
            System.out.printf("Year %d: %.2f%%\n", i + 1, growthRates[i] * 100);
        }

        System.out.printf("Forecasted Value after %d years: %.2f\n", growthRates.length, futureValue);
    }
}
