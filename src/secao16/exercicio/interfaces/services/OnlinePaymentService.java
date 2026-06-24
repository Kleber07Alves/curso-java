package secao16.exercicio.interfaces.services;


public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
