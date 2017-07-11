import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Inventory {

	private ArrayList<Item> ItemsInv = new ArrayList<Item>();;
	
	
	private Item item;
	private int weightLimit = 20;
	
	public Inventory() {
		//ItemsInv = new HashMap<String, Item>();
	}
	
	public void addItem(Item items) {
		// checks if there is enough room in inventory
		if (getCurrentWeight() + items.getWeight() <= weightLimit) {
			//item = new Item();
			ItemsInv.add(items); // adds item to room
			System.out.println(ItemsInv + "=Inventory");
			//System.out.println(invItemsString()); // print items in hashmap 
			System.out.println("------------");
		}
	}
	
	public void removeItem(Item items) {
		ItemsInv.remove(items);
		System.out.println(ItemsInv + "=Inventory");
		System.out.println("------------");
	}
	
	public int getCurrentWeight() {
		int weight = 0;
		for (Item item : ItemsInv) {
			weight += item.getWeight();
		}
		return weight;
		
	}
	
	
}
