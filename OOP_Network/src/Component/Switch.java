package Component;

import ENUMS.Network;

public class Switch extends NetworkComponent {
	
	private boolean stackable;
	private boolean poe;

	
	
	public boolean isStackable() {
		return stackable;
	}



	public void setStackable(boolean stackable) {
		this.stackable = stackable;
	}



	public boolean isPoe() {
		return poe;
	}



	public void setPoe(boolean poe) {
		this.poe = poe;
	}






	public Switch(String cid, int ports, int entryPort, int exitPort, Network assignedTo, boolean stackable,
			boolean poe) {
		super(cid, ports, entryPort, exitPort, assignedTo);
		this.stackable = stackable;
		this.poe = poe;
	}



	@Override
	public String toString() {
		String S="";
		String P="";
		
		if (stackable = true)
		{
			S = "Is Stackable";
		}else {
			S = "Is Not Stackable";
		}
		
		//
		if (poe = true)
		{
			P="Has Poe";
		}
		else {
			P="No Poe";
		}
		
		return "Network Component" + ", ID Number: " + getCid() 
				+ "\n	Ports: "+ getPorts() 
				+ "\n	EntryPort: "  + getEntryPort() 
				+ "\n	ExitPort: " + getExitPort()
				+ "\n	Network Name: " + getAssignedTo().name  
				+ "\n	Network Type: "+ getAssignedTo().type 
		        +"\n	STACKABLE: "+S + "\n	PoE: " + P ;
	}




	
	
}
