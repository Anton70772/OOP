package data;

public class UnionPayCard extends Card{

    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }
    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN)
        return true;
        else
            return false;
    }
}
