/**
 *  This class is the main class of the "World of Zuul" application.
 *  "World of Zuul" is a very simple, text based adventure game.  Users
 *  can walk around some scenery. That's all. It should really be extended
 *  to make it more interesting!
 *
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 *
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

class Game
{
    private Parser parser;
    private Player player;
    private Item knife,torch,key, item;

    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
    	player = new Player();
    	createItems();
        createRooms();
        parser = new Parser();
        
       	
    }

    private void createItems() {
    	knife = new Knife("Knife", "A realy sharp knife");
    	torch = new Torch("Torch", "A burning torch");
    	key = new Key("Key", "A key to a door");
	}

	/**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theatre, pub, lab, office, up_theatre, down_theatre;
        
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        
        outside.addItem(torch);
        
        theatre = new Room("in a lecture theatre");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        
        office.addItem(key); //puts item in inventory of room.
        
        // up en down stairs room opdracht 
        up_theatre = new Room("in the top floor of the theatre");
        down_theatre = new Room("in the bottem floor of the theatre");

        // initialise room exits
        // outside
        outside.setExit("east", theatre);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        // theatre
        theatre.setExit("west", outside);
        theatre.setExit("up", up_theatre);
        theatre.setExit("down", down_theatre);
        // theatre top floor
        up_theatre.setExit("down", theatre);
        
        up_theatre.addItem(knife);
        
        // theatre bottem floor
        down_theatre.setExit("up", theatre);
        // pub
        pub.setExit("east", outside);
        // lab
        lab.setExit("north", outside);
        lab.setExit("east", office);
        // office
        office.setExit("west", lab);
        // sets the player's starting point
        player.setCurrentRoom(outside);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the world of Blank");
        System.out.println("Blank is a mysterious adventure game");
        System.out.println("");
        System.out.println("You wake up in a forrest you don't remember how you got here.");
        System.out.println("You stand up and see an abandoned university.");
        System.out.println("The last thing that you seem to remember was that you were walking to school.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(player.getCurrentRoom().getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * If this command ends the game, true is returned, otherwise false is
     * returned.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            System.out.println("Try typing help if you don't know all commands.");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("look")) {
            look(command);
        }
        else if (commandWord.equals("search")) {
        	search(command);
        }
        else if (commandWord.equals("take")) {
            take(command);
        }
        else if (commandWord.equals("drop")) {
            drop(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the abandoned university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = player.getCurrentRoom().getExit(direction);

        if (nextRoom == null)
            System.out.println("There is no door!");
        else {
            player.setCurrentRoom(nextRoom);
            System.out.println(player.getCurrentRoom().getLongDescription());
            player.damage(1); // damages de player elke keer als ie naar een andere kamer to gaat.
        }
    }
    
    /*
     * "look" was entered. 
     * describes where the player is and what he sees.
     */
    private void look(Command command) {
    	System.out.println(player.getCurrentRoom().getLongDescription() + ".\n");
    }
    
    private void search(Command command) {
    	System.out.println();
    }
    
    // take an item from the ground
    private void take(Command command) {
    	if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Take what?");
            return;
        }
    	System.out.println("You try to pick up the item");
    	player.takeItem(command.getSecondWord());
    }
    
    private void drop(Command command) {
    	if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Drop what?");
            return;
        }
    	System.out.println("You Drop the object.");
    	
    	//player.removeItem(knife);
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game. Return true, if this command
     * quits the game, false otherwise.
     */
    private boolean quit(Command command)
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            System.out.println("Try using quit with no second command.");
            return false;
        }
        else
            return true;  // signal that we want to quit
    }


    public static void main(String[] args)
    {
        Game game = new Game();
        game.play();
    }
}
