package model;

public class Payment {
    private String paymentId;
    private PaymentMode paymentMode;
    private double amount;
    private String thirdPartyTransactionId;

    public Payment(String paymentId, PaymentMode paymentMode, double amount, String thirdPartyTransactionId) {
        this.paymentId = paymentId;
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.thirdPartyTransactionId = thirdPartyTransactionId;
    }

    // Generate Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getThirdPartyTransactionId() {
        return thirdPartyTransactionId;
    }
    public void setThirdPartyTransactionId(String thirdPartyTransactionId) {
        this.thirdPartyTransactionId = thirdPartyTransactionId;
    }
}
