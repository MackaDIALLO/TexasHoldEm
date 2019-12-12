import java.util.HashMap;
import java.util.Map;

public class Hand {

    private int cardNumber;
    Map<CardEnum, Color> card = new HashMap<CardEnum, Color>();

    public int getCardNumber() {
        return cardNumber;
    }

    public Hand(int cardNumber, Map<CardEnum, Color> card) {
        this.cardNumber = cardNumber;
        this.card = card;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Map<CardEnum, Color> getCard() {
        return card;
    }

    public void setCard(Map<CardEnum, Color> card) {
        this.card = card;
    }
}
