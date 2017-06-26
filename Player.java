
class Player {
	
	private Room currentRoom;
	
	private int healthP;
	
	// inventory player
	private Inventory inventoryPlayer;

	public Player()
    {
		// make inventory of the playe
		// total health player
		healthP = 5;
		
		// inventory
		inventoryPlayer = new Inventory();
		inventoryPlayer.player();
		//add item to inventory of player
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
}


