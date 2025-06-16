package model;

public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private double amount;
    private String thirdPartyTransactionId;

    public Payment(PaymentMode paymentMode, double amount, String thirdPartyTransactionId) {
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.thirdPartyTransactionId = thirdPartyTransactionId;
    }

    // Generate Getters and Setters
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
