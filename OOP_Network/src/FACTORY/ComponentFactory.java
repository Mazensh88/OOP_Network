package FACTORY;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import DBSupport.*;
import Component.*;
import ENUMS.*;

public class ComponentFactory {
	static Network F;
	static Connectivity Conn;
	static RouteFinding RF; 
	static Routing RG;
	
	public static void AssignedTo(String E) {
		
		if (E.equals("Brore01wNET_TRACK")) {
  		  F = Network.B1_TRACK;
            
          }

  	  	else if (E.equals("Brore03yNET_SAT")) {
               F = Network.B3_SAT;
             
          }
  	  	else if (E.equals("Brore06vNET_SURV")) {
               F = Network.B6_SURV;
           
          }
  	  	else  if (E.equals("Ginda02xNET_SAT")) {
               F = Network.G2_SAT;
             
          }
  	  	else if (E.equals("Povebos04zNET_CIV")) {
               F = Network.P4_CIV;
             
          }
  	  	else if (E.equals("Trerth01wNET_CIV")) {
               F = Network.T1_CIV;
            
          }
  	  	else if (E.equals("Trerth05uNET_DEF")) {
               F = Network.T5_DEF;
             
          }
  	  	else if (E.equals("Zebetis02xNET_SAT")) {
               F = Network.Z2_SAT;
            
          }
  	  	else if (E.equals("Zebetis05uNET_CIV")) {
               F = Network.Z5_CIV;
             
          }
  	  
		
	}
	
	public static ArrayList<NetworkComponent> buildComponent(int hubs, int switches, int routers, int repeaters) throws SQLException, ClassNotFoundException
	{ 
		 		
		  Connection conn = DBSupport.establishConnection();

	      Statement useStatement1 = conn.createStatement();	  
	      Statement useStatement2 = conn.createStatement();	 
	      Statement useStatement3 = conn.createStatement();	 
	      Statement useStatement4 = conn.createStatement();	 
	      
	      useStatement1.execute("USE imperial_defense");
	      useStatement2.execute("USE imperial_defense");
	      useStatement3.execute("USE imperial_defense");
	      useStatement1.execute("USE imperial_defense");
	      
	      
	      ResultSet rs1 = useStatement1.executeQuery("SELECT * FROM hub limit " +  hubs);
	      ResultSet rs2 = useStatement2.executeQuery("SELECT * FROM switch limit "+  switches);
	      ResultSet rs3 = useStatement3.executeQuery("SELECT * FROM router limit "+  routers);
	      ResultSet rs4 = useStatement4.executeQuery("SELECT * FROM repeater limit "+  repeaters);

	      ArrayList<NetworkComponent> arr = new ArrayList<>();
		 
	      while(rs1.next())
	      {
	    	 
	    	  
	    	  String A = rs1.getString("HID");
	    	  int B = rs1.getInt("Ports");
	    	  int C = rs1.getInt("EntryPort");
	    	  int D = rs1.getInt("ExitPort");
	    	  String E = rs1.getString("assignedTo");
	    	  
	    	  
	    	  AssignedTo(E);
	    	 	    	  	    	  
	    	  Hub H = new Hub (A,B,C,D,F);
              arr.add(H);
    		  
	    	  
    	  
	      }
	            
	      while(rs4.next())
	      {
	    	  String A = rs4.getString("RPID");
	    	  int B = rs4.getInt("Ports");
	    	  int C = rs4.getInt("EntryPort");
	    	  int D = rs4.getInt("ExitPort");
	    	  String E = rs4.getString("AssignedTo");
	    	  
	    	  AssignedTo(E);
	    	  
              
              Repeater H = new Repeater (A,B,C,D,F);
              arr.add(H);
	    	  	    	  
	       	  
	      }
	      
	      while(rs2.next())
	      {
	    	  String A = rs2.getString("SID");    	  
	    	  int C = rs2.getInt("EntryPort");
	    	  int D = rs2.getInt("ExitPort"); 
	    	  String L = rs2.getString("AssignedTo");
	    	  boolean E = rs2.getBoolean("Stackable");
	    	  boolean R = rs2.getBoolean("PoE");
	    	  
	    	
	    	  
	    	
	    	  AssignedTo(L);
	    	  
	    	    Switch  a = new Switch(A, Math.abs(D - C), C, D, F, E, R);
	  	    	  arr.add(a);      	   	  
	      }
	      
	      
	      //ROUTER
	      
	      while(rs3.next())
	      {
	    	  String A = rs3.getString("RID");    
	    	  
	    	  String B = rs3.getString("RType");	  	  
	    	  String C = rs3.getString("RouteFinding");   
	    	  String D = rs3.getString("Connectivity");
	    	  String L = rs3.getString("AssignedTo");
	    	  
	    	  AssignedTo(L);

	    	  if (C.equals("Static"))
	    	  {
	    		  RF = RouteFinding.Static;
	    	  }else
	    	  {
	    		  RF = RouteFinding.Dynamic;
	    	  }
	    	  ///
	    	  
  
	    	  if (D.equals("Edge"))
	    	  {
	    		  Conn = Connectivity.Edge;
	    	  }else if (D.equals("Backbone"))
	    	  {
	    		  Conn = Connectivity.Backbone;
	    	  }else if (D.equals("Forward"))
	    	  {
	    		  Conn = Connectivity.Forward;
	    	  }
	    	  
	    	 ////
	    	  
	    	  if (B.equals("Interior"))
	    	  {
	    		  RG = Routing.Interior;
	    	  }else if (B.equals("Exterior"))
	    	  {
	    		  RG = Routing.Exterior;
	    	  }else if (B.equals("Border"))
	    	  {
	    		  RG = Routing.Border;
	    	  }
	    	  
	    	  
	    	 

	    	  	Router  a = new Router(A, 0, 0, 0, F, RG, RF, Conn);
	  	    	  arr.add(a); 	   	  
	      }
	      
	      
	      
	      
	      
	      arr.get(0).displayComponents();
		
		
		return arr;
		
		
		
	}

}
