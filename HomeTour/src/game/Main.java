package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static boolean quit = false;
	private static Room nextRoom;

	public static void main(String[] args) {
		RoomManager room = new RoomManager();
		room.init();
		System.out.println("The HomeTour");
		System.out.println("Please Enter Player Name to Begin");

		Player newPLayer = new Player();

		newPLayer.setCurrentRoom(room.getStartingRoom());
		scan.nextLine();

		while (!quit) {
			printRoom(newPLayer);
			System.out.println("Where do you want to go");
			String input = scan.nextLine().trim().toLowerCase();
			parse(input, newPLayer);
			
		}
	}

	public static void printRoom(Player player) {
		Room currentRoom = player.getCurrentRoom();
		System.out.println("Current Room: " + currentRoom);
		if(currentRoom.checkDownExit()!="") {
			System.out.println("Exit Down");
		}
		
		if(currentRoom.checkLeftExit()!="") {
			System.out.println("Exit left");
		}
		if(currentRoom.checkUpExit()!="") {
			System.out.println("Exit up");
		}
		if(currentRoom.checkRightExit()!="") {
			System.out.println("Exit right");
		}
	}

	public static void parse(String command, Player player) {

		nextRoom = null;

		switch (command) {
		case "left": {
		
			nextRoom = player.getCurrentRoom().getExit(1);
			player.setCurrentRoom(nextRoom);
			break;
		}
		case "right": {
			nextRoom = player.getCurrentRoom().getExit(3);
			player.setCurrentRoom(nextRoom);
			break;
		}
		case "up": {
			nextRoom = player.getCurrentRoom().getExit(2);
			player.setCurrentRoom(nextRoom);
			break;
		}
		case "down": {
			nextRoom = player.getCurrentRoom().getExit(0);
			player.setCurrentRoom(nextRoom);
			break;
		}
		default: {
			System.out.println("Invalid Direction");
		}

		}

	}
}
