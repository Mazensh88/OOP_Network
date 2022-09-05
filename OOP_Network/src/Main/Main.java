package Main;

import java.sql.SQLException;
import java.util.ArrayList;

import Component.NetworkComponent;
import FACTORY.ComponentFactory;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Autoprivate generated method stub
		
		ArrayList<NetworkComponent> c = ComponentFactory.buildComponent(2, 2, 2, 2);

		for(NetworkComponent NC : c) {
			System.out.println(NC.toString());
		}
	}

}
