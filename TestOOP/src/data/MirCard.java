package data;

public class MirCard extends Card{

    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    public MirCard() {
        super(PaymentSystem.MIR);
    }
    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}