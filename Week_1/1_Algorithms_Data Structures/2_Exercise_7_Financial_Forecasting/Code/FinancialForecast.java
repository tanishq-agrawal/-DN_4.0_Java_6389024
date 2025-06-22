public class FinancialForecast {
    public static double forecastWithPastRates(double presentValue, double[] growthRates, int year) {
        if (year == growthRates.length) {
            return presentValue;
        }
        return forecastWithPastRates(presentValue * (1 + growthRates[year]), growthRates, year + 1);
    }
}
