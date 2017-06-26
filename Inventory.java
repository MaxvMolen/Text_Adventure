import java.util.HashMap;
import java.util.Stack;

import javax.swing.Spring;

public class Inventory {

	private HashMap<String, Item> Things;
	
	private Item item;

	
	public Inventory() {
		//item = new Item(); // new item
		//item.MeleeWeapon();
		
	}
	
	public void player () {
		item = new Item(); // indicates if its a inventory for room or player
		System.out.println("Player");
		item.MeleeWeapon();
	}
	
	public void room () {
		item = new Item(); // new item
		//System.out.println("Room"); // indicates if its a inventory for room or player
		item.MeleeWeapon();
	}


}
