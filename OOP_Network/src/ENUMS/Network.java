package ENUMS;

public enum Network {
	
	B1_TRACK("Brore01wNET_TRACK","Tracking"),
	B3_SAT("Brore03yNET_SAT","Satellite"),
	B6_SURV("Brore06vNET_SURV","Surveillance"),
	G2_SAT("Ginda02xNET_SAT","Satellite"),
	P4_CIV("Povebos04zNET_CIV","Social"),
	T1_CIV("Trerth01wNET_CIV","Social"),
	T5_DEF("Trerth05uNET_DEF","Defense"),
	Z2_SAT("Zebetis02xNET_SAT","Satellite"),
	Z5_CIV("Zebetis05uNET_CIV","Social");
	public String name;
	public String type;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	private Network(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	

}
