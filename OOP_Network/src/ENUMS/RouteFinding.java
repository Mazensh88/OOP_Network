package ENUMS;

public enum RouteFinding {
	
	Static("Static Route Finding"),
	Dynamic("Dynamic Route Finding");
	
	public String type;

	
	
	
	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	private RouteFinding(String type) {
		this.type = type;
	}
	
	

}
