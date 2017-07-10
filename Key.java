
public class Key extends Item {

	public String descriptionKey;
	public int weight;
	public boolean keychain = false;
	
	public Key() {
		keyProperties();
	}
	
	public Key keyProperties() {
		keychain = true;
		descriptionKey = "A key for a door";
		return this;
	}
	
}
