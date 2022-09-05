package Component;
import ENUMS.*;
public abstract class NetworkComponent {
	private String cid;
	private int ports;
	private int entryPort;
	private int exitPort;
	private Network assignedTo;
	
	
	
	
	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public int getPorts() {
		return ports;
	}


	public void setPorts(int ports) {
		this.ports = ports;
	}


	public int getEntryPort() {
		return entryPort;
	}


	public void setEntryPort(int entryPort) {
		this.entryPort = entryPort;
	}


	public int getExitPort() {
		return exitPort;
	}





	public void setExitPort(int exitPort) {
		this.exitPort = exitPort;
	}





	public Network getAssignedTo() {
		return assignedTo;
	}





	public void setAssignedTo(Network assignedTo) {
		this.assignedTo = assignedTo;
	}





	public NetworkComponent(String cid, int ports, int entryPort, int exitPort, Network assignedTo) {
		
		this.cid = cid;
		this.ports = ports;
		this.entryPort = entryPort;
		this.exitPort = exitPort;
		this.assignedTo = assignedTo;
	}





	@Override
	public String toString() {
		return "Network Component:  ID Number: " +  this.cid + 
				"\n	Ports: " +  this.ports +  
				"\n	Etry Port: " +  this.entryPort +  
				"\n	Exit Port: "+  this.exitPort +  
				"\n	NETWORK Name: " +  this.assignedTo.name +  
				"\n	NETWORK Type: " +  this.assignedTo.type ;
	}
	
	
	public void displayComponents()
	{
		System.out.println(toString());
	}
	
	
	
	

}
