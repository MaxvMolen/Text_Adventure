import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Inventory {

	private ArrayList<Item> ItemsInv = new ArrayList<Item>();;
	
	
	private Item item;
	private int weightLimit = 30;
	
	public Inventory() {
	}
	
	public void addItem(Item items) {
		// checks if there is enough room in inventory
		if (getCurrentWeight() + items.getWeight() <= weightLimit) {
			ItemsInv.add(items); // adds item to room
			System.out.println(ItemsInv + "=Inventory");
			System.out.println("------------");
		}
	}
	
	public Item removeItem(String itemname) {
		Item item2 = null; 
		for (Item item : ItemsInv) {
			if(item.getName().equalsIgnoreCase(itemname)){
				item2 = item;
				break;
			}
		}
		if (item2 == null){
			return null;
		}
		ItemsInv.remove(item2);
		System.out.println(ItemsInv + "=Inventory");
		System.out.println("------------");
		return item2;
	}
	
	public void search(){
		System.out.println(ItemsInv + "=Inventory");
		System.out.println("Weight of items: " + getCurrentWeight());
		System.out.println("Your weight limit is: " + weightLimit);
	}
	
	public Item useItem(String itemname){
		Item item2 = null; 
		for (Item item : ItemsInv) {
			if(item.getName().equalsIgnoreCase(itemname)){
				item2 = item;
				break;
			}
		}
		if (item2 == null){
			return null;
		}
		return item2;
	}
	
	public int getCurrentWeight() {
		int weight = 0;
		for (Item item : ItemsInv) {
			weight += item.getWeight();
		}
		return weight;
		
	}
	
	
}
