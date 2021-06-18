package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] allRooms;

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	public Room[] getAllRooms() {
		return allRooms;
	}

	public void setAllRooms(Room[] allRooms) {
		this.allRooms = allRooms;
	}

	public void init() {
		Room Kitchen = new Room("Kitchen", "The  best room in the home when hungry", "Food is made and eaten here");
		Room livingroom = new Room("Living Room", "Put your feet up and relax", "Watch tv, play games, eat, and read here");
		Room bedroom = new Room("Bedroom", "Sleep here", "The place were you catch ZZZZZZZZ");
		Room bathroom = new Room("Bathroom", "A full bathroom", "A man does his best thinking here");

		
		allRooms = new Room[4];
		allRooms[0] = bedroom;
		allRooms[1] = livingroom;
		allRooms[2] = Kitchen;
		allRooms[3] = bathroom;

		
		bedroom.setUpExit(livingroom);
		bedroom.setRightExit(bathroom);
		livingroom.setDownExit(bedroom);
		livingroom.setRightExit(Kitchen);
		Kitchen.setLeftExit(livingroom);
		Kitchen.setDownExit(bathroom);
		bathroom.setUpExit(Kitchen);
		bathroom.setLeftExit(bedroom);

		
		startingRoom = livingroom;
	}
}
