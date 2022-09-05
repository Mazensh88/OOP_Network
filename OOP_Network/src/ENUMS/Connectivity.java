package ENUMS;


public enum Connectivity {
	
	Edge("Interior", "Standard Speed"),
	
	Backbone("Exterior", "Standard Speed"),
	
	Forward("Port Forwarding", "High Speed");
	
	public String name;
	public String speed;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	private Connectivity(String name, String speed) {
		this.name = name;
		this.speed = speed;
	}
	
	
	
	

}
