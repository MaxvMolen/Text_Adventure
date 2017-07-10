import java.util.HashMap;
import java.util.Stack;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Spring;

public class Inventory {

	private HashMap<String, Item> ItemsInv;
	
	private Item item;
	private int weightLimit = 10; // weight limit
	private int weight = 10; // test weight
	
	public Inventory() {
		ItemsInv = new HashMap<String, Item>();
	}
	
	public void player () {
		System.out.println(" =========Player=========");
		// indicates if its a inventory for room or player
		item = new Item();
		ItemsInv.put("knife", item.Knifes());
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
		// checks if there is enough room in inventory
		if (weight <= weightLimit) {
			item = new Item();
			ItemsInv.put(aItems, item.Knifes()); // adds item to room
			System.out.println(ItemsInv + "=Inventory");
			System.out.println(invItemsString()); // print items in hashmap 
			System.out.println("------------");
		}
	}
	
	public void addKey(String aItems) {
		// checks if there is enough room in inventory
		if (weight <= weightLimit) {
			item = new Item();
			ItemsInv.put(aItems, item.Keys()); // adds item to room
			System.out.println(ItemsInv + "=Inventory");
			System.out.println(invItemsString()); // print items in hashmap 
			System.out.println("------------");
		}
	}
	
	public void removeItem(String rItems) {
		// removes item from inventory
		// -weight item from inventory
	}
	
	public void getTotalWeight() {
		// get weight from item.
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
