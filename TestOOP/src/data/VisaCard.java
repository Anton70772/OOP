package data;

public class VisaCard extends Card{

    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    public VisaCard() {
        super(PaymentSystem.VISA);
    }
    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
