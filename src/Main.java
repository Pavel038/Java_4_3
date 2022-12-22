public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditAmount = 1_000_000;  // Сумма займа
        double interestRate = 9.99 ; // Процентная ставка
        double creditTerm = 24; // Срок кредита
        double monthlyPayment = service.calculate(creditAmount, interestRate,creditTerm);


        System.out.println(Math.floor(monthlyPayment));
    }
}
