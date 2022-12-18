public class CreditPaymentService {
    public double calculate(double credit_amount, double protsentnaya_stavka, double srok_kredita) {
        double result;
        {
            double x = protsentnaya_stavka / 12 / 100; //Процентная ставка
            double w = Math.pow(1 + x, srok_kredita); //
            double t = Math.pow(1 + x, srok_kredita) - 1;
            double monthly_payment = credit_amount * x * w / t;
            result = monthly_payment;
        }
        return result;
    }
}

