public class FinancialForecasting {

    public static double calculateFutureValue(double initialAmount, double annualGrowthRate, int numberOfYears) {
        if (numberOfYears == 0) {
            return initialAmount;
        } else {
            double updatedAmount = initialAmount * (1 + annualGrowthRate);
            return calculateFutureValue(updatedAmount, annualGrowthRate, numberOfYears - 1);
        }
    }

    public static void main(String[] args) {
        double initialAmount = 1000.0; 
        double annualGrowthRate = 0.05; 
        int numberOfYears = 10; 

        double futureValue = calculateFutureValue(initialAmount, annualGrowthRate, numberOfYears);

        System.out.println("Future value after " + numberOfYears + " years: $" + String.format("%.2f", futureValue));
    }
}
