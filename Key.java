
public class Key extends Item {
	
	private int weight = 5;
	private boolean keyTrue = false;
	
	public Key(String name,String description) {
		this.name = name;
		itemDescription = description;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public boolean getKey() {
		keyTrue = true;
		return keyTrue;
	}
	
}
