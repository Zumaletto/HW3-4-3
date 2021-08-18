public class CreditPaymentService {
    public int calculate(int creditAmount, int years, double rate) {
        int creditTerm = years * 12;

        double ratePerMonth; // Ставка по кредиту в месяц
        ratePerMonth = rate / 12 / 100;

        double annuityRate;// Коэффициент аннуитета
        annuityRate = (ratePerMonth * Math.pow((1 + ratePerMonth), creditTerm)) / (Math.pow((1 + ratePerMonth), creditTerm) - 1);

        int a = creditAmount;// Ежемесячный платеж
        double b = annuityRate;
        double c = a * b;
        int monthlyPayment = (int) c;
        return monthlyPayment;
    }
}
