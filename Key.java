
public class Key extends Item {
	
	private int weight = 5;
	
	public Key(String name,String description) {
		this.name = name;
		itemDescription = description;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
