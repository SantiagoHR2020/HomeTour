package fixtures;

public class Room extends Fixtures {
	
	Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];

	}

	public Room[] getExits() {
		return exits;
	}
	
		
	public Room getExit(int direction) {
		if (exits[direction]== null) {
			return this;
		}
		return exits[direction];
	}
	
	public void setDownExit(Room room) {
		exits[0] = room;
	}
	public void setLeftExit(Room room) {
		exits[1] = room;
	}
	public void setUpExit(Room room) {
		exits[2] = room;
	}
	public void setRightExit(Room room) {
		exits[3] = room;
	}

	public String checkDownExit() {
		if(exits[0]!=null) {
		return exits[0].getName();
		}
		return "";
		
	}
	
	public String checkLeftExit() {
		if(exits[1]!=null) {
		return exits[1].getName();
		}
		return "";
		
	}
	
	public String checkUpExit() {
		if(exits[2]!=null) {
		return exits[2].getName();
		}
		return "";
		
	}
	
	public String checkRightExit() {
		if(exits[3]!=null) {
		return exits[3].getName();
		}
		return "";
		
	}
	
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	

	@Override
	public String toString() {
		return "Room [name=" + name + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ "]";
	}

	


}
