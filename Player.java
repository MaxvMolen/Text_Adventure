
class Player {
	
	private Room currentRoom;
	
	private int healthP;
	private Inventory inventoryPlayer = new Inventory();;

	public Player()
    {
		// total health player
		healthP = 10;
    }
	
	public void addItem(Item itemname){
    	//itemname = new Item();
    	//inventoryRoom.addItem(knife);
		inventoryPlayer.addItem(itemname);
    }
    
    public Item removeItem(String itemname){
    	return inventoryPlayer.removeItem(itemname);
    }
	
	// getter
	public Room getCurrentRoom() {
		return currentRoom;
	}

	// setter
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	// heals de player
	private void heal(int amount){
		this.healthP =+ 1;
	}
	
	// damages the player
	public void damage(int amount){
		this.healthP -= amount;
		System.out.println("you lost 1 live");
		isAlive();
	}
	
	// see if player still lives
	private void isAlive() {
		if(healthP == 0) {
			//this.healthP = 0;
			System.out.println("You Died");
			
		}
	}

	public void takeItem(String itemName) {
		Item item = currentRoom.removeItem(itemName);
		if (item != null){
			addItem(item);
			System.out.println("Added item to inventory");
		} else {
			System.out.println("Cant pick up that item");
		}
	}
	
	public void dropItem(String itemName) {
		Item item = this.removeItem(itemName);
		if (item != null){
			//Room.addItem(item);
			currentRoom.addItem(item);
			System.out.println("Added item to inventory");
		} else {
			System.out.println("Cant pick up that item");
		}
	}
}


