package model.services;

public interface  OnlinePaymentService {
	
	double payment(double amount);
	abstract double interest(double amount, int months);

}
