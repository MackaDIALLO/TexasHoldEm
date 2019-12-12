import java.util.*;

public class Hand {

    private int cardNumber;
    private List<Card> myCardList = new ArrayList<>();

    Map<CardEnum, Color> card = new HashMap<CardEnum, Color>();

    public int getCardNumber() {
        return cardNumber;
    }

    public Hand(int cardNumber, Map<CardEnum, Color> card) {
        this.cardNumber = cardNumber;
        this.card = card;
        Random random = new Random();

        //generate n cards in list with for loop
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        CardEnum randomValue = CardEnum.values()[random.nextInt(CardEnum.values().length)];

        //genere color
        //value
        Card currentCard = new Card(randomValue, randomColor);
        myCardList.add(currentCard);
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
    //public int compareHeightValue()

    public void displayHand(){
        System.out.println(myCardList.toString());
    }
}


