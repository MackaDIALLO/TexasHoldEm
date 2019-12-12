import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("poker");
        Map<CardEnum, Color> test1 = new HashMap<CardEnum, Color>();
        Hand test = new Hand(2, test1);
        test.displayHand();



    }
}
