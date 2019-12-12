import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Round {

    private int roundNumber;

    Map<CardEnum, Color> usedCard = new HashMap<CardEnum, Color>();

    public Round(int roundNumber, Map<CardEnum, Color> usedCard) {
        this.roundNumber = roundNumber;
        this.usedCard = usedCard;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public void outCard(){
        if (usedCard.containsKey("Welcomes")){
            ///ttt
        }else{
            usedCard.put()
        }
    }



}
