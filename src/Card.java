public class Card {

    private String value;
    private Color color;


    public  Card(String value  ,Color color){
        this.value=value;
        this.color=color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}