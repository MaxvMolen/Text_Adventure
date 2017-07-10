import java.util.HashMap;
import java.util.Stack;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Spring;

public class Inventory {

	private HashMap<String, Item> ItemsInv;
	
	private Item item;
	private int weightLimit;
	
	public Inventory() {
		//item = new Item(); // new item
		//item.MeleeWeapon();
		ItemsInv = new HashMap<String, Item>();
	}
	
	public void player () {
		System.out.println(" =========Player=========");
		// indicates if its a inventory for room or player
		System.out.println("Player");
		item = new Item(); 
		//item.MeleeWeapon(); adds by calling the class and then the function MeleeWeapon
		ItemsInv.put("knife", item);
		//weapons.put("knife", p1);
		//Things.put("knife", item.MeleeWeapon());
		System.out.println(ItemsInv + "=Inventory");
		System.out.println(invItemsString());
	}

	public void room () {
		System.out.println(" =========Rooms=========");
		//item = new Item(); // new item
		//System.out.println("Room"); // indicates if its a inventory for room or player
		//item.MeleeWeapon(); adds by calling the class and then the function MeleeWeapon
		//ItemsInv.put("knife", item);
		//System.out.println(ItemsInv + "=Inventory");
	}
	
	public void addItem(String aItems) {
	// for loop create new items
		//item[i] = new Item();		
		item = new Item();
		ItemsInv.put(aItems, item); // adds item to room
		System.out.println(ItemsInv + "=Inventory");
		
		System.out.println(invItemsString()); // print out items in hashmap
	}
	
	public void removeItem(String rItems) {
		// removes item from inventory 
		//ItemsInv.slice("Knife, item");
	}
	
	public void getTotalWeight() {
		/*if (weight < weightLimit) {
			item = new Item();
			ItemsInv.put("knife", item);
		}*/
	}
	
	private String invItemsString()
    {
        String returnString = "ItemsInv:";
        Set<String> keys = ItemsInv.keySet();
        for(Iterator<String> iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }


}
