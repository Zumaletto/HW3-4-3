public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
      //  int creditAmount = 1_000_000;
      //  System.out.println("Размер кредита :" + creditAmount);
      //  int years = 1;
      //  System.out.println("Срок кредитования :" + years);
     //   double rate = 9.99;
     //   System.out.println("Процентная ставка :" + rate);

        int monthlyPayment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж :" + monthlyPayment);
        monthlyPayment = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж :" + monthlyPayment);
        monthlyPayment = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж :" + monthlyPayment);


    }
}
