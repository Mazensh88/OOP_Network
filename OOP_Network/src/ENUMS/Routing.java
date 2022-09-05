package ENUMS;

public enum Routing {
	
	Interior("Interior Router"),
	Exterior("Exterior Router"),
	Border("Border Router");
	public String type;

	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	private Routing(String type) {
		this.type = type;
	}
	
	

}
