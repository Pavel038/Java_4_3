public class CreditPaymentService {
    public double calculate(double creditAmount, double interestRate, double creditTerm) {
        double result;
        
        double x = protsentnayaStavka / 12 / 100; //Процентная ставка
        double w = Math.pow(1 + x, creditTerm ); //
        double t = Math.pow(1 + x, creditTerm ) - 1;
        double monthlyPayment = creditAmount * x * w / t;
        result = monthlyPayment;
        
        return result;
    }
}

