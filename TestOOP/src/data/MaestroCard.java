package data;

import java.io.Serializable;

import static data.Country.RU;
import static data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
