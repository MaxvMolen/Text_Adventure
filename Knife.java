
	
public class Knife extends Item {
	
	private int weight = 10;

	public Knife(String name,String description) {
		this.name = name;
		itemDescription = description;
	}
	
	public int getWeight() {
		return weight;
	}
}
