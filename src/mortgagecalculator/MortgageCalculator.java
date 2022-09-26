package mortgagecalculator;

public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private Long principal;
    private Double annualInterest;
    private Byte years;

    public MortgageCalculator(Long principal, Double annualInterest, Byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(int numberOfPaymentMade) {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return balance;
    }

    public double[] getRemainingBalances(){
        double[] balances = new double[getNumberOfPayments()];
        for (int month = 1; month <= balances.length; month++) {
            balances[month -1] = calculateBalance(month);
        }
        return balances;
    }

    public double calculateMortgage() {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();
        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private double getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
