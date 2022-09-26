package mortgagecalculator;

public class Mortgage {

    public static void main(String[] args) {
        long principal = (long) Console.readNumber("Principal: ", 1000, 1_000_000);
        double annualInterest = Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period(Years): ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
