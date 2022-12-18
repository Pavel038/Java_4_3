public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double credit_amount = 1_000_000;  // Сумма займа
        double protsentnaya_stavka = 9.99 ; // Процентная ставка
        double srok_kredita = 24; // Срок кредита
        double monthly_payment = service.calculate(credit_amount, protsentnaya_stavka,srok_kredita);



        System.out.println(Math.floor(monthly_payment));
    }
}