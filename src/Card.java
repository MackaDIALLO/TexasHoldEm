public class Card {

    private CardEnum value;
    private Color color;


    public  Card(CardEnum value ,Color color){
        this.value=value;
        this.color=color;
    }

    public CardEnum getValue() {
        return value;
    }

    public void setValue(CardEnum value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public String toString()
    {
        return this.value + " " + this.color;
    }
}
