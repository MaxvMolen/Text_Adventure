
public class Torch extends Item {
	
	private int weight = 5;

	public Torch(String name,String description) {
		this.name = name;
		itemDescription = description;
	}

	public int getWeight() {
		return weight;
	}
}
