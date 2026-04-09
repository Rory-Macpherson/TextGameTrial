package ie.roryroams.textgame;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class Interface {
private Scanner scanner;
private boolean keepRunning = true;
Player player = new Player();
Enemy enemy = new Enemy();
String currentRoom = ("The Awakening Chamber");	
public Interface() {
		scanner = new Scanner(System.in);
		
	}

public void start() {
	
		beginning();
		while (keepRunning) {
			showArea();
			showOptions();
			checkHealth();
			showHealth();
			userInput();
			nextRoom();
			
	}
}



private void beginning() {
	System.out.println("'Ugh'");
	System.out.println("You wake up in a dark room with only one doorway that has no door.");
	System.out.println("'where am I?' You ask out loud.");
	System.out.println("Your voice sounds loud in the quiet of the room.");
	System.out.println("Then you hear footsteps coming towards you from the doorway");
	System.out.println("Quickly you look for something to use as a weapon");
	
}
private void showArea() {
	
		if (player.getCurrentWeapon()== null) {
			System.out.println("Press Enter to look around the room...");
		    scanner.nextLine(); // waits for the user to press Enter
			Weapon startWeapon = new Weapon("Dagger", Quality.POOR, 7);
			player.setCurrentWeapon(startWeapon);
			 System.out.println("You found your first weapon: a " + startWeapon.weaponType() + 
					 " of " + startWeapon.quality() + " Quality");
		}else{
			
		System.out.println(currentRoom);
		System.out.println("Press Enter to look around the room...");
		 scanner.nextLine(); // waits for the user to press Enter
	 String loot = SpawnLoot.generateLoot();
	    System.out.println("You found: " + loot);
	   


	}
		
}


private void showOptions() {
	System.out.println("You are in " + currentRoom);
	enemy = new Enemy();
	String name = enemy.typeSelector();
	System.out.println("There is a " + name + " in This room, you must attack him and win or try to escape!");
	if ("The Awakening Chamber".equals(currentRoom)) {
		while( player.getCurrentHealth() > 0 && enemy.getCurrentHealth() > 0) {
		enemy.getCurrentHealth();
		System.out.println(name + " current health is " + enemy.getCurrentHealth());
		System.out.println("You attack with your " + player.getCurrentWeapon().weaponType());
		System.out.println("Press Enter to continue...");
	    scanner.nextLine();
		enemy.setCurrentHealth(enemy.getCurrentHealth() - player.getCurrentWeapon().damage());
		if(enemy.getCurrentHealth() <= 0) {
			System.out.println("You have killed " + name + "! Well done. time to search the room!");
			keepRunning = false;
			return;
		}
		System.out.println(name + " current health is " + enemy.getCurrentHealth());
		scanner.nextLine();
		System.out.println(name + " is attacking for " + enemy.getDamageDealt() + " amount of damage!");
		player.setCurrentHealth(player.getCurrentHealth() - enemy.getDamageDealt());
		if(player.getCurrentHealth() <= 0) {
			System.out.println("You have been killed by " + name + "! You never see sunlight again!");
			keepRunning = false;
			return;
		}
		scanner.nextLine();
		System.out.println("Your Current Health is " + player.getCurrentHealth());
		scanner.nextLine();
	}}
	System.out.println("press 1 to Attack");
	System.out.println("press 2 to try and escape past the " + name);
	System.out.println("press 6 to quit game because its too hard and life is unfair!");
	
	int choice = Integer.parseInt(scanner.next());
	switch (choice) {
	case 1 -> Attack();
	case 2 -> Flee();
	case 6 -> keepRunning = false;
	default-> out.println("[Error] Invalid Selection");
	}
}

private Object Flee() {
	// TODO Auto-generated method stub
	return null;
}

private Object Attack() {
	// TODO Auto-generated method stub
	return null;
}

private void checkHealth() {
	if (player.getCurrentHealth() <= 0) {
		System.out.println("You have died. Better luck next time!");
		keepRunning = false;
		
	}
	
}
private void showHealth() {
	System.out.println("You currently have " + player.getCurrentHealth() + " Health Left");
}
private void userInput() {
    System.out.println("Press Enter to continue...");
    scanner.nextLine(); // waits for the user to press Enter
}

private ArrayList<String> remainingRooms = new ArrayList<>(
	    List.of(
	        "Abandoned Hallway", "Forgotten Library", "Crumbling Armory",
	        "Underground Cellar", "Collapsed Tunnel", "Slimey Laboratory",
	        "Hidden Alcove", "Silent Passage"
	    )
	);


private void nextRoom() {
	if (remainingRooms.isEmpty()) {
		System.out.println("You are finaly free of that horrid place, "
				+ "you make it outside into the fresh air!! Hurray!!");
		keepRunning = false;
		return;
	}
		int index = ThreadLocalRandom.current().nextInt(remainingRooms.size());
	    String chosenRoom = remainingRooms.remove(index);
		currentRoom = chosenRoom;
}
}

