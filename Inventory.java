import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Inventory {

	private ArrayList<Item> ItemsInv = new ArrayList<Item>();;
	
	
	private Item item;
	private int weightLimit = 100; // weight limit
	/*private int weight = 0; // test weight*/
	
	public Inventory() {
		//ItemsInv = new HashMap<String, Item>();
	}
	
	/*public void player(Item items) {
		System.out.println(" =========Player=========");
		// indicates if its a inventory for room or player
		item = new Item();
		ItemsInv.add(items);
		System.out.println(ItemsInv + "=Inventory");
		//System.out.println(invItemsString());
	}*/
	
	public void player() {
		System.out.println(" =========Player=========");
	}
	
	public void room() {
		System.out.println(" =========Rooms=========");
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
		// removes item from inventory
		// -weight item from inventory
		
		//getCurrentWeight() - items.getWeight();
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
