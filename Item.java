import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class Item {
	
	private HashMap<String, Knife> weapons;
	
	protected String name;
	protected int weight = 10;
	protected String itemDescription;

	public int getWeight() {
		return weight;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}