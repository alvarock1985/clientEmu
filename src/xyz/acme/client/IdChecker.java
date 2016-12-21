package xyz.acme.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class IdChecker {
	
	DataBaseManager db = new DataBaseManager();
	public Statement stmt;
	public ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> getSensorId(){
		
		
		try{
			
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			String query = "select * from sensor";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				int sensorid = rs.getInt("sensorid");
				
				list.add(sensorid);
				
				
			
				
			}
			System.out.println(list);
			
			return list;
			
		}
		catch(Exception e){
			System.out.println("error");
			return null;
			
			
		}

}
	
}
