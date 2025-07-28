package com.example.store;

public class OrderService {
    private PaymentService paymentService;

    public void OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
