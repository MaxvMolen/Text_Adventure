import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Item {
	
	private HashMap<String, Melee> weapons; 
	//private int weight;
	
	public Item(){
	   /* weapons = new HashMap<String, Melee>();
	    
	    Melee p1 = new Melee();
	    
	    //the description that goes with the item number
	    p1.knifes = "A Small Knife";
	    
	    //string (name of the item), item number
	    weapons.put("knife", p1);*/
		//MeleeWeapon();
	}
	// public melee was public void
	public Melee MeleeWeapon(){

	    weapons = new HashMap<String, Melee>();
	    
	    Melee p1 = new Melee();
	    
	    //the description that goes with the item number
	    p1.knifes = "A Small Knife";
	    
	    //string (name of the item), item number
	    weapons.put("knife", p1);
	    //weapons.remove("knife", p1); removes weapon from hashmap
	    
	    System.out.println(weapons);
	    return p1;
	}

	//description what search sent to room
	public String getShortDescription()
    {
		return "You look around for items and this is what you find" + ".\n"/* + getWeaponsString()*/ + "."; // getWeaponsString ERROR
    }
	
	/*private String getWeaponsString()
    {
        String returnString = "Weapons:";
        Set<String> keys = weapons.keySet();
        for(Iterator<String> iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }*/
	
}