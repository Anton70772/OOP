package data;

public class MasterCard extends Card{

    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }
    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
