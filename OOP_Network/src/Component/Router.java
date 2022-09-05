package Component;

import ENUMS.*;

public class Router extends NetworkComponent  {
	
	private Routing RType;
	private RouteFinding routeFinding;
	private Connectivity connectivity;
	

	
	
	public Routing getRType() {
		return RType;
	}

	public void setRType(Routing rType) {
		RType = rType;
	}

	public RouteFinding getRouteFinding() {
		return routeFinding;
	}

	public void setRouteFinding(RouteFinding routeFinding) {
		this.routeFinding = routeFinding;
	}

	public Connectivity getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(Connectivity connectivity) {
		this.connectivity = connectivity;
	}





	public Router(String cid, int ports, int entryPort, int exitPort, Network assignedTo, Routing rType,
			RouteFinding routeFinding, Connectivity connectivity) {
		super(cid, ports, entryPort, exitPort, assignedTo);
		RType = rType;
		this.routeFinding = routeFinding;
		this.connectivity = connectivity;
	}



}
