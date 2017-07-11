import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Item {
	
	private HashMap<String, Knife> weapons;
	
	private int weight = 10;
	
	public Item(){

	}

	public int getWeight() {
		return weight;
	}
	
	//description what search sent to room
	
	/*public String getShortDescription()
    {
		return "You look around for items and this is what you find" + ".\n" + "."; // getWeaponsString ERROR
    }*/
	
	/*private String getWeaponsString()
    {
        String returnString = "Weapons:";
        Set<String> keys = weapons.keySet();
        for(Iterator<String> iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }*/
	
}