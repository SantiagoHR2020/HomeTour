package game;

import fixtures.Room;

public class Player {
	private String playerName;
	private Room currentRoom;
	
	public Player() {}

	public Player(String playerName, Room currentRoom) {
		super();
		this.playerName = playerName;
		this.currentRoom = currentRoom;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	

}

    
